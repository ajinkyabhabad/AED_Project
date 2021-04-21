/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class PharmacistJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacistJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private PharmacyOrganization POrganization; 
    private PharmacyEnterprise Penterprise;
    public PharmacistJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.POrganization = (PharmacyOrganization)organization;
        this.Penterprise = (PharmacyEnterprise) enterprise;
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VRjButton = new javax.swing.JButton();
        VDjButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Pharmacist");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 110, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 69, 24, 0);
        jPanel1.add(VRjButton, gridBagConstraints);

        VDjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VDjButton.setForeground(new java.awt.Color(255, 255, 255));
        VDjButton.setText("View Details");
        VDjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VDjButton.setBorderPainted(false);
        VDjButton.setContentAreaFilled(false);
        VDjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VDjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VDjButtonMouseExited(evt);
            }
        });
        VDjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VDjButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 87, 24, 82);
        jPanel1.add(VDjButton, gridBagConstraints);

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
          VRjButton.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_VRjButtonMouseEntered

    private void VRjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VRjButtonMouseExited
           VRjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_VRjButtonMouseExited

    private void VDjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VDjButtonMouseEntered
              VDjButton.setForeground(Color.black);     // TODO add your handling code here:
    }//GEN-LAST:event_VDjButtonMouseEntered

    private void VDjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VDjButtonMouseExited
        VDjButton.setForeground(Color.white); // TODO add your handling code here:
    }//GEN-LAST:event_VDjButtonMouseExited

    private void VRjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VRjButtonActionPerformed
        PharmaViewRequestJPanel pvrJPanel=new PharmaViewRequestJPanel(userProcessContainer,business,POrganization,userAccount);
        jSplitPane1.setBottomComponent(pvrJPanel);
    }//GEN-LAST:event_VRjButtonActionPerformed

    private void VDjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VDjButtonActionPerformed
        /*ViewPrescriptionJPanel vdpJPanel=new ViewPrescriptionJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(vdpJPanel);*/
    }//GEN-LAST:event_VDjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VDjButton;
    private javax.swing.JButton VRjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
