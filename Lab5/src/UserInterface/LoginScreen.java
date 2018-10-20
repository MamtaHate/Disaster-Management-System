/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author harshalneelkamal
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    List<User> list;
    JPanel panelRight;
    public LoginScreen(JPanel panelRight, List<User> list) {
        initComponents();
        this.list = list;
        this.panelRight = panelRight;
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<Object>();
        txtTitle = new javax.swing.JLabel();
        txtPword = new javax.swing.JPasswordField();

        btnSubmit.setText("Login");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        comboUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTitle.setText("Supplier Login Screen");

        txtPword.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitle)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTitle)
                .addGap(18, 18, 18)
                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String pwd= "";
//        String rePwd = "";
        
        JPasswordField passwordField = new JPasswordField(8);
 
        // add to the container
        this.add(passwordField);
        
        // get the password
        char[] password = new char[txtPword.getPassword().length];
                password = txtPword.getPassword();
                
                for(char c : password){
                    pwd+=c;
                }
//        char[] repassword = new char[txtRePword.getPassword().length];
//                repassword = txtRePword.getPassword();
//                
//                for(char c : repassword){
//                    rePwd+=c;
//                }
                
        for (User user: list){
            User selectedUser = (User) comboUser.getSelectedItem();
            if (selectedUser.getUserName().equals(user.getUserName())){
                if (pwd.equals(user.getPassword())){
                    //JOptionPane.showMessageDialog(null, "Login Successfull");
                    SuccessScreen succScreen = new SuccessScreen(user);
                    CardLayout layout = (CardLayout)panelRight.getLayout();
                    panelRight.add("Success screen", succScreen);
                    layout.next(panelRight);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect user ID or password");
                }
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    
    private void initialize(){
        //text should either be "Supplier Login Screen" OR "Customer Login Screen"
        //Based on the selection
        txtTitle.setText("****** Login Screen");
        comboUser.removeAllItems();
        //only customer or suppliers should be listed based on the selection
        for(User user : list){
            comboUser.addItem(user);
        }   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<Object> comboUser;
    private javax.swing.JPasswordField txtPword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
