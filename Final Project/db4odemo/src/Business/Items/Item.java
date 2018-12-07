/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Items;

/**
 *
 * @author Sweta Chowdhury
 */
public class Item {
    private String name;
    private String category;
    private String unitOfMeasure;
    private String valuePerUnit;
    private Boolean isKit;
    private String comments;
    private Integer qty;
    
    public enum ItemType {
        
        Water("Water"),
        Food("Food"),
        FlashLight("FlashLight"),
        FirstAid("FirstAid"),
        Batteries("Batteries"),
        Medicines("Medicines"),
        FireExtinguisher("Fire extinguisher"),
        Rope("Rope"),
        TrashBag("Trash Bags"),
        Radio("Radio");
        

        private String value;

        private ItemType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getValuePerUnit() {
        return valuePerUnit;
    }

    public void setValuePerUnit(String valuePerUnit) {
        this.valuePerUnit = valuePerUnit;
    }

    public Boolean getIsKit() {
        return isKit;
    }

    public void setIsKit(Boolean isKit) {
        this.isKit = isKit;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    
    
    
    @Override
    public String toString() {
        return category;
    }
    
}
