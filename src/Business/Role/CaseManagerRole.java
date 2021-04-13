/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CaseManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.CaseManager.CaseManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CaseManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CaseManagerJPanel(userProcessContainer, account, organization,business,enterprise);
    }
    
    
}
