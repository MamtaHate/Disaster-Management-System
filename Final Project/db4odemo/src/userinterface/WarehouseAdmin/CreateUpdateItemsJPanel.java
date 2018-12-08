/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WarehouseAdmin;

import userinterface.ShelterOrgAdmin.*;
import Business.Employee.Employee;
import Business.Items.Item;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.WarehouseOrganization;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prathamesh Tambe
 */
public class CreateUpdateItemsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrganizationDirectory directory;
    private WarehouseOrganization organization;

    /**
     * Creates new form ManageEmployeeJPanel
     */
    public CreateUpdateItemsJPanel(JPanel userProcessContainer, OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        for (Organization organization : directory.getOrganizationList()) {
            if (organization instanceof WarehouseOrganization) {
                this.organization = (WarehouseOrganization) organization;
            }
        }
        populateComboBox();

    }

    public void populateComboBox() {
        itemCategory.addItem(Item.ItemType.Batteries);
        itemCategory.addItem(Item.ItemType.FireExtinguisher);
        itemCategory.addItem(Item.ItemType.FirstAid);
        itemCategory.addItem(Item.ItemType.FlashLight);
        itemCategory.addItem(Item.ItemType.Food);
        itemCategory.addItem(Item.ItemType.Medicines);
        itemCategory.addItem(Item.ItemType.Radio);
        itemCategory.addItem(Item.ItemType.Rope);
        itemCategory.addItem(Item.ItemType.TrashBag);
        itemCategory.addItem(Item.ItemType.Water);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        itemNameTextField = new javax.swing.JTextField();
        unitOfMeasure = new javax.swing.JTextField();
        itemCategory = new javax.swing.JComboBox();
        valuePU = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        commentsTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chkKit = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(214, 217, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 170, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("CREATE ITEM");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Item Category: *");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 130, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Description: *");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 110, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Unit of Measure: *");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 140, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Value per unit:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 120, 30));

        itemNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(itemNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 170, 40));

        unitOfMeasure.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(unitOfMeasure, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 170, 40));

        itemCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(itemCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 170, 40));

        valuePU.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(valuePU, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 170, 40));

        saveButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 180, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Comments:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 140, 30));

        commentsTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(commentsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 170, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Kit?:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 130, 30));

        chkKit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(chkKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Quantity:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 140, 30));

        qtyText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(qtyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] components = userProcessContainer.getComponents();
        for (Component component : components) {
            if (component instanceof ManageItemsJPanel) {
                ManageItemsJPanel items = (ManageItemsJPanel) component;
                items.populateTable();
            }
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
        boolean allowSave = true;
        
        allowSave = validateInput();
        
        if (allowSave) {
            Item item = organization.getItemCatalog().addItem();
            item.setName(itemNameTextField.getText());
            item.setCategory(itemCategory.getSelectedItem().toString());
            item.setUnitOfMeasure(unitOfMeasure.getText());
            item.setValuePerUnit(valuePU.getText());
            item.setIsKit(chkKit.isSelected());
            item.setComments(commentsTextField.getText());
            item.setQty(Integer.parseInt(qtyText.getText()));

            JOptionPane.showMessageDialog(this, "Item added successfully");
            clear();
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    public void clear() {
        itemCategory.setSelectedItem("");
        itemNameTextField.setText("");
        unitOfMeasure.setText("");
        valuePU.setText("");
        chkKit.setSelected(false);
        commentsTextField.setText("");
        qtyText.setText("");   
    }
    
    public boolean validateInput() {
        if (itemNameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Description is required");
            return false;
        }
        
        if(unitOfMeasure.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Unit of measure is required");
            return false;
        }
        else if(unitOfMeasure.getText().matches("[0-9]+") == true) {
            JOptionPane.showMessageDialog(this, "Please enter a valid unit of measure.");
            return false;
        }
        
        if(qtyText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Quantity is required");
            return false;
        }
        else if(unitOfMeasure.getText().matches("[0-9]+") == false) {
            JOptionPane.showMessageDialog(this, "Please enter a valid input for quantity.");
            return false;
        }
        
        return true;   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JCheckBox chkKit;
    private javax.swing.JTextField commentsTextField;
    private javax.swing.JComboBox itemCategory;
    private javax.swing.JTextField itemNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField unitOfMeasure;
    private javax.swing.JTextField valuePU;
    // End of variables declaration//GEN-END:variables
}