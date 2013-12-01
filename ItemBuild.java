package poepassiveskilltreeoptimizer;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import poepassiveskilltreeoptimizer.Deserialization.Items.ItemList;
import poepassiveskilltreeoptimizer.Deserialization.Items.Item;

public class ItemBuild {
    
    ItemList itemList;
    List<Item> mainItems;
    
    public ItemBuild(String sItemFile){
        String itemJSON = Utils.ReadFileW(sItemFile);
        itemList = new Gson().fromJson( itemJSON, ItemList.class );
        
        mainItems = new ArrayList<>();
        for(Item i : itemList.items)
            if( !i.inventoryId.equals("MainInventory") && !i.inventoryId.equals("Flask")
                    && !i.inventoryId.equals("Weapon2") && !i.inventoryId.equals("Offhand2"))
                mainItems.add(i);
        for(Item i:mainItems)
            System.out.println(i.typeLine + " -> " + i.inventoryId);
        
    }
    
}
