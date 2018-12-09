/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffAndVolunteerAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Member.Member;
import Business.Organization.Organization;
import Business.Organization.StaffOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageStaffJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private StaffOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;

    /**
     * Creates new form ManageStaffJPanel
     */
    public ManageStaffJPanel(JPanel userProcessContainer, UserAccount account, StaffOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateJTable();
    }

    public void populateJTable() {
        DefaultTableModel model = (DefaultTableModel) membersJTable.getModel();
        model.setRowCount(0);

        for (Member member : organization.getMemberDirectory().getMemberList()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = member.getType();
            row[1] = member;
            row[2] = "Yes";        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        membersJTable = new javax.swing.JTable();
        viewDetailsJButton = new javax.swing.JButton();
        addStaffJButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 253, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE STAFF DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 41));

        membersJTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        membersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Name", "CurrentlyAvailable?"
            }
        ));
        jScrollPane1.setViewportView(membersJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 860, 250));

        viewDetailsJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 190, 40));

        addStaffJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addStaffJButton.setText("Add New");
        addStaffJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffJButtonActionPerformed(evt);
            }
        });
        add(addStaffJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 190, 40));

        backButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void addStaffJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffJButtonActionPerformed
        // TODO add your handling code here:
        AddNewStaffJPanel addNewJPanel = new AddNewStaffJPanel(userProcessContainer, account, organization, enterprise, business);
        userProcessContainer.add("addNewJPanel", addNewJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_addStaffJButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        Member selectedMember;
        int selectedRow = membersJTable.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a member");
        }
        else {
            selectedMember = (Member) membersJTable.getValueAt(selectedRow, 1);
            ViewStaffJPanel viewStaffNewJPanel = new ViewStaffJPanel(userProcessContainer, selectedMember);
            userProcessContainer.add("viewStaffNewJPanel", viewStaffNewJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
        
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStaffJButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable membersJTable;
    private javax.swing.JButton viewDetailsJButton;
    // End of variables declaration//GEN-END:variables
}
