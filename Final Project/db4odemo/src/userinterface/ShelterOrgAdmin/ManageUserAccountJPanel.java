/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ShelterOrgAdmin;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel container;
    private Enterprise enterprise;

    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        populateOrganizationBox();
        populateJTable();
    }

    public void populateOrganizationBox() {
        organizationJComboBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateEmployeeBox(Organization organization) {
        employeeJComboBox.removeAllItems();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    public void populateRoleBox(Organization organization) {
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            roleJComboBox.addItem(role);
        }
    }

    public void populateJTable() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();
        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = user;
                row[1] = user.getRole();

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
        userJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        organizationJComboBox = new javax.swing.JComboBox();
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        createButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        passwordJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 253, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE EMPLOYEE USERACCOUNTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 470, 41));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 500, 240));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("ORGANIZATION:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 170, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("EMPLOYEE:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 170, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("USER NAME:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 170, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("PASSWORD:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 170, 40));

        usernameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 210, 40));

        organizationJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 210, 40));

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 210, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("ROLE:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 170, 40));

        roleJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 210, 40));

        createButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        createButton.setText("CREATE");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 210, 50));

        backButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 190, 60));

        passwordJTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 210, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization selectedOrganization = (Organization) organizationJComboBox.getSelectedItem();
        if(selectedOrganization!=null) {
            populateEmployeeBox(selectedOrganization);
            populateRoleBox(selectedOrganization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String username = usernameJTextField.getText();
        String password = passwordJTextField.getText();
        
        boolean isValidUser = validateStrings(username);
        boolean isValidPass = validatePwd(password);
        
        if(isValidUser && isValidPass) {
            Organization organization = (Organization) organizationJComboBox.getSelectedItem();
            Employee employee = (Employee) employeeJComboBox.getSelectedItem();
            Role role = (Role) roleJComboBox.getSelectedItem();
            organization.getUserAccountDirectory().createUserAccount(username, password, employee, role,enterprise.getNetworkName(), null);
            populateJTable();
        }

    }//GEN-LAST:event_createButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
           container.remove(this);
           CardLayout layout = (CardLayout) container.getLayout();
           layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    public boolean validateStrings(String name) {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter username", "Error", JOptionPane.ERROR_MESSAGE);
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

    public boolean validatePwd(String name) {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Password", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
