package poepassiveskilltreeoptimizer.Genetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static poepassiveskilltreeoptimizer.Main.baseSkillTree;

public class MinimalPath {
    
    public static List<Integer> getMinimalPath( Map<Integer, Set<Integer>> perks, int node ){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add( node );
        Map<Integer, Integer> parents = new HashMap<>();
        parents.put( node, null );
        Set<Integer> done = new HashSet<>();
        
//        System.out.println( perks.keySet() );
        Integer finalNode = null;
        while( finalNode == null ){
            int q = queue.removeFirst();
//            System.out.println(q);
//            System.out.println( queue );
//            System.out.println( parents );
//            System.out.println( done );
            if( !done.contains( q ) ){
                done.add( q );
                if( perks.containsKey( q ) )
                    finalNode = q;
                else 
                    for( int link : baseSkillTree.nodeLinks[q] ) {
                        if( !parents.containsKey( link ) )
                            parents.put( link, q );
                        queue.add( link );
                    }
            }
        }

//        System.out.println("waiting for nothing");
        
        List<Integer> path = new ArrayList<>();
        while( (finalNode = parents.get( finalNode )) != null )
            path.add( finalNode );
        
        return path;
    }
}
