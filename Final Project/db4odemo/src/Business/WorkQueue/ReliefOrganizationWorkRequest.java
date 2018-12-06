/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import sun.security.acl.WorldGroupImpl;

/**
 *
 * @author mamta
 */
public class ReliefOrganizationWorkRequest extends WorkRequest {
    private String event;
    private String loc;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    
     @Override
    public String toString() {
        return event;
    }
    
}
