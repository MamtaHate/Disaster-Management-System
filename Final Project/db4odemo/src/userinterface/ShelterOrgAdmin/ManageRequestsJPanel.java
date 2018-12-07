/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ShelterOrgAdmin;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.HousingWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;

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
            row[4] = (req instanceof HousingWorkRequest) ? "Housing" : "Food and Clothing";
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

        assignButton.setText("Assign");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 170, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void shelterTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_shelterTablePropertyChange
        // TODO add your handling code here:


    }//GEN-LAST:event_shelterTablePropertyChange

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
        if (shelterTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request");
        } else {
            assignButton.setText("Assign to " + shelterTable.getValueAt(shelterTable.getSelectedRow(), 4) + " Organization");
        }
        if(shelterTable.getValueAt(shelterTable.getSelectedRow(), 4) ==  "Housing"){
            
        }
    }//GEN-LAST:event_assignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable shelterTable;
    // End of variables declaration//GEN-END:variables
}