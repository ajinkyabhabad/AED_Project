/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CounsellingDeptOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Counsellar.CounsellarJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CounsellorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CounsellarJPanel(userProcessContainer, account, organization,enterprise,business);
    }
    
    
}
