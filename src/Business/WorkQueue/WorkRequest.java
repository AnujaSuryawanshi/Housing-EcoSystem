/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String sender1;
    private String studentName;
    private String emailId;
    private String phoneNum;
    private String DOB;
    private String allergies;
    private String foodPref;
    private String respRate;
    private String heartRate;
    private String bloodPressure;
    private String weight;

    public String getPhoneNum() {
        return phoneNum;
    }

    public String setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return phoneNum;
    }

    public String getDOB() {
        return DOB;
    }

    public String setDOB(String DOB) {
        this.DOB = DOB;
        return DOB;
    }

    public String getAllergies() {
        return allergies;
    }

    public String setAllergies(String allergies) {
        this.allergies = allergies;
        return allergies;
    }

    public String getFoodPref() {
        return foodPref;
    }

    public String setFoodPref(String foodPref) {
        this.foodPref = foodPref;
        return foodPref;
    }

    public String getRespRate() {
        return respRate;
    }

    public String setRespRate(String respRate) {
        this.respRate = respRate;
        return respRate;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public String setHeartRate(String heartRate) {
        this.heartRate = heartRate;
        return heartRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public String setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
        return bloodPressure;
    }

    public String getWeight() {
        return weight;
    }

    public String setWeight(String weight) {
        this.weight = weight;
        return weight;
    }
    
    
    

    public String getStudentName() {
        return studentName;
    }

    public String setStudentName(String studentName) {
        this.studentName = studentName;
        return studentName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String setEmailId(String emailId) {
        this.emailId = emailId;
        return emailId;
    }
    
    

    public String getSender1() {
        return sender1;
    }

    public void setSender1(String sender1) {
        this.sender1 = sender1;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString(){
        return this.getMessage();
    }
//    @Override
//    public String toString(){
//        return this.getStudentName();
//    }
}
