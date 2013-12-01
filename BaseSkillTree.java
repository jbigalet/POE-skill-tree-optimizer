package poepassiveskilltreeoptimizer;

import poepassiveskilltreeoptimizer.Deserialization.STData;
import com.google.gson.Gson;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.xml.bind.DatatypeConverter;
import poepassiveskilltreeoptimizer.Deserialization.Node;

public class BaseSkillTree {

    private static String mainURL = "http://www.pathofexile.com/passive-skill-tree/";
    private static File skillTreeJSONFile = new File("skillTree.json");
    public STData stData;
    public Node[] nodes;
    public NodePerk[] nodePerks;
    public Set<Integer>[] nodeLinks;
    public Map<String, Integer> rootNodes;
    public Set<Integer> iRootNodes;
    
    public static int IRNode = -1;
    public static int MotANode = -1;
    public static int CharismaNode = 6799; // Hardcoded like a boss
    
    public BaseSkillTree() {
        String skillTreeJSON;
        if( skillTreeJSONFile.exists() )
            skillTreeJSON = Utils.ReadFileW( skillTreeJSONFile.toString() );
        else {
            String mainPage = Utils.getWebPage(mainURL);
            RegexMatch rm = Utils.matchRegex(mainPage, "var passiveSkillTreeData = ([^\n]+)");
            if(!rm.isFound){
                System.out.println("Impossible to download the new passive skill tree: Regex unfound.");
                System.exit(1);
            }
            skillTreeJSON = rm.matches[1].substring(0, rm.matches[1].length() - 2);
            Utils.WriteFile( skillTreeJSONFile.toString(), skillTreeJSON );
        }
        
        stData = new Gson().fromJson( skillTreeJSON, STData.class );
        
        nodes = new Node[65536];
        nodePerks = new NodePerk[65536];
        nodeLinks = (HashSet<Integer>[]) new HashSet[65536];
        for( int i=0 ; i<65536 ; i++ ) nodeLinks[i] = new HashSet<>();
        
        for( Node n : stData.nodes )
            if( nodes[n.id] != null )
                System.out.println("Duplicated node id #" + n.id);
            else {
                nodes[n.id] = n;
                nodePerks[n.id] = new NodePerk(n);
                for( int iNode : n.out ){
                    nodeLinks[n.id].add( iNode );
                    nodeLinks[iNode].add(n.id);
                }
            }
        
        rootNodes = new HashMap<>();
        iRootNodes = new HashSet<>();
        for( int iRootNode : stData.root.out ){
            int iClass = 0;
            while( !Main.poeClasses2[iClass].equals(nodes[iRootNode].dn) )
                iClass++;
            rootNodes.put( Main.poeClasses[iClass], iRootNode );
            iRootNodes.add( iRootNode );
        }
    }
    
    
    public BaseSkillTree( String url ) {
        Set<Integer> s = new HashSet<>();
        String token = url.replace('-', '+').replace('_', '/');
        byte[] buff = DatatypeConverter.parseBase64Binary(token);
        for( int i=6 ; i < buff.length ; i+=2 )
            s.add( ( buff[i] & 0xFF ) << 8 | buff[i+1] & 0xFF );
        
        String skillTreeJSON;
        if( skillTreeJSONFile.exists() )
            skillTreeJSON = Utils.ReadFileW( skillTreeJSONFile.toString() );
        else {
            String mainPage = Utils.getWebPage(mainURL);
            RegexMatch rm = Utils.matchRegex(mainPage, "var passiveSkillTreeData = ([^\n]+)");
            if(!rm.isFound){
                System.out.println("Impossible to download the new passive skill tree: Regex unfound.");
                System.exit(1);
            }
            skillTreeJSON = rm.matches[1].substring(0, rm.matches[1].length() - 2);
            Utils.WriteFile( skillTreeJSONFile.toString(), skillTreeJSON );
        }
        
        stData = new Gson().fromJson( skillTreeJSON, STData.class );
        
        nodes = new Node[65536];
        nodePerks = new NodePerk[65536];
        nodeLinks = (HashSet<Integer>[]) new HashSet[65536];
        for( int i=0 ; i<65536 ; i++ ) nodeLinks[i] = new HashSet<>();
        
        for( Node n : stData.nodes )
            if( s.contains( n.id ) || !n.dn.isEmpty() ){
                if( nodes[n.id] != null )
                    System.out.println("Duplicated node id #" + n.id);
                else {
                    nodes[n.id] = n;
                    nodePerks[n.id] = new NodePerk(n);
                    for( int iNode : n.out )
                        if( s.contains( iNode ) ){
                            nodeLinks[n.id].add( iNode );
                            nodeLinks[iNode].add(n.id);
                        }
                }
            }
        
        rootNodes = new HashMap<>();
        iRootNodes = new HashSet<>();
        for( int iRootNode : stData.root.out ){
            int iClass = 0;
            while( !Main.poeClasses2[iClass].equals(nodes[iRootNode].dn ) )
                iClass++;
            rootNodes.put( Main.poeClasses[iClass], iRootNode );
            iRootNodes.add( iRootNode );
        }
    }
    
    
//    public List<String> getAttributesList( Set<Integer> tree ){
//        List<String> l = new ArrayList<>();
//        for( Integer iNode : tree ){
//            if( nodes[iNode] != null)
//                l.addAll(Arrays.asList(nodes[iNode].sd));
//        }
//        
//        return l;
//    }
}
