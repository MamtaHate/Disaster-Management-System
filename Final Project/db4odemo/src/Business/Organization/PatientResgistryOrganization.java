/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.DisasterRegistry.DisasterVictimDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.PatientAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mamta
 */
public class PatientResgistryOrganization extends Organization {
    private PatientDirectory patientDirectory;
    
        public PatientResgistryOrganization() {
        super(OrganizationType.PatientRegistry.getValue());
        patientDirectory = new PatientDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientAdminRole());
        return roles;
    }
}
