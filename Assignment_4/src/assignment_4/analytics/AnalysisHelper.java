/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import assignment_4.entities.Customer;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Sweta Chowdhury
 */
public class AnalysisHelper {

    Map<Integer, Integer> productPopularity = new HashMap<Integer, Integer>();
    Map<Integer, Order> orders = DataStore.getInstance().getOrders();
    Map<Integer, Product> products = DataStore.getInstance().getProducts();
    Map<Integer, Integer> customerOrderRevenue = new HashMap<Integer, Integer>();
    Map<Integer, Customer> customers = DataStore.getDataStore().getCustomers();
    Map<Integer, Integer> salesPersonPopularity = new HashMap<Integer, Integer>();
    Map<Integer, SalesPerson> salesPersons = DataStore.getDataStore().getSalesPersons();

    /*1) Our top 3 most popular product sorted from high to low.*/
    public void top3MostPopularProduct() {

        int totalRevenuePerProduct = 0;

        for (Product product : products.values()) {
            totalRevenuePerProduct = 0;
            for (Order order : orders.values()) {
                if (product.getProductId() == order.getItem().getProductId()) {
                    totalRevenuePerProduct += (order.getItem().getSalesPrice() - product.getFloorPrice()) * order.getItem().getQuantity();
                }
            }
            productPopularity.put(product.getProductId(), totalRevenuePerProduct);
        }

        Set<Map.Entry<Integer, Integer>> entries = productPopularity.entrySet();
        List<Map.Entry<Integer, Integer>> listOfEntries = new ArrayList<Map.Entry<Integer, Integer>>(entries);

        Collections.sort(listOfEntries, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> t, Map.Entry<Integer, Integer> t1) {
                return t1.getValue() - t.getValue();

            }
        });
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("1) Top 3 most popular product sorted from high to low ");
        System.out.println("--------------------------------------------------------------------------------");
        //System.out.println("Data Set: " + productPopularity);
        int i = 0;
        for (Map.Entry<Integer, Integer> mapping : listOfEntries) {
            if (i == 3) {
                break;
            }
            System.out.println("Product Id " + mapping.getKey() + " generated revenue $" + mapping.getValue());
            i++;
        }
    }

    /*3) Our top 3 best sales people*/
    public void top3BestSalesPeople() {

        int totalRevenuePerProduct = 0;

        for (SalesPerson salesPerson : salesPersons.values()) {
            totalRevenuePerProduct = 0;
            for (Order order : salesPerson.getOrders()) {
                totalRevenuePerProduct += (order.getItem().getSalesPrice() - products.get(order.getItem().getProductId()).getFloorPrice()) * order.getItem().getQuantity();
            }
            salesPersonPopularity.put(salesPerson.getSalesId(), totalRevenuePerProduct);
        }

        List<Map.Entry<Integer, Integer>> listOfEntries = new ArrayList<Map.Entry<Integer, Integer>>(salesPersonPopularity.entrySet());

        Collections.sort(listOfEntries, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> t, Map.Entry<Integer, Integer> t1) {
                return t1.getValue() - t.getValue();

            }
        });
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("3) Top best sales people ");
        System.out.println("--------------------------------------------------------------------------------");
        //System.out.println("Data Set: " + salesPersonPopularity);
        int i = 0;
        for (Map.Entry<Integer, Integer> mapping : listOfEntries) {
            if (i == 3) {
                break;
            }
            System.out.println("Sales Person Id " + mapping.getKey() + " generated revenue $" + mapping.getValue());
            i++;
        }
    }

    /*4) Our total revenue for the year*/
    public void totalRevenueGenerated() {

        int totalRevenue = 0;

        for (Order order : orders.values()) {
            totalRevenue += (order.getItem().getSalesPrice() - products.get(order.getItem().getProductId()).getFloorPrice()) * order.getItem().getQuantity();
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("4) Total Revenue for the year is $" + totalRevenue);
        System.out.println("--------------------------------------------------------------------------------");

    }

}
