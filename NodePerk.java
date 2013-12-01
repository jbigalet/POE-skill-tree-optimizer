package poepassiveskilltreeoptimizer;

import java.util.ArrayList;
import java.util.List;
import poepassiveskilltreeoptimizer.Deserialization.Node;

public class NodePerk {
    
    private List<Integer[]> toExec = new ArrayList<>();

    public NodePerk( Node n ) {
        for( String perk : n.sd ){
            boolean found = false;
            for( BasePerk bPerk : BasePerks.perkList ){
                Integer v = bPerk.getValue( perk );
                if( v != null ){
                    found = true;
                    toExec.add(new Integer[] {bPerk.id, v});
                    if( "ironReflexes".equals(bPerk.name) ){
                        System.out.println("Iron Reflexes found: Node #" + n.id);
                        BaseSkillTree.IRNode = n.id;
                    } else if ("flatMeleeWeaponAndUnarmedRange".equals( bPerk.name ) ){
                        System.out.println("Master of the Arena found: Node#" + n.id);
                        BaseSkillTree.MotANode = n.id;
                    }
                    break;
                }
            }
            if( !found ) System.out.println("Perk not found: [Node #" + n.id + "] " + perk);
        }
    }
    
    public void exec( int[] values ){
        for( Integer[] is : toExec )
            values[is[0]] += is[1];
    }
}
