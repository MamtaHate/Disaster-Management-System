/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataStore;
import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author harshalneelkamal
 */
public class GateWay {

    DataGenerator generator;
    DataReader orderReader;
    DataReader productReader;
    AnalysisHelper helper;

    public GateWay() throws IOException {
        generator = DataGenerator.getInstance();
        productReader = new DataReader(generator.getProductCataloguePath());
        orderReader = new DataReader(generator.getOrderFilePath());
        helper = new AnalysisHelper();
    }

    public static void main(String args[]) throws IOException {
        GateWay gateway = new GateWay();
        gateway.readData();
    }

    private void readData() throws IOException {

        String[] prodRow;
        while ((prodRow = productReader.getNextRow()) != null) {
            generateProducts(prodRow);
        }

        String[] orderRow;
        while ((orderRow = orderReader.getNextRow()) != null) {
            generateOrders(orderRow);
        }

        runAnalysis();
    }

    private void generateProducts(String[] row) {
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        int targetPrice = Integer.parseInt(row[3]);
        Product product = new Product(productId, minPrice, maxPrice, targetPrice);
        DataStore.getInstance().getProducts().put(productId, product);
    }

    private void generateOrders(String row[]){
        int orderId = Integer.parseInt(row[0]);
        int itemId = Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int qty = Integer.parseInt(row[3]);
        int salesId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        int salesPrice = Integer.parseInt(row[6]);   
                       
        Item item = new Item(itemId, productId, salesPrice, qty); 
        DataStore.getInstance().getItems().put(itemId, item);
        
        Order order = new Order(orderId, salesId, customerId, item);
        DataStore.getInstance().getOrders().put(orderId, order);
        
        Map<Integer, Customer> customerList = DataStore.getDataStore().getCustomers();
        if(customerList.containsKey(customerId)){
            customerList.get(customerId).getOrders().add(order);
        }
        else {
             Customer customer = new Customer(customerId);
             customerList.put(customerId, customer);
             customerList.get(customerId).getOrders().add(order);          
        }
        
        Map<Integer, SalesPerson> salesPersonList = DataStore.getDataStore().getSalesPersons();
        if(salesPersonList.containsKey(salesId)){
            salesPersonList.get(salesId).getOrders().add(order);
        }
        else
        {
            SalesPerson salesPerson = new SalesPerson(salesId);
            salesPersonList.put(salesId, salesPerson);
            salesPersonList.get(salesId).getOrders().add(order);
        }
    }
    
    private void runAnalysis() {
       helper.top3MostPopularProduct();
       helper.top3BestCustomers();
       helper.top3BestSalesPeople();
       helper.totalRevenueGenerated();
    }
}
