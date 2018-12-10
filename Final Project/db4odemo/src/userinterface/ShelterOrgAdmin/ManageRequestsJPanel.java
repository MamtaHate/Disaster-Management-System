/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ShelterOrgAdmin;

import Business.Enterprise.Enterprise;
import Business.Organization.HousingOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HousingWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Role.Role.RoleType;
import java.awt.CardLayout;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization org;

    /**
     * Creates new form ManageRequestsJPanel
     */
    public ManageRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateJTable();
    }

    public void populateJTable() {

        DefaultTableModel model = (DefaultTableModel) shelterTable.getModel();
        model.setRowCount(0);

        for (WorkRequest req : enterprise.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = req.getIncident();
            row[1] = req.getSender().toString();
            row[2] = req.getReceiver();
            row[3] = req.getStatus();
            //row[4] = (req instanceof HousingWorkRequest) ? "Housing" : "Food and Clothing";
            row[4] = req;
            row[5] = (req instanceof HousingWorkRequest) ? ((HousingWorkRequest) req).getNoOfPeople() : 0;
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
        shelterTable = new javax.swing.JTable();
        assignButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 253, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE REQUESTS FOR SHELTER ENTERPRISE ADMIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 780, 41));

        shelterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident ", "Sender", "Receiver", "Status", "Requested For", "Need?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        shelterTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                shelterTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(shelterTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 690, 110));

        assignButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        assignButton.setText("Assign");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 230, 50));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/arrow-back-icon_1_40x40.png"))); // NOI18N
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void shelterTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_shelterTablePropertyChange
        // TODO add your handling code here:


    }//GEN-LAST:event_shelterTablePropertyChange

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
        if (shelterTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request");
        } else {
            // assignButton.setText("Assign to " + shelterTable.getValueAt(shelterTable.getSelectedRow(), 4) + " Organization");
            if (!shelterTable.getValueAt(shelterTable.getSelectedRow(), 3).toString().equals("In Progress")) {
                if (shelterTable.getValueAt(shelterTable.getSelectedRow(), 4).toString() == "Housing") {
                    WorkRequest req = (HousingWorkRequest) shelterTable.getValueAt(shelterTable.getSelectedRow(), 4);
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof HousingOrganization) {
                            this.org = org;
                        }
                    }
                    if (org != null) {
                        this.org.getWorkQueue().getWorkRequestList().add(req);
                        for (UserAccount user : this.org.getUserAccountDirectory().getUserAccountList()) {
                            if (user.getRole().toString().equals(RoleType.HousingAdminRole.getValue())) {
                                req.setReceiver(user);
                                req.setMessage(req.getMessage() + "Sent to Housing Admin");
                                req.setStatus("In Progress");
                                JOptionPane.showMessageDialog(this, "Request sent to housing facility");
                                populateJTable();
                            }
                        }

                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Request is already in progress");
            }

        }

    }//GEN-LAST:event_assignButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable shelterTable;
    // End of variables declaration//GEN-END:variables
}
