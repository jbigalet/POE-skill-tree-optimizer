package poepassiveskilltreeoptimizer.Deserialization;

import java.util.HashMap;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SkillSprite {

    public String filename;
    public HashMap<String, Art2D> coords;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
