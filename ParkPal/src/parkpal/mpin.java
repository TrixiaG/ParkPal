/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parkpal;

import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author PC
 */
public class mpin extends javax.swing.JFrame {
    private static final int CORNER_RADIUS = 30;
    
    public mpin() {
        initComponents();
        setLocationRelativeTo(null);
        mpinPwField.setEchoChar('•');
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        mpinLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mpinPwField = new javax.swing.JPasswordField();
        mpinHeader = new javax.swing.JLabel();
        mpinSubmitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 145, 144));
        kGradientPanel1.setkGradientFocus(200);
        kGradientPanel1.setkStartColor(new java.awt.Color(94, 114, 235));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mpinLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageImagePack/mpin4.png"))); // NOI18N
        kGradientPanel1.add(mpinLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 150, 170));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please enter your 6 - Digit MPIN");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 210, -1));

        mpinPwField.setBackground(new java.awt.Color(255, 255, 255));
        mpinPwField.setFont(new java.awt.Font("Poppins Medium", 0, 50)); // NOI18N
        mpinPwField.setForeground(new java.awt.Color(255, 153, 153));
        mpinPwField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mpinPwField.setText("******");
        mpinPwField.setActionCommand("<Not Set>");
        mpinPwField.setAlignmentX(0.0F);
        mpinPwField.setAlignmentY(0.0F);
        mpinPwField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        mpinPwField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mpinPwField.setOpaque(true);
        kGradientPanel1.add(mpinPwField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 330, 44));

        mpinHeader.setFont(new java.awt.Font("Poppins Medium", 0, 30)); // NOI18N
        mpinHeader.setForeground(new java.awt.Color(255, 255, 255));
        mpinHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mpinHeader.setText("SECURITY VERIFICATION");
        mpinHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(mpinHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 500, 39));

        mpinSubmitBtn.setBackground(new java.awt.Color(255, 255, 255));
        mpinSubmitBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        mpinSubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        mpinSubmitBtn.setText("SUBMIT");
        mpinSubmitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        mpinSubmitBtn.setContentAreaFilled(false);
        kGradientPanel1.add(mpinSubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 80, 34));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(mpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mpin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel mpinHeader;
    private javax.swing.JLabel mpinLogo;
    private javax.swing.JPasswordField mpinPwField;
    private javax.swing.JButton mpinSubmitBtn;
    // End of variables declaration//GEN-END:variables
}
