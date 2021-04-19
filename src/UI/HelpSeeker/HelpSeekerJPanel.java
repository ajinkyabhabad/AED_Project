/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HelpSeeker;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Enterprise.HelpSeekerEnterprise;
import Business.Network.Network;
import Business.Organization.HelpSeekerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HelpSeekerWorkRequest;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ankita Dharurkar
 */
public class HelpSeekerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HelpSeekerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private HelpSeekerOrganization HSOrganization; 
    private HelpSeekerEnterprise HSenterprise;
    private EcoSystem system;
    private Network network;
    
    public HelpSeekerJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,EcoSystem business,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.HSOrganization = (HelpSeekerOrganization) organization;
        this.HSenterprise = (HelpSeekerEnterprise) enterprise;
        this.network = network;
      
        jSplitPane1.setDividerSize(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MRjButton2 = new javax.swing.JButton();
        MRjButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Welcome Help Seeker");

        setLayout(new java.awt.CardLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(0, 128, 128));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Help Seeker");

        MRjButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MRjButton2.setForeground(new java.awt.Color(255, 255, 255));
        MRjButton2.setText("View Status");
        MRjButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MRjButton2.setBorderPainted(false);
        MRjButton2.setContentAreaFilled(false);
        MRjButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MRjButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MRjButton2MouseExited(evt);
            }
        });
        MRjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRjButton2ActionPerformed(evt);
            }
        });

        MRjButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MRjButton1.setForeground(new java.awt.Color(255, 255, 255));
        MRjButton1.setText("Report");
        MRjButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MRjButton1.setBorderPainted(false);
        MRjButton1.setContentAreaFilled(false);
        MRjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MRjButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MRjButton1MouseExited(evt);
            }
        });
        MRjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MRjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MRjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MRjButton1)
                    .addComponent(MRjButton2))
                .addContainerGap())
        );

        jSplitPane1.setTopComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void MRjButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRjButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MRjButton2MouseEntered

    private void MRjButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRjButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_MRjButton2MouseExited

    private void MRjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRjButton2ActionPerformed
        // TODO add your handling code here:
        HelpSeekerViewStatusJPanel reportJPanel1=new HelpSeekerViewStatusJPanel(userProcessContainer,userAccount,HSOrganization,HSenterprise,business);
        jSplitPane1.setBottomComponent(reportJPanel1);
    }//GEN-LAST:event_MRjButton2ActionPerformed

    private void MRjButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRjButton1MouseEntered
        MRjButton1.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_MRjButton1MouseEntered

    private void MRjButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRjButton1MouseExited
        MRjButton1.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_MRjButton1MouseExited

    private void MRjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRjButton1ActionPerformed
        ReportJPanel reportJPanel=new ReportJPanel(userProcessContainer,business,userAccount,HSOrganization,network);
        jSplitPane1.setBottomComponent(reportJPanel);
        //ReportJFrame r = new ReportJFrame(system,network,ua,org);
    }//GEN-LAST:event_MRjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MRjButton1;
    private javax.swing.JButton MRjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
