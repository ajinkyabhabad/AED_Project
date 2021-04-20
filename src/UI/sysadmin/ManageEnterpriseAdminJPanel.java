/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.sysadmin;

import java.awt.Color;

/**
 *
 * @author patel
 */
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.HealthAdminRole;
import Business.Role.LegalAdminRole;
import Business.Role.NGOAdminRole;
import Business.Role.PharmacyAdminRole;
//import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }
    
    
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseJComboBox = new javax.swing.JComboBox();
        deleteJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Manage Enterprise Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 16, 0, 0);
        add(jLabel1, gridBagConstraints);

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 361;
        gridBagConstraints.ipady = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        add(jScrollPane1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Enterprise:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 20, 0, 0);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Network:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 29, 0, 0);
        add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 54, 0, 0);
        add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 4, 0, 0);
        add(nameJTextField, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 27, 0, 0);
        add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 3, 0, 0);
        add(usernameJTextField, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 31, 0, 0);
        add(jLabel6, gridBagConstraints);

        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorderPainted(false);
        submitJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitJButtonMouseExited(evt);
            }
        });
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 22, 43, 0);
        add(submitJButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 3, 0, 0);
        add(passwordJPasswordField, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 21, 0, 0);
        add(jButton1, gridBagConstraints);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 4, 0, 0);
        add(networkJComboBox, gridBagConstraints);

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        add(enterpriseJComboBox, gridBagConstraints);

        deleteJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.setBorderPainted(false);
        deleteJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteJButtonMouseExited(evt);
            }
        });
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 29, 43, 0);
        add(deleteJButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseEntered
            submitJButton.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_submitJButtonMouseEntered

    private void submitJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseExited
            submitJButton.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_submitJButtonMouseExited

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        
        if( usernameJTextField.getText().isEmpty()||String.valueOf(passwordJPasswordField.getPassword()).isEmpty()|| nameJTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Health")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HealthAdminRole());
        } else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Legal")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new LegalAdminRole());
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("NGO")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new NGOAdminRole());
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Pharmacy")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new PharmacyAdminRole());
        }
        //UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
        populateTable();
        usernameJTextField.setText("");
        passwordJPasswordField.setText("");
        nameJTextField.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
              jButton1.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
               jButton1.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void deleteJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteJButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteJButtonMouseEntered

    private void deleteJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteJButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteJButtonMouseExited

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
            UserAccount p = (UserAccount) enterpriseJTable.getValueAt(selectedRow, 2);
            
            for (Network network : system.getNetworkList()) 
            {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
                {
                    for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList())
                    {
                        if (p == userAccount) {
                            enterprise.getUserAccountDirectory().getUserAccountList().remove(p);
                            break;
                        }

                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Account successfully deleted!");
            populateTable();
            
        }

    }//GEN-LAST:event_deleteJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
