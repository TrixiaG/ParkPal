/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parkpal;

import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Drian
 */
public class LoadingOpen extends javax.swing.JFrame {
    static Implementation implement = new Implementation();
    int xMouse;
    int yMouse;
    private static final int CORNER_RADIUS = 30;
    public LoadingOpen() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS));
        snakeGame2.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        snakeGame2 = new Games.SnakeGame();
        LoadingProgress = new javax.swing.JProgressBar();
        Loading = new javax.swing.JLabel();
        LoadPercent = new javax.swing.JLabel();
        bgVideo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        snakeGame2.setEnabled(true
        );
        snakeGame2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                snakeGame2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout snakeGame2Layout = new javax.swing.GroupLayout(snakeGame2);
        snakeGame2.setLayout(snakeGame2Layout);
        snakeGame2Layout.setHorizontalGroup(
            snakeGame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        snakeGame2Layout.setVerticalGroup(
            snakeGame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        MainPanel.add(snakeGame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, -1));
        MainPanel.add(LoadingProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 1260, 20));

        Loading.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        Loading.setForeground(new java.awt.Color(255, 255, 255));
        Loading.setText("Loading...");
        MainPanel.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        LoadPercent.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        LoadPercent.setForeground(new java.awt.Color(255, 255, 255));
        LoadPercent.setText("0%");
        MainPanel.add(LoadPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 630, -1, -1));

        bgVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageImagePack/BackGround.gif"))); // NOI18N
        MainPanel.add(bgVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, 710));

        pack();
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
        frame.setState(frame.ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(btnExit);
        frame.dispose();
        System.exit(0);
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

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseReleased

    }//GEN-LAST:event_titleBarMouseReleased

    private void snakeGame2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snakeGame2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_snakeGame2KeyPressed

    public static void main(String args[]) {
        LoadingOpen ls = new LoadingOpen();
        ls.setVisible(true);
        implement.addStack();

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(500);
                
                ls.LoadPercent.setText(i + "%");
                if(i==5){
                    implement.StackingOpen();
                    ls.Loading.setText(implement.getLoadingStatus());
                }
                if(i==20){
                    implement.StackingOpen();
                    ls.Loading.setText(implement.getLoadingStatus());
                }
                if(i==50){
                    implement.StackingOpen();
                    ls.Loading.setText(implement.getLoadingStatus());
                }
                if(i==70){
                    implement.StackingOpen();
                    ls.Loading.setText(implement.getLoadingStatus());
                }
                if(i==80){
                    implement.StackingOpen();
                    ls.Loading.setText(implement.getLoadingStatus());
                }
                ls.LoadingProgress.setValue(i);
                System.out.println(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        welcome w = new welcome();
        w.setVisible(true);
        ls.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadPercent;
    private javax.swing.JLabel Loading;
    private javax.swing.JProgressBar LoadingProgress;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel bgVideo;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMin;
    private Games.SnakeGame snakeGame2;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
