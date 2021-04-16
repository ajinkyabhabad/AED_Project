/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Hospital;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthEnterprise;
//import Business.Organization.DoctorOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class DoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private HospitalOrganization DOrganization; 
    private HealthEnterprise Henterprise;
    
    public DoctorJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.DOrganization = (HospitalOrganization)organization;
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
        MRjButton = new javax.swing.JButton();
        PMjButton = new javax.swing.JButton();
        RLTjButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Doctor");

        MRjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MRjButton.setForeground(new java.awt.Color(255, 255, 255));
        MRjButton.setText("Manage Requests");
        MRjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MRjButton.setBorderPainted(false);
        MRjButton.setContentAreaFilled(false);
        MRjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MRjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MRjButtonMouseExited(evt);
            }
        });
        MRjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRjButtonActionPerformed(evt);
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

        RLTjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RLTjButton.setForeground(new java.awt.Color(255, 255, 255));
        RLTjButton.setText("Request Lab Test");
        RLTjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RLTjButton.setBorderPainted(false);
        RLTjButton.setContentAreaFilled(false);
        RLTjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RLTjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RLTjButtonMouseExited(evt);
            }
        });
        RLTjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RLTjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(MRjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(RLTjButton)
                .addGap(18, 18, 18)
                .addComponent(PMjButton)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MRjButton)
                    .addComponent(PMjButton)
                    .addComponent(RLTjButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
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
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MRjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRjButtonMouseEntered
                MRjButton.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_MRjButtonMouseEntered

    private void MRjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRjButtonMouseExited
           MRjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_MRjButtonMouseExited

    private void PMjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMjButtonMouseEntered
       PMjButton.setForeground(Color.black); // TODO add your handling code here:
    }//GEN-LAST:event_PMjButtonMouseEntered

    private void PMjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMjButtonMouseExited
        MRjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_PMjButtonMouseExited

    private void RLTjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RLTjButtonMouseEntered
      RLTjButton.setForeground(Color.black);   // TODO add your handling code here:
    }//GEN-LAST:event_RLTjButtonMouseEntered

    private void RLTjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RLTjButtonMouseExited
     RLTjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_RLTjButtonMouseExited

    private void MRjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRjButtonActionPerformed
        RequestDoctorJPanel requestdoctorJPanel=new RequestDoctorJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(requestdoctorJPanel);
    }//GEN-LAST:event_MRjButtonActionPerformed

    private void RLTjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RLTjButtonActionPerformed
        RequestLabTestJPanel requestlabtestJPanel=new RequestLabTestJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(requestlabtestJPanel);
    }//GEN-LAST:event_RLTjButtonActionPerformed

    private void PMjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMjButtonActionPerformed
        PrescribeMedicinesJPanel prescribemedicinesJPanel=new PrescribeMedicinesJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(prescribemedicinesJPanel);
    }//GEN-LAST:event_PMjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MRjButton;
    private javax.swing.JButton PMjButton;
    private javax.swing.JButton RLTjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
