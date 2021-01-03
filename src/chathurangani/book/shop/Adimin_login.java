
package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilum
 */public class Adimin_login extends javax.swing.JFrame {

    /**
     * Creates new form Adimin_login
     */
    public Adimin_login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
//        lbl_userName.setVisible(false);
  //      userName_box.setVisible(false);
    }
    
    static int passwordok = 0;
    boolean admin = true;
    dbConnector connect = new dbConnector();

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clogbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        signin = new javax.swing.JButton();
        text_user = new javax.swing.JLabel();
        img_logo = new javax.swing.JLabel();
        forget = new javax.swing.JLabel();
        apasslogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_userName1 = new javax.swing.JLabel();
        cPass = new javax.swing.JPasswordField();
        signin1 = new javax.swing.JButton();
        text_user1 = new javax.swing.JLabel();
        img_logo1 = new javax.swing.JLabel();
        forget1 = new javax.swing.JLabel();
        apasslogo1 = new javax.swing.JLabel();
        userName_box = new javax.swing.JTextField();

        Clogbtn.setText("Sign In");
        Clogbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Clogbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClogbtnActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THISSA SAW MILL");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("- By EvonApps ... -");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_package/images/login.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WELCOME TO ");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EvonApps");

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        password.setBackground(new java.awt.Color(255, 255, 204));
        password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });

        signin.setBackground(new java.awt.Color(0, 204, 204));
        signin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });

        text_user.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text_user.setForeground(new java.awt.Color(255, 255, 255));
        text_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_user.setText("Adminstrator ");

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_package/images/admin.png"))); // NOI18N
        img_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_logoMouseClicked(evt);
            }
        });

        forget.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        forget.setForeground(new java.awt.Color(255, 255, 255));
        forget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forget.setText("Forget password ");
        forget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetMouseClicked(evt);
            }
        });

        apasslogo.setBackground(new java.awt.Color(255, 255, 255));
        apasslogo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        apasslogo.setForeground(new java.awt.Color(255, 255, 0));
        apasslogo.setText("Password : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(text_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password)
                    .addComponent(forget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(apasslogo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(img_logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(text_user)
                .addGap(18, 18, 18)
                .addComponent(img_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(apasslogo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forget)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Admin", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 204, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        lbl_userName1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_userName1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_userName1.setForeground(new java.awt.Color(255, 255, 0));
        lbl_userName1.setText("User Name :");

        cPass.setBackground(new java.awt.Color(255, 255, 204));
        cPass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPassActionPerformed(evt);
            }
        });
        cPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPassKeyTyped(evt);
            }
        });

        signin1.setBackground(new java.awt.Color(0, 204, 204));
        signin1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signin1.setForeground(new java.awt.Color(255, 255, 255));
        signin1.setText("Sign In");
        signin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin1ActionPerformed(evt);
            }
        });

        text_user1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        text_user1.setForeground(new java.awt.Color(255, 255, 255));
        text_user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_user1.setText("Cashier");

        img_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_package/images/cashier.png"))); // NOI18N
        img_logo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_logo1MouseClicked(evt);
            }
        });

        forget1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        forget1.setForeground(new java.awt.Color(255, 255, 255));
        forget1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forget1.setText("Forget password ");
        forget1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forget1MouseClicked(evt);
            }
        });

        apasslogo1.setBackground(new java.awt.Color(255, 255, 255));
        apasslogo1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        apasslogo1.setForeground(new java.awt.Color(255, 255, 0));
        apasslogo1.setText("Password : ");

        userName_box.setBackground(new java.awt.Color(255, 255, 204));
        userName_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userName_boxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(signin1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(text_user1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cPass)
                    .addComponent(forget1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName_box)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apasslogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_userName1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_logo1)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(text_user1)
                .addGap(18, 18, 18)
                .addComponent(img_logo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_userName1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(userName_box, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apasslogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(signin1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forget1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cashier", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 317, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)
                                .addContainerGap(298, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClogbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClogbtnActionPerformed

    }//GEN-LAST:event_ClogbtnActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //setting loging pannel to defult login process
        apasslogo.setText("Password : ");
        passwordok = 0;
        signin.setText("Sign In");
        forget.setText("Forget password ");

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

       //setting loging pannel to defult login process
       defaults();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void forgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetMouseClicked

        signin.setText("CHEK");
        apasslogo.setText("Enter Security Question .");
        passwordok = 1;
    }//GEN-LAST:event_forgetMouseClicked

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed

       //sign in process
       signin();
    }//GEN-LAST:event_signinActionPerformed

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        int lenth = String.copyValueOf(password.getPassword()).length();
        char enter = evt.getKeyChar();
        if(lenth ==254)
        {

            evt.consume();
        }
        
        if(enter == KeyEvent.VK_ENTER)
            {
                signin();
            }
    }//GEN-LAST:event_passwordKeyTyped

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //setting loging pannel to defult login process
       defaults();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         //setting loging pannel to defult login process
       defaults();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //setting loging pannel to defult login process
       defaults();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void img_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_logoMouseClicked
        //setting loging pannel to defult login process
        defaults();
    }//GEN-LAST:event_img_logoMouseClicked

    private void cPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPassActionPerformed

    private void cPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPassKeyTyped
       
        if(cPass.getText().length() == 20)
            {
                evt.consume();
            }
    }//GEN-LAST:event_cPassKeyTyped

    private void signin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin1ActionPerformed
                
        try {
            boolean passOk = connect.passchek_cashier(userName_box.getText() , String.valueOf(cPass.getPassword()));
            
            if(passOk == true)
            {
                MAIN_FRAME open = new MAIN_FRAME();
                open.setVisible(true);
            }
            else
                {
                    userName_box.setText("");
                    cPass.setText("");
                }
            
        } catch (Exception ex) {
            Logger.getLogger(Adimin_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_signin1ActionPerformed

    private void img_logo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_logo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_img_logo1MouseClicked

    private void forget1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forget1MouseClicked
        JOptionPane.showMessageDialog(null,"Contact Administrator to reset your password !");
    }//GEN-LAST:event_forget1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void userName_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userName_boxKeyTyped
        if(userName_box.getText().length() == 20)
            {
                evt.consume();
            }
    }//GEN-LAST:event_userName_boxKeyTyped

    
    //defaults state of admin logn window
    void defaults()
        {
               //setting loging pannel to defult login process
                apasslogo.setText("Password : ");
                passwordok = 0;
                signin.setText("Sign In");
                forget.setText("Forget password ");
        }
    
 //sign inn process
    void signin()
        {        
            if(!String.valueOf(password.getPassword()).isEmpty())
                {
                    if(passwordok == 0) //if user directly enter the password (default state)
                    {
                    
                            String passis = String.valueOf(password.getPassword());

                            Encoder convert = new Encoder();

                            try {
                                boolean passOk = connect.passchek(convert.getMd5(passis));

                                if(passOk == true)
                                {
                                    //opening main menu
                                    apasslogo.setText("Password : ");
                                    MAIN_FRAME open = new MAIN_FRAME();
                                    open.setVisible(true);
                                    dispose();
                                }
                                else
                                {
                                    apasslogo.setText("Password incorrect !");
                                    password.setText("");
                                }

                            } catch (Exception ex) {
                                Logger.getLogger(Adimin_login.class.getName()).log(Level.SEVERE, null, ex);
                            }
                      }
                  else if(passwordok == 1) //user forgot the password ans enter the securty key and trying to chek
                        {
                                    String question = String.valueOf(password.getPassword());
                                    
                                    try {
                                        boolean qesok = connect.questionchek(question , 1); //cheking the avaiability of security question
                                        
                                        if(qesok == true) //if question is availble letting to enter the answer
                                            {
                                                apasslogo.setText("Enter the answer .");
                                                password.setText("");
                                                passwordok = 2; //setting sign in btn state to chek the answer validity
                                            }
                                        else
                                            {
                                                apasslogo.setText("Incorrect Security Question !");
                                                password.setText("");
                                            }
                                        
                                    } catch (Exception ex) {
                                        Logger.getLogger(Adimin_login.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                  else  //state of ready to chek security answer
                    {
                                try {
                                        String answer = String.valueOf(password.getPassword());
                                        boolean qesok = connect.questionchek(answer , 2);
                                        
                                        if(qesok == true) // id answer is ok the open the setting window 
                                            {
                                               passwordok = 0; //setting sign in btn state to chek the answer validity
                                               settings open = new settings(1);
                                               open.setVisible(true);
                                               setVisible(false);
                                            }
                                        else
                                            {
                                                apasslogo.setText("incorrect Answer!");
                                                password.setText("");
                                            }
                                        
                                    } catch (Exception ex) {
                                        Logger.getLogger(Adimin_login.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                    }
                }
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
            java.util.logging.Logger.getLogger(Adimin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adimin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adimin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adimin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adimin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clogbtn;
    public static javax.swing.JLabel apasslogo;
    public static javax.swing.JLabel apasslogo1;
    private javax.swing.JPasswordField cPass;
    public static javax.swing.JLabel forget;
    public static javax.swing.JLabel forget1;
    private javax.swing.JLabel img_logo;
    private javax.swing.JLabel img_logo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JLabel lbl_userName1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signin;
    private javax.swing.JButton signin1;
    private javax.swing.JLabel text_user;
    private javax.swing.JLabel text_user1;
    private javax.swing.JTextField userName_box;
    // End of variables declaration//GEN-END:variables
}
