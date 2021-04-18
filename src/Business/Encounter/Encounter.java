/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Encounter;

import java.util.ArrayList;

/**
 *
 * @author Ankita Dharurkar
 */
public class Encounter {
    
    private ArrayList<CounsellarEncounter> CEncounter;
    //private ArrayList<LawyerEncounter> LEncounter;
    
    public Encounter(){
        CEncounter = new ArrayList<CounsellarEncounter>();
        //LEncounter = new ArrayList<LawyerEncounter>();
    }

    public ArrayList<CounsellarEncounter> getCEncounter() {
        return CEncounter;
    }
    
    
}

