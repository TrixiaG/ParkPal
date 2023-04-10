/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parkpal;

import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author PC
 */
public class mpin extends javax.swing.JFrame {
    private static final int CORNER_RADIUS = 30;
    int xMouse;
    int yMouse;
    char[] pin = new char[]{'1','2','3','4','5','6'};
    
    public mpin() {
        initComponents();
        setLocationRelativeTo(null);
        mpinPwField.setEchoChar('•');
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS));
        PlainDocument document = (PlainDocument) mpinPwField.getDocument();
        document.setDocumentFilter(new DocumentFilter() {

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String string = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;

                if (string.length() <= 6) {
                    super.replace(fb, offset, length, text, attrs); //To change body of generated methods, choose Tools | Templates.
                }
            }

        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        mpinLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mpinPwField = new javax.swing.JPasswordField(4);
        mpinHeader = new javax.swing.JLabel();
        mpinSubmitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(94, 30, 249));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        btnMin.setBackground(new java.awt.Color(98, 103, 235));
        btnMin.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TitleBar/min.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.setContentAreaFilled(false);
        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(98, 103, 235));
        btnExit.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TitleBar/ex1.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(btnMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(12, 12, 12))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 20));

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

        mpinPwField.setDocument(mpinPwField.getDocument());
        mpinPwField.setFont(new java.awt.Font("Poppins Medium", 0, 50)); // NOI18N
        mpinPwField.setForeground(new java.awt.Color(255, 153, 153));
        mpinPwField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mpinPwField.setActionCommand("<Not Set>");
        mpinPwField.setAlignmentX(0.0F);
        mpinPwField.setAlignmentY(0.0F);
        mpinPwField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        mpinPwField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mpinPwField.setOpaque(true);
        mpinPwField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mpinPwField(evt);
            }
        });
        kGradientPanel1.add(mpinPwField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 330, 44));

        mpinHeader.setFont(new java.awt.Font("Poppins Medium", 0, 30)); // NOI18N
        mpinHeader.setForeground(new java.awt.Color(255, 255, 255));
        mpinHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mpinHeader.setText("SECURITY VERIFICATION");
        mpinHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(mpinHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 500, 39));

        mpinSubmitBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        mpinSubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        mpinSubmitBtn.setText("SUBMIT");
        mpinSubmitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        mpinSubmitBtn.setContentAreaFilled(false);
        mpinSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpinSubmitBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(mpinSubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 80, 34));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinMouseExited

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(btnMin);
        frame.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(btnExit);
        frame.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void mpinPwField(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mpinPwField

    }//GEN-LAST:event_mpinPwField

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void mpinSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpinSubmitBtnActionPerformed
         if (Arrays.equals(mpinPwField.getPassword(), new char[]{})) {
            JOptionPane.showMessageDialog(null,"Please enter PIN!");
        } else if (!Arrays.equals(mpinPwField.getPassword(), pin)){
            JOptionPane.showMessageDialog(null,"Incorrect PIN. Please try again.", "Incorrect PIN", JOptionPane.ERROR_MESSAGE);
        } else if (Arrays.equals(mpinPwField.getPassword(), pin)){
               dashboard dashWin = new dashboard();
               dashWin.setVisible(true);
               dashWin.pack();
               this.dispose();
        }
    }//GEN-LAST:event_mpinSubmitBtnActionPerformed

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
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMin;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel mpinHeader;
    private javax.swing.JLabel mpinLogo;
    private javax.swing.JPasswordField mpinPwField;
    private javax.swing.JButton mpinSubmitBtn;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
