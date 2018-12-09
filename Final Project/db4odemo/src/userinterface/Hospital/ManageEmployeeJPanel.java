/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PatientResgistryOrganization;
import static com.sun.org.apache.bcel.internal.Repository.instanceOf;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamta
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Organization organization;    
    OrganizationDirectory od;
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory directory,Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.organization=organization;
        this.od=directory;
        populateOrganizationComboBox();  
        populateCombo();//populateJTable(organization);
        
    }
    public void populateCombo() {
        organizationEmpJComboBox.removeAllItems();
//        
//        for(Organization organization: od.getOrganizationList()){
//            if (organization instanceof PatientResgistryOrganization)
//            {
//            organizationJComboBox.addItem(organization);
//            }
           for(Organization organization: od.getOrganizationList()){
            if (organization instanceof PatientResgistryOrganization)
            {
            organizationEmpJComboBox.addItem(organization);
            }
           }
    }
     public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
       
        for(Organization organization: od.getOrganizationList()){
            if (organization instanceof PatientResgistryOrganization)
            {
            organizationJComboBox.addItem(organization);
            }
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

        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(255, 253, 208));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE EMPLOYEE WORKAREA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 41));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ORGANIZATION:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, 40));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 190, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 710, 160));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 80, 40));

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 190, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("ORGANIZATION:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 150, 40));
        jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 220, 40));

        createEmployeeButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        createEmployeeButton.setText("CREATE EMPLOYEE");
        createEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmployeeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 280, 50));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1034, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization selectedOrganization = (Organization) organizationJComboBox.getSelectedItem();
        if(selectedOrganization!=null) {
            populateJTable(selectedOrganization);
        }

    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void createEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmployeeButtonActionPerformed
        Organization selectedEmpOrganization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String employeeName = nameJTextField.getText();
        //boolean isValidName = validateStrings(employeeName);
        selectedEmpOrganization.getEmployeeDirectory().createEmployee(employeeName);
        populateJTable(selectedEmpOrganization);

//        if(isValidName){
//            selectedEmpOrganization.getEmployeeDirectory().createEmployee(employeeName);
//            populateJTable(selectedEmpOrganization);
//        }
    }//GEN-LAST:event_createEmployeeButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createEmployeeButton;
    private javax.swing.JTable empJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    // End of variables declaration//GEN-END:variables
}
