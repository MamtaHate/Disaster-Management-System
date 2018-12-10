/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.OrganizationType;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PatientResgistryOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamta
 */
public class ManageOrganization extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganization
     */
    JPanel userProcessContainer;
    OrganizationDirectory directory;
    public ManageOrganization(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.directory= directory;
        
         
        populateCombo();
        populateTable();
    }
    
   
    public void populateCombo() {
        organizationJComboBox.removeAllItems();
        
        for(Organization.OrganizationType type: Organization.OrganizationType.values()){
            if(type.getValue().equals(Organization.OrganizationType.PatientRegistry.getValue())){
                organizationJComboBox.addItem(type);
            }
        }
    }
    
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);
        
        
        for(Organization organization : directory.getOrganizationList()) {
            if (organization instanceof PatientResgistryOrganization)
            {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
        }
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    private void initComponents() {
//        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();
//
//        jLabel1 = new javax.swing.JLabel();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        organizationJTable = new javax.swing.JTable();
//        jLabel2 = new javax.swing.JLabel();
//        organizationJComboBox = new javax.swing.JComboBox();
//        addJButton = new javax.swing.JButton();
//        backJButton = new javax.swing.JButton();
//
//        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//
//        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
//        jLabel1.setText("MANAGE ORGANIZATION WORKAREA");
//        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 41));
//
//        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null},
//                {null, null},
//                {null, null},
//                {null, null}
//            },
//            new String [] {
//                "ID", "Name"
//            }
//        ) {
//            boolean[] canEdit = new boolean [] {
//                true, false
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//
//        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, organizationJTable, org.jdesktop.beansbinding.ELProperty.create("${ID}"), organizationJTable, org.jdesktop.beansbinding.BeanProperty.create("rowSorter"));
//        bindingGroup.addBinding(binding);
//
//        jScrollPane1.setViewportView(organizationJTable);
//
//        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 710, 160));
//
//        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
//        jLabel2.setText("ORGANIZATION TYPE:");
//        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 210, 40));
//
//        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
//        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 316, 190, 40));
//
//        addJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
//        addJButton.setText("ADD ORGANIZATION");
//        addJButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                addJButtonActionPerformed(evt);
//            }
//        });
//        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 390, 250, 50));
//
//        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
//        backJButton.setText("<<BACK");
//        backJButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                backJButtonActionPerformed(evt);
//            }
//        });
//        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 170, 50));
//
//        bindingGroup.bind();
//    }// </editor-fold>                        
                                        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 253, 208));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANIZATION WORKAREA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 41));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(organizationJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 710, 160));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ORGANIZATION TYPE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 210, 40));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 316, 190, 40));

        addJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addJButton.setText("ADD ORGANIZATION");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 390, 250, 50));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/arrow-back-icon_1_40x40.png"))); // NOI18N
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1109, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
         Organization.OrganizationType type = (Organization.OrganizationType) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
