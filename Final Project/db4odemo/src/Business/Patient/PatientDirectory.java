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
    private ArrayList<Patient> patientList;

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

   
     public Patient createPatientRegistry(String name, String gender, String identification,String synopsis, int room ){
        Patient patient = new Patient();
        patient.setPatientName(name);
        patient.setGender(gender);
        patient.setIndentification(identification);
        patient.setSynopsis(synopsis);
        patient.setRoom(room);
        patientList.add(patient);
        return patient;
    }
    
}
