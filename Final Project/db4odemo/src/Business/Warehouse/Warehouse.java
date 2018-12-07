/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Warehouse;

import Business.Housing.*;
import Business.Organization.Organization;

/**
 *
 * @author Prathamesh
 */
public class Warehouse {
    private String itemName;
    private String valuePerUnit;

    public Warehouse() {
        
    }
    
    public enum wareHouseType {
        Permanent("Permanent Camp"), 
        Spontaneous("Spontaneous Site"),
        Temporary("Temporary Camp"),
        Transition("Transition Site");

        private String value;

        private wareHouseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum statusType {
        Active("Active"), 
        Inactive("In Active");

        private String value;

        private statusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
/*    public HousingOrganization() {
        super(Organization.OrganizationType.Warehouse.getValue());
    }*/

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getValuePerUnit() {
        return valuePerUnit;
    }

    public void setValuePerUnit(String valuePerUnit) {
        this.valuePerUnit = valuePerUnit;
    }
    
    @Override
    public String toString() {
        return itemName;
    }
    
}
