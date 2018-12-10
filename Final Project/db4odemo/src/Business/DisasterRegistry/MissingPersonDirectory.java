/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DisasterRegistry;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author mamta
 */
public class MissingPersonDirectory {
    private ArrayList<DisasterVictim> missingList;

    public ArrayList<DisasterVictim> getMissingList() {
        return missingList;
    }

    public void setMissingList(ArrayList<DisasterVictim> missingList) {
        this.missingList = missingList;
    }
   
    public DisasterVictim createMissingRegistry(String name, int age, String gender,long contact,String address,String nationality,File file,String type){
        DisasterVictim disasterVictim = new DisasterVictim();
        disasterVictim.setName(name);
        disasterVictim.setAge(age);
        disasterVictim.setGender(gender);
        disasterVictim.setContact(contact);
        disasterVictim.setAddress(address);
        disasterVictim.setNationality(nationality);
        disasterVictim.setFile(file);
        disasterVictim.setType(type);
        missingList.add(disasterVictim);
        return disasterVictim;
    }
}
