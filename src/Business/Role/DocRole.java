/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
//import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Hospital.DoctorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DocRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new DoctorJPanel(userProcessContainer, account, organization, enterprise,business,network);
    }
    
    
}
