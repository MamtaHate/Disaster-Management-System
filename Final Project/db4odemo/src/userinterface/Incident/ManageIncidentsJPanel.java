/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Incident;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Incident.Incident;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageIncidentsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem system;
    
    /**
     * Creates new form ManageIncidentsJPanel
     */
    public ManageIncidentsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, EcoSystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        populateTable();
    }

     public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) incidentsJTable.getModel();
        model.setRowCount(0);

        for(Incident incident: enterprise.getIncidentDirectory().getIncidentList()) {
            Object[] row = new Object[model.getColumnCount()];
                row[0] = incident;
                row[1] = incident.getEventType();
                row[2] = incident.getIncidentType();
                row[3] = incident.getDateOccured();
                row[4] = incident.getCity();
               
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
        incidentsJTable = new javax.swing.JTable();
        reportNewIncidentButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 253, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("VIEW REPORTED INCIDENTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 41));

        incidentsJTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        incidentsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident Name", "Event Type", "Incident Type", "Date of Occurrence", "Location"
            }
        ));
        jScrollPane1.setViewportView(incidentsJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 960, 210));

        reportNewIncidentButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        reportNewIncidentButton.setText("Report New Incident");
        reportNewIncidentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportNewIncidentButtonActionPerformed(evt);
            }
        });
        add(reportNewIncidentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 380, 250, 50));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/arrow-back-icon_1_40x40.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void reportNewIncidentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportNewIncidentButtonActionPerformed
        // TODO add your handling code here:
        IncidentReportingJPanel reportIncidentJPanel = new IncidentReportingJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add("reportIncidentJPanel", reportIncidentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reportNewIncidentButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable incidentsJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reportNewIncidentButton;
    // End of variables declaration//GEN-END:variables
}
