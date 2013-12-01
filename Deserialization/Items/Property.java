package poepassiveskilltreeoptimizer.Deserialization.Items;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Property {
    
    public String name;
    public String[][] values;
    public Integer displayMode;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }       
}
