/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.VendorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author suhas
 */
public class VendorOrganization extends Organization{

    public VendorOrganization() {
        super(Organization.Type.Vendor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VendorRole());
        return roles;
    }
}
