package poepassiveskilltreeoptimizer.Deserialization.Items;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AdditionalProperty {
    
    public String name;
    public String[][] values;
    public Integer displayMode;
    public Double progress;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
