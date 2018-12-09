/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Items.ItemCatalog;
import Business.Role.Role;
import Business.Role.WarehouseAdminRole;
import Business.Warehouse.WarehouseDirectory;
import java.util.ArrayList;

/**
 *
 * @author prathamesh tambe
 */
public class WarehouseOrganization extends Organization {
    private ItemCatalog itemCatalog;
    

    public WarehouseOrganization() {
        super(OrganizationType.Warehouse.getValue());
        itemCatalog = new ItemCatalog();
    }

    public ItemCatalog getItemCatalog() {
        return itemCatalog;
    }

    public void setItemCatalog(ItemCatalog itemCatalog) {
        this.itemCatalog = itemCatalog;
    }
       
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WarehouseAdminRole());
        return roles;
    }
}
