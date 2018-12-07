/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Warehouse;

import Business.Housing.*;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Prathamesh
 */
public class WarehouseDirectory {
    private ArrayList<Warehouse> warehouseList;

    public WarehouseDirectory() {
        warehouseList = new ArrayList<Warehouse>();
    }
    
    public ArrayList<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public Warehouse createAndAddHousing(){
        Warehouse house = new Warehouse();
        warehouseList.add(house);
        return house;
    }
    

}
