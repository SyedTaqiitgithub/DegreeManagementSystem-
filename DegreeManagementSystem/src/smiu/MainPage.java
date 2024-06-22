/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smiu;

/**
 *
 * @author Syed Taqi
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBtnStudent = new javax.swing.JButton();
        jBtnAdmin = new javax.swing.JButton();
        jBtnStudentForm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(943, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SMIU.jpg"))); // NOI18N

        jBtnStudent.setBackground(new java.awt.Color(0, 0, 0));
        jBtnStudent.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jBtnStudent.setForeground(new java.awt.Color(255, 255, 255));
        jBtnStudent.setText("STUDENT");
        jBtnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStudentActionPerformed(evt);
            }
        });

        jBtnAdmin.setBackground(new java.awt.Color(0, 0, 0));
        jBtnAdmin.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jBtnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAdmin.setText("ADMIN");
        jBtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdminActionPerformed(evt);
            }
        });

        jBtnStudentForm.setBackground(new java.awt.Color(0, 0, 0));
        jBtnStudentForm.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jBtnStudentForm.setForeground(new java.awt.Color(255, 255, 255));
        jBtnStudentForm.setText("REGISTER FORM");
        jBtnStudentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStudentFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jBtnAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jBtnStudent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jBtnStudentForm)))
                .addGap(630, 630, 630))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBtnAdmin)
                .addGap(54, 54, 54)
                .addComponent(jBtnStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jBtnStudentForm)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 650, 670));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdminActionPerformed
        AdminLogin Info = new AdminLogin();
        Info.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnAdminActionPerformed

    private void jBtnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStudentActionPerformed
        LoginPage Info = new LoginPage();
        Info.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnStudentActionPerformed

    private void jBtnStudentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStudentFormActionPerformed
        RegisterForm Info = new RegisterForm();
        Info.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnStudentFormActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdmin;
    private javax.swing.JButton jBtnStudent;
    private javax.swing.JButton jBtnStudentForm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
