/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.enterpriseadmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class EnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseAdminJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    public EnterpriseAdminJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        jSplitPane1.setDividerSize(0);
        jTextField1.setText(enterprise.getEnterpriseType().getValue());
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
        MOjButton = new javax.swing.JButton();
        MEjButton = new javax.swing.JButton();
        MUjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Enterprise Admin");

        MOjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MOjButton.setForeground(new java.awt.Color(255, 255, 255));
        MOjButton.setText("Manage Organization(s)");
        MOjButton.setBorderPainted(false);
        MOjButton.setContentAreaFilled(false);
        MOjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MOjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MOjButtonMouseExited(evt);
            }
        });
        MOjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOjButtonActionPerformed(evt);
            }
        });

        MEjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MEjButton.setForeground(new java.awt.Color(255, 255, 255));
        MEjButton.setText("Manage Employee");
        MEjButton.setBorderPainted(false);
        MEjButton.setContentAreaFilled(false);
        MEjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MEjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MEjButtonMouseExited(evt);
            }
        });
        MEjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEjButtonActionPerformed(evt);
            }
        });

        MUjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MUjButton.setForeground(new java.awt.Color(255, 255, 255));
        MUjButton.setText("Manage User");
        MUjButton.setBorderPainted(false);
        MUjButton.setContentAreaFilled(false);
        MUjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MUjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MUjButtonMouseExited(evt);
            }
        });
        MUjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enterprise:");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(MOjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MEjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MUjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MOjButton)
                    .addComponent(MEjButton)
                    .addComponent(MUjButton))
                .addContainerGap())
        );

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
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

    private void MOjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MOjButtonMouseEntered
            MOjButton.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_MOjButtonMouseEntered

    private void MOjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MOjButtonMouseExited
          MOjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_MOjButtonMouseExited

    private void MEjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEjButtonMouseEntered
          MEjButton.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_MEjButtonMouseEntered

    private void MEjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEjButtonMouseExited
          MEjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_MEjButtonMouseExited

    private void MUjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MUjButtonMouseEntered
          MUjButton.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_MUjButtonMouseEntered

    private void MUjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MUjButtonMouseExited
          MUjButton.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_MUjButtonMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void MOjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOjButtonActionPerformed
        ManageOrganizationsJPanel manageorganizationsJPanel=new ManageOrganizationsJPanel(userProcessContainer,enterprise, system,enterprise.getOrganizationDirectory());
        jSplitPane1.setBottomComponent(manageorganizationsJPanel);
    }//GEN-LAST:event_MOjButtonActionPerformed

    private void MEjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEjButtonActionPerformed
        ManageEmployeeJPanel manageemployeeJPanel=new ManageEmployeeJPanel(userProcessContainer,enterprise, system,enterprise.getOrganizationDirectory());
        jSplitPane1.setBottomComponent(manageemployeeJPanel);
    }//GEN-LAST:event_MEjButtonActionPerformed

    private void MUjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUjButtonActionPerformed
        ManageUserJPanel manageuserJPanel=new ManageUserJPanel(userProcessContainer,enterprise, system);
        jSplitPane1.setBottomComponent(manageuserJPanel);
    }//GEN-LAST:event_MUjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MEjButton;
    private javax.swing.JButton MOjButton;
    private javax.swing.JButton MUjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
