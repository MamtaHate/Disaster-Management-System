/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Incident;

import Business.Enterprise.Enterprise;
import Business.Incident.Incident;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class IncidentReportingJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    /**
     * Creates new form IncidentReportingJPanel
     */
    public IncidentReportingJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        cityJTextField.setText(enterprise.getNetworkName());
        populateEventTypes();
        incidentJComboBox.removeAllItems();
    }

    public void populateEventTypes() {
        eventTypeJComboBox.removeAllItems();

        eventTypeJComboBox.addItem("Avalanche");
        eventTypeJComboBox.addItem("Explosion");
        eventTypeJComboBox.addItem("Earthquake");
        eventTypeJComboBox.addItem("Drought");
        eventTypeJComboBox.addItem("Fire");
        eventTypeJComboBox.addItem("Flood");
        eventTypeJComboBox.addItem("Land Slide");
        eventTypeJComboBox.addItem("Heatwave");
        eventTypeJComboBox.addItem("Tsunami");
        eventTypeJComboBox.addItem("Tropical Cyclone");
        eventTypeJComboBox.addItem("Volcano");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cityJTextField = new javax.swing.JTextField();
        postalCodeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        eventNameJTextField = new javax.swing.JTextField();
        incidentJComboBox = new javax.swing.JComboBox();
        eventTypeJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsJTextArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        dateOfOccurrenceJXDatePicker = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(214, 217, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("REPORT AN EVENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 240, 41));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Incident Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 130, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Event Type:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 130, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Incident Type:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 150, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Date of Occurrence:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 160, 40));

        jPanel1.setBackground(new java.awt.Color(214, 217, 224));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("City:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Postal Code:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cityJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(postalCodeTextField))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cityJTextField, postalCodeTextField});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 440, 140));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Comments: (if any)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 180, 40));

        eventNameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(eventNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 210, 30));

        incidentJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        incidentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(incidentJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 210, 30));

        eventTypeJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eventTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        eventTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventTypeJComboBoxActionPerformed(evt);
            }
        });
        eventTypeJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                eventTypeJComboBoxPropertyChange(evt);
            }
        });
        add(eventTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 210, 30));

        commentsJTextArea.setColumns(20);
        commentsJTextArea.setRows(5);
        jScrollPane1.setViewportView(commentsJTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 200, -1));

        saveButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 190, 40));

        backButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 140, 40));
        add(dateOfOccurrenceJXDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] components = userProcessContainer.getComponents();

        for (Component c : components) {
            if (c instanceof ManageIncidentsJPanel) {
                ManageIncidentsJPanel incidentJPanel = (ManageIncidentsJPanel) c;
                incidentJPanel.populateTable();
            }
        }


    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        Boolean allowSave = true;

        Incident incident = enterprise.getIncidentDirectory().addIncident();
        incident.setIncidentName(eventNameJTextField.getText());
        incident.setEventType(eventTypeJComboBox.getSelectedItem().toString());
        incident.setIncidentType(eventTypeJComboBox.getSelectedItem().toString());
        incident.setDateOccured(dateOfOccurrenceJXDatePicker.getDate());
        incident.setCity(cityJTextField.getText());
        incident.setPostCode(postalCodeTextField.getText());
        incident.setComments(commentsJTextArea.getText());

        JOptionPane.showMessageDialog(this, "Reported Successfully");

        //send alerts???

    }//GEN-LAST:event_saveButtonActionPerformed

    public boolean validateInputs() {
        if (eventNameJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Incident name is required");
            return false;
        }

        if (dateOfOccurrenceJXDatePicker.equals("")) {
            JOptionPane.showMessageDialog(this, "Date of Occurrence is required");
            return false;
        }

        if (cityJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "City is required");
            return false;
        } else if (cityJTextField.getText().matches("[0-9]+") == true) {
            JOptionPane.showMessageDialog(this, "Please enter a city.");
            return false;
        }

        if (postalCodeTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Postal Code is required");
            return false;
        } else if (!isValidZip(postalCodeTextField.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter a valid zip code.");
            return false;
        }

        return true;
    }

    public boolean isValidZip(String zipCode) {
        String regex = "^[0-9]{5}(?:-[0-9]{4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(zipCode);
        return matcher.matches();
    }


    private void eventTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventTypeJComboBoxActionPerformed
        // TODO add your handling code here:
        incidentJComboBox.removeAllItems();
        if (eventTypeJComboBox.getItemCount() > 0) {
            if (eventTypeJComboBox.getSelectedItem().toString().equals("Fire")) {
                incidentJComboBox.addItem("Fire");
                incidentJComboBox.addItem("Forest Fire");
            } else if (eventTypeJComboBox.getSelectedItem().toString().equals("Volacano")) {
                incidentJComboBox.addItem("Volcanic Ash Cloud");
                incidentJComboBox.addItem("Volcanic Event");
            } else if (eventTypeJComboBox.getSelectedItem().toString().equals("Earthquake")) {
                incidentJComboBox.addItem("Earthquake");
            } else if (eventTypeJComboBox.getSelectedItem().toString().equals("Avalanche")) {
                incidentJComboBox.addItem("Avalanche");
            } else if (eventTypeJComboBox.getSelectedItem().toString().equals("Explosion")) {
                incidentJComboBox.addItem("Bomb Explosion");
                incidentJComboBox.addItem("Chemical Hazzard");
                incidentJComboBox.addItem("Bomb Threat");
            }
        }
    }//GEN-LAST:event_eventTypeJComboBoxActionPerformed

    private void eventTypeJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_eventTypeJComboBoxPropertyChange
        // TODO add your handling code here:


    }//GEN-LAST:event_eventTypeJComboBoxPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JTextArea commentsJTextArea;
    private org.jdesktop.swingx.JXDatePicker dateOfOccurrenceJXDatePicker;
    private javax.swing.JTextField eventNameJTextField;
    private javax.swing.JComboBox eventTypeJComboBox;
    private javax.swing.JComboBox incidentJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField postalCodeTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
