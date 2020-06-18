/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.HouseKeeperRole;
import Business.Role.Role;
import java.util.ArrayList;
import Business.WorkQueue.LabTestWorkRequest;

/**
 *
 * @author suhas
 */
public class HouseKeepingOragnization extends Organization{

    private ArrayList<LabTestWorkRequest> roomsAvailablity;

    public ArrayList<LabTestWorkRequest> getRoomsAvailablity() {
        return roomsAvailablity;
    }

    public void setRoomsAvailablity(ArrayList<LabTestWorkRequest> roomsAvailablity) {
        this.roomsAvailablity = roomsAvailablity;
    }
    
    
    
    public HouseKeepingOragnization() {
        super(Organization.Type.HouseKeeping.getValue());
        this.roomsAvailablity = new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HouseKeeperRole());
        return roles;
    }
}
