/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ems;

/**
 *
 * @author user
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public SignIn() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SignUpNow1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Please Enter Your Credentials");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 430, 70));

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hello!");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 180, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\College\\Sophomore Year\\PL-2\\EVENTMANAGEMENT\\Images\\lol.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1000, 210));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 57, 34));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(124, 81, 14));
        jLabel7.setText("Sign Up");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        jTextField2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(40, 30, 18));
        jTextField2.setText("Enter a valid email address");
        jTextField2.setSelectionColor(new java.awt.Color(54, 41, 25));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 380, 30));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setSelectionColor(new java.awt.Color(54, 41, 25));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 380, 30));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 57, 34));
        jLabel8.setText("Email Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 54, 19));
        jLabel9.setText("New Here?");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        SignUpNow1.setBackground(new java.awt.Color(87, 67, 41));
        SignUpNow1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        SignUpNow1.setForeground(new java.awt.Color(255, 255, 255));
        SignUpNow1.setText("Sign In");
        SignUpNow1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignUpNow1.setBorderPainted(false);
        SignUpNow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpNow1ActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpNow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 160, 20));

        jLabel1.setBackground(new java.awt.Color(204, 173, 140));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 562));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        SignUp su =new SignUp();
        su.show();
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void SignUpNow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpNow1ActionPerformed
        User.signIN(jTextField2.getText(), jPasswordField1.getText());
        dispose();
    }//GEN-LAST:event_SignUpNow1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    String EmailAddress;
    String Password;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpNow1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
