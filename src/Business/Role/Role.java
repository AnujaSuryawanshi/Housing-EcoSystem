/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Manager("Manager"),
        Physician("Physician"),
        Nutritionist("Nutritionist"),
        Vendor("Vendor"),
        HouseKeeper("HouseKeeper");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel container, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            EnterpriseDirectory enterpriseDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}