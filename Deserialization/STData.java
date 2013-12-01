package poepassiveskilltreeoptimizer.Deserialization;

import java.util.HashMap;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class STData {
    
    public HashMap<Integer,Character> characterData;
    public HashMap<Integer,NodeGroup> groups;
    public Root root;
    public Node[] nodes;
    public int min_x;
    public int min_y;
    public int max_x;
    public int max_y;
    public HashMap<String, HashMap<Float, String>> assets;
    public Constants constants;
    public String imageRoot;
    public HashMap<String, SkillSprite[]> skillSprites;
    public Double[] imageZoomLevels;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
