/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HelpSeeker;

import UI.Hospital.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpSeekerEnterprise;
import Business.Network.Network;
import Business.Organization.CaseManagerOrganization;
import Business.Organization.HelpSeekerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.WorkQueue.HelpSeekerWorkRequest;

/**
 *
 * @author patel
 */
public class ReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestDoctorJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    HelpSeekerOrganization organization;
    Network network;
    public ReportJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount,Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = (HelpSeekerOrganization) organization;
        this.network = network;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReportjLabel = new javax.swing.JLabel();
        namesurvivorjLabel = new javax.swing.JLabel();
        relationjLabel = new javax.swing.JLabel();
        typejLabel = new javax.swing.JLabel();
        locationjLabel = new javax.swing.JLabel();
        timejLabel = new javax.swing.JLabel();
        detailsjLabel = new javax.swing.JLabel();
        suspecttypejLabel = new javax.swing.JLabel();
        namesuspectjLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        friendRadioButton = new javax.swing.JRadioButton();
        parentRadioButton = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        knownRadioButton = new javax.swing.JRadioButton();
        unknownRadioButton = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Colleagueradiobutton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        ReportjButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ReportjLabel.setBackground(new java.awt.Color(0, 128, 128));
        ReportjLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ReportjLabel.setForeground(new java.awt.Color(255, 255, 255));
        ReportjLabel.setText("       Register Report");
        ReportjLabel.setOpaque(true);

        namesurvivorjLabel.setText("Name of Survivor : ");

        relationjLabel.setText("Relation with Survivor : ");

        typejLabel.setText("Type of Sexual Assault : ");

        locationjLabel.setText("Location of Incident :");

        timejLabel.setText("Date of Incident :");

        detailsjLabel.setText("More Details : ");

        suspecttypejLabel.setText("Suspect :");

        namesuspectjLabel.setText("Name of Suspect : ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        friendRadioButton.setText("Friend");

        parentRadioButton.setText("Parent");
        parentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentRadioButtonActionPerformed(evt);
            }
        });

        knownRadioButton.setText("Known");
        knownRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knownRadioButtonActionPerformed(evt);
            }
        });

        unknownRadioButton.setText("Unknown");

        Colleagueradiobutton.setText("Self");

        otherRadioButton.setText("Other");

        ReportjButton.setBackground(new java.awt.Color(255, 0, 51));
        ReportjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ReportjButton.setText("Report");
        ReportjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportjButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Rape", "Marital Rape", "Child Sexual Abuse", "Unwanted Sexual Touching", "Incest" }));

        jLabel1.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReportjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(friendRadioButton)
                                .addGap(38, 38, 38)
                                .addComponent(parentRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Colleagueradiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(otherRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typejLabel)
                                    .addComponent(timejLabel)
                                    .addComponent(locationjLabel)
                                    .addComponent(detailsjLabel))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(knownRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(unknownRadioButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namesurvivorjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suspecttypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(relationjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namesuspectjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(ReportjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ReportjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namesurvivorjLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(relationjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(friendRadioButton)
                            .addComponent(parentRadioButton)
                            .addComponent(Colleagueradiobutton)
                            .addComponent(otherRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typejLabel)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(locationjLabel)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(timejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailsjLabel)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suspecttypejLabel)
                            .addComponent(knownRadioButton)
                            .addComponent(unknownRadioButton))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namesuspectjLabel)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReportjButton)))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void parentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentRadioButtonActionPerformed

    private void knownRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knownRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_knownRadioButtonActionPerformed

    private void ReportjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportjButtonActionPerformed

        HelpSeekerWorkRequest request = new HelpSeekerWorkRequest();
        request.setStatus("Waiting");
        request.setSender(userAccount);
        
        request.setNameofvictim(jTextField1.getText());
        request.setEmail(jTextField5.getText());
        //for choosing relations
        if(friendRadioButton.isSelected())
        {
            request.setRelation("Friend");
        }
        else if(parentRadioButton.isSelected())
        {
            request.setRelation("Parent");
        }
        else if(Colleagueradiobutton.isSelected())
        {
            request.setRelation("Self");

        }
        else if(otherRadioButton.isSelected())
        {
            request.setRelation("Other");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a relation");

        }
        //for choosing type
        if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Select one"))
        {
            JOptionPane.showMessageDialog(null, "Please select a type");
        }
        else{
            request.setTypeofsa(jComboBox1.getSelectedItem().toString());
        }
        //location
        request.setLocation(jTextField4.getText());
        //date
        if(jDateChooser1.getDate()==null)
        {
            JOptionPane.showMessageDialog(null, "Please select a date");
        }else{
            request.setDoi(jDateChooser1.getDate());
        }
        //more detaisl
        if(jTextField3.getText()==null)
        {
            JOptionPane.showMessageDialog(null, "Please fill more details");
            return;
        }
        request.setMoredetails(jTextField3.getText());
        //suspect
        if(knownRadioButton.isSelected())
        {
            request.setSuspecttype("Known");
        }
        else if(unknownRadioButton.isSelected())
        {
            request.setSuspecttype("Unknown");
        }else{JOptionPane.showMessageDialog(null, "Please select a suspect type");}

        //name of suspect
        request.setNameofsuspect(jTextField2.getText());

        if(request.getDoi()!=null && request.getLocation()!=null && request.getRelation()!=null && request.getSuspecttype()!=null
            && request.getNameofvictim()!=null && request.getTypeofsa()!=null)
        {
            Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.NGO);
            Organization org = null;
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof CaseManagerOrganization){
                    org = organization;
                    break;
                }
            }
            if (org!=null){
                org.getWorkQueue().getHelpSeekerworkRequestList().add(request);
                //userAccount.getWorkQueue().getHelpSeekerworkRequestList().add(request);
            }

            

            //organization.getWorkQueue().getHelpSeekerworkRequestList().add(request);
            
            userAccount.getWorkQueue().getHelpSeekerworkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Incident is reported successfully.");


        }

    }//GEN-LAST:event_ReportjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Colleagueradiobutton;
    private javax.swing.JButton ReportjButton;
    private javax.swing.JLabel ReportjLabel;
    private javax.swing.JLabel detailsjLabel;
    private javax.swing.JRadioButton friendRadioButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton knownRadioButton;
    private javax.swing.JLabel locationjLabel;
    private javax.swing.JLabel namesurvivorjLabel;
    private javax.swing.JLabel namesuspectjLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JRadioButton parentRadioButton;
    private javax.swing.JLabel relationjLabel;
    private javax.swing.JLabel suspecttypejLabel;
    private javax.swing.JLabel timejLabel;
    private javax.swing.JLabel typejLabel;
    private javax.swing.JRadioButton unknownRadioButton;
    // End of variables declaration//GEN-END:variables
}
