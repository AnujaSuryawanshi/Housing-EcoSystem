/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagerRole;

import userinterface.ManagerRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
//import static demo.BubbleChartDemo1.createDataset;
import java.awt.CardLayout;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel container;
    private ManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private LabTestWorkRequest request;
    private EcoSystem business;
    private WorkRequest wr;
    String studentname,email,phone, dob, allergy, foodPref, respRate, heartRate, bloodP, weight;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public ManagerWorkAreaJPanel(JPanel container, UserAccount account, ManagerOrganization organization, Enterprise enterprise) {
        initComponents();
        
        this.container = container;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        populateRequestTable();
        
    }
    
    public void populateRequestTable(){
        
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[15];
            row[0] = request.getMessage();
            //row[0] = request.getStudentName();
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[4] = result == null ? "Waiting" : result;
//             int selectedRow = workRequestJTable.getSelectedRow();
//
//                if (selectedRow < 0){
//                    return;
//                }
//            
//            String name = (String) studentTable.getValueAt(selectedRow, 5);
//            row[5] = request.setStudentName(name);
                
           // studentname = name;
            row[5] = request.getStudentName();
            row[6] =request.getEmailId();
            row[7]=request.getPhoneNum();
            row[8]=request.getDOB();
            row[9]=request.getAllergies();
            row[10]=request.getFoodPref();
            row[11]=request.getRespRate();
            row[12]=request.getHeartRate();
            row[13]=request.getBloodPressure();
            row[14]=request.getWeight();
            
            model.addRow(row);
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        requestTestJButton1 = new javax.swing.JButton();
        requestTestJButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Result", "Student Name", "Email", "Phone Number", "Date of Birth", "Allergies", "Food Preferences", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 390, 1240, 170);

        requestTestJButton.setBackground(new java.awt.Color(0, 51, 255));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("SEND TO HOUSEKEEPING");
        requestTestJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(160, 590, 230, 60);

        refreshTestJButton.setBackground(new java.awt.Color(0, 51, 255));
        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("REFRESH");
        refreshTestJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton);
        refreshTestJButton.setBounds(710, 40, 150, 60);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("MANAGER ORGANIZATION:");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(21, 27, 280, 30);

        requestTestJButton1.setBackground(new java.awt.Color(0, 51, 255));
        requestTestJButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        requestTestJButton1.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton1.setText("SEND TO PHYSICIAN");
        requestTestJButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton1ActionPerformed(evt);
            }
        });
        add(requestTestJButton1);
        requestTestJButton1.setBounds(440, 590, 230, 60);

        requestTestJButton2.setBackground(new java.awt.Color(0, 51, 255));
        requestTestJButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        requestTestJButton2.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton2.setText("SEND TO NUTRITIONIST");
        requestTestJButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestTestJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton2ActionPerformed(evt);
            }
        });
        add(requestTestJButton2);
        requestTestJButton2.setBounds(730, 590, 250, 60);
        add(jLabel3);
        jLabel3.setBounds(90, 300, 620, 400);

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Suhas", "suhas@husky.neu.edu", "8572301075", "13/04/1993", "Lactose Intolerant", "Vegetarian", "65.5", "110", "102", "75"},
                {"Ankita", "ankita@husky.neu", "6692783828", "07/07/1994", "Pollen", "Vegan", "70", "105", "108.5", "65"},
                {"Anuja", "anuja@husky.neu.edu", "7897896655", "09/01/1994", "Potatoes", "Non-Vegetarian", "45.5", "108", "120", "45"},
                {"Aswani", "aswani@husky.nedu.edu", "7896784561", "01/02/93", "Skin Allergy", "Vegetarian", "58", "97", "105.5", "50"},
                {"Anku", "anku@husky.nedu.edu", "8576661115", "09/03/92", "Rashes", "Vegetarian", "76", "120", "109", "68"},
                {"Kelvin", "kelvin@husky.nedu.edu", "9843178291", "06/04/94", "Pet hair allergy", "Non-Vegetarian", "61.5", "100", "99", "70"},
                {"Prajakta", "Prajakta@husky.neu.edu", "8576789890", "09/01/94", "No allergies", "Non-Vegetarian", "65.5", "100", "89.1", "77"},
                {"Nupur", "nupur@husky.neu.edu", "6564738899", "01/01/92", "Dust allergy", "Vega", "77", "109", "88", "87"},
                {"Priya", "priya@husky.neu.edu", "8878890081", "04/08/95", "Allergic to fish", "Vegan", "88", "103", "101", "81"},
                {"Yash", "yash@husky.neu.edu", "6698879929", "01/06/94", "Peanuts allergy", "Vegetarian", "90", "101", "100", "98"}
            },
            new String [] {
                "Student Name", "Email ID", "Phone number", "Date Of Birth", "Allergies", "Food Preferences", "Respiratory rate", "Heart Rate", "Blood Pressure", "Weight"
            }
        ));
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(0, 130, 1240, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MANAGER ACTIONS");
        add(jLabel1);
        jLabel1.setBounds(500, 330, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("STUDENT DETAILS");
        add(jLabel2);
        jLabel2.setBounds(420, 60, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Please select a student from the below list : ");
        add(jLabel4);
        jLabel4.setBounds(20, 90, 320, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        //email,phone, dob, allergy, foodPref, respRate, heartRate, bloodP, weight;
        studentname = (String) model.getValueAt(selectedRow, 5);   
        email = (String) model.getValueAt(selectedRow, 6);
        phone = (String) model.getValueAt(selectedRow, 7);
        dob = (String) model.getValueAt(selectedRow, 8);
        allergy = (String) model.getValueAt(selectedRow, 9);
        foodPref = (String) model.getValueAt(selectedRow, 10);
        respRate = (String) model.getValueAt(selectedRow, 11);
        heartRate = (String) model.getValueAt(selectedRow, 12);
        bloodP = (String) model.getValueAt(selectedRow, 13);
        weight = (String) model.getValueAt(selectedRow, 14);
        
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("ManagerRequestTestJPanel", new ManagerRequestTestJPanel(container, userAccount, enterprise,wr,studentname,email,phone, dob, allergy, foodPref, respRate, heartRate, bloodP, weight));
        layout.next(container);
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void requestTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        
        studentname = (String) model.getValueAt(selectedRow, 5);
        email = (String) model.getValueAt(selectedRow, 6);
        phone = (String) model.getValueAt(selectedRow, 7);
        dob = (String) model.getValueAt(selectedRow, 8);
        allergy = (String) model.getValueAt(selectedRow, 9);
        foodPref = (String) model.getValueAt(selectedRow, 10);
        respRate = (String) model.getValueAt(selectedRow, 11);
        heartRate = (String) model.getValueAt(selectedRow, 12);
        bloodP = (String) model.getValueAt(selectedRow, 13);
        weight = (String) model.getValueAt(selectedRow, 14);
        

        CardLayout layout = (CardLayout) container.getLayout();
        container.add("PhysicianRequestTestJPanel", new PhysicianRequestTestJPanel(container, userAccount, enterprise,wr,studentname,email,phone, dob, allergy, foodPref, respRate, heartRate, bloodP, weight));
        layout.next(container);
    }//GEN-LAST:event_requestTestJButton1ActionPerformed

    private void requestTestJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        
        studentname = (String) model.getValueAt(selectedRow, 5); 
        email = (String) model.getValueAt(selectedRow, 6);
        phone = (String) model.getValueAt(selectedRow, 7);
        dob = (String) model.getValueAt(selectedRow, 8);
        allergy = (String) model.getValueAt(selectedRow, 9);
        foodPref = (String) model.getValueAt(selectedRow, 10);
        respRate = (String) model.getValueAt(selectedRow, 11);
        heartRate = (String) model.getValueAt(selectedRow, 12);
        bloodP = (String) model.getValueAt(selectedRow, 13);
        weight = (String) model.getValueAt(selectedRow, 14);
        
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("NutritionistRequestTestJPanel", new NutritionistRequestTestJPanel(container, userAccount, enterprise,wr,studentname,email,phone, dob, allergy, foodPref, respRate, heartRate, bloodP, weight));
        layout.next(container);
    
    }//GEN-LAST:event_requestTestJButton2ActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        Object[] row = new Object[15];
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow < 0){
           return;
        }
        row[5] = (String) studentTable.getValueAt(selectedRow, 0);
        row[6] = (String) studentTable.getValueAt(selectedRow, 1);
        row[7] = (String) studentTable.getValueAt(selectedRow, 2);
        row[8] = (String) studentTable.getValueAt(selectedRow, 3);
        row[9] = (String) studentTable.getValueAt(selectedRow, 4);
        row[10] = (String) studentTable.getValueAt(selectedRow, 5);
        row[11] = (String) studentTable.getValueAt(selectedRow, 6);
        row[12] = (String) studentTable.getValueAt(selectedRow, 7);
        row[13] = (String) studentTable.getValueAt(selectedRow, 8);
        row[14] = (String) studentTable.getValueAt(selectedRow, 9);
        
        //studentname = (String) studentTable.getValueAt(selectedRow, 0);
        model.addRow(row);
        JOptionPane.showMessageDialog(null, "Please select the student for the processing");
    }//GEN-LAST:event_studentTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton requestTestJButton1;
    private javax.swing.JButton requestTestJButton2;
    private javax.swing.JTable studentTable;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}