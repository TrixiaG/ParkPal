
package parkpal;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
/**
 *
 * @author PC
 */
public class dashboard extends javax.swing.JFrame {
    private static final int CORNER_RADIUS = 30;
    static final String FILENAME = "data.txt";
    static String first_name;
    static String last_name;
    static String mobnum;
    static String platenum;
    static String vehicle_type;
    static boolean Pwd_Sen;
    static boolean hPwd_Sen;
    static String date;
    Implementation implement = new Implementation();
    
    public dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        load();
        DashboardTab.setSelectedIndex(0);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS));
        JTableHeader header = dashTabled.getTableHeader();
        header.setFont(new Font("Poppins Medium", Font.PLAIN, 12)); // set font for the header
        header.setBackground(Color.LIGHT_GRAY); // set background color for the header
        for (int i = 0; i < dashTabled.getColumnCount(); i++) {
            TableColumn column = dashTabled.getColumnModel().getColumn(i);
        }
        PlainDocument document = (PlainDocument) pnum.getDocument();
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
    
    public void addTable(String first_name, 
            String last_name, 
            String mobnum, 
            String platenum, 
            String vehicle_type, 
            boolean Pwd_Sen, 
            boolean hPwd_Sen, 
            String date){
        DefaultTableModel t;
        
        t = (DefaultTableModel) dashTabled.getModel();
            t.addRow(new Object[]{
                first_name, 
                last_name, 
                mobnum, 
                platenum, 
                vehicle_type, 
                Pwd_Sen, 
                hPwd_Sen, 
                date
            });
    }
    private void clear(){
        fname.setText("");
        lname.setText("");
        mnum.setText("");
        pnum.setText("");
        vtype.setSelectedIndex(0);
        rb_one.clearSelection();
        rb_two.clearSelection();
    }
    public static void load(){
        File file = new File("data.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dashTabled.getModel();
            
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length ; i++){
                String[] line = lines[i].toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollBar1 = new javax.swing.JScrollBar();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        rb_one = new javax.swing.ButtonGroup();
        rb_two = new javax.swing.ButtonGroup();
        titleBar = new javax.swing.JPanel();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titleBar1 = new javax.swing.JPanel();
        btnMin1 = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        DashboardLogo = new javax.swing.JLabel();
        BtnDashboard = new javax.swing.JButton();
        BtnAddCustomer = new javax.swing.JButton();
        BtnAvailableParking = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        DashboardTab = new javax.swing.JTabbedPane();
        Dashboardpanel = new javax.swing.JPanel();
        DashboardLabel = new javax.swing.JLabel();
        DashboardLine = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashTabled = new javax.swing.JTable();
        sortVtypeBtn = new javax.swing.JButton();
        DashboardLine3 = new keeptoo.KGradientPanel();
        sortFnameBtn = new javax.swing.JButton();
        sortLnameBtn1 = new javax.swing.JButton();
        sortPnumberBtn1 = new javax.swing.JButton();
        sortVtypeBtn1 = new javax.swing.JButton();
        AddCusPanel = new javax.swing.JPanel();
        DashboardLine1 = new keeptoo.KGradientPanel();
        DashboardLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        mobileNumberLabel = new javax.swing.JLabel();
        mnum = new javax.swing.JTextField();
        plateNumberLabel = new javax.swing.JLabel();
        pnum = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        vtype = new javax.swing.JComboBox<>();
        vehicleLabel = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        p2 = new javax.swing.JRadioButton();
        p1 = new javax.swing.JRadioButton();
        pwdFamLabel = new javax.swing.JLabel();
        SubmitAddCusBtn = new javax.swing.JButton();
        AvailParkingPanel = new javax.swing.JPanel();
        DashboardLine2 = new keeptoo.KGradientPanel();
        DashboardLabel2 = new javax.swing.JLabel();

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
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(94, 30, 249));

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar1.setBackground(new java.awt.Color(94, 30, 249));

        btnMin1.setBackground(new java.awt.Color(98, 103, 235));
        btnMin1.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        btnMin1.setForeground(new java.awt.Color(255, 255, 255));
        btnMin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TitleBar/min.png"))); // NOI18N
        btnMin1.setBorder(null);
        btnMin1.setContentAreaFilled(false);
        btnMin1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMin1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMin1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMin1MouseExited(evt);
            }
        });
        btnMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMin1ActionPerformed(evt);
            }
        });

        btnExit1.setBackground(new java.awt.Color(98, 103, 235));
        btnExit1.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(255, 255, 255));
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TitleBar/ex1.png"))); // NOI18N
        btnExit1.setBorder(null);
        btnExit1.setContentAreaFilled(false);
        btnExit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExit1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExit1MouseExited(evt);
            }
        });
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titleBar1Layout = new javax.swing.GroupLayout(titleBar1);
        titleBar1.setLayout(titleBar1Layout);
        titleBar1Layout.setHorizontalGroup(
            titleBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBar1Layout.createSequentialGroup()
                .addContainerGap(1227, Short.MAX_VALUE)
                .addComponent(btnMin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit1)
                .addGap(12, 12, 12))
        );
        titleBar1Layout.setVerticalGroup(
            titleBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBar1Layout.createSequentialGroup()
                .addGroup(titleBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(titleBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 20));

        kGradientPanel1.setBackground(new java.awt.Color(255, 145, 144));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 145, 144));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(94, 114, 235));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParkPalLogo/ParkPal-Logo9.png"))); // NOI18N
        DashboardLogo.setToolTipText("");
        kGradientPanel1.add(DashboardLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 29, -1, -1));

        BtnDashboard.setBackground(new java.awt.Color(98, 103, 235));
        BtnDashboard.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnDashboardMouseExited(evt);
            }
        });
        BtnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDashboardActionPerformed(evt);
            }
        });
        kGradientPanel1.add(BtnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 249, 255, 46));

        BtnAddCustomer.setBackground(new java.awt.Color(98, 103, 235));
        BtnAddCustomer.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        BtnAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        BtnAddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/viewparking.png"))); // NOI18N
        BtnAddCustomer.setText("       AVAILABLE PARKING");
        BtnAddCustomer.setActionCommand("         ADD CUSTOMER");
        BtnAddCustomer.setBorder(null);
        BtnAddCustomer.setContentAreaFilled(false);
        BtnAddCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnAddCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAddCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAddCustomerMouseExited(evt);
            }
        });
        BtnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddCustomerActionPerformed(evt);
            }
        });
        kGradientPanel1.add(BtnAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 377, 255, 46));

        BtnAvailableParking.setBackground(new java.awt.Color(98, 103, 235));
        BtnAvailableParking.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        BtnAvailableParking.setForeground(new java.awt.Color(255, 255, 255));
        BtnAvailableParking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/addcustomer.png"))); // NOI18N
        BtnAvailableParking.setText("       ADD CUSTOMER");
        BtnAvailableParking.setActionCommand("         ADD CUSTOMER");
        BtnAvailableParking.setBorder(null);
        BtnAvailableParking.setContentAreaFilled(false);
        BtnAvailableParking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnAvailableParking.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnAvailableParking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAvailableParkingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAvailableParkingMouseExited(evt);
            }
        });
        BtnAvailableParking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvailableParkingActionPerformed(evt);
            }
        });
        kGradientPanel1.add(BtnAvailableParking, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 313, 255, 46));

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
        kGradientPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 472, 255, 62));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 730));

        DashboardTab.setBackground(new java.awt.Color(255, 255, 255));

        Dashboardpanel.setBackground(new java.awt.Color(255, 255, 255));
        Dashboardpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardLabel.setBackground(new java.awt.Color(255, 255, 255));
        DashboardLabel.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel.setForeground(new java.awt.Color(153, 153, 153));
        DashboardLabel.setText("Dashboard");
        Dashboardpanel.add(DashboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 352, 82));

        DashboardLine.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLineLayout = new javax.swing.GroupLayout(DashboardLine);
        DashboardLine.setLayout(DashboardLineLayout);
        DashboardLineLayout.setHorizontalGroup(
            DashboardLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardLineLayout.setVerticalGroup(
            DashboardLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Dashboardpanel.add(DashboardLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 880, -1));

        dashTabled.setBackground(new java.awt.Color(255, 255, 255));
        dashTabled.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        dashTabled.setForeground(new java.awt.Color(0, 0, 0));
        dashTabled.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Mobile Number", "Plate Number", "Vehicle Type", "PWD/SC", "PWD/SC Family", "Reg. Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dashTabled.setFocusable(false);
        dashTabled.setGridColor(new java.awt.Color(94, 114, 235));
        dashTabled.setSelectionBackground(new java.awt.Color(255, 145, 144));
        dashTabled.setSelectionForeground(new java.awt.Color(94, 114, 235));
        dashTabled.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dashTabled);
        if (dashTabled.getColumnModel().getColumnCount() > 0) {
            dashTabled.getColumnModel().getColumn(0).setResizable(false);
            dashTabled.getColumnModel().getColumn(1).setResizable(false);
            dashTabled.getColumnModel().getColumn(2).setResizable(false);
            dashTabled.getColumnModel().getColumn(3).setResizable(false);
            dashTabled.getColumnModel().getColumn(4).setResizable(false);
            dashTabled.getColumnModel().getColumn(5).setResizable(false);
            dashTabled.getColumnModel().getColumn(6).setResizable(false);
            dashTabled.getColumnModel().getColumn(7).setResizable(false);
        }

        Dashboardpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 880, 430));

        sortVtypeBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortVtypeBtn.setForeground(new java.awt.Color(233, 123, 122));
        sortVtypeBtn.setText("SORT BY REG. DATE");
        sortVtypeBtn.setToolTipText("");
        sortVtypeBtn.setActionCommand("SORT BYFIRST NAME");
        sortVtypeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(233, 123, 122), 1, true));
        sortVtypeBtn.setContentAreaFilled(false);
        sortVtypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortVtypeBtnActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortVtypeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 160, 30));

        DashboardLine3.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine3.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLine3Layout = new javax.swing.GroupLayout(DashboardLine3);
        DashboardLine3.setLayout(DashboardLine3Layout);
        DashboardLine3Layout.setHorizontalGroup(
            DashboardLine3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        DashboardLine3Layout.setVerticalGroup(
            DashboardLine3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        Dashboardpanel.add(DashboardLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 880, -1));

        sortFnameBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortFnameBtn.setForeground(new java.awt.Color(96, 114, 233));
        sortFnameBtn.setText("SORT BY FIRST NAME");
        sortFnameBtn.setToolTipText("");
        sortFnameBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(96, 114, 233), 1, true));
        sortFnameBtn.setContentAreaFilled(false);
        sortFnameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortFnameBtnActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortFnameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, 30));

        sortLnameBtn1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortLnameBtn1.setForeground(new java.awt.Color(197, 133, 176));
        sortLnameBtn1.setText("SORT BY LAST NAME");
        sortLnameBtn1.setToolTipText("");
        sortLnameBtn1.setActionCommand("SORT BYFIRST NAME");
        sortLnameBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 133, 176), 1, true));
        sortLnameBtn1.setContentAreaFilled(false);
        sortLnameBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortLnameBtn1ActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortLnameBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, 30));

        sortPnumberBtn1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortPnumberBtn1.setForeground(new java.awt.Color(235, 141, 155));
        sortPnumberBtn1.setText("SORT BY PLATE NO.");
        sortPnumberBtn1.setToolTipText("");
        sortPnumberBtn1.setActionCommand("SORT BYFIRST NAME");
        sortPnumberBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 141, 155), 1, true));
        sortPnumberBtn1.setContentAreaFilled(false);
        sortPnumberBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPnumberBtn1ActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortPnumberBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 160, 30));

        sortVtypeBtn1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortVtypeBtn1.setForeground(new java.awt.Color(255, 145, 144));
        sortVtypeBtn1.setText("SORT BY VEHICLE TYPE");
        sortVtypeBtn1.setToolTipText("");
        sortVtypeBtn1.setActionCommand("SORT BYFIRST NAME");
        sortVtypeBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 145, 144), 1, true));
        sortVtypeBtn1.setContentAreaFilled(false);
        sortVtypeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortVtypeBtn1ActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortVtypeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 160, 30));

        DashboardTab.addTab("tab3", Dashboardpanel);

        AddCusPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddCusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardLine1.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine1.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLine1Layout = new javax.swing.GroupLayout(DashboardLine1);
        DashboardLine1.setLayout(DashboardLine1Layout);
        DashboardLine1Layout.setHorizontalGroup(
            DashboardLine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        DashboardLine1Layout.setVerticalGroup(
            DashboardLine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        AddCusPanel.add(DashboardLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 880, -1));

        DashboardLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel1.setForeground(new java.awt.Color(153, 153, 153));
        DashboardLabel1.setText("Add Customer");
        AddCusPanel.add(DashboardLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 492, 82));

        nameLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        nameLabel.setText("Given Name:");
        AddCusPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 162, -1, 36));

        fname.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        AddCusPanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 162, 417, -1));

        lastnameLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        lastnameLabel.setText("Last Name:");
        AddCusPanel.add(lastnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 221, -1, 36));

        lname.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        AddCusPanel.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 221, 417, -1));

        mobileNumberLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        mobileNumberLabel.setText("Mobile Number:");
        AddCusPanel.add(mobileNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 275, -1, 36));

        mnum.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        mnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mnumKeyTyped(evt);
            }
        });
        AddCusPanel.add(mnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 275, 417, -1));

        plateNumberLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        plateNumberLabel.setText("Plate Number:");
        AddCusPanel.add(plateNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 329, -1, 36));

        pnum.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        pnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnumKeyTyped(evt);
            }
        });
        AddCusPanel.add(pnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 329, 417, -1));

        pwdLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        pwdLabel.setText("PWD Member or Senior Citizen:");
        AddCusPanel.add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 437, -1, 36));

        vtype.setBackground(new java.awt.Color(98, 103, 235));
        vtype.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        vtype.setForeground(new java.awt.Color(255, 255, 255));
        vtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Motorcycle", "4 Wheeler Car" }));
        vtype.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddCusPanel.add(vtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 383, 417, -1));

        vehicleLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        vehicleLabel.setText("Vehicle Type:");
        AddCusPanel.add(vehicleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 383, -1, 36));

        rb_one.add(r1);
        r1.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        r1.setText("Yes");
        r1.setBorderPainted(true);
        AddCusPanel.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 438, -1, -1));

        rb_one.add(r2);
        r2.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        r2.setText("No");
        AddCusPanel.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 438, -1, -1));

        rb_two.add(p2);
        p2.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        p2.setText("No");
        AddCusPanel.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 492, -1, -1));

        rb_two.add(p1);
        p1.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        p1.setText("Yes");
        AddCusPanel.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 492, -1, -1));

        pwdFamLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        pwdFamLabel.setText("Any PWDs or senior citizens in your family?");
        AddCusPanel.add(pwdFamLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 491, -1, 36));

        SubmitAddCusBtn.setBackground(new java.awt.Color(255, 153, 0));
        SubmitAddCusBtn.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        SubmitAddCusBtn.setForeground(new java.awt.Color(255, 145, 144));
        SubmitAddCusBtn.setText("SUBMIT");
        SubmitAddCusBtn.setBorder(null);
        SubmitAddCusBtn.setContentAreaFilled(false);
        SubmitAddCusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitAddCusBtnActionPerformed(evt);
            }
        });
        AddCusPanel.add(SubmitAddCusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 170, 60));

        DashboardTab.addTab("tab1", AddCusPanel);

        AvailParkingPanel.setBackground(new java.awt.Color(255, 255, 255));
        AvailParkingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardLine2.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine2.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLine2Layout = new javax.swing.GroupLayout(DashboardLine2);
        DashboardLine2.setLayout(DashboardLine2Layout);
        DashboardLine2Layout.setHorizontalGroup(
            DashboardLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        DashboardLine2Layout.setVerticalGroup(
            DashboardLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        AvailParkingPanel.add(DashboardLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 880, -1));

        DashboardLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel2.setForeground(new java.awt.Color(153, 153, 153));
        DashboardLabel2.setText("Available Parking");
        AvailParkingPanel.add(DashboardLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 735, 82));

        DashboardTab.addTab("tab2", AvailParkingPanel);

        jPanel1.add(DashboardTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, -38, 910, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 733));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDashboardActionPerformed
        DashboardTab.setSelectedIndex(0);
    }//GEN-LAST:event_BtnDashboardActionPerformed

    private void BtnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCustomerActionPerformed
        DashboardTab.setSelectedIndex(2);
    }//GEN-LAST:event_BtnAddCustomerActionPerformed

    private void BtnAvailableParkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvailableParkingActionPerformed
        DashboardTab.setSelectedIndex(1);
    }//GEN-LAST:event_BtnAvailableParkingActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BtnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashboardMouseClicked
    }//GEN-LAST:event_BtnDashboardMouseClicked

    private void BtnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashboardMouseEntered
        BtnDashboard.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnDashboardMouseEntered

    private void BtnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashboardMouseExited
        BtnDashboard.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnDashboardMouseExited

    private void BtnAvailableParkingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAvailableParkingMouseEntered
        BtnAvailableParking.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnAvailableParkingMouseEntered

    private void BtnAvailableParkingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAvailableParkingMouseExited
        BtnAvailableParking.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnAvailableParkingMouseExited

    private void BtnAddCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddCustomerMouseEntered
        BtnAddCustomer.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnAddCustomerMouseEntered

    private void BtnAddCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddCustomerMouseExited
        BtnAddCustomer.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnAddCustomerMouseExited

    private void SubmitAddCusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitAddCusBtnActionPerformed
        first_name = fname.getText();
        last_name = lname.getText();
        mobnum = mnum.getText();
        platenum = pnum.getText();
        vehicle_type = vtype.getSelectedItem().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        date = dateFormat.format(currentDate);
        implement.setDate(date);
        implement.setFname(first_name);
        implement.setLname(last_name);
        implement.setMnum(mobnum);
        implement.setPnum(platenum);
        implement.setVtype(vehicle_type);
        if(r1.isSelected()){
            implement.setIsPwd_Sen(true);
        }
        else if(r2.isSelected()){
            implement.setIsPwd_Sen(false);
        }
        if(p1.isSelected()){
            implement.setHavePwd_Sen(true);
        }
        else if(p2.isSelected()){
            implement.setHavePwd_Sen(false);
        }
        Pwd_Sen = implement.isIsPwd_Sen();
        hPwd_Sen = implement.isHavePwd_Sen();
        implement.saveData();
        JOptionPane.showMessageDialog(this, "Registered Successfully!");
        addTable(first_name, 
                last_name, 
                mobnum, 
                platenum, 
                vehicle_type, 
                Pwd_Sen, 
                hPwd_Sen, 
                date);
        clear();
    }//GEN-LAST:event_SubmitAddCusBtnActionPerformed

    private void mnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnumKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || mnum.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_mnumKeyTyped

    private void pnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnumKeyTyped

    }//GEN-LAST:event_pnumKeyTyped

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
        frame.dispose();    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMin1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMin1MouseClicked

    private void btnMin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMin1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMin1MouseEntered

    private void btnMin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMin1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMin1MouseExited

    private void btnMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMin1ActionPerformed

    private void btnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1MouseClicked

    private void btnExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1MouseEntered

    private void btnExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1MouseExited

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void sortVtypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortVtypeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortVtypeBtnActionPerformed

    private void sortPnumberBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPnumberBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortPnumberBtn1ActionPerformed

    private void sortVtypeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortVtypeBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortVtypeBtn1ActionPerformed

    private void sortFnameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortFnameBtnActionPerformed
        
        implement.readData();
        implement.InsertSort(implement.getData());
        File file = new File("insertion.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dashTabled.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length ; i++){
                String[] line = lines[i].toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sortFnameBtnActionPerformed

    private void sortLnameBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortLnameBtn1ActionPerformed
        implement.readData();
        implement.SelectSort(implement.getData());
        File file = new File("selection.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dashTabled.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length ; i++){
                String[] line = lines[i].toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sortLnameBtn1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel AddCusPanel;
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
    private keeptoo.KGradientPanel DashboardLine3;
    private javax.swing.JLabel DashboardLogo;
    private javax.swing.JTabbedPane DashboardTab;
    private javax.swing.JPanel Dashboardpanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton SubmitAddCusBtn;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnMin1;
    private static javax.swing.JTable dashTabled;
    private static javax.swing.JTextField fname;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lastnameLabel;
    private static javax.swing.JTextField lname;
    private static javax.swing.JTextField mnum;
    private javax.swing.JLabel mobileNumberLabel;
    private javax.swing.JLabel nameLabel;
    private static javax.swing.JRadioButton p1;
    private static javax.swing.JRadioButton p2;
    private javax.swing.JLabel plateNumberLabel;
    private static javax.swing.JTextField pnum;
    private javax.swing.JLabel pwdFamLabel;
    private javax.swing.JLabel pwdLabel;
    private static javax.swing.JRadioButton r1;
    private static javax.swing.JRadioButton r2;
    private javax.swing.ButtonGroup rb_one;
    private javax.swing.ButtonGroup rb_two;
    private javax.swing.JButton sortFnameBtn;
    private javax.swing.JButton sortLnameBtn1;
    private javax.swing.JButton sortPnumberBtn1;
    private javax.swing.JButton sortVtypeBtn;
    private javax.swing.JButton sortVtypeBtn1;
    private javax.swing.JPanel titleBar;
    private javax.swing.JPanel titleBar1;
    private javax.swing.JLabel vehicleLabel;
    private static javax.swing.JComboBox<String> vtype;
    // End of variables declaration//GEN-END:variables
}
