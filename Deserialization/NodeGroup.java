package poepassiveskilltreeoptimizer.Deserialization;

import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class NodeGroup {
    
    public double x;
    public double y;
    public HashMap<Integer, Boolean> oo;
    public List<Integer> n;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
