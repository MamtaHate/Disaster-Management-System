/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import Business.Enterprise.Enterprise;
import Business.Items.Item;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MissingPersonRequest;
import Business.WorkQueue.WarehouseRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageRequestsJPanel extends javax.swing.JPanel {

    
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    /**
     * Creates new form ManageRequestsJPanel
     */
    public ManageRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateMissingRequests();
        populateInventoryRequests();
    }
        
    public void populateInventoryRequests() {
        
        DefaultTableModel model = (DefaultTableModel) reqInventoryjTable.getModel();
        model.setRowCount(0);

        for(WorkRequest request: userAccount.getWorkQueue().getWorkRequestList()) {
            if(request instanceof WarehouseRequest){
                Object[] row = new Object[model.getColumnCount()];
                row[0] = (WarehouseRequest) request;
                row[1] = ((WarehouseRequest) request).getQty();
                row[2] =  request.getReceiver();
                row[3] = request.getRequestDate();
                row[4] = request.getStatus();
                model.addRow(row);
            }
        }
        
               
    }
    
    public void populateMissingRequests() {
        
        DefaultTableModel model = (DefaultTableModel) jMissingRequests.getModel();
        model.setRowCount(0);

        for(WorkRequest request: userAccount.getWorkQueue().getWorkRequestList()) {
            if(request instanceof MissingPersonRequest){
                Object[] row = new Object[model.getColumnCount()];
                row[0] = request;
                row[1] = ((MissingPersonRequest) request).getGender();
                row[2] = ((MissingPersonRequest) request).getAddress();
                row[3] = ((MissingPersonRequest) request).getStatus();
                model.addRow(row);
            }
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
        reqInventoryjTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jMissingRequests = new javax.swing.JTable();
        requestPersonDetails = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 253, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE STAFF REQUESTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 41));

        reqInventoryjTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        reqInventoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Type", "Quantity", "Reciever", "Request Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reqInventoryjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 530, 130));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Request Inventory");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, 50));

        jMissingRequests.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMissingRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Name", "Gender", "Address", "Status"
            }
        ));
        jScrollPane2.setViewportView(jMissingRequests);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 550, 130));

        requestPersonDetails.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        requestPersonDetails.setText("Request person details");
        requestPersonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestPersonDetailsActionPerformed(evt);
            }
        });
        add(requestPersonDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 260, 50));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("<<BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 168, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void requestPersonDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestPersonDetailsActionPerformed
        // TODO add your handling code here:
        FindMissingPersonJPanel missingPersonJPanel = new FindMissingPersonJPanel(userProcessContainer, userAccount, enterprise);
        userProcessContainer.add("missingPersonJPanel", missingPersonJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_requestPersonDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ReqInventoryJPanel reqInventoryJPanel = new ReqInventoryJPanel(userProcessContainer, userAccount, enterprise);
        userProcessContainer.add("reqInventoryJPanel", reqInventoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jMissingRequests;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable reqInventoryjTable;
    private javax.swing.JButton requestPersonDetails;
    // End of variables declaration//GEN-END:variables
}
