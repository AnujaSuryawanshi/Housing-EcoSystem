package Business.Student;

import Business.WorkQueue.StudentToManagementRequest;
import java.util.ArrayList;
import java.util.List;

public class Student {
    
    private String studentName;
    private String emailId;
    private String DOB;
    private int phoneNumber;
    private double GPA;
    private double respRate;
    private double heartRate;
    private double bloodPressure;
    private double weight;
    private String allergy;
    private String preferences;

    private ArrayList<StudentToManagementRequest> stmrcqueue;
    
    
    public ArrayList<StudentToManagementRequest> getStudentToManagementRequests() {
        return stmrcqueue;
    }

    public void setStudentToManagementRequests(ArrayList<StudentToManagementRequest> studentToManagementRequests) {
        this.stmrcqueue = studentToManagementRequests;
    }

    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getRespRate() {
        return respRate;
    }

    public void setRespRate(double respRate) {
        this.respRate = respRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
  
    public Student(){
    this.stmrcqueue = new ArrayList<>();

    }

    @Override
    public String toString()
    
    {
        return studentName;
    
    }
}
