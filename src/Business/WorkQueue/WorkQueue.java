/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<HelpSeekerWorkRequest> HelpSeekerworkRequestList;

    public WorkQueue() {
        HelpSeekerworkRequestList = new ArrayList<HelpSeekerWorkRequest>();
    }

    public ArrayList<HelpSeekerWorkRequest> getHelpSeekerworkRequestList() {
        return HelpSeekerworkRequestList;
    }
}