/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain.view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Main() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbFastmath = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbusername = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbEqual = new javax.swing.JLabel();
        lbFastmath5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbFastmath6 = new javax.swing.JLabel();
        lbName1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVICE'S");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(350, 265));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 460, -1, -1));

        lbFastmath.setFont(new java.awt.Font("Uni Sans  ", 1, 36)); // NOI18N
        lbFastmath.setForeground(new java.awt.Color(255, 255, 255));
        lbFastmath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/abacus.png"))); // NOI18N
        lbFastmath.setToolTipText("");
        lbFastmath.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbFastmath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFastmathMouseClicked(evt);
            }
        });
        jPanel2.add(lbFastmath, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 100, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/creative-idea.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("UniSansBold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 30));

        jLabel5.setFont(new java.awt.Font("UniSansBold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 30));

        lbusername.setFont(new java.awt.Font("Uni Sans Thin CAPS", 1, 36)); // NOI18N
        lbusername.setForeground(new java.awt.Color(255, 255, 255));
        lbusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbusername.setToolTipText("");
        lbusername.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(lbusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 160, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 690, 470, 10));

        lbEqual.setFont(new java.awt.Font("Uni Sans  ", 1, 36)); // NOI18N
        lbEqual.setForeground(new java.awt.Color(255, 255, 255));
        lbEqual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/true-or-false.png"))); // NOI18N
        lbEqual.setToolTipText("");
        lbEqual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbEqual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEqualMouseClicked(evt);
            }
        });
        jPanel2.add(lbEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 100, 110));

        lbFastmath5.setFont(new java.awt.Font("Uni Sans  ", 1, 36)); // NOI18N
        lbFastmath5.setForeground(new java.awt.Color(255, 255, 255));
        lbFastmath5.setText("Equal Or Not");
        lbFastmath5.setToolTipText("");
        lbFastmath5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(lbFastmath5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 220, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 470, 10));

        lbFastmath6.setFont(new java.awt.Font("Uni Sans  ", 1, 36)); // NOI18N
        lbFastmath6.setForeground(new java.awt.Color(255, 255, 255));
        lbFastmath6.setText("Fast Math");
        lbFastmath6.setToolTipText("");
        lbFastmath6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(lbFastmath6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 170, 30));

        lbName1.setFont(new java.awt.Font("Uni Sans Thin CAPS", 1, 36)); // NOI18N
        lbName1.setForeground(new java.awt.Color(255, 255, 255));
        lbName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName1.setText("Welcome");
        lbName1.setToolTipText("");
        lbName1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(lbName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void lbFastmathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFastmathMouseClicked
        new panel_fastmath1().show();
        this.dispose();
    }//GEN-LAST:event_lbFastmathMouseClicked

    private void lbEqualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEqualMouseClicked
        // TODO add your handling code here:
        new panel_truefalse().show();
        this.dispose();
    }//GEN-LAST:event_lbEqualMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbEqual;
    private javax.swing.JLabel lbFastmath;
    private javax.swing.JLabel lbFastmath5;
    private javax.swing.JLabel lbFastmath6;
    private javax.swing.JLabel lbName1;
    private javax.swing.JLabel lbusername;
    // End of variables declaration//GEN-END:variables
}
