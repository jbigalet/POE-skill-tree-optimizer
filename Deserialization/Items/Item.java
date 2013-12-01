package poepassiveskilltreeoptimizer.Deserialization.Items;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {
    
    public Boolean verified;
    public Integer w;
    public Integer h;
    public String icon;
    public Boolean support;
    public String league;
    public Socket[] sockets;
    public String name;
    public String typeLine;
    public Boolean identified;
    public String[] implicitMods;
    public String[] explicitMods;
    public String[] flavourText;
    public Integer frameType;
    public Integer x;
    public Integer y;
    public String inventoryId;
    public Item[] socketedItems;
    public Property[] properties;
    public Requirement[] requirements;
    public String descrText;
    public AdditionalProperty[] additionalProperties;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
