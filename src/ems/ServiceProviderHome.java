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
public class ServiceProviderHome extends javax.swing.JFrame {

    /**
     * Creates new form ServiceProviderHome
     */
    boolean flag=false;
    public ServiceProviderHome() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        PMRequests = new javax.swing.JTable();
        LogOut = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Send2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PMRequests.setBackground(new java.awt.Color(204, 173, 140));
        PMRequests.setFont(new java.awt.Font("Poppins SemiBold", 0, 11)); // NOI18N
        PMRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venue", "Event Type", "Date", "Duration", "Bill", "Ready Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PMRequests.setToolTipText("");
        PMRequests.setOpaque(false);
        PMRequests.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(PMRequests);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 130, 960, 420));

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
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 15, 200, -1));

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
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 140, -1));

        Send2.setBackground(new java.awt.Color(87, 67, 41));
        Send2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        Send2.setForeground(new java.awt.Color(255, 255, 255));
        Send2.setText("Send");
        Send2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Send2.setBorderPainted(false);
        Send2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Send2ActionPerformed(evt);
            }
        });
        getContentPane().add(Send2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 130, -1));

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Welcome Back");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 190, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\College\\Sophomore Year\\PL-2\\EMS 3\\Images\\lol.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jLabel2.setBackground(new java.awt.Color(48, 37, 21));
        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel2.setText("Recieved Requests from the Project Manager");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 570, 60));

        jLabel21.setBackground(new java.awt.Color(204, 173, 140));
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 10, 100));

        jLabel18.setBackground(new java.awt.Color(204, 173, 140));
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 10, 100));

        jLabel22.setBackground(new java.awt.Color(204, 173, 140));
        jLabel22.setOpaque(true);
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 10, 100));

        jLabel19.setBackground(new java.awt.Color(204, 173, 140));
        jLabel19.setOpaque(true);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 10, 100));

        jLabel7.setBackground(new java.awt.Color(204, 173, 140));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 10, 100));

        jLabel9.setBackground(new java.awt.Color(204, 173, 140));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 10, 100));

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

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) PMRequests.getModel();
        Booking c= new Booking();
        c.BookingHistory(model);
    }//GEN-LAST:event_UpdateActionPerformed

    private void Send2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Send2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) PMRequests.getModel();        
        flag=true;
        for(int i=0;i<PMRequests.getRowCount();i++){
          ServiceProvider.setPriceandReadyDate( (PMRequests.getValueAt(i, 4)).toString(),(PMRequests.getValueAt(i, 5)).toString() ,i);
        }
        ServiceProvider.sendData(flag);
    }//GEN-LAST:event_Send2ActionPerformed

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
//            java.util.logging.Logger.getLogger(ServiceProviderHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ServiceProviderHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ServiceProviderHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ServiceProviderHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ServiceProviderHome().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut;
    private javax.swing.JTable PMRequests;
    private javax.swing.JButton Send2;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}