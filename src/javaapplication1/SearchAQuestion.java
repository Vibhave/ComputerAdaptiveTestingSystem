/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jyoti
 */
public class SearchAQuestion extends javax.swing.JFrame {
    int qcode;
    public static Statement stmt;
    public static Connection Conn;
    /**
     * Creates new form SearchAQuestion
     */

    public SearchAQuestion() {
        initComponents();
        this.setTitle("CAT | Search a Question");
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qcode_tf = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        question_table = new javax.swing.JTable();
        button_quit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_level = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Search a Question");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Enter the Question Code");

        button_search.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        question_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        question_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question Code", "Question", "Option1", "Option2", "Option3", "Option4", "Correct Answer", "No of attempts", "Correct Attempts"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        question_table.setGridColor(new java.awt.Color(0, 255, 0));
        question_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        question_table.getTableHeader().setReorderingAllowed(false);
        question_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                question_tableMouseClicked(evt);
            }
        });
        question_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                question_tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(question_table);
        question_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        button_quit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        button_quit.setForeground(new java.awt.Color(0, 51, 255));
        button_quit.setText("Quit");
        button_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_quitMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Level :");

        label_level.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        label_level.setText("      ");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(qcode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(button_search)))
                        .addGap(156, 156, 156)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_level, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(button_quit)
                        .addContainerGap())))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(qcode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search)
                    .addComponent(jLabel3)
                    .addComponent(label_level))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(button_quit)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void question_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_question_tableMouseClicked
        //((DefaultTableModel)question_table.getModel()).setRowCount(0);

      
        // TODO add your handling code here:
    }//GEN-LAST:event_question_tableMouseClicked

    private void question_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_question_tableKeyReleased
        
    }//GEN-LAST:event_question_tableKeyReleased

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        int i = 1;
        String search = new String();
        
        try {   
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        
        }catch(ClassNotFoundException |InstantiationException |IllegalAccessException q)
        {
            ;
        } 
        
        String url = "jdbc:mysql://localhost:3306/cat?zeroDateTimeBehavior=convertToNull";
        
        String user = "root";
        String pw = "vaibhav";
        Conn = DriverManager.getConnection( url, user, pw );
        stmt  = Conn.createStatement();
        
            
        }
     
//       ((DefaultTableModel)question_table.getModel()).addRow(new_row); 
      //here we will write code to load the questions
      //throw new UnsupportedOperationException("Not yet implemented");
    
    catch(SQLException sqle)
    {
         //  System.out.println("SqlException:" + sqle);
    }
    
        
        
        
        try{
        qcode = Integer.parseInt(qcode_tf.getText());
        for(i = 1; i <= 10; i++)
        {
            search = "select * from level"+Integer.toString(i)+" where qcode="+qcode_tf.getText();
//            System.out.println(search);
            
            ((DefaultTableModel)question_table.getModel()).setRowCount(0);
            ResultSet rs = stmt.executeQuery(search);
           // System.out.println(search);
        while(rs.next())
        {
            int qcode = rs.getInt(1);
            String question = rs.getString(2);
            String opt1 = rs.getString(3);
            String opt2 = rs.getString(4);
            String opt3 = rs.getString(5);
            String opt4 = rs.getString(6);
            int correct = rs.getInt(7);
            int attempts = rs.getInt(8);
            int correct_attempts = rs.getInt(9);
         //   System.out.println(i);
            
            ((DefaultTableModel)question_table.getModel()).addRow(new Object [] {qcode, question, opt1, opt2, opt3, opt4, correct, attempts, correct_attempts}); 
            label_level.setText(Integer.toString(i));
            return;
        }
        }
            JOptionPane.showMessageDialog(null, "No question found with the given Question Code. Please try again.");
        }
        catch(NumberFormatException | SQLException e){
           JOptionPane.showMessageDialog(null, "Invalid Question Code. Please try again.");
         
        }
    }//GEN-LAST:event_button_searchActionPerformed

    private void button_quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_quitMouseClicked
        this.dispose();
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
            java.util.logging.Logger.getLogger(SearchAQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAQuestion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button_quit;
    private javax.swing.JButton button_search;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_level;
    private javax.swing.JTextField qcode_tf;
    private javax.swing.JTable question_table;
    // End of variables declaration//GEN-END:variables
}
