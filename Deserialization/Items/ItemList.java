package poepassiveskilltreeoptimizer.Deserialization.Items;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemList {
    
    public Item[] items;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
