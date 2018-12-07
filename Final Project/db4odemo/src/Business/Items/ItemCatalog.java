/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Items;

import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class ItemCatalog {
    private ArrayList<Item> itemList;
    
    public ItemCatalog() {
        itemList = new ArrayList<Item>();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    
    public Item addItem() {
        Item item = new Item();
        itemList.add(item);
        return item;
    }
    
    
}
