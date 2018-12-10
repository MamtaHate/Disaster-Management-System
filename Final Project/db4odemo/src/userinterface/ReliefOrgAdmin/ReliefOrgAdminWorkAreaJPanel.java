/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReliefOrgAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Incident.Incident;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ReliefOrgAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem system;
    /**
     * Creates new form ReliefOrgAdminWorkAreaJPanel
     */
    public ReliefOrgAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        this.account = account;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageUserJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        viewIncidentJButton = new javax.swing.JButton();
        approveDonations = new javax.swing.JButton();
        approveDonations1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 253, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageUserJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageUserJButton.setText("MANAGE USER");
        manageUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserJButtonActionPerformed(evt);
            }
        });
        add(manageUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 320, 60));

        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("MANAGE ORGANIZATION");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 320, 60));

        manageEmployeeJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageEmployeeJButton.setText("MANAGE EMPLOYEE");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 320, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO RELIEF ORGANIZATION ADMIN WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 41));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ENTERPRISE:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, 40));

        valueLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 210, 40));

        viewIncidentJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewIncidentJButton.setText("VIEW INCIDENTS REPORTED");
        viewIncidentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIncidentJButtonActionPerformed(evt);
            }
        });
        add(viewIncidentJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 320, 60));

        approveDonations.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        approveDonations.setText("DONATION STATS");
        approveDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveDonationsActionPerformed(evt);
            }
        });
        add(approveDonations, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 320, 60));

        approveDonations1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        approveDonations1.setText("APPROVE DONATIONS");
        approveDonations1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveDonations1ActionPerformed(evt);
            }
        });
        add(approveDonations1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 320, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrganizationJPanel manageOrgJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrgJPanel", manageOrgJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        ManageEmployeeJPanel manageEmpJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmpJPanel", manageEmpJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserJButtonActionPerformed
        ManageUserAccountJPanel manageUserJPanel = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageUserJPanel", manageUserJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserJButtonActionPerformed

    private void viewIncidentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIncidentJButtonActionPerformed
        // TODO add your handling code here:
        ViewIncidentsJPanel viewIncidentJPanel = new ViewIncidentsJPanel(userProcessContainer, enterprise, account, system);
        userProcessContainer.add("viewIncidentJPanel", viewIncidentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewIncidentJButtonActionPerformed

    private void approveDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveDonationsActionPerformed
        // TODO add your handling code here:
        DonationAnalysis viewIncidentJPanel = new DonationAnalysis(userProcessContainer, enterprise, account, system);
        userProcessContainer.add("DonationAnalysis", viewIncidentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_approveDonationsActionPerformed

    private void approveDonations1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveDonations1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        ApproveDonationsJPanel viewIncidentJPanel = new ApproveDonationsJPanel(userProcessContainer, enterprise, account, system);
        userProcessContainer.add("viewIncidentJPanel", viewIncidentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_approveDonations1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveDonations;
    private javax.swing.JButton approveDonations1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageUserJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewIncidentJButton;
    // End of variables declaration//GEN-END:variables
}
