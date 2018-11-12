/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author harshalneelkamal
 */
public class SalesPerson {
    private int salesId;
    private List<Order> orders;
    
    public SalesPerson(int salesId){
        this.salesId = salesId;
        this.orders = new ArrayList<>();
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
