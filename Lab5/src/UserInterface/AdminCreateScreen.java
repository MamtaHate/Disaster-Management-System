/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author harshalneelkamal
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;
    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        txtPword = new javax.swing.JPasswordField();
        txtRePword = new javax.swing.JPasswordField();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("username:");

        jLabel2.setText("password:");

        jLabel3.setText("re-enter password :");

        radioGroup.add(radioCustomer);
        radioCustomer.setText("Customer");
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCustomerActionPerformed(evt);
            }
        });

        radioGroup.add(radioSupplier);
        radioSupplier.setText("Supplier");

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPword.setText("jPasswordField1");

        txtRePword.setText("jPasswordField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioSupplier)
                                    .addComponent(radioCustomer)))
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String pwd= "";
        String rePwd = "";
              if(!userNamePatternCorrect()){
            JOptionPane.showMessageDialog(this, "Username must be an email ID with _ and @ as the only allowed special characters but should not begin with an _");
            return;
        }  
        if(!passwordPatternCorrect()){
            JOptionPane.showMessageDialog(this, "Password must contain a combination of uppercase and lowercase letter, number and special characters. ");
            return;
        }
        JPasswordField passwordField = new JPasswordField(8);
 
        // add to the container
        this.add(passwordField);
        
        // get the password
        char[] password = new char[txtPword.getPassword().length];
                password = txtPword.getPassword();
                
                for(char c : password){
                    pwd+=c;
                }
        char[] repassword = new char[txtRePword.getPassword().length];
                repassword = txtRePword.getPassword();
                
                for(char c : repassword){
                    rePwd+=c;
                }
                //txtRePword.getPassword();
        
        //System.out.println(pwd);
         //System.out.println(rePwd);
     

        if (!Arrays.equals(password, repassword)) {
            //System.out.println("Password is correct");
            JOptionPane.showMessageDialog(this, "Passwords dont match !!");
            return;
        } 
        

        if(radioGroup.isSelected(radioCustomer.getModel())){

            Customer customer = new Customer(new Date(), pwd, txtUser.getText());
            admin.getCustDir().getCustomerList().add(customer);
            JOptionPane.showMessageDialog(this, "Customer successfully created");
            clearFields();
        }
        else if(radioGroup.isSelected(radioSupplier.getModel())){
            Supplier supplier = new Supplier(pwd, txtUser.getText());
            admin.getSuppDir().getSupplierList().add(supplier);
            JOptionPane.showMessageDialog(this, "Supplier successfully created");
            clearFields();
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select a type");
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private boolean userNamePatternCorrect(){
        Pattern p = Pattern.compile("^[a-zA-Z0-9][A-Za-z0-9+_]+@(.+)$");
        Matcher m = p.matcher(txtUser.getText());
        
        return m.matches();
        
        
//        boolean b = m.find();
//        if (b == true){
//            System.out.println("There is a special character in the string");
//            return false;
//        }
//        else {
//             System.out.println("There is no special character in the string");
//            return true;
//        }
        
    }
    
    
     
    private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$+_])(?=\\S+$).*[A-Za-z0-9]$");
        Matcher m = p.matcher(txtPword.getText());
           
        return m.matches();
//        boolean b = m.find();
//        if (b == true){
//            System.out.println("There is a special character in the string");
//            return false;
//        }
//        else {
//             System.out.println("There is no special character in the string");
//            return true;
//        }
    }  
    
     private void clearFields(){
        txtUser.setText("");
        txtPword.setText("");
        txtRePword.setText("");
    }
    
    private void checkFoButtonVisibility(){
        if(!txtUser.getText().isEmpty() && !txtPword.getText().isEmpty() && !txtRePword.getText().isEmpty()){
            btnCreate.setEnabled(true);
        }
        else {
             btnCreate.setEnabled(false);
        }
            
    }
    
     private void initialize(){
        checkFoButtonVisibility();
    }
    
    private void radioCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);
    }//GEN-LAST:event_btnBackActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.JPasswordField txtPword;
    private javax.swing.JPasswordField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
