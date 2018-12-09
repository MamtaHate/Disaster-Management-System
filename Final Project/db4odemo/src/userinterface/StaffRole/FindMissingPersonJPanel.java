/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DisasterVictimOrganization;
import Business.Organization.Organization;
import Business.Organization.StaffOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MissingPersonRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class FindMissingPersonJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StaffOrganization organization;
    private UserAccount account;
    private Enterprise enterprise;

    /**
     * Creates new form FindMissingPersonJPanel
     */
    public FindMissingPersonJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = userAccount;
        this.enterprise = enterprise;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        personNameTextField = new javax.swing.JTextField();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        addressTextField = new javax.swing.JTextField();
        submitRequest = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(214, 217, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("FIND A MISSING PERSON");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 41));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Person Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 140, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Gender:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Address:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 110, 30));
        add(personNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 230, 30));

        genderGroup.add(rdbMale);
        rdbMale.setText("Male");
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 213, -1, 30));

        genderGroup.add(rdbFemale);
        rdbFemale.setText("Female");
        add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 213, -1, 30));
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 230, 30));

        submitRequest.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        submitRequest.setText("Submit Request");
        submitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRequestActionPerformed(evt);
            }
        });
        add(submitRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 220, 40));

        backButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 168, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void submitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRequestActionPerformed
        // TODO add your handling code here:

        boolean allowSubmit = true;

        allowSubmit = validateInput();

        if (allowSubmit) {
            MissingPersonRequest request = new MissingPersonRequest();
            request.setPersonName(personNameTextField.getText());
            if (genderGroup.isSelected(rdbMale.getModel())) {
                request.setGender("Male");
            } else {
                request.setGender("Female");
            }
            request.setAddress(addressTextField.getText());
            request.setSender(account);
            request.setStatus("Missing");

            account.getWorkQueue().getWorkRequestList().add(request);

            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof DisasterVictimOrganization) {
                    organization.getWorkQueue().getWorkRequestList().add(request);
                }
            }

            JOptionPane.showMessageDialog(this, "Request submitted");
        }


    }//GEN-LAST:event_submitRequestActionPerformed

    public boolean validateInput() {
        if (personNameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Person name is required");
            return false;
        }

        if (genderGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Gender is required");
            return false;
        }

        return true;
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] components = userProcessContainer.getComponents();
        for (Component c : components) {
            if (c instanceof ManageRequestsJPanel) {
                ManageRequestsJPanel m = (ManageRequestsJPanel) c;
                m.populateMissingRequests();
            }
        }


    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField personNameTextField;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JButton submitRequest;
    // End of variables declaration//GEN-END:variables
}
