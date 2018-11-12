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

        }
              
        String[] orderRow;      
        while ((orderRow = orderReader.getNextRow()) != null) {
        
        }  
        
        runAnalysis();
    }
    
    private void generateProducts(String[] row){

    }
    
    private void runAnalysis() {
        
    }
}
