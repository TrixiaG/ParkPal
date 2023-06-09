
package parkpal;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
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
    int xMouse;
    int yMouse;
    
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
        countingCus();
        firstFile();
        secondFile();
        thirdFile();
        forthFile();
        fifthFile();
        DashboardTab.setSelectedIndex(0);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS));
        JTableHeader header = dashTabled.getTableHeader();
        header.setFont(new Font("Poppins Medium", Font.BOLD, 12)); // set font for the header
        header.setBackground(new java.awt.Color(94, 114, 234)); // set background color for the header
        header.setForeground(Color.white);
        for (int i = 0; i < dashTabled.getColumnCount(); i++) {
            TableColumn column = dashTabled.getColumnModel().getColumn(i);
        }
        JTableHeader header1 = firstTable.getTableHeader();
        header1.setFont(new Font("Poppins Medium", Font.BOLD, 12)); // set font for the header
        header1.setBackground(new java.awt.Color(94, 114, 234)); // set background color for the header
        header1.setForeground(Color.white);
        for (int i = 0; i < firstTable.getColumnCount(); i++) {
            TableColumn column = firstTable.getColumnModel().getColumn(i);
        }
        JTableHeader header2 = secondTable.getTableHeader();
        header2.setFont(new Font("Poppins Medium", Font.BOLD, 12)); // set font for the header
        header2.setBackground(new java.awt.Color(94, 114, 234)); // set background color for the header
        header2.setForeground(Color.white);
        for (int i = 0; i < secondTable.getColumnCount(); i++) {
            TableColumn column = secondTable.getColumnModel().getColumn(i);
        }
        JTableHeader header3 = thirdTable.getTableHeader();
        header3.setFont(new Font("Poppins Medium", Font.BOLD, 12)); // set font for the header
        header3.setBackground(new java.awt.Color(94, 114, 234)); // set background color for the header
        header3.setForeground(Color.white);
        for (int i = 0; i < thirdTable.getColumnCount(); i++) {
            TableColumn column = thirdTable.getColumnModel().getColumn(i);
        }
        JTableHeader header4 = forthTable.getTableHeader();
        header4.setFont(new Font("Poppins Medium", Font.BOLD, 12)); // set font for the header
        header4.setBackground(new java.awt.Color(94, 114, 234)); // set background color for the header
        header4.setForeground(Color.white);
        for (int i = 0; i < forthTable.getColumnCount(); i++) {
            TableColumn column = forthTable.getColumnModel().getColumn(i);
        }
        JTableHeader header5 = fifthTable.getTableHeader();
        header5.setFont(new Font("Poppins Medium", Font.BOLD, 12)); // set font for the header
        header5.setBackground(new java.awt.Color(94, 114, 234)); // set background color for the header
        header5.setForeground(Color.white);
        for (int i = 0; i < fifthTable.getColumnCount(); i++) {
            TableColumn column = fifthTable.getColumnModel().getColumn(i);
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
    public void countingCus(){
        implement.readData();
        implement.getCustomers(implement.getData());
        int cus = implement.getNoCus();
        String noCus = Integer.toString(cus);
        noCustomer.setText(noCus);
        implement.setNoCus(0);
        
        implement.getPwd(implement.getData());
        int pwd = implement.getNoPwd();
        String noPwd = Integer.toString(pwd);
        noPwd_Sen.setText(noPwd);
        implement.setNoPwd(0);
        
        implement.getAvail(implement.getData());
        int avail = 150 - cus;
        String noAvail = Integer.toString(avail);
        Remain.setText(noAvail);
        implement.setNoAvail(0);
        
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
    public void addFirstTable(String platenum){
        DefaultTableModel t;
        
        t = (DefaultTableModel) firstTable.getModel();
            t.addRow(new Object[]{platenum});   
    }
    public void addSecondTable(String platenum){
        DefaultTableModel t;
        int row = 0;
        t = (DefaultTableModel) secondTable.getModel();
            t.addRow(new Object[]{platenum});   
    }
    public void addThirdTable(String platenum){
        DefaultTableModel t;
        int row = 0;
        t = (DefaultTableModel) thirdTable.getModel();
            t.addRow(new Object[]{platenum});   
    }
    public void addForthTable(String platenum){
        DefaultTableModel t;
        int row = 0;
        t = (DefaultTableModel) forthTable.getModel();
            t.addRow(new Object[]{platenum});   
    }
    public void addFifthTable(String platenum){
        DefaultTableModel t;
        int row = 0;
        t = (DefaultTableModel) fifthTable.getModel();
            t.addRow(new Object[]{platenum});   
    }
    public void firstFile(){
        File file = new File("gate1.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) firstTable.getModel();
            
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] line = lines[i].toString().trim().split("\n");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void secondFile(){
        File file = new File("gate2.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) secondTable.getModel();
            
            Object[] lines = br.lines().toArray();
            if(lines.length <= 30){
                for(int i = 0; i < lines.length ; i++){
                    String[] line = lines[i].toString().trim().split("\n");
                    model.addRow(line);
                }
            }else if(lines.length > 30 && lines.length <= 60){
                for(int i = 0; i < 30 ; i++){
                    String[] line = lines[i].toString().trim().split("\n");
                    model.addRow(line);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void thirdFile(){
        File file = new File("gate2.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) thirdTable.getModel();
            
            Object[] lines = br.lines().toArray();
            
            if(lines.length <= 60){
                for(int i = 29; i < lines.length ; i++){
                    String[] line = lines[i].toString().trim().split("\n");
                    model.addRow(line);
                }
            }else if(lines.length > 60 && lines.length <= 90){
                for(int i = 29; i < 60 ; i++){
                    String[] line = lines[i].toString().trim().split("\n");
                    model.addRow(line);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void forthFile(){
        File file = new File("gate2.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) forthTable.getModel();
            
            Object[] lines = br.lines().toArray();
            
            if(lines.length <= 90){
                for(int i = 59; i < lines.length ; i++){
                    String[] line = lines[i].toString().trim().split("\n");
                    model.addRow(line);
                }
            }else if(lines.length > 90 && lines.length <= 120){
                for(int i = 59; i < 90 ; i++){
                    String[] line = lines[i].toString().trim().split("\n");
                    model.addRow(line);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fifthFile(){
        File file = new File("gate2.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) fifthTable.getModel();
            
            Object[] lines = br.lines().toArray();
            
            if(lines.length <= 120){
                for(int i = 89; i < lines.length ; i++){
                    String[] line = lines[i].toString().trim().split("\n");
                    model.addRow(line);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        File file = new File("data.txt");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        titleBar = new javax.swing.JPanel();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        titleBar1 = new javax.swing.JPanel();
        btnMin1 = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        DashboardLogo = new javax.swing.JLabel();
        BtnDashboard = new javax.swing.JButton();
        BtnParkingView = new javax.swing.JButton();
        BtnAddCustomer = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        BtnAvailable = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DashboardTab = new javax.swing.JTabbedPane();
        Dashboardpanel = new javax.swing.JPanel();
        DashboardLabel = new javax.swing.JLabel();
        DashboardLine = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashTabled = new javax.swing.JTable();
        sortVtypeBtn = new javax.swing.JButton();
        DashboardLine3 = new keeptoo.KGradientPanel();
        searchBtn = new javax.swing.JButton();
        sortFnameBtn = new javax.swing.JButton();
        sortLnameBtn1 = new javax.swing.JButton();
        sortPnumberBtn1 = new javax.swing.JButton();
        sortVtypeBtn1 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        AvailParkingPanel = new javax.swing.JPanel();
        DashboardLine2 = new keeptoo.KGradientPanel();
        DashboardLabel2 = new javax.swing.JLabel();
        TotalRec = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        Remain = new javax.swing.JLabel();
        availLogo = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        noPwd_Sen = new javax.swing.JLabel();
        pwdLogo = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        noCustomer = new javax.swing.JLabel();
        cusLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        ParkingView = new javax.swing.JPanel();
        fifthPark = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        fifthTable = new javax.swing.JTable();
        thirdPark = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        thirdTable = new javax.swing.JTable();
        forthPark = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        forthTable = new javax.swing.JTable();
        firstPark = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        firstTable = new javax.swing.JTable();
        secondPark = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        secondTable = new javax.swing.JTable();

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

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 730));
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
        btnMin.setFocusPainted(false);
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
        btnExit.setFocusPainted(false);
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

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        MainPanel.add(titleBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 20));

        kGradientPanel1.setBackground(new java.awt.Color(255, 145, 144));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 145, 144));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(94, 114, 235));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParkPalLogo/ParkPal-Logo9.png"))); // NOI18N
        DashboardLogo.setToolTipText("");
        DashboardLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardLogoMouseClicked(evt);
            }
        });
        kGradientPanel1.add(DashboardLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 29, -1, -1));

        BtnDashboard.setBackground(new java.awt.Color(98, 103, 235));
        BtnDashboard.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        BtnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        BtnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/dashboard.png"))); // NOI18N
        BtnDashboard.setText("       DASHBOARD");
        BtnDashboard.setBorder(null);
        BtnDashboard.setContentAreaFilled(false);
        BtnDashboard.setFocusPainted(false);
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

        BtnParkingView.setBackground(new java.awt.Color(98, 103, 235));
        BtnParkingView.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        BtnParkingView.setForeground(new java.awt.Color(255, 255, 255));
        BtnParkingView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/viewparking.png"))); // NOI18N
        BtnParkingView.setText("       PARKING OVERVIEW");
        BtnParkingView.setActionCommand("         ADD CUSTOMER");
        BtnParkingView.setBorder(null);
        BtnParkingView.setContentAreaFilled(false);
        BtnParkingView.setFocusPainted(false);
        BtnParkingView.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnParkingView.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnParkingView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnParkingViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnParkingViewMouseExited(evt);
            }
        });
        BtnParkingView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParkingViewActionPerformed(evt);
            }
        });
        kGradientPanel1.add(BtnParkingView, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 440, 255, 46));

        BtnAddCustomer.setBackground(new java.awt.Color(98, 103, 235));
        BtnAddCustomer.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        BtnAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        BtnAddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/addcustomer.png"))); // NOI18N
        BtnAddCustomer.setText("       ADD CUSTOMER");
        BtnAddCustomer.setActionCommand("         ADD CUSTOMER");
        BtnAddCustomer.setBorder(null);
        BtnAddCustomer.setContentAreaFilled(false);
        BtnAddCustomer.setFocusPainted(false);
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
        kGradientPanel1.add(BtnAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 313, 255, 46));

        ExitButton.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("E X I T");
        ExitButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ExitButton.setContentAreaFilled(false);
        ExitButton.setFocusPainted(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 255, 62));

        BtnAvailable.setBackground(new java.awt.Color(98, 103, 235));
        BtnAvailable.setFont(new java.awt.Font("Poppins Medium", 0, 17)); // NOI18N
        BtnAvailable.setForeground(new java.awt.Color(255, 255, 255));
        BtnAvailable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/viewparking.png"))); // NOI18N
        BtnAvailable.setText("       AVAILABLE PARKING");
        BtnAvailable.setActionCommand("         ADD CUSTOMER");
        BtnAvailable.setBorder(null);
        BtnAvailable.setContentAreaFilled(false);
        BtnAvailable.setFocusPainted(false);
        BtnAvailable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnAvailable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnAvailable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAvailableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAvailableMouseExited(evt);
            }
        });
        BtnAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvailableActionPerformed(evt);
            }
        });
        kGradientPanel1.add(BtnAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 377, 255, 46));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageImagePack/BackGround.gif"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, 20, 820, 710));

        MainPanel.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 730));

        DashboardTab.setBackground(new java.awt.Color(255, 255, 255));

        Dashboardpanel.setBackground(new java.awt.Color(255, 255, 255));
        Dashboardpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardLabel.setBackground(new java.awt.Color(255, 255, 255));
        DashboardLabel.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel.setForeground(new java.awt.Color(153, 153, 153));
        DashboardLabel.setText("Dashboard");
        Dashboardpanel.add(DashboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 352, 82));

        DashboardLine.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLineLayout = new javax.swing.GroupLayout(DashboardLine);
        DashboardLine.setLayout(DashboardLineLayout);
        DashboardLineLayout.setHorizontalGroup(
            DashboardLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        DashboardLineLayout.setVerticalGroup(
            DashboardLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Dashboardpanel.add(DashboardLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 880, -1));

        dashTabled.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
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
        dashTabled.setGridColor(new java.awt.Color(255, 255, 255));
        dashTabled.setOpaque(false);
        dashTabled.setRowHeight(50);
        dashTabled.setSelectionBackground(new java.awt.Color(232, 207, 250));
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

        Dashboardpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 840, 440));

        sortVtypeBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortVtypeBtn.setForeground(new java.awt.Color(233, 123, 122));
        sortVtypeBtn.setText("SORT BY REG. DATE");
        sortVtypeBtn.setToolTipText("");
        sortVtypeBtn.setActionCommand("SORT BYFIRST NAME");
        sortVtypeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(233, 123, 122), 1, true));
        sortVtypeBtn.setContentAreaFilled(false);
        sortVtypeBtn.setFocusPainted(false);
        sortVtypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortVtypeBtnActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortVtypeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 225, 160, 30));

        DashboardLine3.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine3.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLine3Layout = new javax.swing.GroupLayout(DashboardLine3);
        DashboardLine3.setLayout(DashboardLine3Layout);
        DashboardLine3Layout.setHorizontalGroup(
            DashboardLine3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        DashboardLine3Layout.setVerticalGroup(
            DashboardLine3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        Dashboardpanel.add(DashboardLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 870, -1));

        searchBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(96, 114, 233));
        searchBtn.setText("Search");
        searchBtn.setToolTipText("");
        searchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(96, 114, 233), 1, true));
        searchBtn.setContentAreaFilled(false);
        searchBtn.setFocusPainted(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        Dashboardpanel.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 160, 30));

        sortFnameBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortFnameBtn.setForeground(new java.awt.Color(96, 114, 233));
        sortFnameBtn.setText("SORT BY FIRST NAME");
        sortFnameBtn.setToolTipText("");
        sortFnameBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(96, 114, 233), 1, true));
        sortFnameBtn.setContentAreaFilled(false);
        sortFnameBtn.setFocusPainted(false);
        sortFnameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortFnameBtnActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortFnameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 225, 160, 30));

        sortLnameBtn1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortLnameBtn1.setForeground(new java.awt.Color(197, 133, 176));
        sortLnameBtn1.setText("SORT BY LAST NAME");
        sortLnameBtn1.setToolTipText("");
        sortLnameBtn1.setActionCommand("SORT BYFIRST NAME");
        sortLnameBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 133, 176), 1, true));
        sortLnameBtn1.setContentAreaFilled(false);
        sortLnameBtn1.setFocusPainted(false);
        sortLnameBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortLnameBtn1ActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortLnameBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 225, 160, 30));

        sortPnumberBtn1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortPnumberBtn1.setForeground(new java.awt.Color(235, 141, 155));
        sortPnumberBtn1.setText("SORT BY PLATE NO.");
        sortPnumberBtn1.setToolTipText("");
        sortPnumberBtn1.setActionCommand("SORT BYFIRST NAME");
        sortPnumberBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 141, 155), 1, true));
        sortPnumberBtn1.setContentAreaFilled(false);
        sortPnumberBtn1.setFocusPainted(false);
        sortPnumberBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPnumberBtn1ActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortPnumberBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 225, 160, 30));

        sortVtypeBtn1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        sortVtypeBtn1.setForeground(new java.awt.Color(255, 145, 144));
        sortVtypeBtn1.setText("SORT BY VEHICLE TYPE");
        sortVtypeBtn1.setToolTipText("");
        sortVtypeBtn1.setActionCommand("SORT BYFIRST NAME");
        sortVtypeBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 145, 144), 1, true));
        sortVtypeBtn1.setContentAreaFilled(false);
        sortVtypeBtn1.setFocusPainted(false);
        sortVtypeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortVtypeBtn1ActionPerformed(evt);
            }
        });
        Dashboardpanel.add(sortVtypeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 225, 160, 30));

        searchField.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        Dashboardpanel.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 660, 30));

        DashboardTab.addTab("tab3", Dashboardpanel);

        AvailParkingPanel.setBackground(new java.awt.Color(255, 255, 255));
        AvailParkingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardLine2.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine2.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLine2Layout = new javax.swing.GroupLayout(DashboardLine2);
        DashboardLine2.setLayout(DashboardLine2Layout);
        DashboardLine2Layout.setHorizontalGroup(
            DashboardLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        DashboardLine2Layout.setVerticalGroup(
            DashboardLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        AvailParkingPanel.add(DashboardLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 870, -1));

        DashboardLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel2.setForeground(new java.awt.Color(153, 153, 153));
        DashboardLabel2.setText("Available Parking");
        AvailParkingPanel.add(DashboardLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 735, 82));

        TotalRec.setBackground(new java.awt.Color(255, 255, 255));
        TotalRec.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 145, 144));
        kGradientPanel2.setkStartColor(new java.awt.Color(239, 142, 152));

        Remain.setFont(new java.awt.Font("Poppins Medium", 0, 100)); // NOI18N
        Remain.setForeground(new java.awt.Color(255, 255, 255));
        Remain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Remain.setText("0");

        availLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AvailParkingLogo/avail2.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Remain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(availLogo)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(availLogo)
                .addGap(18, 18, 18)
                .addComponent(Remain, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        TotalRec.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 250, 330));

        kGradientPanel4.setkEndColor(new java.awt.Color(239, 142, 152));
        kGradientPanel4.setkStartColor(new java.awt.Color(195, 133, 177));

        noPwd_Sen.setFont(new java.awt.Font("Poppins Medium", 0, 100)); // NOI18N
        noPwd_Sen.setForeground(new java.awt.Color(255, 255, 255));
        noPwd_Sen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noPwd_Sen.setText("0");

        pwdLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AvailParkingLogo/Pwd.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(noPwd_Sen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pwdLogo)
                .addGap(96, 96, 96))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(pwdLogo)
                .addGap(18, 18, 18)
                .addComponent(noPwd_Sen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        TotalRec.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 330));

        kGradientPanel5.setkEndColor(new java.awt.Color(195, 133, 177));
        kGradientPanel5.setkGradientFocus(400);
        kGradientPanel5.setkStartColor(new java.awt.Color(94, 114, 234));

        noCustomer.setFont(new java.awt.Font("Poppins Medium", 0, 100)); // NOI18N
        noCustomer.setForeground(new java.awt.Color(255, 255, 255));
        noCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noCustomer.setText("0");
        noCustomer.setToolTipText("");

        cusLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AvailParkingLogo/Cus.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(noCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(cusLogo)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(cusLogo)
                .addGap(26, 26, 26)
                .addComponent(noCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        TotalRec.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 330));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 145, 144));
        jLabel1.setText("Available Slots");
        TotalRec.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 220, 40));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(145, 124, 206));
        jLabel2.setText("Customers");
        TotalRec.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 170, 40));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(202, 135, 174));
        jLabel3.setText("PWD/S.C.");
        TotalRec.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 140, 40));

        AvailParkingPanel.add(TotalRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 870, 540));

        DashboardTab.addTab("tab2", AvailParkingPanel);

        AddCusPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddCusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardLine1.setkEndColor(new java.awt.Color(255, 145, 144));
        DashboardLine1.setkStartColor(new java.awt.Color(94, 114, 235));

        javax.swing.GroupLayout DashboardLine1Layout = new javax.swing.GroupLayout(DashboardLine1);
        DashboardLine1.setLayout(DashboardLine1Layout);
        DashboardLine1Layout.setHorizontalGroup(
            DashboardLine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        DashboardLine1Layout.setVerticalGroup(
            DashboardLine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        AddCusPanel.add(DashboardLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 870, -1));

        DashboardLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 60)); // NOI18N
        DashboardLabel1.setForeground(new java.awt.Color(153, 153, 153));
        DashboardLabel1.setText("Add Customer");
        AddCusPanel.add(DashboardLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 492, 82));

        nameLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        nameLabel.setText("Given Name:");
        AddCusPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 36));

        fname.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        AddCusPanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 417, -1));

        lastnameLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        lastnameLabel.setText("Last Name:");
        AddCusPanel.add(lastnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 36));

        lname.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        AddCusPanel.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 417, -1));

        mobileNumberLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        mobileNumberLabel.setText("Mobile Number:");
        AddCusPanel.add(mobileNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 36));

        mnum.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        mnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mnumKeyTyped(evt);
            }
        });
        AddCusPanel.add(mnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 417, -1));

        plateNumberLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        plateNumberLabel.setText("Plate Number:");
        AddCusPanel.add(plateNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 36));

        pnum.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        pnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnumKeyTyped(evt);
            }
        });
        AddCusPanel.add(pnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 417, -1));

        pwdLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        pwdLabel.setText("PWD Member or Senior Citizen:");
        AddCusPanel.add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 36));

        vtype.setBackground(new java.awt.Color(98, 103, 235));
        vtype.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        vtype.setForeground(new java.awt.Color(255, 255, 255));
        vtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Motorcycle", "4 Wheeler Car" }));
        vtype.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddCusPanel.add(vtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 417, -1));

        vehicleLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        vehicleLabel.setText("Vehicle Type:");
        AddCusPanel.add(vehicleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 36));

        r1.setBackground(new java.awt.Color(255, 255, 255));
        rb_one.add(r1);
        r1.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        r1.setText("Yes");
        r1.setBorder(null);
        r1.setBorderPainted(true);
        r1.setFocusPainted(false);
        AddCusPanel.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, -1, -1));

        r2.setBackground(new java.awt.Color(255, 255, 255));
        rb_one.add(r2);
        r2.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        r2.setText("No");
        r2.setBorder(null);
        r2.setFocusPainted(false);
        AddCusPanel.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        rb_two.add(p2);
        p2.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        p2.setText("No");
        p2.setBorder(null);
        p2.setFocusPainted(false);
        AddCusPanel.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, -1, -1));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        rb_two.add(p1);
        p1.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        p1.setText("Yes");
        p1.setBorder(null);
        p1.setFocusPainted(false);
        AddCusPanel.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        pwdFamLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        pwdFamLabel.setText("Any PWDs or senior citizens in your family?");
        AddCusPanel.add(pwdFamLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 36));

        SubmitAddCusBtn.setBackground(new java.awt.Color(255, 153, 0));
        SubmitAddCusBtn.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        SubmitAddCusBtn.setForeground(new java.awt.Color(255, 145, 144));
        SubmitAddCusBtn.setText("SUBMIT");
        SubmitAddCusBtn.setBorder(null);
        SubmitAddCusBtn.setContentAreaFilled(false);
        SubmitAddCusBtn.setFocusPainted(false);
        SubmitAddCusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmitAddCusBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmitAddCusBtnMouseExited(evt);
            }
        });
        SubmitAddCusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitAddCusBtnActionPerformed(evt);
            }
        });
        AddCusPanel.add(SubmitAddCusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 170, 60));

        DashboardTab.addTab("tab1", AddCusPanel);

        ParkingView.setBackground(new java.awt.Color(255, 255, 255));
        ParkingView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fifthTable.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        fifthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gate 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fifthTable.setToolTipText("");
        fifthTable.setFocusable(false);
        fifthTable.setOpaque(false);
        fifthTable.setRowHeight(21);
        fifthTable.setSelectionBackground(new java.awt.Color(232, 207, 250));
        jScrollPane7.setViewportView(fifthTable);
        if (fifthTable.getColumnModel().getColumnCount() > 0) {
            fifthTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout fifthParkLayout = new javax.swing.GroupLayout(fifthPark);
        fifthPark.setLayout(fifthParkLayout);
        fifthParkLayout.setHorizontalGroup(
            fifthParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fifthParkLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fifthParkLayout.setVerticalGroup(
            fifthParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fifthParkLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ParkingView.add(fifthPark, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 158, 670));

        thirdTable.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        thirdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gate 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        thirdTable.setToolTipText("");
        thirdTable.setFocusable(false);
        thirdTable.setOpaque(false);
        thirdTable.setRowHeight(21);
        thirdTable.setSelectionBackground(new java.awt.Color(232, 207, 250));
        jScrollPane5.setViewportView(thirdTable);
        if (thirdTable.getColumnModel().getColumnCount() > 0) {
            thirdTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout thirdParkLayout = new javax.swing.GroupLayout(thirdPark);
        thirdPark.setLayout(thirdParkLayout);
        thirdParkLayout.setHorizontalGroup(
            thirdParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdParkLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        thirdParkLayout.setVerticalGroup(
            thirdParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdParkLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ParkingView.add(thirdPark, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 158, 670));

        forthTable.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        forthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gate 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        forthTable.setToolTipText("");
        forthTable.setFocusable(false);
        forthTable.setOpaque(false);
        forthTable.setRowHeight(21);
        forthTable.setSelectionBackground(new java.awt.Color(232, 207, 250));
        jScrollPane6.setViewportView(forthTable);
        if (forthTable.getColumnModel().getColumnCount() > 0) {
            forthTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout forthParkLayout = new javax.swing.GroupLayout(forthPark);
        forthPark.setLayout(forthParkLayout);
        forthParkLayout.setHorizontalGroup(
            forthParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forthParkLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        forthParkLayout.setVerticalGroup(
            forthParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forthParkLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ParkingView.add(forthPark, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 158, 670));

        firstPark.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstTable.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        firstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gate 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        firstTable.setToolTipText("");
        firstTable.setFocusable(false);
        firstTable.setOpaque(false);
        firstTable.setRowHeight(21);
        firstTable.setSelectionBackground(new java.awt.Color(232, 207, 250));
        jScrollPane3.setViewportView(firstTable);
        if (firstTable.getColumnModel().getColumnCount() > 0) {
            firstTable.getColumnModel().getColumn(0).setResizable(false);
        }

        firstPark.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 670));

        ParkingView.add(firstPark, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 158, 670));

        secondTable.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        secondTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gate 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        secondTable.setToolTipText("");
        secondTable.setFocusable(false);
        secondTable.setOpaque(false);
        secondTable.setRowHeight(21);
        secondTable.setSelectionBackground(new java.awt.Color(232, 207, 250));
        jScrollPane4.setViewportView(secondTable);
        if (secondTable.getColumnModel().getColumnCount() > 0) {
            secondTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout secondParkLayout = new javax.swing.GroupLayout(secondPark);
        secondPark.setLayout(secondParkLayout);
        secondParkLayout.setHorizontalGroup(
            secondParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondParkLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        secondParkLayout.setVerticalGroup(
            secondParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondParkLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ParkingView.add(secondPark, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 50, 158, 670));

        DashboardTab.addTab("tab4", ParkingView);

        MainPanel.add(DashboardTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, -38, 920, 770));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 733));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDashboardActionPerformed
        DashboardTab.setSelectedIndex(0);
    }//GEN-LAST:event_BtnDashboardActionPerformed

    private void BtnParkingViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParkingViewActionPerformed
        DashboardTab.setSelectedIndex(3);
        countingCus();
    }//GEN-LAST:event_BtnParkingViewActionPerformed

    private void BtnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCustomerActionPerformed
        DashboardTab.setSelectedIndex(2);
    }//GEN-LAST:event_BtnAddCustomerActionPerformed

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

    private void BtnAddCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddCustomerMouseEntered
        BtnAddCustomer.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnAddCustomerMouseEntered

    private void BtnAddCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddCustomerMouseExited
        BtnAddCustomer.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnAddCustomerMouseExited

    private void BtnParkingViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnParkingViewMouseEntered
        BtnParkingView.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnParkingViewMouseEntered

    private void BtnParkingViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnParkingViewMouseExited
        BtnParkingView.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnParkingViewMouseExited

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
        
              if (fname.getText().isBlank()){
            JOptionPane.showMessageDialog(null,"Please enter  first name!") ;
        } else if (lname.getText().isBlank()){
            JOptionPane.showMessageDialog(null,"Please enter  last name!") ;
        } else if (mnum.getText().isBlank()){
            JOptionPane.showMessageDialog(null,"Please enter  mobile number!") ;
        } else if (pnum.getText().isBlank()){
            JOptionPane.showMessageDialog(null,"Please enter  plate number!") ;
        } else if (!r1.isSelected() && !r2.isSelected()){
            JOptionPane.showMessageDialog(null,"Please select if you're a PWD/S.C.!") ;
        } else if (!p1.isSelected() && !p2.isSelected()){
            JOptionPane.showMessageDialog(null,"Please select if you have a PWD/S.C. in your family!") ;

        } else {
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
        if(Pwd_Sen == true || hPwd_Sen == true){
            addFirstTable(platenum);    
        }else{
            if(secondTable.getRowCount() <= 29){
                addSecondTable(platenum);
            }else if(secondTable.getRowCount() == 30){
                addThirdTable(platenum);
            }else if(thirdTable.getRowCount() == 30){
                addForthTable(platenum);
            }else if(forthTable.getRowCount() == 30){
                addFifthTable(platenum);
            }
        }
        clear();
        
        implement.Queuing();
        }
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
        implement.StackingClose();
        System.exit(0);
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
        implement.readData();
        implement.selectSortByDate(implement.getData());
        File file = new File("selection_by_date.txt");
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
    }//GEN-LAST:event_sortVtypeBtnActionPerformed

    private void sortPnumberBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPnumberBtn1ActionPerformed
        implement.readData();
        implement.bubbleSort(implement.getData());
        File file = new File("bubble.txt");
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
    }//GEN-LAST:event_sortPnumberBtn1ActionPerformed

    private void sortVtypeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortVtypeBtn1ActionPerformed
        implement.readData();
        implement.InsertSort2(implement.getData());
        File file = new File("insertion2.txt");
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

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void SubmitAddCusBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitAddCusBtnMouseEntered
        SubmitAddCusBtn.setForeground(Color.BLACK);
    }//GEN-LAST:event_SubmitAddCusBtnMouseEntered

    private void SubmitAddCusBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitAddCusBtnMouseExited
        SubmitAddCusBtn.setForeground(new java.awt.Color(255,145,144));
    }//GEN-LAST:event_SubmitAddCusBtnMouseExited

    private void BtnAvailableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAvailableMouseEntered
        BtnAvailable.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnAvailableMouseEntered

    private void BtnAvailableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAvailableMouseExited
        BtnAvailable.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnAvailableMouseExited

    private void BtnAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvailableActionPerformed
        DashboardTab.setSelectedIndex(1);
    }//GEN-LAST:event_BtnAvailableActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        System.out.println("CLICKED");
        String query = searchField.getText().trim();
        System.out.println("QUERY: " + query);
        
        implement.setQuery(query);
        List<String> res = implement.search();
        String array = res.get(0);
        
        String[] info = array.split(", ");
        
        DefaultTableModel t;
        
        t = (DefaultTableModel) dashTabled.getModel();
        t.setRowCount(0);
            t.addRow(new Object[]{
                info[0], 
                info[1], 
                info[2], 
                info[3], 
                info[4], 
                info[5], 
                info[6], 
                info[7]
            });
    }//GEN-LAST:event_searchBtnActionPerformed

    private void DashboardLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardLogoMouseClicked
        load();
    }//GEN-LAST:event_DashboardLogoMouseClicked
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
    private javax.swing.JButton BtnAvailable;
    private javax.swing.JButton BtnDashboard;
    private javax.swing.JButton BtnParkingView;
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
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel ParkingView;
    private javax.swing.JLabel Remain;
    private javax.swing.JButton SubmitAddCusBtn;
    private javax.swing.JPanel TotalRec;
    private javax.swing.JLabel availLogo;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnMin1;
    private javax.swing.JLabel cusLogo;
    private static javax.swing.JTable dashTabled;
    private javax.swing.JPanel fifthPark;
    private javax.swing.JTable fifthTable;
    private javax.swing.JPanel firstPark;
    private javax.swing.JTable firstTable;
    private static javax.swing.JTextField fname;
    private javax.swing.JPanel forthPark;
    private javax.swing.JTable forthTable;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JLabel lastnameLabel;
    private static javax.swing.JTextField lname;
    private static javax.swing.JTextField mnum;
    private javax.swing.JLabel mobileNumberLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel noCustomer;
    private javax.swing.JLabel noPwd_Sen;
    private static javax.swing.JRadioButton p1;
    private static javax.swing.JRadioButton p2;
    private javax.swing.JLabel plateNumberLabel;
    private static javax.swing.JTextField pnum;
    private javax.swing.JLabel pwdFamLabel;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JLabel pwdLogo;
    private static javax.swing.JRadioButton r1;
    private static javax.swing.JRadioButton r2;
    private javax.swing.ButtonGroup rb_one;
    private javax.swing.ButtonGroup rb_two;
    private javax.swing.JButton searchBtn;
    private static javax.swing.JTextField searchField;
    private javax.swing.JPanel secondPark;
    private javax.swing.JTable secondTable;
    private javax.swing.JButton sortFnameBtn;
    private javax.swing.JButton sortLnameBtn1;
    private javax.swing.JButton sortPnumberBtn1;
    private javax.swing.JButton sortVtypeBtn;
    private javax.swing.JButton sortVtypeBtn1;
    private javax.swing.JPanel thirdPark;
    private javax.swing.JTable thirdTable;
    private javax.swing.JPanel titleBar;
    private javax.swing.JPanel titleBar1;
    private javax.swing.JLabel vehicleLabel;
    private static javax.swing.JComboBox<String> vtype;
    // End of variables declaration//GEN-END:variables

}
