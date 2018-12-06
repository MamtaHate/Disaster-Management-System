/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReliefOrgAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ShelterEnterprise;
import Business.Incident.Incident;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodClothingWorkRequest;
import Business.WorkQueue.HousingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageRequests extends javax.swing.JPanel {

    /**
     * Creates new form ManageRequests
     */
    private JPanel container;
    private Incident incident;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;

    public ManageRequests(JPanel container, Incident incident, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.incident = incident;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        populateComboBox();
        populateJTable();
    }

    public void populateComboBox() {
        comboRequestType.addItem(Organization.OrganizationType.Housing);
        comboRequestType.addItem(Organization.OrganizationType.FoodClothing);
        comboRequestType.addItem(Enterprise.EnterpriseType.Alerts);
    }

    public void populateJTable() {

        DefaultTableModel model = (DefaultTableModel) jTblRequests.getModel();
        model.setRowCount(0);
        for (WorkRequest req : account.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = req.getMessage();
            row[1] = req.getReceiver();
            row[2] = req.getStatus();
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
        jTblRequests = new javax.swing.JTable();
        panelRaiseRequest = new javax.swing.JPanel();
        comboRequestType = new javax.swing.JComboBox();
        btnRaiseRequest = new javax.swing.JButton();
        noOfPeopleTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        commentsJTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE REQUESTS FOR RELIEF ORGANIZATION ADMIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 780, 41));

        jTblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Reciever", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTblRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 620, 200));

        panelRaiseRequest.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RAISE A NEW REQUEST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        panelRaiseRequest.setEnabled(false);

        comboRequestType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRequestTypeActionPerformed(evt);
            }
        });

        btnRaiseRequest.setText("MAKE REQUEST");
        btnRaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseRequestActionPerformed(evt);
            }
        });

        jLabel2.setText("Request Type:");

        jLabel3.setText("Number of People:");

        jLabel4.setText("Comments:");

        javax.swing.GroupLayout panelRaiseRequestLayout = new javax.swing.GroupLayout(panelRaiseRequest);
        panelRaiseRequest.setLayout(panelRaiseRequestLayout);
        panelRaiseRequestLayout.setHorizontalGroup(
            panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noOfPeopleTextField)
                            .addComponent(comboRequestType, 0, 190, Short.MAX_VALUE)
                            .addComponent(commentsJTextField)))
                    .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnRaiseRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRaiseRequestLayout.setVerticalGroup(
            panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRequestType, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfPeopleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commentsJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addComponent(btnRaiseRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        add(panelRaiseRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 580, 330));

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 190, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseRequestActionPerformed
        // TODO add your handling code here:
        // WorkRequest workRequest;
        // HousingWorkRequest wr;
        if (comboRequestType.getSelectedItem().equals(Organization.OrganizationType.Housing)) {
            HousingWorkRequest workRequest = new HousingWorkRequest();
            workRequest.setNoOfPeople(noOfPeopleTextField.getText());
            workRequest.setIncident(incident);
            workRequest.setSender(account);
            workRequest.setStatus("Pending");
            workRequest.setMessage(commentsJTextField.getText());
            account.getWorkQueue().getWorkRequestList().add(workRequest);

            for (Network network : system.getNetworkList()) {
                if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e instanceof ShelterEnterprise) {
                            e.getWorkQueue().getWorkRequestList().add(workRequest);
                        }
                    }
                }
            }

            //((HousingWorkRequest)workRequest).setNoOfPeople(noOfPeopleTextField.getText());
        } else if (comboRequestType.getSelectedItem().equals(Organization.OrganizationType.FoodClothing)) {
            FoodClothingWorkRequest workRequest = new FoodClothingWorkRequest();
//            workRequest.s(noOfPeopleTextField.getText());
//            workRequest.setIncident(incident);
//            workRequest.setSender(account);
//            workRequest.setStatus("Pending");
//            workRequest.setMessage(commentsJTextField.getText());
//            account.getWorkQueue().getWorkRequestList().add(workRequest);
//
//            for (Network network : system.getNetworkList()) {
//                if (network.getNetworkName().equals(enterprise.getNetworkName())) {
//                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
//                        if (e instanceof ShelterEnterprise) {
//                            e.getWorkQueue().getWorkRequestList().add(workRequest);
//                        }
//                    }
//                }
//            }
        } else if(comboRequestType.getSelectedItem().equals(Enterprise.EnterpriseType.Alerts)) {
           
            
            
        }

        JOptionPane.showMessageDialog(this, "Request created successfully");
        populateJTable();
    }//GEN-LAST:event_btnRaiseRequestActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void comboRequestTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRequestTypeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboRequestTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnRaiseRequest;
    private javax.swing.JComboBox comboRequestType;
    private javax.swing.JTextField commentsJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblRequests;
    private javax.swing.JTextField noOfPeopleTextField;
    private javax.swing.JPanel panelRaiseRequest;
    // End of variables declaration//GEN-END:variables
}
