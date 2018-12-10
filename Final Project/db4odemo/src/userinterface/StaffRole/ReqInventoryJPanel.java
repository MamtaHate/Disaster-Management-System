/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import Business.Enterprise.Enterprise;
import Business.Items.Item;
import Business.Organization.DisasterVictimOrganization;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WarehouseRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class ReqInventoryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;

    /**
     * Creates new form reqInventoryJPanel
     */
    public ReqInventoryJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = userAccount;
        this.enterprise = enterprise;
        populateComboBox();
    }

    public void populateComboBox() {
        itemCategory.addItem(Item.ItemType.Batteries);
        itemCategory.addItem(Item.ItemType.FireExtinguisher);
        itemCategory.addItem(Item.ItemType.FirstAid);
        itemCategory.addItem(Item.ItemType.FlashLight);
        itemCategory.addItem(Item.ItemType.Food);
        itemCategory.addItem(Item.ItemType.Medicines);
        itemCategory.addItem(Item.ItemType.Radio);
        itemCategory.addItem(Item.ItemType.Rope);
        itemCategory.addItem(Item.ItemType.TrashBag);
        itemCategory.addItem(Item.ItemType.Water);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        itemCategory = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 253, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("REQUEST INVENTORY");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 41));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("REQUEST TYPE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 140, 40));

        qty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 230, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("QUANTITY");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/arrow-back-icon_1_40x40.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 50));

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSubmit.setText("Submit Request");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 190, 40));

        itemCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(itemCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] components = userProcessContainer.getComponents();
        for (Component c : components) {
            if (c instanceof ManageRequestsJPanel) {
                ManageRequestsJPanel m = (ManageRequestsJPanel) c;
                m.populateInventoryRequests();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int remaining = 0;
        
        boolean allowSave = true;
        
        
        
        
        WarehouseRequest request = new WarehouseRequest();
        request.setItemType(itemCategory.getSelectedItem().toString());
        request.setQty(Integer.parseInt(qty.getText()));

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof WarehouseOrganization) {
                for (Item i : ((WarehouseOrganization) org).getItemCatalog().getItemList()) {
                    if(i.getCategory().toString().equals(itemCategory.getSelectedItem().toString())) {
                        remaining = i.getQty();
                        request.setItem(i); 
                    }             
                }
            }
        }
        request.setRemaining(remaining);
        request.setRequestDate(new Date());
        request.setSender(account);
        request.setStatus("Pending");
        System.out.println("Request: " + request.getStatus());

        account.getWorkQueue().getWorkRequestList().add(request);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof WarehouseOrganization) {
                organization.getWorkQueue().getWorkRequestList().add(request);
            }
        }

        
        JOptionPane.showMessageDialog(this, "Request submitted");
    }//GEN-LAST:event_btnSubmitActionPerformed

    
    
    public boolean validateInput () {
        if(qty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Quantity is required");
            return false;
        }
        else if (qty.getText().matches("[0-9]+") == false) {
            JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
            return false;
        }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox itemCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField qty;
    // End of variables declaration//GEN-END:variables
}
