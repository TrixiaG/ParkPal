/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parkpal;

/**
 *
 * @author PC
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        DashboardTab.setSelectedIndex(2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollBar1 = new javax.swing.JScrollBar();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        DashboardLogo = new javax.swing.JLabel();
        BtnDashboard = new javax.swing.JButton();
        BtnAddCustomer = new javax.swing.JButton();
        BtnAvailableParking = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        DashboardTab = new javax.swing.JTabbedPane();
        AddCusPanel = new javax.swing.JPanel();
        DashboardLine1 = new keeptoo.KGradientPanel();
        DashboardLabel1 = new javax.swing.JLabel();
        AvailParkingPanel = new javax.swing.JPanel();
        DashboardLine2 = new keeptoo.KGradientPanel();
        DashboardLabel2 = new javax.swing.JLabel();
        Dashboardpanel = new javax.swing.JPanel();
        DashboardLabel = new javax.swing.JLabel();
        DashboardLine = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 730));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(255, 145, 144));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 145, 144));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(94, 114, 235));

        DashboardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParkPalLogo/ParkPal-Logo9.png"))); // NOI18N
        DashboardLogo.setToolTipText("");

        BtnDashboard.setBackground(new java.awt.Color(98, 103, 235));
        BtnDashboard.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        BtnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        BtnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dashboard.png"))); // NOI18N
        BtnDashboard.setText("       DASHBOARD");
        BtnDashboard.setBorder(null);
        BtnDashboard.setContentAreaFilled(false);
        BtnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnDashboard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDashboardMouseClicked(evt);
            }
        });
        BtnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDashboardActionPerformed(evt);
            }
        });

        BtnAddCustomer.setBackground(new java.awt.Color(98, 103, 235));
        BtnAddCustomer.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        BtnAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        BtnAddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/viewparking.png"))); // NOI18N
        BtnAddCustomer.setText("       AVAILABLE PARKING");
        BtnAddCustomer.setActionCommand("         ADD CUSTOMER");
        BtnAddCustomer.setBorder(null);
        BtnAddCustomer.setContentAreaFilled(false);
        BtnAddCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnAddCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddCustomerActionPerformed(evt);
            }
        });

        BtnAvailableParking.setBackground(new java.awt.Color(98, 103, 235));
        BtnAvailableParking.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        BtnAvailableParking.setForeground(new java.awt.Color(255, 255, 255));
        BtnAvailableParking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/addcustomer.png"))); // NOI18N
        BtnAvailableParking.setText("       ADD CUSTOMER");
        BtnAvailableParking.setActionCommand("         ADD CUSTOMER");
        BtnAvailableParking.setBorder(null);
        BtnAvailableParking.setContentAreaFilled(false);
        BtnAvailableParking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnAvailableParking.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnAvailableParking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvailableParkingActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("E X I T");
        ExitButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(BtnAvailableParking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(DashboardLogo)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(DashboardLogo)
                .addGap(121, 121, 121)
                .addComponent(BtnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAvailableParking, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        DashboardTab.setBackground(new java.awt.Color(255, 255, 255));

        AddCusPanel.setBackground(new java.awt.Color(255, 255, 255));

        DashboardLine1.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine1.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLine1Layout = new javax.swing.GroupLayout(DashboardLine1);
        DashboardLine1.setLayout(DashboardLine1Layout);
        DashboardLine1Layout.setHorizontalGroup(
            DashboardLine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        DashboardLine1Layout.setVerticalGroup(
            DashboardLine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        DashboardLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel1.setText("Add Customer");

        javax.swing.GroupLayout AddCusPanelLayout = new javax.swing.GroupLayout(AddCusPanel);
        AddCusPanel.setLayout(AddCusPanelLayout);
        AddCusPanelLayout.setHorizontalGroup(
            AddCusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCusPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(AddCusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DashboardLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DashboardLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        AddCusPanelLayout.setVerticalGroup(
            AddCusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCusPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(DashboardLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DashboardLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(613, Short.MAX_VALUE))
        );

        DashboardTab.addTab("tab1", AddCusPanel);

        AvailParkingPanel.setBackground(new java.awt.Color(255, 255, 255));

        DashboardLine2.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine2.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLine2Layout = new javax.swing.GroupLayout(DashboardLine2);
        DashboardLine2.setLayout(DashboardLine2Layout);
        DashboardLine2Layout.setHorizontalGroup(
            DashboardLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        DashboardLine2Layout.setVerticalGroup(
            DashboardLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        DashboardLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel2.setText("Available Parking");

        javax.swing.GroupLayout AvailParkingPanelLayout = new javax.swing.GroupLayout(AvailParkingPanel);
        AvailParkingPanel.setLayout(AvailParkingPanelLayout);
        AvailParkingPanelLayout.setHorizontalGroup(
            AvailParkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvailParkingPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(AvailParkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DashboardLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DashboardLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        AvailParkingPanelLayout.setVerticalGroup(
            AvailParkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvailParkingPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(DashboardLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DashboardLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(613, Short.MAX_VALUE))
        );

        DashboardTab.addTab("tab2", AvailParkingPanel);

        Dashboardpanel.setBackground(new java.awt.Color(255, 255, 255));

        DashboardLabel.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel.setText("Dashboard");

        DashboardLine.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLineLayout = new javax.swing.GroupLayout(DashboardLine);
        DashboardLine.setLayout(DashboardLineLayout);
        DashboardLineLayout.setHorizontalGroup(
            DashboardLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        DashboardLineLayout.setVerticalGroup(
            DashboardLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout DashboardpanelLayout = new javax.swing.GroupLayout(Dashboardpanel);
        Dashboardpanel.setLayout(DashboardpanelLayout);
        DashboardpanelLayout.setHorizontalGroup(
            DashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardpanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(DashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DashboardLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        DashboardpanelLayout.setVerticalGroup(
            DashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(DashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DashboardLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        DashboardTab.addTab("tab3", Dashboardpanel);

        jPanel1.add(DashboardTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, -38, 900, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDashboardActionPerformed
        DashboardTab.setSelectedIndex(2);
    }//GEN-LAST:event_BtnDashboardActionPerformed

    private void BtnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCustomerActionPerformed
        DashboardTab.setSelectedIndex(1);
    }//GEN-LAST:event_BtnAddCustomerActionPerformed

    private void BtnAvailableParkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvailableParkingActionPerformed
        DashboardTab.setSelectedIndex(0);
    }//GEN-LAST:event_BtnAvailableParkingActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BtnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashboardMouseClicked
    }//GEN-LAST:event_BtnDashboardMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddCusPanel;
    private javax.swing.JPanel AvailParkingPanel;
    private javax.swing.JButton BtnAddCustomer;
    private javax.swing.JButton BtnAvailableParking;
    private javax.swing.JButton BtnDashboard;
    private javax.swing.JLabel DashboardLabel;
    private javax.swing.JLabel DashboardLabel1;
    private javax.swing.JLabel DashboardLabel2;
    private keeptoo.KGradientPanel DashboardLine;
    private keeptoo.KGradientPanel DashboardLine1;
    private keeptoo.KGradientPanel DashboardLine2;
    private javax.swing.JLabel DashboardLogo;
    private javax.swing.JTabbedPane DashboardTab;
    private javax.swing.JPanel Dashboardpanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
}
