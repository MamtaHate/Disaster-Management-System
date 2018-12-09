/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ReliefOrganizationEnterprise;
import Business.Incident.Incident;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.StaffOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import userinterface.MainJFrame;

/**
 *
 * @author Sweta Chowdhury
 */
public class EmergencyJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StaffOrganization organization;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem business;
    Incident incident;
    
    int k;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     * Creates new form NonEmergencyJPanel
     */
    public EmergencyJPanel(JPanel userProcessContainer, StaffOrganization organization, UserAccount account, Enterprise enterprise, EcoSystem business, Incident incident) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        this.incident = incident;

        nameTextField.setEnabled(false);
        cardNumberTextField.setEnabled(false);
        amountTextField.setEnabled(false);
        donorNameTextField.setEnabled(false);

        foodWeightTextField.setEnabled(false);
        clothesWeightTextField.setEnabled(false);

        comboboxPopulate();
        comboboxYear();
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
        fundCheck = new javax.swing.JCheckBox();
        foodCheck = new javax.swing.JCheckBox();
        clothesCheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox();
        yearComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        clothesWeightTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        donorNameTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        foodWeightTextField = new javax.swing.JTextField();
        donateButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        OtpTextField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(214, 217, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MONETARY HELP");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 370, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Donation Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, 30));

        fundCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fundCheck.setText("Funds");
        fundCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundCheckActionPerformed(evt);
            }
        });
        add(fundCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        foodCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        foodCheck.setText("Food");
        foodCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodCheckActionPerformed(evt);
            }
        });
        add(foodCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        clothesCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clothesCheck.setText("Clothing");
        clothesCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothesCheckActionPerformed(evt);
            }
        });
        add(clothesCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Name (as on card): ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, 40));

        nameTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 310, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Email:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 170, 30));

        emailTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 260, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Card Number:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, 30));

        cardNumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(cardNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 310, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Enter amount to donate:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 260, 40));

        amountTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(amountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 260, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("$");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 10, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Expiration Date:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 260, 40));

        monthComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 80, -1));

        yearComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 80, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Approx clothes weight (pounds):");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 240, 40));

        clothesWeightTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(clothesWeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 280, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Donation in the name of:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 220, 40));

        donorNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(donorNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 280, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Approx food weight (pounds):");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 240, 40));

        foodWeightTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(foodWeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 280, 40));

        donateButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        donateButton.setText("Donate Now");
        donateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateButtonActionPerformed(evt);
            }
        });
        add(donateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 210, 50));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("OTP:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        OtpTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(OtpTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 190, 40));

        confirmButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 180, 50));

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 160, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void donateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateButtonActionPerformed

       
        
        Map<String, Object> validateMap = new HashMap<>();

        if (nullCheck(amountTextField)) {
            Float amountfunds = validateInputFloat(amountTextField);
        }

        if (nullCheck(foodWeightTextField)) {
            float foodWeightAmount = validateInputFloat(foodWeightTextField);
        }

        if (nullCheck(clothesWeightTextField)) {
            float clothesWeightAmount = validateInputFloat(clothesWeightTextField);
        }

        if (!cardNumberTextField.getText().matches("^[0-9]{16}") && fundCheck.isSelected() == true) {
            JOptionPane.showMessageDialog(null, "wrong card number");
            return;
        }

        populateMap("nameTextField", nameTextField.getText(), validateMap);
        populateMap("emailTextField", emailTextField.getText(), validateMap);
        populateMap("cardNumberTextField", cardNumberTextField.getText(), validateMap);

        populateMap("amountTextField", amountTextField.getText(), validateMap);
        populateMap("foodWeightTextField", foodWeightTextField.getText(), validateMap);
        populateMap("clothesWeightTextField", clothesWeightTextField.getText(), validateMap);

        if (validateMap.size() == 0) {
            JOptionPane.showMessageDialog(null, "Sorry we cannot accept your donation");
            return;
        }

       DonationWorkRequest request = new DonationWorkRequest();

        for (Map.Entry<String, Object> entry : validateMap.entrySet()) {
            if (entry.getKey().equals("amountTextField")) {
                request.getDonation().setMoneyDonation(Float.parseFloat(amountTextField.getText()));
            }

            if (entry.getKey().equals("foodWeightTextField")) {
                request.getDonation().setFood_quantity(Float.parseFloat(foodWeightTextField.getText()));
            }

            if (entry.getKey().equals("clothesWeightTextField")) {
                request.getDonation().setCloth_quantity(Float.parseFloat(clothesWeightTextField.getText()));
            }
        }

        request.setDonationType(DonationWorkRequest.DonationType.Emergency);
        request.setSender(account);
        request.setStatus("Donated");
        request.getDonation().setDonatedTo(incident.getCity());

        for (Network network : business.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        enterprise.getWorkQueue().getWorkRequestList().add(request);
                        account.getWorkQueue().getWorkRequestList().add(request);
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Thank you for your donation");
        //******************************************************************************

         final String from = "abc27@gmail.com";
        final String pass = "xyz";
        String add = emailTextField.getText();
        String[] to = {add};
        String host = "smtp.gmail.com";

        Properties prop = System.getProperties();
        prop.put("mail.smtp.starttls.enable","true");
        prop.put("mail.smtp.host",host);
        prop.put("mail.smtp.user",from);
        prop.put("mail.smtp.password",pass);
        prop.put("mail.smtp.port","587");
        prop.put("mail.smtp.auth","true");

        //Session session = Session.getDefaultInstance(prop);
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, pass);
            }
        });
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];
            for (int i = 0; i < to.length; i++) {
                toAddress[i] = new InternetAddress(to[i]);
            }
            for (int i = 0; i < toAddress.length; i++) {
                msg.setRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            msg.setSubject("test");
            double k1 = Math.random()*100000;//Integer.toString(k)
            k = (int) k1;
            //System.out.println(k);
            msg.setContent(Integer.toString(k),"text/html;charset=\"ISO-8859-1\"");
            Transport transport = session.getTransport("smtp");
            transport.connect(host,from,pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();

        } catch (MessagingException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConfirmDonationJPanel nonMonetoryDonationJPanel = new ConfirmDonationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), account, enterprise,k);
        userProcessContainer.add("confirmDonationJPanel", nonMonetoryDonationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            
    }//GEN-LAST:event_donateButtonActionPerformed

    private void fundCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundCheckActionPerformed
        // TODO add your handling code here:
        if (fundCheck.isSelected() == true) {
            nameTextField.setEnabled(true);
            cardNumberTextField.setEnabled(true);
            amountTextField.setEnabled(true);
            donorNameTextField.setEnabled(true);
        } else if (fundCheck.isSelected() == false) {
            nameTextField.setEnabled(false);
            cardNumberTextField.setEnabled(false);
            amountTextField.setEnabled(false);
            donorNameTextField.setEnabled(false);
        }
    }//GEN-LAST:event_fundCheckActionPerformed

    private void foodCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodCheckActionPerformed
        // TODO add your handling code here:
        if (foodCheck.isSelected() == true) {
            foodWeightTextField.setEnabled(true);
        } else if (foodCheck.isSelected() == false) {
            foodWeightTextField.setEnabled(false);
        }
    }//GEN-LAST:event_foodCheckActionPerformed

    private void clothesCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothesCheckActionPerformed
        // TODO add your handling code here:
        if (clothesCheck.isSelected() == true) {
            clothesWeightTextField.setEnabled(true);
        } else if (clothesCheck.isSelected() == false) {
            clothesWeightTextField.setEnabled(false);
        }
    }//GEN-LAST:event_clothesCheckActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(OtpTextField.getText()) == k) {
            final String from = "aedprojectmail@gmail.com";
            final String pass = "securepayment";
            String add = emailTextField.getText();

            if (!(isValidEmail(add))) {
                JOptionPane.showMessageDialog(null, "ENter a valid email");
                return;
            }

            String[] to = {add};
            String host = "smtp.gmail.com";

            Properties prop = System.getProperties();
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.host", host);
            prop.put("mail.smtp.user", from);
            prop.put("mail.smtp.password", pass);
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", "true");

            //Session session = Session.getDefaultInstance(prop);
            Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, pass);
                }
            });
            MimeMessage msg = new MimeMessage(session);
            try {
                msg.setFrom(new InternetAddress(from));
                InternetAddress[] toAddress = new InternetAddress[to.length];
                for (int i = 0; i < to.length; i++) {
                    toAddress[i] = new InternetAddress(to[i]);
                }
                for (int i = 0; i < toAddress.length; i++) {
                    msg.setRecipient(Message.RecipientType.TO, toAddress[i]);
                }

                msg.setSubject("test");
                //double k1 = Math.random()*100000;//Integer.toString(k)
                //k = (int) k1;
                //System.out.println(k);
                msg.setContent("Thank you for your donation", "text/html;charset=\"ISO-8859-1\"");
                Transport transport = session.getTransport("smtp");
                transport.connect(host, from, pass);
                transport.sendMessage(msg, msg.getAllRecipients());
                transport.close();

            } catch (MessagingException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Thank you for the confirmation");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry invalid code");
            return;
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    public static boolean isValidEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    private boolean nullCheck(JTextField toCheck) {
        if (!(toCheck.getText().equals(""))) {
            return true;
        }
        return false;
    }

    private int validateInput(JTextField toCheck) {
        int checked = 0;
        try {
            String s = toCheck.getText();
            checked = Integer.parseInt(s);
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Please enter the integer number instead of the " + toCheck.getText());
            checked = Integer.parseInt(toCheck.getText());
        }
        return checked;
    }

    private float validateInputFloat(JTextField toCheck) {
        float checked = 0;
        try {
            String s = toCheck.getText();
            checked = Float.parseFloat(s);
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Please enter the integer number instead of the " + toCheck.getText());
            checked = Integer.parseInt(toCheck.getText());
        }
        return checked;
    }

    public void comboboxPopulate() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) monthComboBox.getModel();
        dcbm.setSelectedItem(0);

        Object row1 = new Object();
        row1 = "Jan";
        dcbm.addElement(row1);

        Object row2 = new Object();
        row2 = "Feb";
        dcbm.addElement(row2);

        Object row3 = new Object();
        row3 = "Mar";
        dcbm.addElement(row3);

        Object row4 = new Object();
        row4 = "Apr";
        dcbm.addElement(row4);

        Object row5 = new Object();
        row5 = "May";
        dcbm.addElement(row5);

        Object row6 = new Object();
        row6 = "Jun";
        dcbm.addElement(row6);

        Object row7 = new Object();
        row7 = "Jul";
        dcbm.addElement(row7);

        Object row8 = new Object();
        row8 = "Aug";
        dcbm.addElement(row8);

        Object row9 = new Object();
        row9 = "Sep";
        dcbm.addElement(row9);

        Object row10 = new Object();
        row10 = "Oct";
        dcbm.addElement(row10);

        Object row11 = new Object();
        row11 = "Nov";
        dcbm.addElement(row11);

        Object row12 = new Object();
        row12 = "Dec";
        dcbm.addElement(row12);

    }

    private void populateMap(String key, Object value, Map<String, Object> mapref) {

        if (!(value.equals(""))) {
            mapref.put(key, value);
        }
    }

    public void comboboxYear() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) yearComboBox.getModel();
        dcbm.setSelectedItem(0);

        for (int i = 2018; i < 2025; i++) {
            Object row = new Object();
            row = i;
            dcbm.addElement(row);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OtpTextField;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JCheckBox clothesCheck;
    private javax.swing.JTextField clothesWeightTextField;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton donateButton;
    private javax.swing.JTextField donorNameTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JCheckBox foodCheck;
    private javax.swing.JTextField foodWeightTextField;
    private javax.swing.JCheckBox fundCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
}
