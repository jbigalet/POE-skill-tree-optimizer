package poepassiveskilltreeoptimizer.Genetic;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import static poepassiveskilltreeoptimizer.Main.baseSkillTree;

    // Modified Tarjan's algorithm to get articulation points from a graph
    // http://algs4.cs.princeton.edu/41undirected/Biconnected.java
    // http://www.geeksforgeeks.org/articulation-points-or-cut-vertices-in-a-graph/
public class TarjansArtPoints {
    
    private static int[] low = new int[ 65536 ];
    private static int[] pre = new int[ 65536 ];

    private Map<Integer, Set<Integer>> perks;
    private int rootNode;
    
    private int cnt;
    public Set<Integer> articulations;
    
    public TarjansArtPoints( Map<Integer, Set<Integer>> perks, int rootNode ) {
        this.perks = perks;
        this.rootNode = rootNode;
        this.articulations = new HashSet<>();
        
        for( int node : perks.keySet() ){
            low[node] = -1;
            pre[node] = -1;
        }
        
            // Starting by the children of the root node
            // Proper implementation would be to start with the root node, assuming he's existing in the graph
        for( int node : baseSkillTree.nodeLinks[ rootNode ] )
            if( pre[node] == -1 )
                DFS( node, node );

//        for( int node : chromosome.perks.keySet() )
//            if( pre[node] == -1 )
//                DFS( node, node );
        
            // Then add the children of the root nodes
        articulations.addAll( baseSkillTree.nodeLinks[ rootNode ] );
    }
    
    public boolean isConnected(){
        for( int node : perks.keySet() )
            if( pre[node] == -1 ){
//                System.out.println(node);
                return false;
            }
        return true;
    }
    
    private void DFS( int u, int v ){
//        int children = 0;
        pre[v] = cnt++;
        low[v] = pre[v];
        for(int w : perks.get( v ))
            if( pre[w] == -1 ){
//                children++;
                DFS(v, w);
                low[v] = Math.min(low[v], low[w]);
                if( low[w] >= pre[v] && u != v )
                    articulations.add( v );
            } else if( w != u )
                low[v] = Math.min( low[v], low[w] );
        
//        if( u == v && children > 1 )
//            articulation[v] = true;
    }
    
    public Set<Integer> getNonArticulationPoints(){
        Set<Integer> nap = new HashSet<>( perks.keySet() );
        nap.removeAll( articulations );
        return nap;
    }
}
