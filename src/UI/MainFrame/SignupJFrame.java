/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MainFrame;


import java.awt.Color;

/**
 *
 * @author Ankita Dharurkar
 */
public class SignupJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignupJFrame
     */
    public SignupJFrame() {
        initComponents();
        this.setSize(1080, 720);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameJLabel = new javax.swing.JLabel();
        detailsjPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fnamejLabel = new javax.swing.JLabel();
        contactjLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        usernamejLabel = new javax.swing.JLabel();
        passwordjLabel = new javax.swing.JLabel();
        fnameTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        usernamejTextField = new javax.swing.JTextField();
        passwordjTextField = new javax.swing.JTextField();
        signupjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameJLabel.setBackground(new java.awt.Color(0, 128, 128));
        NameJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameJLabel.setText("Sexual Awareness & Help");
        NameJLabel.setOpaque(true);

        detailsjPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter your details below ");

        fnamejLabel.setText("Full Name");

        contactjLabel.setText("Contact Number");

        emailjLabel.setText("Email - Id");

        usernamejLabel.setText("Username");

        passwordjLabel.setText("Password");

        signupjButton.setBackground(new java.awt.Color(0, 128, 128));
        signupjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupjButton.setText("Sign Up");
        signupjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupjButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout detailsjPanelLayout = new javax.swing.GroupLayout(detailsjPanel);
        detailsjPanel.setLayout(detailsjPanelLayout);
        detailsjPanelLayout.setHorizontalGroup(
            detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsjPanelLayout.createSequentialGroup()
                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsjPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(detailsjPanelLayout.createSequentialGroup()
                                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernamejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnamejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(contactjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fnameTextField)
                                    .addComponent(contactTextField)
                                    .addComponent(emailjTextField)
                                    .addComponent(usernamejTextField)
                                    .addComponent(passwordjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))))
                    .addGroup(detailsjPanelLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(signupjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        detailsjPanelLayout.setVerticalGroup(
            detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsjPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnamejLabel)
                    .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactjLabel)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailjLabel)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamejLabel)
                    .addComponent(usernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordjLabel)
                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(signupjButton)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(detailsjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(detailsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupjButtonMouseEntered
        signupjButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_signupjButtonMouseEntered

    private void signupjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupjButtonMouseExited
        signupjButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_signupjButtonMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignupJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameJLabel;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel contactjLabel;
    private javax.swing.JPanel detailsjPanel;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.JLabel fnamejLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JButton signupjButton;
    private javax.swing.JLabel usernamejLabel;
    private javax.swing.JTextField usernamejTextField;
    // End of variables declaration//GEN-END:variables
}
