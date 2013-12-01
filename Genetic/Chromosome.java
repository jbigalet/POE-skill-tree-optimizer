package poepassiveskilltreeoptimizer.Genetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import poepassiveskilltreeoptimizer.BaseSkillTree;
import poepassiveskilltreeoptimizer.Build;
import static poepassiveskilltreeoptimizer.Main.baseSkillTree;

public class Chromosome implements Comparable<Chromosome> {

    private Random rand = new Random();
    
    public String poeClass;
    public int level;
    public Map<Integer, Set<Integer>> perks;
    public int nPoints;
    public int rootNode;
    public List<Integer> availablePerks;
    
    public Build build;
    public double score;
    
    public Chromosome( String poeClass, int level, int nPoints ) {
        this.poeClass = poeClass;
        this.level = level;
        this.nPoints = nPoints;
        
        rootNode = baseSkillTree.rootNodes.get( poeClass );
        perks = new HashMap<>();
        availablePerks = new ArrayList<>();
        for( int iNode : baseSkillTree.nodeLinks[rootNode] )
            availablePerks.add( iNode );
  
        addRandomNodes( nPoints );
        refreshBuild();
    }
    
        // Crossover
    public Chromosome( Chromosome c1, Chromosome c2 ){
        if( !c1.poeClass.equals(c2.poeClass) || c1.level != c2.level || c1.nPoints != c2.nPoints ){
            System.out.println("Impossible to crossover 2 builds with different main properties.");
            System.exit(1);
        }
        
        this.poeClass = c1.poeClass;
        this.level = c1.level;
        this.nPoints = c1.nPoints;
        this.rootNode = c1.rootNode;
        this.availablePerks = new ArrayList<>();    // Dummy to check size = 0
        
        perks = new HashMap<>();
        Set<Integer> merge = new HashSet<>( c1.perks.keySet() );
        merge.addAll( c2.perks.keySet() );
        
        for( int node : merge ){
            Set<Integer> links = getLinks( node );
            perks.put( node, links );
            for( int link : links )
                perks.get( link ).add( node );
        }
        
//        if( perks.size() - nPoints != removeRandomNodesHEAVY(perks.size() - nPoints ) ){
//            System.out.println("Impossible to remove enough points to get a valid child build from the crossover");
//            System.exit(2);
//        }
        removeRandomNodesHEAVY( perks.size() - nPoints );
        
        refreshBuild();
    }
    
    private void refreshBuild(){
        forceNodes( new Integer[] { BaseSkillTree.IRNode, BaseSkillTree.MotANode, BaseSkillTree.CharismaNode } );
        this.build = new Build(poeClass, level, perks.keySet());
        updateScore();
    }
    
    public void forceNodes( Integer[] nodes ){
        for( int node : nodes ){
            List<Integer> minimalPath = MinimalPath.getMinimalPath( perks, node );
            for( int toAdd : minimalPath ){
                Set<Integer> links = getLinks( toAdd );
                perks.put( toAdd, links );
                for( int link : links )
                    perks.get( link ).add( toAdd );
            }
        }
        
        removeRandomNodesHEAVY( perks.size() - nPoints, new HashSet<>( Arrays.asList( nodes ) ));
    }
    
    private Set<Integer> getLinks( int node ){
        Set<Integer> links = new HashSet<>();
        
        for( int toCheck : baseSkillTree.nodeLinks[node] )
            if( perks.containsKey( toCheck ) )
                links.add( toCheck );
        
        return links;
    }
    
    private Set<Integer> getAvailablePerks() {
        Set<Integer> aPerks = new HashSet<>();
        
        aPerks.addAll( getSpecificAvailablePerks( rootNode ) );
        for( int p : perks.keySet() )
            aPerks.addAll( getSpecificAvailablePerks( p ) );
        
        return aPerks;
    }
    
    private Set<Integer> getSpecificAvailablePerks( int node ){
        Set<Integer> aPerks = new HashSet<>();
        
        for( int iNode : baseSkillTree.nodeLinks[ node ])
            if( !perks.containsKey( iNode ) && !baseSkillTree.iRootNodes.contains( iNode ) )
                aPerks.add( iNode );
        
        return aPerks;
    }
    
    private int removeRandomNodes( int n ){
        Set<Integer> nonArtPts = new TarjansArtPoints( perks, rootNode ).getNonArticulationPoints();
        int i = 0;
        while( i<n && !nonArtPts.isEmpty() ){
            int pos = rand.nextInt( nonArtPts.size() );
            int iCurrent = 0;
            for( int aPerk : nonArtPts )
                if( iCurrent++ == pos ){
                    for( int link : perks.remove( aPerk ) )
                        perks.get( link ).remove( aPerk );
                    nonArtPts.remove( aPerk );
                    break;
                }
            i++;
        }
        return i;
    }
    
    private int removeRandomNodesHEAVY( int n ){
        int i = 0;
        while( i<n ){
            Set<Integer> nonArtPts = new TarjansArtPoints( perks, rootNode ).getNonArticulationPoints();
            if( nonArtPts.isEmpty() ){
                System.out.println("Impossible to remove any more point...");
                break;
            }
            int pos = rand.nextInt( nonArtPts.size() );
            int iCurrent = 0;
            for( int aPerk : nonArtPts )
                if( iCurrent++ == pos ){
                    Set<Integer> links = perks.remove( aPerk );
                    for( int link : links )
                        perks.get( link ).remove( aPerk );
                    //nonArtPts.remove( aPerk ); //wut
                    break;
                }
            i++;
        }
        return i;
    }
    
    private int removeRandomNodesHEAVY( int n, Set<Integer> cantRemove ){
        int i = 0;
        while( i<n ){
            Set<Integer> nonArtPts = new TarjansArtPoints( perks, rootNode ).getNonArticulationPoints();
            nonArtPts.removeAll( cantRemove );
            if( nonArtPts.isEmpty() ){
                System.out.println("Impossible to remove any more point...");
                break;
            }
            int pos = rand.nextInt( nonArtPts.size() );
            int iCurrent = 0;
            for( int aPerk : nonArtPts )
                if( iCurrent++ == pos ){
                    Set<Integer> links = perks.remove( aPerk );
                    for( int link : links )
                        perks.get( link ).remove( aPerk );
                    //nonArtPts.remove( aPerk ); //wut
                    break;
                }
            i++;
        }
        return i;
    }
    
    private void removeRandomNodesPEACE( int n ){
        Map<Integer, Set<Integer>> newPerks;
        
        int w=0;
        do {
            newPerks = new HashMap();
            for( Map.Entry<Integer, Set<Integer>> entry : perks.entrySet() )
                newPerks.put( entry.getKey(), new HashSet<>(entry.getValue()) );
            for( int i=0 ; i<n ; i++ ){
                int pos = rand.nextInt( newPerks.keySet().size() );
                int iCurrent = 0;
                for( int aPerk : newPerks.keySet() )
                    if( iCurrent++ == pos ){
                        for( int link : newPerks.remove( aPerk ) )
                            newPerks.get( link ).remove( aPerk );
                        newPerks.remove( aPerk );
                        break;
                    }
            }
            w++; if( w%1000==0 ) System.out.println(w/1000);
        } while( !new TarjansArtPoints( newPerks, rootNode ).isConnected() );
        
        perks = newPerks;
    }
    
    private void addRandomNodes( int n ){
            // Meh. Shitty randomizing all the way.
        availablePerks = new ArrayList<>();
        
        int initSize = perks.size();
        while( perks.size() < initSize + n ){
//            int iRandomNode = rand.nextInt( availablePerks.size() );
//            int iCurrent = 0;
//            int randomNode = -1;
//            for( int aPerk : availablePerks )
//                if( iCurrent++ == iRandomNode ){
//                    randomNode = aPerk;
//                    break;
//                }
//            perks.add( randomNode );
//            availablePerks.remove( randomNode );
//            for( int iNode : baseSkillTree.nodeLinks[randomNode] )
//                if( !perks.contains(iNode) )
//                    availablePerks.add( iNode );

            Set<Integer> newAvPerks = new HashSet<>();
            if( availablePerks.isEmpty() )
                availablePerks = new ArrayList<>( getAvailablePerks() );
            int aSize = availablePerks.size();
            int iStart = rand.nextInt( aSize );
            while( iStart < aSize && perks.size() < initSize + n ){
                int toAdd = availablePerks.get( iStart );
                Set<Integer> links = getLinks( toAdd );
                perks.put( toAdd, links );
                for( int link : links )
                    perks.get( link ).add( toAdd );
                newAvPerks.addAll( getSpecificAvailablePerks( toAdd ) );
                iStart += 1 + rand.nextInt( aSize - iStart );
            }
            
            if( newAvPerks.isEmpty() )
                newAvPerks = getAvailablePerks();
            
            availablePerks = new ArrayList<>( newAvPerks );
        }
    }
    
    public Chromosome localOptimization( int mutationMax, int localGeneration ){
        Chromosome bestC = null;
        double max = 0;
        for(int i=0 ; i<localGeneration ; i++){
            Chromosome c = new Chromosome(this, this);
            c.mutation( rand.nextInt( mutationMax ) );
            if( c.score > max ){
//                System.out.println("oyeah: " + max + " -> " + c.score);
                max = c.score;
                bestC = c;
            }
        }
        return bestC;
    }
    
    public void mutation( int n ){
//        addRandomNodes( removeRandomNodesHEAVY( n ) );
        addRandomNodes( n );
        removeRandomNodesHEAVY( n );
//        removeRandomNodesPEACE( n );
//        addRandomNodes( n );
        refreshBuild();
    }
    
    private void updateScore(){
//        this.score = build.perkProp.percMaxLife;
        this.score = build.calculateShit();
    }

    @Override
    public int compareTo(Chromosome t) {
        return Double.compare(score, t.score);
    }
    
    
}