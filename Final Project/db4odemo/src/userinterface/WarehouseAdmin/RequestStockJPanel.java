/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WarehouseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Items.Item;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WarehouseRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class RequestStockJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private WarehouseOrganization org;
    private UserAccount account;
    private EcoSystem business;

    /**
     * Creates new form RequestStockJPanel
     */
    public RequestStockJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        populateComboBox();
    }

    public void populateComboBox() {
        itemType.addItem(Item.ItemType.Batteries);
        itemType.addItem(Item.ItemType.FireExtinguisher);
        itemType.addItem(Item.ItemType.FirstAid);
        itemType.addItem(Item.ItemType.FlashLight);
        itemType.addItem(Item.ItemType.Food);
        itemType.addItem(Item.ItemType.Medicines);
        itemType.addItem(Item.ItemType.Radio);
        itemType.addItem(Item.ItemType.Rope);
        itemType.addItem(Item.ItemType.TrashBag);
        itemType.addItem(Item.ItemType.Water);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        itemType = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        message = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("REQUEST FOR STOCK OVER NETWORK");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 41));

        jLabel1.setText("Item Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 30));
        add(itemType, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 220, 40));

        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 100, 30));
        add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 220, 40));

        jLabel4.setText("Message:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 130, -1));

        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });
        add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 220, 40));

        btnSubmit.setText("Submit Request");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 240, 50));

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 170, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        WarehouseRequest req = new WarehouseRequest();
        req.setRequestDate(new Date());
        req.setSender(account);
        req.setItemType(itemType.getSelectedItem().toString());
        req.setQty(Integer.parseInt(qty.getText()));
        req.setMessage(message.getText());
        req.setStatus("Requested");

        account.getWorkQueue().getWorkRequestList().add(req);

        for (Network network : business.getNetworkList()) {
            if (!network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof WarehouseOrganization) {
                            for (Item item : ((WarehouseOrganization) org).getItemCatalog().getItemList()) {
                                if (item.getCategory().toString().equals(itemType.getSelectedItem().toString())) {
                                    req.setRemaining(item.getQty());
                                    req.setItem(item);
                                }
                            }
                            org.getWorkQueue().getWorkRequestList().add(req);
                        }
                    }
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Request raised successfully");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] components = userProcessContainer.getComponents();
        for (Component component : components) {
            if (component instanceof ManageRequestsJPanel) {
                ManageRequestsJPanel req = (ManageRequestsJPanel) component;
                req.populateJTable();
            }
        }
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox itemType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField message;
    private javax.swing.JTextField qty;
    // End of variables declaration//GEN-END:variables
}