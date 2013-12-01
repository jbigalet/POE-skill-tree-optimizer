package poepassiveskilltreeoptimizer.Deserialization;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Character {
    
    public int base_str;
    public int base_dex;
    public int base_int;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
