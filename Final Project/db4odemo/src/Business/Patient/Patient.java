/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.DisasterRegistry.DisasterVictim;
import java.io.File;

/**
 *
 * @author mamta
 */
public class Patient {
    private String patientName;
    private String gender;
    private String indentification;
    private String height;
    private String synopsis;
    private int room;

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIndentification() {
        return indentification;
    }

    public void setIndentification(String indentification) {
        this.indentification = indentification;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
   @Override
    public String toString() {
        return this.patientName;
    }
}
