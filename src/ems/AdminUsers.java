/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ems;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AdminUsers extends javax.swing.JFrame {

    /**
     * Creates new form AdminUsers
     */
    public AdminUsers() {
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

        LogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Users = new javax.swing.JTable();
        ContactUs = new javax.swing.JButton();
        Update1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogOut.setBackground(new java.awt.Color(207, 179, 138));
        LogOut.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        LogOut.setForeground(new java.awt.Color(84, 64, 40));
        LogOut.setText("Log Out");
        LogOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogOut.setBorderPainted(false);
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 15, 200, -1));

        Users.setBackground(new java.awt.Color(204, 173, 140));
        Users.setFont(new java.awt.Font("Poppins SemiBold", 0, 11)); // NOI18N
        Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "First Name", "Last Name", "Phone Number", "User Role", "User ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Users.setToolTipText("");
        Users.setOpaque(false);
        Users.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Users);
        if (Users.getColumnModel().getColumnCount() > 0) {
            Users.getColumnModel().getColumn(0).setPreferredWidth(60);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 130, 960, 420));

        ContactUs.setBackground(new java.awt.Color(207, 179, 138));
        ContactUs.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        ContactUs.setForeground(new java.awt.Color(84, 64, 40));
        ContactUs.setText("Users");
        ContactUs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ContactUs.setBorderPainted(false);
        ContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactUsActionPerformed(evt);
            }
        });
        getContentPane().add(ContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 15, 200, -1));

        Update1.setBackground(new java.awt.Color(87, 67, 41));
        Update1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        Update1.setForeground(new java.awt.Color(255, 255, 255));
        Update1.setText("Delete");
        Update1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update1.setBorderPainted(false);
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });
        getContentPane().add(Update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 150, -1));

        jButton1.setBackground(new java.awt.Color(207, 179, 138));
        jButton1.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(84, 64, 40));
        jButton1.setText("Requests");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 15, 200, -1));

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Welcome Back");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 190, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\College\\Sophomore Year\\PL-2\\EMS 3\\Images\\lol.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jLabel2.setBackground(new java.awt.Color(48, 37, 21));
        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel2.setText("Users Information");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 310, 60));

        jLabel21.setBackground(new java.awt.Color(204, 173, 140));
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 10, 100));

        jLabel8.setBackground(new java.awt.Color(204, 173, 140));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 10, 100));

        jLabel12.setBackground(new java.awt.Color(204, 173, 140));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 10, 100));

        jLabel13.setBackground(new java.awt.Color(204, 173, 140));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 10, 100));

        jLabel7.setBackground(new java.awt.Color(204, 173, 140));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 10, 100));

        jLabel9.setBackground(new java.awt.Color(204, 173, 140));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 10, 100));

        Update.setBackground(new java.awt.Color(87, 67, 41));
        Update.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update.setBorderPainted(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 130, -1));

        jLabel29.setBackground(new java.awt.Color(48, 37, 21));
        jLabel29.setFont(new java.awt.Font("Poppins Medium", 2, 18)); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, 40));

        jLabel1.setBackground(new java.awt.Color(204, 173, 140));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 562));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        Home lo = new Home();
        lo.show();
        dispose();
    }//GEN-LAST:event_LogOutActionPerformed

    private void ContactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactUsActionPerformed
        AdminUsers ok = new AdminUsers();
        ok.show();
        dispose();
    }//GEN-LAST:event_ContactUsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminHome s = new AdminHome();
        s.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        Admin a= new Admin();
        DefaultTableModel model= (DefaultTableModel) Users.getModel();
        a.User(model);
    }//GEN-LAST:event_UpdateActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        DeleteUser a = new DeleteUser();
        a.show();
        
    }//GEN-LAST:event_Update1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminUsers().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContactUs;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Update;
    private javax.swing.JButton Update1;
    private javax.swing.JTable Users;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
