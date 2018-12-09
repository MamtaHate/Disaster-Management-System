/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.DisasterVictimRegistry.RequestVictimWorkAreaJPanel;

/**
 *
 * @author mamta
 */
public class HospitalWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalWorkAreaJPanel
     */
    private UserAccount account;
    Organization organization; 
            Enterprise enterprise;
            EcoSystem business;
            JPanel userProcessContainer;
    public HospitalWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.account=account;
        this.organization = organization;
        this.business= business;
        this.enterprise= enterprise;
        this.userProcessContainer=userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        manageUserJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();

        jButton1.setText("Service Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        manageUserJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageUserJButton.setText("MANAGE USER");
        manageUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserJButtonActionPerformed(evt);
            }
        });

        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("MANAGE ORGANIZATION");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        manageEmployeeJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageEmployeeJButton.setText("MANAGE EMPLOYEE");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(manageUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ServiceRequestsJPanel serviceRequestsJPanel = new ServiceRequestsJPanel(userProcessContainer,account);
        userProcessContainer.add("serviceRequestsJPanel", serviceRequestsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void manageUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserJButtonActionPerformed
        ManageUserAccountJPanel manageUserJPanel = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageUserJPanel", manageUserJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
       OrganizationDirectory od=enterprise.getOrganizationDirectory();
               ManageOrganization manageOrgJPanel = new ManageOrganization(userProcessContainer, od);
        userProcessContainer.add("manageOrgJPanel", manageOrgJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
         OrganizationDirectory od=enterprise.getOrganizationDirectory();
         ManageEmployeeJPanel manageEmpJPanel = new ManageEmployeeJPanel(userProcessContainer, od,organization);
        userProcessContainer.add("manageEmpJPanel", manageEmpJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageUserJButton;
    // End of variables declaration//GEN-END:variables
}