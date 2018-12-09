/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DisasterVictimRegistry;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DisasterVictimOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientResgistryOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DisasterRegistryWorkRequest;
import Business.WorkQueue.MissingPersonRequest;
import Business.WorkQueue.PatientRegistry;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamta
 */
public class RequestVictimWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestVictimWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private DisasterVictimOrganization organization;
    private EcoSystem system;
    private UserAccount account;
    private Enterprise enterprise;

    public RequestVictimWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount account,DisasterVictimOrganization organization,Enterprise enterprise) {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.system = system;
        this.account = account;
        this.enterprise = enterprise;
        populateComboBox();
        populateRequestTable();
    }
    public void populateComboBox() {
        //selectCombo.removeAllItems();
        selectCombo.addItem("Missing Person");
        selectCombo.addItem(Organization.OrganizationType.PatientRegistry);
        //selectCombo.addItem(Enterprise.EnterpriseType.Alerts);
    }

   public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel)workQueueTbl.getModel();
        model.setRowCount(0);
        for (WorkRequest req : account.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = req;
                row[1] = req.getMessage();
                row[2] = req.getSender();
                row[3] = req.getReceiver();
                row[4] = req.getStatus();
                row[5] = ((PatientRegistry)req).getTestResult();
                model.addRow(row);
        }
        for(WorkRequest req : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[model.getColumnCount()];
                row[0] = req;
                row[1] = "Missing Person";
                row[2] = ((MissingPersonRequest)req).getSender();
                row[3] = ((MissingPersonRequest)req).getReceiver();
                row[4] = ((MissingPersonRequest)req).getStatus();
//                row[4] = ((MissingPersonRequest)req);
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

        genderGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        workQueueTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        panelRaiseRequest = new javax.swing.JPanel();
        btnRaiseRequest = new javax.swing.JButton();
        typeTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        synopsisTxt = new javax.swing.JTextField();
        patientNameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        selectCombo = new javax.swing.JComboBox();
        identificationTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        gender = new javax.swing.JLabel();
        processJButton = new javax.swing.JButton();

        workQueueTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Person Name", "Message", "Sender", "Receiver", "Status", "Result"
            }
        ));
        jScrollPane1.setViewportView(workQueueTbl);

        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("MANAGE REQUESTS");

        panelRaiseRequest.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RAISE A NEW REQUEST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        panelRaiseRequest.setEnabled(false);

        btnRaiseRequest.setText("MAKE REQUEST");
        btnRaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseRequestActionPerformed(evt);
            }
        });

        jLabel3.setText("Type of emergency:");

        jLabel4.setText("Synopsis:");

        jLabel7.setText("Name of Patient:");

        selectCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectComboActionPerformed(evt);
            }
        });

        jLabel5.setText("Identification mark:");

        rdbMale.setBackground(new java.awt.Color(214, 217, 224));
        genderGroup.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rdbMale.setText("Male");

        rdbFemale.setBackground(new java.awt.Color(214, 217, 224));
        genderGroup.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rdbFemale.setText("Female");

        gender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gender.setText("Gender:");

        javax.swing.GroupLayout panelRaiseRequestLayout = new javax.swing.GroupLayout(panelRaiseRequest);
        panelRaiseRequest.setLayout(panelRaiseRequestLayout);
        panelRaiseRequestLayout.setHorizontalGroup(
            panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeTxt)
                            .addComponent(synopsisTxt)
                            .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(identificationTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gender)
                        .addGap(59, 59, 59)
                        .addComponent(rdbMale)
                        .addGap(42, 42, 42)
                        .addComponent(rdbFemale))
                    .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnRaiseRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRaiseRequestLayout.setVerticalGroup(
            panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRaiseRequestLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(selectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                        .addComponent(identificationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(synopsisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRaiseRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gender)
                                    .addComponent(rdbMale)
                                    .addComponent(rdbFemale))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnRaiseRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRaiseRequestLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(processJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(panelRaiseRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRaiseRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(processJButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selectComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectComboActionPerformed
        // TODO add your handling code here:
        patientNameTxt.setText("");
        //genderTxt.setText("");
        typeTxt.setText("");
        
        if (selectCombo.getSelectedItem().toString().equals("Missing Person")) {
            jLabel7.setText("Accommodation required for:");
            //jLabel4.setText("Location:");
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            typeTxt.setVisible(false);
          // genderTxt.setVisible(false);
        }
        else {
//            jLabel7.setText("Name of Patient:");
//            jLabel3.setText("Type of emergency:");
//            jLabel4.setText("Identification mark:");
            
//        boolean allowSave = true;
//        allowSave = validateInputFields();
//        String gender = "";
//        if (allowSave) {
//            
//            if (genderGroup.getSelection().equals(rdbMale.getModel())) {
//                gender = "Male";
//            } else if (genderGroup.getSelection().equals(rdbFemale.getModel())) {
//                gender = "Female";
//            }
//        }

            if (selectCombo.getSelectedItem().equals(Organization.OrganizationType.PatientRegistry)) {
                jLabel7.setVisible(true);
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                typeTxt.setVisible(true);
                //genderTxt.setVisible(true);
            }

        }
    }//GEN-LAST:event_selectComboActionPerformed

    public boolean validateInputFields() {
        boolean allowSave = true;

        if (patientNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name is required");
            return false;
        } else {
            allowSave = validateStrings(patientNameTxt.getText());
        }

        if (genderGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Gender is required");
            return false;
        }
        
        if(identificationTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Identification is required.");
            return false;
        }
        
        if(synopsisTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Synopsis is required.");
            return false;
        }
        
        return allowSave;
    }

    public boolean validateStrings(String name) {
        if (patientNameTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter mandatory value", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z ]*");
        Matcher matcher = pattern.matcher(name);
        if (!matcher.matches()) {

            JOptionPane.showMessageDialog(null, "Please enter valid string value", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void btnRaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseRequestActionPerformed
        // TODO add your handling code here:
        
//        String name = patientNameTxt.getText();
//        String type= typeTxt.getText();
//        String comment = commentsTxt.getText();

//        if (selectCombo.getSelectedItem().equals(Organization.OrganizationType.Housing)) {
//            HousingWorkRequest workRequest = new HousingWorkRequest();
//            workRequest.setShelter(patientNameTxt.getText());
//            workRequest.setSender(account);
//            workRequest.setStatus("Pending");
//            workRequest.setMessage(commentsTxt.getText());
//            account.getWorkQueue().getWorkRequestList().add(workRequest);
//
//            for (Network network : system.getNetworkList()) {
//                if (network.getNetworkName().equals(enterprise.getNetworkName())) {
//                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
//                        if (e instanceof ShelterEnterprise) {
//                            for(Organization organization : e.getOrganizationDirectory().getOrganizationList()){
//                                if(organization instanceof HousingOrganization){
//                                    organization.getWorkQueue().getWorkRequestList().add(workRequest);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        } else 
        System.out.println("ent name"+enterprise.getNetworkName());
        if (selectCombo.getSelectedItem().equals(Organization.OrganizationType.PatientRegistry)) {
            // workRequest = new FoodClothingWorkRequest();
            //((FoodClothingWorkRequest)workRequest).setNoOfPeople(noOfPeopleTextField.getText());

        boolean allowSave = true;
        allowSave = validateInputFields();
        String gender = "";
        if (allowSave) {
            
            if (genderGroup.getSelection().equals(rdbMale.getModel())) {
                gender = "Male";
            } else if (genderGroup.getSelection().equals(rdbFemale.getModel())) {
                gender = "Female";
            }
        }
            PatientRegistry workRequest = new PatientRegistry();
            // workRequest.setNoOfPeople(noOfPeopleTextField.getText());
            workRequest.setName(patientNameTxt.getText());
            workRequest.setSynopsis(typeTxt.getText());
            workRequest.setIdentification(identificationTxt.getText());
            workRequest.setStatus("Pending");
            workRequest.setGender(gender);
            workRequest.setSender(account);
            workRequest.setMessage(synopsisTxt.getText());
            account.getWorkQueue().getWorkRequestList().add(workRequest);

            for (Network network : system.getNetworkList()) {
                if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e instanceof HospitalEnterprise) {
                            for(Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                                if(organization instanceof PatientResgistryOrganization){
                                    organization.getWorkQueue().getWorkRequestList().add(workRequest);
                                }
                            }
                        }
                    }
                }
            }

        } 
        JOptionPane.showMessageDialog(this, "Request created successfully");
        populateRequestTable();
    }//GEN-LAST:event_btnRaiseRequestActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workQueueTbl.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Select a row");
            return;
        }

        MissingPersonRequest request = (MissingPersonRequest)workQueueTbl.getValueAt(selectedRow, 0);

        //request.setStatus("Processing");

        ProcessMissingPersonJPanel processMissingPersonJPanel = new ProcessMissingPersonJPanel(userProcessContainer, request,organization);
        userProcessContainer.add("processMissingPersonJPanel", processMissingPersonJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRaiseRequest;
    private javax.swing.JLabel gender;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JTextField identificationTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelRaiseRequest;
    private javax.swing.JTextField patientNameTxt;
    private javax.swing.JButton processJButton;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JComboBox selectCombo;
    private javax.swing.JTextField synopsisTxt;
    private javax.swing.JTextField typeTxt;
    private javax.swing.JTable workQueueTbl;
    // End of variables declaration//GEN-END:variables
}
