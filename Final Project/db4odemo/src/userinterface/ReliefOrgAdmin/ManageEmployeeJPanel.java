/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReliefOrgAdmin;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
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
public class ManageEmployeeJPanel extends javax.swing.JPanel {

       
    private JPanel userProcessContainer;
    private OrganizationDirectory directory;
    
    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }
    
      
    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
       
        for(Organization organization: directory.getOrganizationList()){
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox() {
        organizationEmpJComboBox.removeAllItems();
       
        for(Organization organization: directory.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }
    
    
    public void populateJTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) empJTable.getModel();
        
        model.setRowCount(0);
        
        for(Employee emp: organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = emp.getId();
            row[1] = emp.getName();
            
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
        jLabel2 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        empJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        createEmployeeButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE EMPLOYEE WORKAREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 41));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ORGANIZATION:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, 40));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 190, 40));

        empJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(empJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 710, 160));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("NAME:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 80, 40));

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 190, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("ORGANIZATION:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 150, 40));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 220, 40));

        createEmployeeButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        createEmployeeButton.setText("CREATE EMPLOYEE");
        createEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmployeeButtonActionPerformed(evt);
            }
        });
        add(createEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 280, 50));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 170, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization selectedOrganization = (Organization) organizationJComboBox.getSelectedItem();
        if(selectedOrganization!=null) {
            populateJTable(selectedOrganization);
        }
        
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void createEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmployeeButtonActionPerformed
        Organization selectedEmpOrganization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String employeeName = nameJTextField.getText();
        boolean isValidName = validateStrings(employeeName);
        if(isValidName){
            selectedEmpOrganization.getEmployeeDirectory().createEmployee(employeeName);
            populateJTable(selectedEmpOrganization);
        }
    }//GEN-LAST:event_createEmployeeButtonActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createEmployeeButton;
    private javax.swing.JTable empJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    // End of variables declaration//GEN-END:variables
}