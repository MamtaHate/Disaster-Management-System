/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class AddEditInformationJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private ArrayList<String> skillSet;

    /**
     * Creates new form SkillsAvailableJPanel
     */
    public AddEditInformationJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        populateInformation();
        skillSet = userAccount.getEmployee().getSkillSet();
    }

    public void populateInformation() {
        nameJTextField.setText(userAccount.getEmployee().getName());
        if (userAccount.getEmployee().getPhoneNumber() != null) {
            phoneNumberJTextField.setText(userAccount.getEmployee().getPhoneNumber());
        }

        if (userAccount.getEmployee().getAddress() != null) {
            addressJTextField.setText(userAccount.getEmployee().getAddress());
        }

        if (userAccount.getEmployee().getGender() != null) {
            if (userAccount.getEmployee().getGender().equals("Male")) {
                rdbMale.setSelected(true);
            } else {
                rdbFemale.setSelected(true);
            }
        }

        if (userAccount.getEmployee().getSkillSet() != null) {
            for (String skill : userAccount.getEmployee().getSkillSet()) {
                if (skill.equals("AED")) {
                    chkAED.setSelected(true);
                }
                if (skill.equals("CNA")) {
                    chkCNA.setSelected(true);
                }
                if (skill.equals("CPR")) {
                    chkCPR.setSelected(true);
                }
                if (skill.equals("LGT")) {
                    chkLGT.setSelected(true);
                }
                if (skill.equals("FST")) {
                    chkFST.setSelected(true);
                }
                if (skill.equals("BLS")) {
                    chkBLS.setSelected(true);
                }
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

        genderGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        chkAED = new javax.swing.JCheckBox();
        addressJTextField = new javax.swing.JTextField();
        phoneNumberJTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        chkBLS = new javax.swing.JCheckBox();
        chkCNA = new javax.swing.JCheckBox();
        chkCPR = new javax.swing.JCheckBox();
        chkLGT = new javax.swing.JCheckBox();
        chkFST = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 253, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Staff Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 131, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 131, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 131, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Skills Available:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 170, 30));

        nameJTextField.setEditable(false);
        nameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 230, -1));

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 140, 40));

        chkAED.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkAED.setText("Automated External Defibrillator (AED)");
        add(chkAED, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        addressJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 230, 30));

        phoneNumberJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(phoneNumberJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 230, 30));

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 130, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("EDIT/UPDATE STAFF INFORMATION SECTION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 560, 41));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Gender:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, 30));

        genderGroup.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rdbMale.setText("Male");
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 90, -1));

        genderGroup.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rdbFemale.setText("Female");
        add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 100, -1));

        chkBLS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkBLS.setText("Basic Life Support (BLS) Trained");
        add(chkBLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        chkCNA.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkCNA.setText("Certified Nursing Assistant (CNA)");
        add(chkCNA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        chkCPR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkCPR.setText("Cardiopulmonary Resuscitation (CPR)");
        chkCPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCPRActionPerformed(evt);
            }
        });
        add(chkCPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        chkLGT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkLGT.setText("Life Guard Trained");
        add(chkLGT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        chkFST.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkFST.setText("Fire Service Trained");
        add(chkFST, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Employee staff = userAccount.getEmployee();
        staff.setName(nameJTextField.getText());
        staff.setPhoneNumber(phoneNumberJTextField.getText());
        if (genderGroup.getSelection().equals(rdbMale.getModel())) {
            staff.setGender("Male");
        } else if (genderGroup.getSelection().equals(rdbFemale.getModel())) {
            staff.setGender("Female");
        }
        staff.setAddress(addressJTextField.getText());

        if (chkAED.isSelected()) {
            if (skillSet != null) {
                if (!skillSet.contains("AED")) {
                    skillSet.add("AED");
                }                
            } else {
                skillSet.add("AED");
            }

        }

        if (chkCNA.isSelected()) {
            if (skillSet != null) {
                skillSet.add("CNA");
            } else {
                if (!skillSet.contains("CNAr")) {
                    skillSet.add("CNA");
                }
            }

        }

        if (chkCPR.isSelected()) {
            if (skillSet != null) {
                skillSet.add("CPR");
            } else {
                if (!skillSet.contains("CPR")) {
                    skillSet.add("CPR");
                }
            }
        }

        if (chkLGT.isSelected()) {
            if (skillSet != null) {
                skillSet.add("LGT");
            } else {
                if (!skillSet.contains("LGT")) {
                    skillSet.add("LGT");
                }
            }

        }

        if (chkFST.isSelected()) {
            if (skillSet != null) {
                skillSet.add("FST");
            } else {
                if (!skillSet.contains("FST")) {
                    skillSet.add("FST");
                }
            }
        }
        
        if (chkFST.isSelected()) {
            if (skillSet != null) {
                skillSet.add("FST");
            } else {
                if (!skillSet.contains("FST")) {
                    skillSet.add("FST");
                }
            }
        }
        
        if (chkBLS.isSelected()) {
            if (skillSet != null) {
                skillSet.add("BLS");
            } else {
                if (!skillSet.contains("BLS")) {
                    skillSet.add("BLS");
                }
            }
        }
        
        JOptionPane.showMessageDialog(this, "Details updated successfully");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void chkCPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCPRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox chkAED;
    private javax.swing.JCheckBox chkBLS;
    private javax.swing.JCheckBox chkCNA;
    private javax.swing.JCheckBox chkCPR;
    private javax.swing.JCheckBox chkFST;
    private javax.swing.JCheckBox chkLGT;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField phoneNumberJTextField;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
