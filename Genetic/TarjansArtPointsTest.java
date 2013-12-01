package poepassiveskilltreeoptimizer.Genetic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TarjansArtPointsTest {
    
    private Map<Integer, Set<Integer>> graph;
    private int rootNode;
    
    private int[] low;
    private int[] pre;
    private int cnt;
    public Set<Integer> articulations;

    public TarjansArtPointsTest( Map<Integer, Set<Integer>> graph, int rootNode ) {
        this.graph = graph;
        this.rootNode = rootNode;
        this.articulations = new HashSet<>();
        
        this.low = new int[ 65536 ];
        this.pre = new int[ 65536 ];
        for( int node : graph.keySet() ){
            low[node] = -1;
            pre[node] = -1;
        }
        
            // Starting by the children of the root node
            // Proper implementation would be to start with the root node, assuming he's existing in the graph
        DFS( rootNode, rootNode );

//        for( int node : graph.keySet() )
//            if( pre[node] == -1 )
//                DFS( node, node );
        
        System.out.println(isConnected());
    }
    
    private boolean isConnected(){
        for( int node : graph.keySet() )
            if( pre[node] == -1 )
                return false;
        return true;
    }
    
    private void DFS( int u, int v ){
//        int children = 0;
        pre[v] = cnt++;
        low[v] = pre[v];
//        System.out.println("(" + u + "," + v + "):\t" + Arrays.toString(pre) + "\n\t" + Arrays.toString(low));
        for(int w : graph.get( v ))
            if( pre[w] == -1 ){
//                children++;
                DFS(v, w);
                low[v] = Math.min(low[v], low[w]);
                if( low[w] >= pre[v] && u != v )
                    articulations.add( v );
            } else if( w != u )
                low[v] = Math.min( low[v], low[w] );
//        System.out.println("@(" + u + "," + v + "):\t" + Arrays.toString(pre) + "\n\t" + Arrays.toString(low));
//        if( u == v && children > 1 )
//            articulation[v] = true;
    }
    
    public Set<Integer> getNonArticulationPoints(){
        Set<Integer> nap = new HashSet<>( graph.keySet() );
        nap.removeAll( articulations );
        return nap;
    }
    
    private static void add(Map<Integer, Set<Integer>> g, int v1, int v2){
        if( !g.containsKey(v1) )
            g.put(v1, new HashSet<Integer>());
        if( !g.containsKey(v2) )
            g.put(v2, new HashSet<Integer>());
        g.get(v1).add(v2);
        g.get(v2).add(v1);
    }
    
    private static Map<Integer, Set<Integer>> getGraph( int[] t ){
        Map<Integer, Set<Integer>> g = new HashMap<>();
        for( int i=0 ; i<t.length ; i+=2 )
            add(g, t[i], t[i+1]);
        return g;
    }
    
    public static void main(String[] args) {
        System.out.println(new TarjansArtPointsTest(getGraph( new int[] {
            
            0,1,
            1,2,
            2,3
                
        } ), 0).articulations);
        
        System.out.println(new TarjansArtPointsTest(getGraph( new int[] {
            
            0,1,
            0,2,
            1,2,
            0,3,
            3,4
                
        } ), 1).articulations);
        
        System.out.println(new TarjansArtPointsTest(getGraph( new int[] {
            
            0,1,
            0,2,
            1,6,
            1,2,
            1,3,
            1,4,
            4,5,
            5,3,
                
        } ), 0).articulations);
        System.out.println(new TarjansArtPointsTest(getGraph( new int[] {
            
            0,1,
            0,2,
            1,6,
            1,2,
//            1,3,
            1,4,
            4,5,
//            5,3,
                
        } ), 0).articulations);
        
    }
}
