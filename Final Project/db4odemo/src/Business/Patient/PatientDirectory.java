/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.DisasterRegistry.DisasterVictim;
import java.util.ArrayList;

/**
 *
 * @author mamta
 */
public class PatientDirectory {
    private ArrayList<DisasterVictim> patient;

    public ArrayList<DisasterVictim> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<DisasterVictim> patient) {
        this.patient = patient;
    }
    
}
