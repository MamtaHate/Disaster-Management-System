/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Alerts.AlertsWorkAreaJPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class AlertsAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AlertsWorkAreaJPanel(userProcessContainer,account,enterprise); //To change body of generated methods, choose Tools | Templates.
    }
      
    @Override
    public String toString() {
        return RoleType.AlertsAdminRole.getValue();
    }
}
