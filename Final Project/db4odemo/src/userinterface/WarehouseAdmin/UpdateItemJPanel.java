/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WarehouseAdmin;

import Business.Items.Item;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class UpdateItemJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Item item;
    /**
     * Creates new form UpdateItemJPanel
     */
    public UpdateItemJPanel(JPanel userProcessContainer, Item item) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.item = item;
        populateItems();
    }

    
    public void populateItems() {
        itemNameTextField.setText(item.getName());
        itemCategory.setText(item.getCategory());
        unitOfMeasure.setText(item.getUnitOfMeasure());
        valuePU.setText(item.getValuePerUnit());
        chkKit.setSelected(item.getIsKit());
        commentsTextField.setText(item.getComments());
        if(item.getQty() != null) {
             qtyText.setText(Integer.toString(item.getQty()));
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

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        itemNameTextField = new javax.swing.JTextField();
        unitOfMeasure = new javax.swing.JTextField();
        valuePU = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        commentsTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chkKit = new javax.swing.JCheckBox();
        backJButton = new javax.swing.JButton();
        itemCategory = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("UPDATE ITEM");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 230, 41));

        jLabel5.setText("Item Category: *");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 130, 30));

        jLabel6.setText("Name: *");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 110, 30));

        jLabel7.setText("Unit of Measure: *");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 140, 40));

        jLabel8.setText("Value per unit:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 120, 30));

        itemNameTextField.setEditable(false);
        add(itemNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 170, 40));
        add(unitOfMeasure, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 170, 40));
        add(valuePU, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 170, 40));

        saveButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveButton.setText("UPDATE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 180, 60));

        jLabel1.setText("Comments:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 140, 30));
        add(commentsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 170, 40));

        jLabel2.setText("Kit?:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 130, 30));
        add(chkKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 170, 50));
        add(itemCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 170, 40));

        jLabel4.setText("Quantity:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 140, 30));
        add(qtyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        item.setUnitOfMeasure(unitOfMeasure.getText());
        item.setValuePerUnit(valuePU.getText());
        item.setIsKit(chkKit.isSelected());
        item.setComments(commentsTextField.getText());
        item.setQty(Integer.parseInt(qtyText.getText()));

        JOptionPane.showMessageDialog(this, "Item updated successfully");
    }//GEN-LAST:event_saveButtonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JCheckBox chkKit;
    private javax.swing.JTextField commentsTextField;
    private javax.swing.JLabel itemCategory;
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
