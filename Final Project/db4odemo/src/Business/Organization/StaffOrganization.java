/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StaffRole;
import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class StaffOrganization extends Organization {
    public StaffOrganization() {
        super(OrganizationType.Staff.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StaffRole());
        return roles;
    }
    
}
