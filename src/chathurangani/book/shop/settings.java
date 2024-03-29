package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//Logger.getLogger(settings.class.getName()).log(Level.SEVERE, null, e);

public class settings extends javax.swing.JFrame implements Runnable {

    public settings() {
        initComponents();
        Thread time = new Thread(this);
        time.start();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        setPanel.setVisible(false);
        changePannel.setVisible(false);
        saveDB();
    }

    public settings(boolean loked) {
        initComponents();
        Thread time = new Thread(this);
        time.start();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        setPanel.setVisible(false);
        changePannel.setVisible(false);
        //addpassword.setVisible(false);
    }

    public settings(int change) {
        initComponents();
        Thread time = new Thread(this);
        time.start();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        delasstock.setVisible(false);
        analizeBiz.setVisible(false);
        passPanel.setVisible(false);
        setPanel.setVisible(true);
        changePannel.setVisible(false);
        //addpassword.setVisible(false);
        cashier.setVisible(false);
        biz.setVisible(false);
        btn_activities.setVisible(false);

        this.forgetpass = true; //this will help to the ok btn wich is in password setting panel to re open new admin login window
    }

    boolean forgetpass = false;
    dbConnector connect = new dbConnector(); // 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ctime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cdate = new javax.swing.JLabel();
        passPanel = new javax.swing.JPanel();
        changePassword = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        setPanel = new javax.swing.JPanel();
        setPassword = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        s_p_retypePass = new javax.swing.JPasswordField();
        s_p_newPass = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        question = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cashier = new javax.swing.JButton();
        analizeBiz = new javax.swing.JButton();
        notify = new javax.swing.JLabel();
        delasstock = new javax.swing.JButton();
        biz = new javax.swing.JButton();
        btn_activities = new javax.swing.JButton();
        health = new javax.swing.JLabel();
        developerPass = new javax.swing.JPasswordField();
        changePannel = new javax.swing.JPanel();
        Change = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        c_p_retypePass = new javax.swing.JPasswordField();
        c_p_newPass = new javax.swing.JPasswordField();
        currentPass = new javax.swing.JPasswordField();
        evonpass = new javax.swing.JLabel();

        jButton3.setBackground(new java.awt.Color(102, 102, 0));
        jButton3.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jButton3.setText("CREATE BILL");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 0));
        jButton5.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jButton5.setText("STORE");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 153, 153));
        jButton12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("History");
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton12.setBorderPainted(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 153, 153));
        jButton14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("History");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton14.setBorderPainted(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hi Admin ... ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 31, 358, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(21, 22, 26));

        ctime.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ctime.setForeground(new java.awt.Color(255, 255, 255));
        ctime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctimeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ctime, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ctime, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(21, 21, 23));
        jPanel3.setForeground(new java.awt.Color(37, 34, 39));

        cdate.setBackground(new java.awt.Color(255, 255, 255));
        cdate.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cdate.setForeground(new java.awt.Color(255, 255, 255));
        cdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, 36));

        passPanel.setBackground(new java.awt.Color(0, 51, 51));
        passPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePassword.setBackground(new java.awt.Color(0, 51, 51));
        changePassword.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        changePassword.setForeground(new java.awt.Color(255, 255, 255));
        changePassword.setText("Change password");
        changePassword.setToolTipText("Change your password");
        changePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        changePassword.setBorderPainted(false);
        changePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        passPanel.add(changePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 50));

        jPanel1.add(passPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 0));

        setPanel.setBackground(new java.awt.Color(0, 51, 51));
        setPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        setPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setPassword.setBackground(new java.awt.Color(255, 0, 0));
        setPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        setPassword.setForeground(new java.awt.Color(255, 255, 255));
        setPassword.setText("ADD");
        setPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPasswordActionPerformed(evt);
            }
        });
        setPanel.add(setPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 377, 157, 44));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SET A PASSWORD");
        setPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 294, -1));

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CLOSE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        setPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 377, 107, 44));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("New Password :");
        setPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, 172, 14));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Re-Type Password :");
        setPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, 172, 14));

        s_p_retypePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_p_retypePassActionPerformed(evt);
            }
        });
        s_p_retypePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s_p_retypePassKeyTyped(evt);
            }
        });
        setPanel.add(s_p_retypePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 153, 270, 40));

        s_p_newPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s_p_newPassKeyTyped(evt);
            }
        });
        setPanel.add(s_p_newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, 40));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Security question");
        setPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 235, 172, 14));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Answer :");
        setPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 302, 172, 14));

        answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                answerKeyTyped(evt);
            }
        });
        setPanel.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 325, 270, 40));

        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        question.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                questionKeyTyped(evt);
            }
        });
        setPanel.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 256, 270, 40));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Security Question helps you to recover your password ");
        setPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 205, -1, -1));

        jPanel1.add(setPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, 432));

        cashier.setBackground(new java.awt.Color(0, 51, 51));
        cashier.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        cashier.setForeground(new java.awt.Color(255, 255, 255));
        cashier.setText("Manage Cashiers");
        cashier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierActionPerformed(evt);
            }
        });
        jPanel1.add(cashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 259, 47));

        analizeBiz.setBackground(new java.awt.Color(0, 153, 255));
        analizeBiz.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        analizeBiz.setForeground(new java.awt.Color(255, 255, 255));
        analizeBiz.setText("ANALIZE MY BIZ");
        analizeBiz.setToolTipText("Get Report About Your Income");
        analizeBiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizeBizActionPerformed(evt);
            }
        });
        jPanel1.add(analizeBiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 182, 0, -1));

        notify.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        notify.setForeground(new java.awt.Color(255, 255, 255));
        notify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notifyMouseClicked(evt);
            }
        });
        jPanel1.add(notify, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 450, 20));

        delasstock.setBackground(new java.awt.Color(204, 0, 0));
        delasstock.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        delasstock.setForeground(new java.awt.Color(255, 255, 255));
        delasstock.setText(" MY DEALS");
        delasstock.setToolTipText("See All Deals");
        delasstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delasstockActionPerformed(evt);
            }
        });
        jPanel1.add(delasstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 129, 0, 48));

        biz.setBackground(new java.awt.Color(255, 0, 0));
        biz.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        biz.setForeground(new java.awt.Color(255, 255, 255));
        biz.setText("ANALIZE MY BIZ");
        biz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bizActionPerformed(evt);
            }
        });
        jPanel1.add(biz, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 156, 259, 65));

        btn_activities.setBackground(new java.awt.Color(0, 51, 51));
        btn_activities.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_activities.setForeground(new java.awt.Color(255, 255, 255));
        btn_activities.setText("Cashier Activities");
        btn_activities.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_activities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_activitiesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_activities, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 259, 47));

        health.setText("System Health ");
        jPanel1.add(health, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 80, -1));

        developerPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developerPassActionPerformed(evt);
            }
        });
        developerPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                developerPassKeyTyped(evt);
            }
        });
        jPanel1.add(developerPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, 130, 30));

        changePannel.setBackground(new java.awt.Color(0, 51, 51));
        changePannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        Change.setBackground(new java.awt.Color(255, 0, 0));
        Change.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Change.setForeground(new java.awt.Color(255, 255, 255));
        Change.setText("CHANGE");
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHANGE PASSWORD");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Current Password :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Password :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Re-Type Password :");

        c_p_retypePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_p_retypePassKeyTyped(evt);
            }
        });

        c_p_newPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_p_newPassKeyTyped(evt);
            }
        });

        currentPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                currentPassKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout changePannelLayout = new javax.swing.GroupLayout(changePannel);
        changePannel.setLayout(changePannelLayout);
        changePannelLayout.setHorizontalGroup(
            changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currentPass)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, changePannelLayout.createSequentialGroup()
                        .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(c_p_retypePass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, changePannelLayout.createSequentialGroup()
                        .addGroup(changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(c_p_newPass, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        changePannelLayout.setVerticalGroup(
            changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c_p_newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(c_p_retypePass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Change, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(changePannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        evonpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_package/images/evon apps.jpg"))); // NOI18N
        evonpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(evonpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void cashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierActionPerformed

        cashiers open = new cashiers();
        open.setVisible(true);
    }//GEN-LAST:event_cashierActionPerformed

    private void delasstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delasstockActionPerformed
        //visibeling deal panel
        DealHistory open = new DealHistory();
        open.setVisible(true);
    }//GEN-LAST:event_delasstockActionPerformed

    private void analizeBizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizeBizActionPerformed
        report open = new report();
        open.setVisible(true);
    }//GEN-LAST:event_analizeBizActionPerformed

    private void questionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_questionKeyTyped

        int lenth = question.getText().toString().length();
        if (lenth == 254) {

            evt.consume();
        }
    }//GEN-LAST:event_questionKeyTyped

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionActionPerformed

    private void answerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerKeyTyped

        int lenth = answer.getText().toString().length();
        if (lenth == 254) {

            evt.consume();
        }
    }//GEN-LAST:event_answerKeyTyped

    private void s_p_newPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_p_newPassKeyTyped

        int lenth = String.copyValueOf(s_p_newPass.getPassword()).length();
        if (lenth == 20) {

            evt.consume();
        }
    }//GEN-LAST:event_s_p_newPassKeyTyped

    private void s_p_retypePassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_p_retypePassKeyTyped
        int lenth = String.copyValueOf(s_p_retypePass.getPassword()).length();
        if (lenth == 20) {

            evt.consume();
        }
    }//GEN-LAST:event_s_p_retypePassKeyTyped

    private void s_p_retypePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_p_retypePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_p_retypePassActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //clearinf input fields before closing panel
        s_p_newPass.setText("");
        s_p_retypePass.setText("");
        question.setText("");
        answer.setText("");
        setPanel.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void setPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPasswordActionPerformed

        String newPass = String.valueOf(s_p_newPass.getPassword());
        String rePass = String.valueOf(s_p_retypePass.getPassword());
        String questionis = String.valueOf(question.getText().trim());
        String answeris = String.valueOf(answer.getText().trim());

        if (!newPass.isEmpty() && !rePass.isEmpty() && !questionis.isEmpty() && !answeris.isEmpty()) {
            if (newPass.equals(rePass)) {
                try {

                    Encoder encode = new Encoder();
                    String hash = encode.getMd5(String.valueOf(s_p_retypePass.getPassword()));
                    connect.changePass(hash, questionis, answeris);

                    s_p_newPass.setText("");
                    s_p_retypePass.setText("");
                    question.setText("");
                    answer.setText("");

                    MAIN_FRAME.panelLock = true; //updatinf mainframe password on / off variable state to on
                    setPanel.setVisible(false);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, " Something went wrong - Settings#740! ");
                    connect.recod_error(ex.toString() + "- Settings 740 ");
                }
            } else {
                JOptionPane.showMessageDialog(null, " passwords dosent match ! ");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Please fill every field ! ");
        }

        if (forgetpass == true) {
            Adimin_login open = new Adimin_login();
            open.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_setPasswordActionPerformed

    private void currentPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentPassKeyTyped
        int lenth = String.copyValueOf(currentPass.getPassword()).length();
        if (lenth == 254) {

            evt.consume();
        }
    }//GEN-LAST:event_currentPassKeyTyped

    private void c_p_newPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_p_newPassKeyTyped
        int lenth = String.copyValueOf(c_p_newPass.getPassword()).length();
        if (lenth == 254) {

            evt.consume();
        }
    }//GEN-LAST:event_c_p_newPassKeyTyped

    private void c_p_retypePassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_p_retypePassKeyTyped
        int lenth = String.copyValueOf(c_p_retypePass.getPassword()).length();
        if (lenth == 254) {

            evt.consume();
        }
    }//GEN-LAST:event_c_p_retypePassKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        currentPass.setText("");
        c_p_newPass.setText("");
        c_p_retypePass.setText("");
        changePannel.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed

        String cp = String.valueOf(currentPass.getPassword()); //getting current passowrd
        String np = String.valueOf(c_p_newPass.getPassword()); //getting new passowrd
        String rp = String.valueOf(c_p_retypePass.getPassword()); //getting retyped password

        Encoder encode = new Encoder();

        if (!cp.isEmpty() && !np.isEmpty() && !rp.isEmpty()) //CHEKING IS EVERY FIELD HAS BEEN FILED
        {
            try {
                String oldPass = encode.getMd5(String.valueOf(cp));
                boolean passOk = connect.passchek(oldPass); //CHEKING IS OLD PASSWORD CORRECT , IF IT OK THEN passOk IS TRUE

                if (passOk == true) {
                    //CHEKKING NEW TYPED PASSWORD AND RETYPE PASS WORD ARE EQAULS
                    if (String.valueOf(c_p_newPass.getPassword()).equals(String.valueOf(c_p_retypePass.getPassword()))) {

                        String newPass = encode.getMd5(String.valueOf(rp));
                        connect.changePass("", String.valueOf(newPass));

                        currentPass.setText("");
                        c_p_newPass.setText("");
                        c_p_retypePass.setText("");

                        changePannel.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "  New password dosent match ! ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, " Current Password Incorrect ! ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Something went wrong - Settings#825! ");
                connect.recod_error(e.toString() + "- Settings 826 ");
            }

        } else {
            JOptionPane.showMessageDialog(null, " Please fill every field ! ");
        }
    }//GEN-LAST:event_ChangeActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        changePannel.setVisible(true);
    }//GEN-LAST:event_changePasswordActionPerformed

    private void ctimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctimeMouseClicked
        int clearOk = JOptionPane.showConfirmDialog(null, "You need to clear all data ?", "Clear All Deals..", JOptionPane.ERROR_MESSAGE, JOptionPane.OK_CANCEL_OPTION);

        if (clearOk == 0) {
            try {
                //creating a backup
                notify.setText("Creating Backup ... !");
                connect.clearDeals();
                notify.setText("Done !");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, " Something went wrong - Settings#863! ");
                connect.recod_error(ex.toString() + "- Settings 860 ");
                Logger.getLogger(settings.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ctimeMouseClicked

    private void bizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bizActionPerformed
        try {
            report open = new report();
            open.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Sorry unable to open Analize - Settings#874! ");
            connect.recod_error(e.toString() + "- Settings 874 ");
        }
    }//GEN-LAST:event_bizActionPerformed

    private void btn_activitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_activitiesActionPerformed
        try {
            activities open = new activities();
            open.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Sorry unable to open Cashier Activites - Settings#887! ");
            connect.recod_error(e.toString() + "- Settings 887 ");
        }
    }//GEN-LAST:event_btn_activitiesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.gc();
    }//GEN-LAST:event_formWindowClosing

    private void cdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdateMouseClicked
                
        try {
            Process restore = null;
            String[] path = new String[]{"C:/Program Files/MySQL/MySQL Server 5.7/bin/mysql.exe", "--user=" + "root", "--password=" + "papapapa", "-e", "source " + "C:/Users/Dilum/Documents/backup.sql"};
            restore = Runtime.getRuntime().exec(path);

            if (restore.waitFor() == 0) {
                notify.setText("Restored !");
            }
            else
             {//trying to access other backup
                    path = new String[]{"C:/Program Files/MySQL/MySQL Server 5.7/bin/mysql.exe", "--user=" + "root", "--password=" + "papapapa", "-e", "source " + "C:/ProgramData/backup.sql"};
                    restore = Runtime.getRuntime().exec(path);

                    if (restore.waitFor() == 0) {
                          notify.setText("Restored !");
                     }
                    else
                        {
                            notify.setText("Sorry unable to backup your data !");
                        }
             }
        } catch (Exception e) {
            
                notify.setText("Sorry unable to backup your data !, restart your PC and try again .");    
         }
    }//GEN-LAST:event_cdateMouseClicked

    private void notifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notifyMouseClicked
        notify.setText("");
    }//GEN-LAST:event_notifyMouseClicked

    private void developerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developerPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_developerPassActionPerformed

    private void developerPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_developerPassKeyTyped

        char enter = evt.getKeyChar();
            if(developerPass.getPassword().toString().length() == 50)
                {
                    evt.consume();
                }
            
            if(enter == KeyEvent.VK_ENTER)
                {
                      Encoder convert = new Encoder();
                            try 
                            {
                                boolean passOk = connect.passchek(convert.getMd5(String.valueOf(developerPass.getPassword())));

                                if(passOk == true)
                                {
                                    errors open = new errors();
                                    open.setVisible(true);
                                    developerPass.setText("");
                                    developerPass.setVisible(false);
                                }
                            }
                            catch(Exception e)
                                {
                                    connect.recod_error(e.toString());
                                }
                }
            
                           
    }//GEN-LAST:event_developerPassKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JButton analizeBiz;
    private javax.swing.JTextField answer;
    private javax.swing.JButton biz;
    private javax.swing.JButton btn_activities;
    private javax.swing.JPasswordField c_p_newPass;
    private javax.swing.JPasswordField c_p_retypePass;
    private javax.swing.JButton cashier;
    private javax.swing.JLabel cdate;
    private javax.swing.JPanel changePannel;
    private javax.swing.JButton changePassword;
    private javax.swing.JLabel ctime;
    private javax.swing.JPasswordField currentPass;
    private javax.swing.JButton delasstock;
    private javax.swing.JPasswordField developerPass;
    private javax.swing.JLabel evonpass;
    private javax.swing.JLabel health;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel notify;
    private javax.swing.JPanel passPanel;
    private javax.swing.JTextField question;
    private javax.swing.JPasswordField s_p_newPass;
    private javax.swing.JPasswordField s_p_retypePass;
    private javax.swing.JPanel setPanel;
    private javax.swing.JButton setPassword;
    // End of variables declaration//GEN-END:variables

    private void DateFormat(String hhmmssaa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        //backup databse
    void saveDB(){
    
                 //backup database  
               try
                {

                    Process backup = null;
                    Runtime getDB = Runtime.getRuntime();
                    
  backup = getDB.exec("C:/Program Files/MySQL/MySQL Server 5.7/bin/mysqldump.exe -uroot -ppapapapa --add-drop-database -B bookshop -r C:/Users/Dilum/Documents/backup.sql");
  backup = getDB.exec("C:/Program Files/MySQL/MySQL Server 5.7/bin/mysqldump.exe -uroot -ppapapapa --add-drop-database -B bookshop -r C:/ProgramData/backup.sql");
                
                }
               catch(Exception e)
                    {
                            connect.recod_error(e.toString()+" Main Frame 1277");
                    }
        
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while (true) {
            // CODE FOR TIME 
            try {
                Calendar cal = Calendar.getInstance();

                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
                Date time = cal.getTime();
                String timeok = sdf.format(time);
                ctime.setText(timeok);

                // CODE FOR DATE
                LocalDate date = LocalDate.now();
                String dateok = date.toString();
                cdate.setText(dateok);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Something went wrong - Settings#984! ");
                connect.recod_error(e.toString() + "- Settings 982 ");
            }

        }
    }

}
