/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        passwordField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee management system");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(null);

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username.setText("Username");
        getContentPane().add(username);
        username.setBounds(100, 340, 170, 40);

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.setText("Password");
        getContentPane().add(password);
        password.setBounds(100, 410, 170, 50);

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(380, 340, 250, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 250, 251));
        jLabel2.setText("         Employee Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 140);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(380, 410, 250, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 250, 251));
        jLabel4.setText("Welcome Admin");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 240, 310, 50);

        login.setBackground(new java.awt.Color(13, 155, 49));
        login.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        login.setForeground(new java.awt.Color(248, 250, 251));
        login.setText("Login ");
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(380, 490, 120, 40);

        reset.setBackground(new java.awt.Color(227, 134, 69));
        reset.setForeground(new java.awt.Color(248, 250, 251));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(520, 490, 110, 40);

        passwordField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/emp2.png"))); // NOI18N
        passwordField.setText("jLabel5");
        getContentPane().add(passwordField);
        passwordField.setBounds(0, 140, 1370, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        usernameField.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        Home home = new Home();
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        
        //JOptionPane.showMessageDialog(null, "credentials doesnot exist", "Error", JOptionPane.ERROR_MESSAGE);
        home.setSize(2160, 1920);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        usernameField.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_resetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton login;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordField;
    private javax.swing.JButton reset;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
