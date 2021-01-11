/*
 System By - COMPUTER_LK 
 */
package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dilum
 */


public class MAIN_FRAME extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form MAIN_FRAME
     */
    public MAIN_FRAME() {
        initComponents();
        Thread time = new Thread(this);
        time.start();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        
         Toolkit screenSize = Toolkit.getDefaultToolkit();
         int height = (int) screenSize.getScreenSize().getHeight();
         int width = (int) screenSize.getScreenSize().getWidth();
         this.setSize(width,height);
        
        //Disabling btns
        removeItem.setEnabled(false);
        discLable.setVisible(false);
        discAmount.setVisible(false);
        balanceLable.setVisible(false);
        balanceShow.setVisible(false);

        //this is a normal billing window

        try {

            passAvailability = connect.isLocked();
            this.panelLock = passAvailability;

        } catch (Exception ex) {
            Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    dbConnector connect = new dbConnector();
    static String newPrice = "0.0";// for storing new item price
    static BigDecimal paymentForBill = new BigDecimal("0.0");
    static BigDecimal balanceForBill = new BigDecimal("0.0");
    static boolean dot = false;//for get notified wen working with floating points
    public static String quan = "1"; //guantity of new item
    static BigDecimal payment;
    static BigDecimal discount;
    static boolean panelLock;
    static boolean passAvailability;


 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        shopName = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        barcode = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        total = new javax.swing.JLabel();
        discLable = new javax.swing.JLabel();
        discAmount = new javax.swing.JLabel();
        balanceLable = new javax.swing.JLabel();
        balanceShow = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        removeItem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        borrowersTab = new javax.swing.JButton();
        stockTab = new javax.swing.JButton();
        settingTab = new javax.swing.JButton();
        addStockTab = new javax.swing.JButton();
        bell = new javax.swing.JLabel();
        advancedTab = new javax.swing.JButton();
        proceed = new javax.swing.JButton();
        paymentAmount = new javax.swing.JTextField();
        disc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        borrowProceed = new javax.swing.JButton();
        discountingBtn = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        staticTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selltable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TISSA SAW MILL");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        shopName.setBackground(new java.awt.Color(204, 0, 255));
        shopName.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 42)); // NOI18N
        shopName.setForeground(new java.awt.Color(0, 0, 0));
        shopName.setText("THISSA SAW MILL ");

        Date.setBackground(new java.awt.Color(255, 255, 102));
        Date.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Time.setBackground(new java.awt.Color(255, 255, 102));
        Time.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 255, 255));
        Time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("- By  EvonApps ... -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shopName)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 624, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 100));

        barcode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        barcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barcodeKeyTyped(evt);
            }
        });
        jPanel1.add(barcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 139, 504, 53));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        total.setForeground(new java.awt.Color(255, 0, 0));
        total.setText("0.0");
        jPanel5.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 406, -1));

        discLable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        discLable.setForeground(new java.awt.Color(102, 102, 102));
        discLable.setText("Discount");
        jPanel5.add(discLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 212, -1));

        discAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        discAmount.setForeground(new java.awt.Color(102, 102, 102));
        discAmount.setText("0.0");
        jPanel5.add(discAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, 254, 36));

        balanceLable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        balanceLable.setForeground(new java.awt.Color(51, 51, 51));
        balanceLable.setText("Balance");
        jPanel5.add(balanceLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 104, -1));

        balanceShow.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        balanceShow.setForeground(new java.awt.Color(51, 51, 51));
        balanceShow.setText("0.0");
        jPanel5.add(balanceShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 206, 264, 32));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 406, 10));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 406, 10));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("  Total Price   (  Rs /- ) ");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 212, 31));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("  Total Price   (  Rs /- ) ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 212, 31));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 222, -1, -1));

        removeItem.setBackground(new java.awt.Color(0, 102, 102));
        removeItem.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        removeItem.setForeground(new java.awt.Color(255, 255, 255));
        removeItem.setText("REMOVE ITEM");
        removeItem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });
        jPanel1.add(removeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 563, 214, 43));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrowersTab.setBackground(new java.awt.Color(102, 0, 204));
        borrowersTab.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        borrowersTab.setForeground(new java.awt.Color(255, 255, 255));
        borrowersTab.setText("Borrowers");
        borrowersTab.setToolTipText("Borrowers");
        borrowersTab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrowersTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowersTabActionPerformed(evt);
            }
        });

        stockTab.setBackground(new java.awt.Color(0, 255, 0));
        stockTab.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        stockTab.setForeground(new java.awt.Color(255, 255, 255));
        stockTab.setText("Stocks");
        stockTab.setToolTipText("See your Stocks !");
        stockTab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockTabActionPerformed(evt);
            }
        });

        settingTab.setBackground(new java.awt.Color(51, 51, 51));
        settingTab.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        settingTab.setForeground(new java.awt.Color(255, 255, 255));
        settingTab.setText("Settings");
        settingTab.setToolTipText("Settings");
        settingTab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        settingTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingTabActionPerformed(evt);
            }
        });

        addStockTab.setBackground(new java.awt.Color(51, 51, 255));
        addStockTab.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addStockTab.setForeground(new java.awt.Color(255, 255, 255));
        addStockTab.setText("Add Stocks");
        addStockTab.setToolTipText("Add new items to Stocks.");
        addStockTab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addStockTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockTabActionPerformed(evt);
            }
        });

        bell.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 60)); // NOI18N
        bell.setForeground(new java.awt.Color(255, 0, 0));
        bell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_package/images/out.png"))); // NOI18N
        bell.setText(".");
        bell.setToolTipText("Your stocks running out !");

        advancedTab.setBackground(new java.awt.Color(51, 51, 51));
        advancedTab.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        advancedTab.setForeground(new java.awt.Color(255, 255, 255));
        advancedTab.setText("Advanced");
        advancedTab.setToolTipText("Settings");
        advancedTab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        advancedTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(settingTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(borrowersTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addStockTab, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(stockTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(bell)
                                .addGap(35, 35, 35))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(advancedTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(stockTab, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStockTab, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrowersTab, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(advancedTab, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingTab, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(bell, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 100, 170, -1));

        proceed.setBackground(new java.awt.Color(255, 0, 0));
        proceed.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        proceed.setForeground(new java.awt.Color(255, 255, 255));
        proceed.setText("CREATE BILL");
        proceed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        jPanel1.add(proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 640, 289, 50));

        paymentAmount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paymentAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentAmountActionPerformed(evt);
            }
        });
        paymentAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paymentAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paymentAmountKeyTyped(evt);
            }
        });
        jPanel1.add(paymentAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 582, 378, 42));

        disc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discActionPerformed(evt);
            }
        });
        disc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                discKeyTyped(evt);
            }
        });
        jPanel1.add(disc, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 516, 378, 40));

        jLabel4.setText("Discount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 497, 256, -1));

        jLabel5.setText("Payment");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 562, 296, 14));

        cancel.setBackground(new java.awt.Color(51, 51, 51));
        cancel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel ");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 563, 163, 43));

        borrowProceed.setBackground(new java.awt.Color(153, 0, 153));
        borrowProceed.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        borrowProceed.setForeground(new java.awt.Color(255, 255, 255));
        borrowProceed.setText("BORROWING");
        borrowProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowProceedActionPerformed(evt);
            }
        });
        jPanel1.add(borrowProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 640, -1, 50));

        discountingBtn.setBackground(new java.awt.Color(255, 255, 255));
        discountingBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        discountingBtn.setText("ADD");
        discountingBtn.setBorder(null);
        discountingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountingBtnActionPerformed(evt);
            }
        });
        jPanel1.add(discountingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 516, 65, 40));

        paymentBtn.setBackground(new java.awt.Color(255, 255, 255));
        paymentBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        paymentBtn.setText("ADD");
        paymentBtn.setBorder(null);
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });
        jPanel1.add(paymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 582, 65, 42));

        staticTotal.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        jPanel1.add(staticTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 139, 449, 63));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_package/images/search--v1.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 139, -1, 53));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        selltable.setBackground(new java.awt.Color(255, 255, 255));
        selltable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        selltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(selltable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 222, 696, 335));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyTyped
        //CHEKING IF ENTER PRESSED
        char enter = evt.getKeyChar(); //geting youser press key code

        searchProcess(enter);
    }//GEN-LAST:event_barcodeKeyTyped

    private void barcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyPressed

        //CHEKING IF ENTER PRESSED
        char enter = evt.getKeyChar();

        // searchProcess(enter);
    }//GEN-LAST:event_barcodeKeyPressed

    private void stockTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockTabActionPerformed
        try {
            stocks open = new stocks();
            open.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cant Open stocks !");
        }
    }//GEN-LAST:event_stockTabActionPerformed

    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemActionPerformed
        int row = selltable.getSelectedRow();

        if (!selltable.getValueAt(row, 0).equals("")) {
            int removeok = JOptionPane.showConfirmDialog(this, "You sure to Remove this item from the bill ?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);

            if (removeok == 0) {
                DefaultTableModel remove = (DefaultTableModel) selltable.getModel();

                BigDecimal removingAmount = new BigDecimal((String) selltable.getModel().getValueAt(row, 4));

                BigDecimal updateTotal = (new BigDecimal(total.getText().trim()).add(new BigDecimal(discAmount.getText().trim()))).subtract(removingAmount);
                total.setText(updateTotal.toString());
                staticTotal.setText(updateTotal.toString());
                discAmount.setText("0.0");
                remove.removeRow(row);
            }

            removeItem.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Please select an item to Remove !");
            removeItem.setEnabled(false);
        }
    }//GEN-LAST:event_removeItemActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed

    DefaultTableModel items = (DefaultTableModel) selltable.getModel();
    int rowCount = selltable.getRowCount();
    

            //cheking if items avaible in table
            if (rowCount > 0) {

                BigDecimal[] values = new BigDecimal[4];

                values[0] = new BigDecimal(total.getText()); // bill amount
                //total.getText()).trim()).add(new BigDecimal(discAmount.getText().trim()) ->[total bill amount]
                
                //IF USER CLICKED CREATE BILL BUTOON WITHOUT INSERTING DISCOUNT VALUE
                try
                    {
                            values[1] = new BigDecimal(discAmount.getText().trim());// discounted price
                    }
                catch(Exception e)
                    {
                             values[1] = new BigDecimal(String.valueOf(0.0));// discounted price
                        
                    }
                
                //IF USER CLICKED CREATE BILL BUTOON WITHOUT INSERTING PAYMENT VALUE IT WILL AUTOMATICLY ASSING TOTAL VALUE
                 try
                    {
                            values[2] = new BigDecimal(paymentAmount.getText().trim()); // cash amount that customer given
                            paymentForBill = values[2];
                    }
                catch(Exception e)
                    {
                        values[2] = new BigDecimal(total.getText().trim()); // cash amount that customer given
                        paymentForBill = values[2];
                        
                    }
                              
                //IF USER CLICEKD CREATE BILL BUTTON THEN AUTOMATICLY BALANCE WILL BE 0
                try
                    {
                            values[3] = new BigDecimal(balanceShow.getText().trim());// balance amount
                    }
                catch(Exception e)
                    {
                            values[3] = new BigDecimal(String.valueOf(0.0));// balance amount
                        
                    }
                
                

                        try {
                            connect.storeCashDealsDataIntoBase(values);

                            for (int i = 0; i < rowCount; i++) 
                            
                                {
                                        String chek = selltable.getValueAt(i, 0).toString();
                                        if (!chek.equals("")) 
                                            {
                                                String pk, code, name, quantity, priceget;
                                                BigDecimal price, totalGet;

                                                pk = controllers.primaryKeyOfdealsData; //deal number
                                                code = selltable.getValueAt(i, 0).toString();//itemcode
                                                name = selltable.getValueAt(i, 1).toString();//item name
                                                priceget = selltable.getValueAt(i, 2).toString();
                                                quantity = selltable.getValueAt(i, 3).toString();
                                                totalGet = new BigDecimal(selltable.getValueAt(i, 4).toString());
                                                price = new BigDecimal(priceget);

                                                  //storing deal cash item in to database
                                                  connect.storeCashDealItemsIntoDataBase(pk, code, name, price, quantity, totalGet);
                            
                                                //updating stocks by calling stockupdate mthod
                                                stockupdate(code , quantity);

                                        }
                            }

                        } catch (Exception ex) {
                            Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
                        }

                            //income date databse handling
                            try {
                                
                                    //cheking is date avaible()
                                    boolean dateAvailability = connect.passdate(String.valueOf(java.time.LocalDate.now()) , true);

                                    //if date is not exsit in database then create new row for the date either update exsising dat row
                                    if (dateAvailability == true) {
                                        // adding new sellprice amount to prevois cashprice and sell price amount
                                        //new  sell price amounts are holded in controller class sellPrice variables
                                        BigDecimal updated_sellPrice = new BigDecimal(total.getText().trim()).add(controllers.sellPrice);
                                        connect.incomedataUpdater( String.valueOf(updated_sellPrice), "sellIncome", String.valueOf(java.time.LocalDate.now()));
                                    } else {
                                        connect.Strore_incomedata( total.getText(), "sellIncome",  String.valueOf(java.time.LocalDate.now()));
                                    }
                                    
                                    
                                  //calling bill printng method
                                   invoice(rowCount);
                                    
                            } catch (Exception ex) {
                                Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
                            }
                      }
           
                //refresh main class window
                refreshWindow();
            

        
    }//GEN-LAST:event_proceedActionPerformed

    void invoice(int rowCount)
        {
             //printing the bill
                        printer print = new printer();
                        print.bHeight = Double.valueOf(rowCount);
                        PrinterJob pj = PrinterJob.getPrinterJob();
                        pj.setPrintable(new printer() , print.pf(pj));
                                    
                        try {
                            pj.print();
                        } catch (PrinterException ex) {
                            Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
                        }
        }
    
    //stock updator method
    void stockupdate( String code , String quantity)
        {
             try {

                                                    //decreasing stock of out items
                                                    int stock = connect.searchItemStock(code); //cheking for current stock
                                                    if (stock > 0) {

                                                        if (stock > Integer.valueOf(quantity)) {
                                                            stock = stock - Integer.parseInt(quantity); //updatin stock
                                                            connect.updateStockitems("stocks" , "stock", String.valueOf(stock), code);
                                                        } else // if customer buys items more than in stock it automaticly set stocl items to 0.
                                                        {
                                                            connect.updateStockitems("stocks" ,"stock", String.valueOf(0), code);
                                                            JOptionPane.showMessageDialog(null, " Done !");
                                                        }

                                                    }

                                                } catch (Exception e) {
                                                    // JOptionPane.showMessageDialog(null , "Something went wrong(MainFrameE791)!");
                                                    Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, e);
                                                }
        }
    
    
    private void paymentAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentAmountKeyTyped

        String lenth = paymentAmount.getText().trim();
        char charactor = evt.getKeyChar();

        if (lenth.length() == 16) {
            evt.consume();
        }

        // IF DOT HAS TYPED THIS PART WILL BW RUN
        if (dot == false) {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) || charactor == KeyEvent.VK_PERIOD) {
                paymentAmount.setEditable(true);

            } else {

                evt.consume();
            }

        } else // IF DOT DOES NOT HAS TYPED THIS PART WILL RUN
        {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor))) {
                if (lenth.length() == lenth.indexOf(".") + 3) {
                    evt.consume();
                }
            } else {
                evt.consume();
            }
        }

        //CHAKING IF ALREADY " . " IN TEXT BOX
        if (!lenth.contains(".")) {
            dot = false;

        }

        //MAKE dot VARIABLE TRUE IF USER PRESSED " . "
        if (charactor == KeyEvent.VK_PERIOD) {
            dot = true;
        }

        if (charactor == KeyEvent.VK_ENTER) {
            
            if (!lenth.equals(""))
                {
                    paymentAmountProcess(); //calling to payment process
                }

        }
    }//GEN-LAST:event_paymentAmountKeyTyped

    void paymentAmountProcess() {

        BigDecimal totalIs = new BigDecimal(total.getText().trim());
        BigDecimal payment = new BigDecimal(paymentAmount.getText().trim());

        BigDecimal balance = payment.subtract(totalIs);

        balanceShow.setText(balance.toString());

        balanceLable.setVisible(true);
        balanceShow.setVisible(true);

        disc.setEditable(false);
        discountingBtn.setEnabled(false);

    }

    private void discKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discKeyTyped
        String lenth = disc.getText().trim();
        char charactor = evt.getKeyChar();

        if (lenth.length() == 16) {
            evt.consume();
        }

        // IF DOT HAS TYPED THIS PART WILL BW RUN
        if (dot == false) {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) || charactor == KeyEvent.VK_PERIOD) {
                disc.setEditable(true);

            } else {

                evt.consume();
            }

        } else // IF DOT DOES NOT HAS TYPED THIS PART WILL RUN
        {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor))) {
                if (lenth.length() == lenth.indexOf(".") + 3) {
                    evt.consume();
                }
            } else {
                evt.consume();
            }
        }

        //CHAKING IF ALREADY " . " IN TEXT BOX
        if (!lenth.contains(".")) {
            dot = false;

        }

        //MAKE dot VARIABLE TRUE IF USER PRESSED " . "
        if (charactor == KeyEvent.VK_PERIOD) {
            dot = true;
        }

        if (charactor == KeyEvent.VK_ENTER) {
            
             if (!lenth.equals(""))
                {
                    discountProcess(); //calling to discount process
                }
            
        }
    }//GEN-LAST:event_discKeyTyped

    void discountProcess() {
        BigDecimal totalIs = new BigDecimal(total.getText().trim());
        BigDecimal discounted = new BigDecimal(disc.getText().trim());

        BigDecimal currentDiscount = new BigDecimal(discAmount.getText().trim());

        BigDecimal balance = totalIs.subtract(discounted);
        total.setText(balance.toString());
        disc.setText("");

        BigDecimal updateDiscAmount = currentDiscount.add(discounted);
        discAmount.setText(updateDiscAmount.toString());

        discLable.setVisible(true);
        discAmount.setVisible(true);
    }

    private void paymentAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentAmountKeyReleased
     
//           String lenth = paymentAmount.getText().trim();
//        BigDecimal totalAmount, pAmount;
//
//        // TOTAL AMOUNT AS A BIG DECIMAL WITH NULL EXCEPTION HANDLING
//        try {
//            totalAmount = new BigDecimal(String.valueOf(total.getText().trim()));
//        } catch (Exception e) {
//            totalAmount = new BigDecimal("0.0");
//        }
//
//        // DISCOUNT AMOUNT AS A BIG DECIMAL WITH NULL EXCEPTION HANDLING
//        try {
//            pAmount = new BigDecimal(String.valueOf(paymentAmount.getText().trim()));
//        } catch (Exception e) {
//            pAmount = new BigDecimal("0.0");
//        }
//
//        int compareValues = pAmount.compareTo(totalAmount); // if pAmount > total amount, then this varible will contain " 1 " , if equals then contains " 0 ", small then contain " -1 "
//
//        if (compareValues == -1 || compareValues == 0 && lenth.length() > 0) {
//            balanceShow.setText(new BigDecimal(lenth).subtract(new BigDecimal(total.getText().trim())).toString());
//            
//        }

    }//GEN-LAST:event_paymentAmountKeyReleased

    private void discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discActionPerformed

    private void discKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discKeyReleased
        String lenth = disc.getText().trim();
        BigDecimal totalAmount, discamount;

        // TOTAL AMOUNT AS A BIG DECIMAL WITH NULL EXCEPTION HANDLING
        try {
            totalAmount = new BigDecimal(String.valueOf(total.getText().trim()));
        } catch (Exception e) {
            totalAmount = new BigDecimal(String.valueOf(total.getText().trim()));
        }

        // DISCOUNT AMOUNT AS A BIG DECIMAL WITH NULL EXCEPTION HANDLING
        try {
            discamount = new BigDecimal(String.valueOf(disc.getText().trim()));
        } catch (Exception e) {
            discamount = new BigDecimal("0.0");
        }

        int compareValues = discamount.compareTo(totalAmount); // if pAmount > total amount, then this varible will contain " 1 " , if equals then contains " 0 ", small then contain " -1 "

        if (compareValues == 1) {
            JOptionPane.showMessageDialog(null, "Invalid Discount amount !");
            disc.setText("");
        }


    }//GEN-LAST:event_discKeyReleased

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // resetting vwindow
        refreshWindow();
    }//GEN-LAST:event_cancelActionPerformed

    private void borrowProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowProceedActionPerformed

        DefaultTableModel items = (DefaultTableModel) selltable.getModel();
        int rowCount = selltable.getRowCount();
        //cheking if items avaible in table

        if (rowCount > 0) {
            //DISPLAYING borrower pannel
            borrowers open = new borrowers();
            open.setVisible(true);
        }

    }//GEN-LAST:event_borrowProceedActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
   
         String lenth = paymentAmount.getText().trim();
         
        if (!lenth.equals(""))
                {
                    paymentAmountProcess(); //callling to payment process method
                }
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void discountingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountingBtnActionPerformed
        String lenth = disc.getText().trim();
        if (!lenth.equals(""))
                {
                    discountProcess(); //calling to discount process
                }
    }//GEN-LAST:event_discountingBtnActionPerformed

    private void addStockTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockTabActionPerformed
        try {
            AddStocks open = new AddStocks(0);
            open.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cant open Add Stocks window");
        }
    }//GEN-LAST:event_addStockTabActionPerformed

    private void borrowersTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowersTabActionPerformed

        try {
            borrowers open = new borrowers();
            open.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cant open returns window 1");
        }
    }//GEN-LAST:event_borrowersTabActionPerformed

    private void settingTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingTabActionPerformed
        //cheking is this pannel locked or not
        if (panelLock == true) {
            passget open = new passget();
            open.setVisible(true);
        }
        if (panelLock == false) {
            settings open = new settings();
            open.setVisible(true);
        }
    }//GEN-LAST:event_settingTabActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        searchBtn();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void paymentAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentAmountActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void selltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selltableMouseClicked
       
        //eanabling table oparator btns
        removeItem.setEnabled(true);
        cancel.setEnabled(true);
    }//GEN-LAST:event_selltableMouseClicked

    private void advancedTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedTabActionPerformed
        try
            {
                advanced open = new advanced();
                open.setVisible(true);
            }
        catch(Exception e)
            {
            
            }
    }//GEN-LAST:event_advancedTabActionPerformed

//filling jtable with parsed itesm
    public static void searchItemsToTable(String[] stockdatas) {

        // try
        //   {
        String[] dataToTable = new String[5];
        String[] lineBreak = {"", "", "", "", ""};

        dataToTable[0] = stockdatas[0];
        dataToTable[1] = stockdatas[1];
        dataToTable[2] = stockdatas[2];
        dataToTable[3] = quan;
        dataToTable[4] = String.valueOf(new BigDecimal(stockdatas[2]).multiply(new BigDecimal(quan)));

        DefaultTableModel itemData = (DefaultTableModel) selltable.getModel();

        itemData.addRow(lineBreak);
        itemData.addRow(dataToTable);

        //updating new price 
        newPrice = stockdatas[2];
        /*  }
        catch(Exception e)
            {
                    JOptionPane.showMessageDialog(null,"Please enter a valid Number !");
            }*/
    }
    
    //filling jtable with parsed itesm
    public static void advancedItems_searchItemsToTable(String[] stockdatas) {

        // try
        //   {
        String[] dataToTable = new String[5];
        String[] lineBreak = {"", "", "", "", ""};

        dataToTable[0] = stockdatas[0];
        dataToTable[1] = stockdatas[1];
        dataToTable[2] = stockdatas[3];
        dataToTable[3] = stockdatas[2];
        dataToTable[4] = stockdatas[4];

        DefaultTableModel itemData = (DefaultTableModel) selltable.getModel();

        itemData.addRow(lineBreak);
        itemData.addRow(dataToTable);

    }

//starting barcode detect process
    void searchProcess(char character) {
        if (character == KeyEvent.VK_ENTER) {

            String code = barcode.getText().trim();
            System.out.println(code);
            try {
                //searching item from stock
                connect.itemsForSelling(code);
            } catch (Exception ex) {
                Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
            }

            //make sure that continue search preocess is ready to run
            if (controllers.QuantityTrue == true) {
                quantitiyBox open = new quantitiyBox();
                open.setVisible(true);
            } else {
                barcode.setText("");
            }

        }
    }

    void searchBtn() {
        String code = barcode.getText().trim();
        try {
            //searching item from stock
            connect.itemsForSelling(code);
        } catch (Exception ex) {
            Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
        }

        //make sure that continue search preocess is ready to run
        if (controllers.QuantityTrue == true) {
            quantitiyBox open = new quantitiyBox();
            open.setVisible(true);
        } else {
            barcode.setText("");
        }
    }

// continuing barcode ditect process
    public static void ContinueSearch() {
        try {

            //calculating total
            BigDecimal totalIs = new BigDecimal(total.getText().trim());
            BigDecimal newItemPrice = new BigDecimal(newPrice);

            totalIs = totalIs.add(newItemPrice.multiply(new BigDecimal(quan))); // adding new item price to total amount of things

            total.setText(totalIs.toString()); // displayng new total amount to display
            staticTotal.setText("Rs. " + totalIs.toString());
            newPrice = "0.0";//setting default new price amount to 0.0
            quan = "1"; //setting default quan value 

            barcode.setText("");

        } catch (Exception ex) {
            Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //RESETING THE WINDOW   
    public static void refreshWindow() {
        removeItem.setEnabled(false);
        discLable.setVisible(false);
        discAmount.setVisible(false);
        balanceLable.setVisible(false);
        balanceShow.setVisible(false);
        disc.setEditable(true);
        newPrice = "0.0";// for storing new item price
        dot = false;//for get notified wen working with floating points
        quan = "1.0"; //guantity of new item

        //clearing the table
        DefaultTableModel items = (DefaultTableModel) selltable.getModel();

        while (selltable.getRowCount() > 0) {
            items.removeRow(0);
        }

        barcode.setText("");
        staticTotal.setText("");
        total.setText("0.0");
        discAmount.setText("0.0");
        paymentAmount.setText("");
        disc.setText("");

    }

//extra item adding process
    void ExtraQuanProcess(BigDecimal totalis, BigDecimal money, BigDecimal quantitiy) {
        BigDecimal totalUpdate = totalis;

        //addinf new row to table
        String[] newRow = {"xxx", "Item", String.valueOf(money), String.valueOf(quantitiy), String.valueOf(money.multiply(quantitiy))};
        String[] linebrake = {"", "", "", "", ""};

        DefaultTableModel itemData = (DefaultTableModel) selltable.getModel();
        itemData.addRow(linebrake);
        itemData.addRow(newRow);

        
        totalUpdate = totalUpdate.add(money.multiply(quantitiy)); // adding new item price to total amount of things

            total.setText(totalUpdate.toString()); // displayng new total amount to display
            staticTotal.setText("Rs. " + totalUpdate.toString()); //displaying static total amount
            
    }

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
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_FRAME().setVisible(true);
            }
        });
    }

    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while (true) {
            // CODE FOR TIME 
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);

            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
            Date time = cal.getTime();
            String timeok = sdf.format(time);
            Time.setText(timeok);

            // CODE FOR DATE
            LocalDate date = LocalDate.now();
            String dateok = date.toString();
            Date.setText(dateok);

            try {
                //cheking stocks
                boolean out = connect.stockout();
                
                if(out == true)
                    {   
                           bell.setVisible(true);
                    }
                else
                    {
                            bell.setVisible(false);
                    }
            } catch (Exception ex) {
                Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Date;
    public static javax.swing.JLabel Time;
    private javax.swing.JButton addStockTab;
    private javax.swing.JButton advancedTab;
    public static javax.swing.JLabel balanceLable;
    public static javax.swing.JLabel balanceShow;
    public static javax.swing.JTextField barcode;
    private javax.swing.JLabel bell;
    private javax.swing.JButton borrowProceed;
    private javax.swing.JButton borrowersTab;
    protected static javax.swing.JButton cancel;
    public static javax.swing.JTextField disc;
    public static javax.swing.JLabel discAmount;
    public static javax.swing.JLabel discLable;
    private javax.swing.JButton discountingBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTextField paymentAmount;
    private javax.swing.JButton paymentBtn;
    public static javax.swing.JButton proceed;
    public static javax.swing.JButton removeItem;
    public static javax.swing.JTable selltable;
    private javax.swing.JButton settingTab;
    private javax.swing.JLabel shopName;
    public static javax.swing.JLabel staticTotal;
    private javax.swing.JButton stockTab;
    public static javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
