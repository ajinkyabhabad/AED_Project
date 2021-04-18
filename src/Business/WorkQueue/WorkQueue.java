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
    private ArrayList<LawyerWorkRequest> LawyerworkRequestList;
    private ArrayList<HelpProviderWorkRequest> HPworkRequestList;
    private ArrayList<CounsellarWorkRequest> CounsellarworkRequestList;
    
    public WorkQueue() {
        HelpSeekerworkRequestList = new ArrayList<HelpSeekerWorkRequest>();
        LawyerworkRequestList=new ArrayList<LawyerWorkRequest>();
        HPworkRequestList=new ArrayList<HelpProviderWorkRequest>();
        CounsellarworkRequestList = new ArrayList<CounsellarWorkRequest>();
    }

    public ArrayList<HelpSeekerWorkRequest> getHelpSeekerworkRequestList() {
        return HelpSeekerworkRequestList;
    }

    public ArrayList<LawyerWorkRequest> getLawyerworkRequestList() {
        return LawyerworkRequestList;
    }

    public ArrayList<HelpProviderWorkRequest> getHPworkRequestList() {
        return HPworkRequestList;
    }

    public ArrayList<CounsellarWorkRequest> getCounsellarworkRequestList() {
        return CounsellarworkRequestList;
    }
    
    
}