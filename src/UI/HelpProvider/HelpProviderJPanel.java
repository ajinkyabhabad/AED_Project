/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HelpProvider;

import Business.EcoSystem;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class HelpProviderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HelpProviderJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    public HelpProviderJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = system;
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
        jPanel2 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Help Provider");

        VRjButton.setBackground(new java.awt.Color(0, 128, 128));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(VRjButton)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(VRjButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

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

    private void VRjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VRjButtonActionPerformed
        HelpProviderRequestJPanel hprJPanel=new HelpProviderRequestJPanel(userProcessContainer,business);
        jSplitPane1.setBottomComponent(hprJPanel);
    }//GEN-LAST:event_VRjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VRjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
