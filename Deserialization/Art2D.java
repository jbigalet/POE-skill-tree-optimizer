package poepassiveskilltreeoptimizer.Deserialization;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Art2D {
    
    public int x;
    public int y;
    public int w;
    public int h;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
