 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;

        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        Check_JButton = new javax.swing.JButton();
        Reset_JButton1 = new javax.swing.JButton();
        Valid_JLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(32767, 32767));
        setLayout(null);

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Type", "Type1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(42, 123, 898, 250);

        jLabel1.setText("NETWORK ");
        add(jLabel1);
        jLabel1.setBounds(298, 508, 53, 14);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(networkJComboBox);
        networkJComboBox.setBounds(485, 505, 136, 20);

        jLabel2.setText("NAME");
        add(jLabel2);
        jLabel2.setBounds(298, 609, 60, 14);
        add(nameJTextField);
        nameJTextField.setBounds(485, 606, 136, 30);

        jLabel3.setText("ENTERPRISE TYPE");
        add(jLabel3);
        jLabel3.setBounds(298, 565, 88, 14);

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseTypeJComboBox);
        enterpriseTypeJComboBox.setBounds(485, 562, 136, 20);

        submitJButton.setBackground(new java.awt.Color(204, 204, 255));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(0, 51, 255));
        submitJButton.setText("SUBMIT");
        submitJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(190, 400, 91, 48);

        backJButton.setBackground(new java.awt.Color(204, 204, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 51, 255));
        backJButton.setText("BACK");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(70, 400, 102, 50);

        Check_JButton.setBackground(new java.awt.Color(204, 204, 255));
        Check_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Check_JButton.setForeground(new java.awt.Color(0, 51, 255));
        Check_JButton.setText("CHECK?");
        Check_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Check_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_JButtonActionPerformed(evt);
            }
        });
        add(Check_JButton);
        Check_JButton.setBounds(70, 500, 101, 50);

        Reset_JButton1.setBackground(new java.awt.Color(204, 204, 255));
        Reset_JButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset_JButton1.setForeground(new java.awt.Color(0, 51, 255));
        Reset_JButton1.setText("RESET");
        Reset_JButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset_JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_JButton1ActionPerformed(evt);
            }
        });
        add(Reset_JButton1);
        Reset_JButton1.setBounds(70, 600, 100, 46);

        Valid_JLabel.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        Valid_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(Valid_JLabel);
        Valid_JLabel.setBounds(482, 382, 80, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!","WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String name = nameJTextField.getText();

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

        populateTable();

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void Check_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_JButtonActionPerformed
        // TODO add your handling code here:
        String EnterpriseName = nameJTextField.getText();
        Pattern penterprise=Pattern.compile("^[a-zA-Z0-9]{3,30}$");
        Matcher menterprise=penterprise.matcher(nameJTextField.getText());
        boolean isenterpriseValid=menterprise.matches();

        if(isenterpriseValid==true){
            Valid_JLabel.setForeground(Color.green);
            Valid_JLabel.setText(Boolean.toString(isenterpriseValid));
            submitJButton.setEnabled(true);
            nameJTextField.setEditable(false);
        }
        else{
            Valid_JLabel.setForeground(Color.red);
            Valid_JLabel.setText(Boolean.toString(isenterpriseValid));
            nameJTextField.setEditable(true);
        }
    }//GEN-LAST:event_Check_JButtonActionPerformed

    private void Reset_JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButton1ActionPerformed
        nameJTextField.setText("");
    }//GEN-LAST:event_Reset_JButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check_JButton;
    private javax.swing.JButton Reset_JButton1;
    private javax.swing.JLabel Valid_JLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
