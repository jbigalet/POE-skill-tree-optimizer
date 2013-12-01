package poepassiveskilltreeoptimizer.Deserialization;

import java.util.HashMap;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Constants {
    
    public HashMap<String, Integer> classes;
    public HashMap<String, Integer> characterAttributes;
    public int PSSCentreInnerRadius;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
