/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author jyoti
 */
public class NewJFrame2admin extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2admin
     */
    Adminlogin am;
    
    public NewJFrame2admin() {
        initComponents();
        this.setTitle("CAT | Admin Options");
        this.setLocationRelativeTo(null);
        am = new Adminlogin(this, rootPaneCheckingEnabled);
        
        //System.out.println(s);
    }
public void take(String s){
        Admin.setText(s);
      //  System.out.println(s);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        button_questions = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_searchques = new javax.swing.JButton();
        button_quit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Admin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminFunctions");
        setName("Adminfunc"); // NOI18N

        jInternalFrame1.setBorder(new javax.swing.border.MatteBorder(null));
        jInternalFrame1.setVisible(true);

        jButton1.setText("View applicant Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button_questions.setText("View Questions Database");
        button_questions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_questionsActionPerformed(evt);
            }
        });

        jButton3.setText("Add Questions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Welcome!");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("What would you like to do?");

        button_searchques.setText("Search a Question");
        button_searchques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchquesActionPerformed(evt);
            }
        });

        button_quit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        button_quit.setForeground(new java.awt.Color(0, 51, 255));
        button_quit.setText("Logout");
        button_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_quitMouseClicked(evt);
            }
        });

        jLabel3.setText("Session:");

        Admin.setText("jLabel4");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Admin)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)))
                .addGap(0, 56, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_questions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(button_searchques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_quit)
                .addGap(22, 22, 22))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Admin)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(16, 16, 16)
                .addComponent(button_questions)
                .addGap(18, 18, 18)
                .addComponent(button_searchques)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(button_quit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("AdminFunc");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_questionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_questionsActionPerformed
        new ViewQuestions().setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_button_questionsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        String q1 = JOptionPane.showInputDialog(null, "Enter the question", "Question database", WIDTH);
//        String a1 = JOptionPane.showInputDialog(null, "Enter the first option", "Question database", WIDTH);
//        String a2 = JOptionPane.showInputDialog(null, "Enter the second option", "Question database", WIDTH);        
//        String a3 = JOptionPane.showInputDialog(null, "Enter the third option", "Question database", WIDTH);
//        String a4 = JOptionPane.showInputDialog(null, "Enter the fourth option", "Question database", WIDTH);
//        String ans = JOptionPane.showInputDialog(null, "Enter the answer option", "Question database", WIDTH);
//        String l = JOptionPane.showInputDialog(null, "Enter the level of question", "Question database", WIDTH);
//        String q2 = JOptionPane.showInputDialog(null, "Enter the weight of the question", "Question database", WIDTH);
//        jTextField1.setText(q1);
        new Question_add().setVisible(true);
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void button_searchquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchquesActionPerformed
        new SearchAQuestion().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button_searchquesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ApplicantDatabase().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_quitMouseClicked
        this.dispose();
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_button_quitMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame2admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2admin().setVisible(true);
                            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin;
    private javax.swing.JButton button_questions;
    private javax.swing.JLabel button_quit;
    private javax.swing.JButton button_searchques;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
