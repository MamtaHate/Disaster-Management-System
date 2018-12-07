/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Email;

import static Business.Email.SendMailUsingAuthentication.SMTP_AUTH_PWD;
import static Business.Email.SendMailUsingAuthentication.SMTP_AUTH_USER;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author mamta
 */
public class SMTPAuthenticator extends javax.mail.Authenticator{

    
    @ Override
    public PasswordAuthentication getPasswordAuthentication()
    {
    String username = SMTP_AUTH_USER;
    String password = SMTP_AUTH_PWD;
    return new PasswordAuthentication(username, password);
    }
    
    
    
    
}
