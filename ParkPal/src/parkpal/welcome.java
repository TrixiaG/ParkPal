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

/**
 *
 * @author PC
 */
public class welcome extends javax.swing.JFrame {
    private static final int CORNER_RADIUS = 30;
    int xMouse;
    int yMouse;
    
    public welcome() {
        initComponents();
        setLocationRelativeTo(null);
        passwordPwField.setEchoChar('•');
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        titleBar = new javax.swing.JPanel();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        HomePagePanel = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        ParkPalHeader = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ParkPalLogo = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        passwordPwField = new javax.swing.JPasswordField();
        ShowPasswordCheckbox = new javax.swing.JCheckBox();
        LogInButton = new javax.swing.JButton();
        HomePageImage = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parkpal");
        setBackground(new java.awt.Color(94, 114, 235));
        setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        setName("HomePageFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                titleBarMouseReleased(evt);
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
                .addContainerGap(1227, Short.MAX_VALUE)
                .addComponent(btnMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        getContentPane().add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 20));

        HomePagePanel.setBackground(new java.awt.Color(255, 255, 255));
        HomePagePanel.setForeground(new java.awt.Color(255, 255, 255));
        HomePagePanel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        HomePagePanel.setPreferredSize(new java.awt.Dimension(1280, 740));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 145, 144));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(94, 114, 235));

        ParkPalHeader.setFont(new java.awt.Font("Poppins Medium", 0, 50)); // NOI18N
        ParkPalHeader.setForeground(new java.awt.Color(255, 255, 255));
        ParkPalHeader.setText("ParkPal");
        ParkPalHeader.setToolTipText("");
        ParkPalHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ParkPalHeader.setIconTextGap(6);
        ParkPalHeader.setMinimumSize(new java.awt.Dimension(100, 100));
        ParkPalHeader.setPreferredSize(new java.awt.Dimension(100, 19));

        UserNameLabel.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password");

        ParkPalLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParkPalLogo/ParkPal-Logo7.png"))); // NOI18N

        usernameTxtField.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        usernameTxtField.setForeground(new java.awt.Color(102, 0, 102));
        usernameTxtField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameTxtField.setToolTipText("");
        usernameTxtField.setAutoscrolls(false);
        usernameTxtField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        usernameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtFieldActionPerformed(evt);
            }
        });

        passwordPwField.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        passwordPwField.setForeground(new java.awt.Color(102, 0, 102));
        passwordPwField.setToolTipText("");
        passwordPwField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        ShowPasswordCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        ShowPasswordCheckbox.setFont(new java.awt.Font("Poppins Light", 2, 12)); // NOI18N
        ShowPasswordCheckbox.setForeground(new java.awt.Color(255, 255, 255));
        ShowPasswordCheckbox.setText("Show Password");
        ShowPasswordCheckbox.setBorder(null);
        ShowPasswordCheckbox.setContentAreaFilled(false);
        ShowPasswordCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordCheckboxActionPerformed(evt);
            }
        });

        LogInButton.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("LOG-IN");
        LogInButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        LogInButton.setContentAreaFilled(false);
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        HomePageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageImagePack/6.jpg"))); // NOI18N
        HomePageImage.setOpaque(true);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordPwField)
                    .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(ParkPalLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ParkPalHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPasswordCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(HomePageImage, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParkPalLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(ParkPalHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(53, 53, 53)
                .addComponent(UserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPwField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowPasswordCheckbox)
                .addGap(18, 18, 18)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(HomePageImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HomePagePanelLayout = new javax.swing.GroupLayout(HomePagePanel);
        HomePagePanel.setLayout(HomePagePanelLayout);
        HomePagePanelLayout.setHorizontalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePagePanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePagePanelLayout.setVerticalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(HomePagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowPasswordCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordCheckboxActionPerformed
        // TODO add your handling code here:
        if(ShowPasswordCheckbox.isSelected()){
            passwordPwField.setEchoChar((char)0);
        } else {
            passwordPwField.setEchoChar(('*'));
        }
    }//GEN-LAST:event_ShowPasswordCheckboxActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
        
        if(usernameTxtField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter  username!") ;
        } else if (Arrays.equals(passwordPwField.getPassword(), new char[]{})) {
            JOptionPane.showMessageDialog(null,"Please enter password!");
        } else if(!usernameTxtField.getText().equals("AdminA")){
            JOptionPane.showMessageDialog(null, "Incorrect username. Please try again.", "Incorrect Username", JOptionPane.ERROR_MESSAGE);
        } else if (!Arrays.equals(passwordPwField.getPassword(), new char[]{'@','D','m','1','n','0','0'})){
            JOptionPane.showMessageDialog(null,"Incorrect password. Please try again.", "Incorrect Password", JOptionPane.ERROR_MESSAGE);
        } else if (Arrays.equals(passwordPwField.getPassword(), new char[]{'@','D','m','1','n','0','0'}) && usernameTxtField.getText().equals("AdminA")){
               mpin mpinWin = new mpin();
               mpinWin.setVisible(true);
               mpinWin.pack();
               this.dispose();
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void usernameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtFieldActionPerformed

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

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void titleBarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseReleased

    }//GEN-LAST:event_titleBarMouseReleased

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomePageImage;
    private javax.swing.JPanel HomePagePanel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel ParkPalHeader;
    private javax.swing.JLabel ParkPalLogo;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JCheckBox ShowPasswordCheckbox;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField passwordPwField;
    private javax.swing.JPanel titleBar;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables

}
