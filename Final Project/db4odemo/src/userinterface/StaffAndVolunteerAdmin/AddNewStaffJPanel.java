/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffAndVolunteerAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Member.Member;
import Business.Organization.StaffOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static userinterface.HousingAdmin.ManageShelterJPanel.isValidEmail;

/**
 *
 * @author Sweta Chowdhury
 */
public class AddNewStaffJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private StaffOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private ArrayList<String> skillSet = new ArrayList<String>();

    /**
     * Creates new form AddNewStaffJPanel
     */
    public AddNewStaffJPanel(JPanel userProcessContainer, UserAccount account, StaffOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateComboBox();
    }

    public void populateComboBox() {
        memberTypeJComboBox.removeAllItems();
        memberTypeJComboBox.addItem(Member.MemberType.Staff);
        memberTypeJComboBox.addItem(Member.MemberType.Volunteer);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        phoneNumberJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        chkCNA = new javax.swing.JCheckBox();
        chkAED = new javax.swing.JCheckBox();
        chkCPR = new javax.swing.JCheckBox();
        chkLGT = new javax.swing.JCheckBox();
        chkFST = new javax.swing.JCheckBox();
        chkBLS = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        memberTypeJComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtOtherSkills = new javax.swing.JTextField();
        chkNone = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("MEMBER INFORMATION SECTION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 500, 41));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Staff Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 131, 43));

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 230, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Gender:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 110, 40));

        genderGroup.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdbMale.setText("Male");
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 90, -1));

        genderGroup.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdbFemale.setText("Female");
        add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 100, -1));

        phoneNumberJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(phoneNumberJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 230, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Phone Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 131, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 131, 40));

        addressJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 230, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Skills Available:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 170, 40));

        chkCNA.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkCNA.setText("Certified Nursing Assistant (CNA)");
        add(chkCNA, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        chkAED.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkAED.setText("Automated External Defibrillator (AED)");
        add(chkAED, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        chkCPR.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkCPR.setText("Cardiopulmonary Resuscitation (CPR)");
        chkCPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCPRActionPerformed(evt);
            }
        });
        add(chkCPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        chkLGT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkLGT.setText("Life Guard Trained");
        add(chkLGT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, -1, -1));

        chkFST.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkFST.setText("Fire Service Trained");
        add(chkFST, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, -1, -1));

        chkBLS.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkBLS.setText("Basic Life Support (BLS) Trained");
        add(chkBLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, -1, -1));

        saveButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 810, 160, 50));

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 860, 130, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Type:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 130, -1));

        memberTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(memberTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 230, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Email ID:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 140, 40));
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 230, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Other Skills (if any):");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 760, 170, -1));

        txtOtherSkills.setEditable(false);
        txtOtherSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtherSkillsActionPerformed(evt);
            }
        });
        add(txtOtherSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 750, 240, 40));

        chkNone.setText("None of the above");
        chkNone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoneActionPerformed(evt);
            }
        });
        add(chkNone, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void chkCPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCPRActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        boolean allowSave = true;

        allowSave = validateInputs();

        if (allowSave) {
            Member member = organization.getMemberDirectory().addMember();
            member.setName(nameJTextField.getText());
            member.setType(memberTypeJComboBox.getSelectedItem().toString());
            if (genderGroup.getSelection().equals(rdbMale.getModel())) {
                member.setGender("Male");
            } else if (genderGroup.getSelection().equals(rdbFemale.getModel())) {
                member.setGender("Female");
            }
            member.setPhoneNumber(phoneNumberJTextField.getText());
            member.setEmail(emailTextField.getText());
            member.setAddress(addressJTextField.getText());
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

            if (chkNone.isSelected()) {
                if (skillSet != null) {
                    if (!skillSet.contains(txtOtherSkills.getText())) {
                        skillSet.add(txtOtherSkills.getText());
                    }
                } else {
                    skillSet.add(txtOtherSkills.getText());
                }

            }

            member.setSkillSet(skillSet);

            JOptionPane.showMessageDialog(this, "Details added successfully");
        }


    }//GEN-LAST:event_saveButtonActionPerformed

    public boolean validateInputs() {
        if (nameJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name is required");
            return false;
        } else {
            if (!validateStrings(nameJTextField.getText())) {
                return false;
            }
        }

        if (genderGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Gender is required");
            return false;
        }

        if (emailTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email ID is required.");
            return false;
        } else if (!isValidEmail(emailTextField.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email ID");
            return false;
        }

        if (phoneNumberJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Contact Number is required.");
            return false;
        } else if (phoneNumberJTextField.getText().matches("[0-9]+") == false) {
            JOptionPane.showMessageDialog(this, "Please enter a valid contact number.");
            return false;
        } else if (phoneNumberJTextField.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "Contact Number should be atleast 10 digits.");
            return false;
        }

        if (addressJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address is required.");
            return false;
        }

        if (chkNone.isSelected()) {
            if (txtOtherSkills.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Other Skills is required.");
                return false;
            }
        }

        return true;
    }

    public boolean validateStrings(String name) {
        if (name.equals("")) {
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component components[] = userProcessContainer.getComponents();
        for (Component component : components) {
            if (component instanceof ManageStaffJPanel) {
                ManageStaffJPanel mPanel = (ManageStaffJPanel) component;
                mPanel.populateJTable();
            }
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void txtOtherSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtherSkillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtherSkillsActionPerformed

    private void chkNoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoneActionPerformed
        // TODO add your handling code here:
        if (chkNone.isSelected()) {
            txtOtherSkills.setEnabled(true);
        } else {
            txtOtherSkills.setEnabled(false);
            txtOtherSkills.setText("");
        }
    }//GEN-LAST:event_chkNoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox chkAED;
    private javax.swing.JCheckBox chkBLS;
    private javax.swing.JCheckBox chkCNA;
    private javax.swing.JCheckBox chkCPR;
    private javax.swing.JCheckBox chkFST;
    private javax.swing.JCheckBox chkLGT;
    private javax.swing.JCheckBox chkNone;
    private javax.swing.JTextField emailTextField;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox memberTypeJComboBox;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField phoneNumberJTextField;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtOtherSkills;
    // End of variables declaration//GEN-END:variables
}
