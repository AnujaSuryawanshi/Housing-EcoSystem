/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        /*else if (type.getValue().equals(Type.Availablility.getValue())){
            organization = new AvailabiltyManagerOrganization();
            organizationList.add(organization);
        }*/
        else if (type.getValue().equals(Type.HouseKeeping.getValue())){
            organization = new HouseKeepingOragnization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Physician.getValue())){
            organization = new PhysicianOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharma.getValue())){
            organization = new PharmaOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Vendor.getValue())){
            organization = new VendorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nutritionist.getValue())){
            organization = new NutritionistOrganization();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.Student.getValue())){
//            organization = new StudentOrganization();
//            organizationList.add(organization);
//        }
        return organization;
    }
}