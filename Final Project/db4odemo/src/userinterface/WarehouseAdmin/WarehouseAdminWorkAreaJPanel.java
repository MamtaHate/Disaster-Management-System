/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WarehouseAdmin;

import userinterface.ShelterOrgAdmin.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class WarehouseAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    
    /**
     * Creates new form ReliefOrgAdminWorkAreaJPanel
     */
    public WarehouseAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageOrganizationJButton = new javax.swing.JButton();
        manageRequestsJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("MANAGE ITEMS");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 360, 60));

        manageRequestsJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageRequestsJButton.setText("MANAGE REQUEST");
        manageRequestsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRequestsJButtonActionPerformed(evt);
            }
        });
        add(manageRequestsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 360, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO WAREHOUSE ADMIN WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 41));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageItemsJPanel manageItemsJPanel = new ManageItemsJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageItemsJPanel", manageItemsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageRequestsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRequestsJButtonActionPerformed
        ManageRequestsJPanel manageRequestsJPanel = new ManageRequestsJPanel(userProcessContainer, enterprise, account);
        userProcessContainer.add("manageRequestsJPanel", manageRequestsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageRequestsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageRequestsJButton;
    // End of variables declaration//GEN-END:variables
}