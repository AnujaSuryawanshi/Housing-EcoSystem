/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.PhysicianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.PhysicianRole.PhysicianWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class PhysicianRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,EnterpriseDirectory enterpriseDirectory) {
        return new PhysicianWorkAreaJPanel(container, account, (PhysicianOrganization)organization, enterprise);
    }
    
    
}
