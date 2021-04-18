/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Ankita Dharurkar
 */
public class CounsellarWorkRequest extends WorkRequest{
    HelpSeekerWorkRequest HelpSeekerWorkRequest;

    public HelpSeekerWorkRequest getHelpSeekerWorkRequest() {
        return HelpSeekerWorkRequest;
    }

    public void setHelpSeekerWorkRequest(HelpSeekerWorkRequest HelpSeekerWorkRequest) {
        this.HelpSeekerWorkRequest = HelpSeekerWorkRequest;
    }
}
