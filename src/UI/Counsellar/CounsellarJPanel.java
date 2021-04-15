/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Counsellar;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthEnterprise;
import Business.Organization.CounsellingDeptOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class CounsellarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CounsellarJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private CounsellingDeptOrganization COrganization; 
    private HealthEnterprise Henterprise;
    public CounsellarJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.COrganization = (CounsellingDeptOrganization)organization;
        this.Henterprise = (HealthEnterprise) enterprise;
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
        EjButton = new javax.swing.JButton();
        PMjButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Counsellar");

        VRjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VRjButton.setForeground(new java.awt.Color(255, 255, 255));
        VRjButton.setText("View Requests");
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

        EjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EjButton.setForeground(new java.awt.Color(255, 255, 255));
        EjButton.setText("Encounters");
        EjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EjButton.setBorderPainted(false);
        EjButton.setContentAreaFilled(false);
        EjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EjButtonMouseExited(evt);
            }
        });
        EjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjButtonActionPerformed(evt);
            }
        });

        PMjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PMjButton.setForeground(new java.awt.Color(255, 255, 255));
        PMjButton.setText("Prescribe Medicines");
        PMjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PMjButton.setBorderPainted(false);
        PMjButton.setContentAreaFilled(false);
        PMjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PMjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PMjButtonMouseExited(evt);
            }
        });
        PMjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(VRjButton)
                        .addGap(18, 18, 18)
                        .addComponent(EjButton)
                        .addGap(26, 26, 26)
                        .addComponent(PMjButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VRjButton)
                    .addComponent(EjButton)
                    .addComponent(PMjButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
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

    private void EjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EjButtonMouseEntered
   EjButton.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_EjButtonMouseEntered

    private void EjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EjButtonMouseExited
       EjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_EjButtonMouseExited

    private void PMjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMjButtonMouseEntered
       PMjButton.setForeground(Color.BLACK); // TODO add your handling code here:
    }//GEN-LAST:event_PMjButtonMouseEntered

    private void PMjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMjButtonMouseExited
        PMjButton.setForeground(Color.white);  // TODO add your handling code here:
    }//GEN-LAST:event_PMjButtonMouseExited

    private void PMjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMjButtonActionPerformed
        CounsellarPrescribeMedicinesJPanel cpmJPanel=new CounsellarPrescribeMedicinesJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(cpmJPanel);
    }//GEN-LAST:event_PMjButtonActionPerformed

    private void VRjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VRjButtonActionPerformed
        CounsellarRequestJPanel crJPanel=new CounsellarRequestJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(crJPanel);
    }//GEN-LAST:event_VRjButtonActionPerformed

    private void EjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjButtonActionPerformed
        CounsellarEncounterJPanel ceJPanel=new CounsellarEncounterJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(ceJPanel);
    }//GEN-LAST:event_EjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EjButton;
    private javax.swing.JButton PMjButton;
    private javax.swing.JButton VRjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
