/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Lab;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthEnterprise;
import Business.Network.Network;
import Business.Organization.ForensicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class LabAssistantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ForensicOrganization LOrganization; 
    private HealthEnterprise Henterprise;
    private Network network;
    public LabAssistantJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,EcoSystem business,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.LOrganization = (ForensicOrganization)organization;
        this.Henterprise = (HealthEnterprise) enterprise;
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VRjButton = new javax.swing.JButton();
        TRjButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Lab Assistant");

        VRjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VRjButton.setForeground(new java.awt.Color(255, 255, 255));
        VRjButton.setText("View Requests");
        VRjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VRjButton.setBorderPainted(false);
        VRjButton.setContentAreaFilled(false);
        VRjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VRjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VRjButtonMouseExited(evt);
            }
        });
        VRjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VRjButtonActionPerformed(evt);
            }
        });

        TRjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TRjButton.setForeground(new java.awt.Color(255, 255, 255));
        TRjButton.setText("Test Results");
        TRjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TRjButton.setBorderPainted(false);
        TRjButton.setContentAreaFilled(false);
        TRjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TRjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TRjButtonMouseExited(evt);
            }
        });
        TRjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(VRjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TRjButton)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VRjButton)
                    .addComponent(TRjButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VRjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VRjButtonMouseEntered
         VRjButton.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_VRjButtonMouseEntered

    private void VRjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VRjButtonMouseExited
          VRjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_VRjButtonMouseExited

    private void TRjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRjButtonMouseEntered
       TRjButton.setForeground(Color.BLACK); // TODO add your handling code here:
    }//GEN-LAST:event_TRjButtonMouseEntered

    private void TRjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRjButtonMouseExited
         TRjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_TRjButtonMouseExited

    private void VRjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VRjButtonActionPerformed
        LabRequestJPanel lrJPanel=new LabRequestJPanel(userProcessContainer,business,network,Henterprise,userAccount,LOrganization);
        jSplitPane1.setBottomComponent(lrJPanel);
    }//GEN-LAST:event_VRjButtonActionPerformed

    private void TRjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRjButtonActionPerformed
        /*TestResultsJPanel trJPanel=new TestResultsJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(trJPanel);*/
    }//GEN-LAST:event_TRjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TRjButton;
    private javax.swing.JButton VRjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
