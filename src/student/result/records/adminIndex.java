/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student.result.records;

import javax.swing.JOptionPane;

/**
 *
 * @author souravmazumdar
 */
public class adminIndex extends javax.swing.JFrame {

    /**
     * Creates new form adminIndex
     */
    public adminIndex() {
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

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jTextField15 = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        USERNAME = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        back = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        usernamefield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTextField15.setText("jTextField15");

        jlabel.setIcon(new javax.swing.ImageIcon("/Users/souravmazumdar/Desktop/STUDENT RECORD PROJECT/CAMPUS.jpg")); // NOI18N
        jlabel.setText("jLabel1");

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/souravmazumdar/Desktop/STUDENT RECORD PROJECT/CAMPUS.jpg")); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        USERNAME.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        USERNAME.setForeground(new java.awt.Color(255, 255, 102));
        USERNAME.setText("USERNAME");
        getContentPane().add(USERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, 20));

        PASSWORD.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        PASSWORD.setForeground(new java.awt.Color(255, 255, 102));
        PASSWORD.setText("PASSWORD");
        getContentPane().add(PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, 20));

        login.setBackground(new java.awt.Color(255, 204, 255));
        login.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        login.setForeground(new java.awt.Color(51, 51, 255));
        login.setIcon(new javax.swing.ImageIcon("/Users/souravmazumdar/Desktop/STUDENT RECORD PROJECT/LOGINICON.png")); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, 40));

        back.setBackground(new java.awt.Color(255, 204, 255));
        back.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        back.setForeground(new java.awt.Color(51, 51, 255));
        back.setIcon(new javax.swing.ImageIcon("/Users/souravmazumdar/Desktop/STUDENT RECORD PROJECT/CROSS.png")); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 120, 40));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 130, -1));

        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/souravmazumdar/Desktop/STUDENT RECORD PROJECT/CAMPUS.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 700, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String username=usernamefield.getText();
        String pass=PasswordField.getText();
        if(username.equals("admin") && pass.equals("password")) {
            setVisible(false);
            new adminHome().setVisible(true);
            
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect Username or password");
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
        
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PASSWORD;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JLabel jlabel;
    private javax.swing.JButton login;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables

}