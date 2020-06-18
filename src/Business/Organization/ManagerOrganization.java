package Business.Organization;

import Business.Role.ManagerRole;
import Business.Role.Role;
import Business.WorkQueue.HospitalAvailabilityWorkTestRequest;
import java.util.ArrayList;

/**
 *
 * @author rusha
 */
public class ManagerOrganization extends Organization{

    private ArrayList<HospitalAvailabilityWorkTestRequest> hospitalavailablityqueue;

    public ArrayList<HospitalAvailabilityWorkTestRequest> getHospitalavailablityqueue() {
        return hospitalavailablityqueue;
    }

    public void setHospitalavailablityqueue(ArrayList<HospitalAvailabilityWorkTestRequest> hospitalavailablityqueue) {
        this.hospitalavailablityqueue = hospitalavailablityqueue;
    }

    public ManagerOrganization() {
        super(Organization.Type.Manager.getValue());
        this.hospitalavailablityqueue=new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagerRole());
        return roles;
    }

    
    
    
    
    
    
    
    
    
    
}
