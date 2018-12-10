/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReliefOrgAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Incident.Incident;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ApproveDonationsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem system;

    /**
     * Creates new form ApproveDonationsJPanel
     */
    public ApproveDonationsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, EcoSystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        populateTable();
        donationRequests.getColumnModel().getColumn(0).setMinWidth(0);
        donationRequests.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) donationRequests.getModel();
        model.setRowCount(0);

        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = request;
            row[1] = ((DonationWorkRequest) request).getDonationType();
            row[2] = request.getSender();
            row[3] = request.getReceiver();
            row[4] = request.getResolveDate();
            row[5] = request.getStatus();
            model.addRow(row);
        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        donationRequests = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        approveButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(214, 217, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("APPROVE DONATIONS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 280, 41));

        donationRequests.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        donationRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donation", "Donation Type", "Sender ", "Approver", "Approved Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(donationRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 130, 780, 140));

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 170, 40));

        approveButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        approveButton.setText("Approve");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });
        add(approveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        // TODO add your handling code here:
        if (donationRequests.getSelectedRow() >= 0) {

            if (donationRequests.getValueAt(donationRequests.getSelectedRow(), 5).toString().equals("Approved")) {
                 JOptionPane.showMessageDialog(this, "This donation is already approved");
            } else {
                System.out.println("===Donation work request approval====");
                WorkRequest request = (DonationWorkRequest) donationRequests.getValueAt(donationRequests.getSelectedRow(), 0);
                request.setReceiver(account);
                request.setResolveDate(new Date());
                request.setStatus("Approved");
                System.out.println("Request status:" + request.getStatus());
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select a request");
        }

    }//GEN-LAST:event_approveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable donationRequests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
