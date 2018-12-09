/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DisasterVictimOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientResgistryOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DisasterVictimRegistry.DisasterVictimWorkAreaJPanel;
import userinterface.PatientAdmin.PatientAdminWorkAreaJPanel;

/**
 *
 * @author mamta
 */
public class PatientAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PatientAdminWorkAreaJPanel(userProcessContainer,(PatientResgistryOrganization) organization,system, account);
        
    }
        
    @Override
    public String toString() {
        return Role.RoleType.PatientRegistryAdminRole.getValue();
    }
}
