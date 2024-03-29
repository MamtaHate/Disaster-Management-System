/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.DisasterRegistry.DisasterVictimDirectory;
import Business.DisasterRegistry.MissingPersonDirectory;
import Business.Role.DisasterVictimRegistryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mamta
 */
public class DisasterVictimOrganization extends Organization{
        private DisasterVictimDirectory disasterVictimDirectory;
        private MissingPersonDirectory missingPersonDiretory;
    
        public DisasterVictimOrganization() {
        super(OrganizationType.DisasterVictimRegistry.getValue());
        disasterVictimDirectory = new DisasterVictimDirectory();
        missingPersonDiretory = new MissingPersonDirectory();
    }

    public MissingPersonDirectory getMissingPersonDiretory() {
        return missingPersonDiretory;
    }

    public void setMissingPersonDiretory(MissingPersonDirectory missingPersonDiretory) {
        this.missingPersonDiretory = missingPersonDiretory;
    }
    
    public DisasterVictimDirectory getDisasterVictimDirectory() {
        return disasterVictimDirectory;
    }

    public void setDisasterVictimDirectory(DisasterVictimDirectory disasterVictimDirectory) {
        this.disasterVictimDirectory = disasterVictimDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DisasterVictimRegistryRole());
        return roles;
    }
}
