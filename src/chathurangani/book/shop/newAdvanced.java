package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dilum
 */
public class newAdvanced extends javax.swing.JFrame {

    /**
     * Creates new form BillOwner
     */
    
    boolean who = true; //true means new borrower update // false for new cashier
    
    public newAdvanced() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        changephoneno.setEnabled(false);
        next.setEnabled(false);
    }

    dbConnector connect = new dbConnector();
    static boolean dot = false;//for get notified wen working with floating points
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cusphoneForBill = new javax.swing.JTextField();
        CusNameForBill = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        lbl_phone = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        changephoneno = new javax.swing.JButton();
        nic = new javax.swing.JTextField();
        lbl_nic = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        lbl_pass = new javax.swing.JLabel();
        advanceAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Name & Phone Number ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        cusphoneForBill.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cusphoneForBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusphoneForBillActionPerformed(evt);
            }
        });
        cusphoneForBill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cusphoneForBillKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cusphoneForBillKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cusphoneForBillKeyTyped(evt);
            }
        });

        CusNameForBill.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CusNameForBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusNameForBillActionPerformed(evt);
            }
        });
        CusNameForBill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CusNameForBillKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CusNameForBillKeyTyped(evt);
            }
        });

        next.setBackground(new java.awt.Color(0, 204, 51));
        next.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        lbl_phone.setBackground(new java.awt.Color(255, 255, 255));
        lbl_phone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(255, 255, 255));
        lbl_phone.setText("Customer Phone Number");

        lbl_name.setBackground(new java.awt.Color(255, 255, 255));
        lbl_name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("Customer Name");

        changephoneno.setText("Change");
        changephoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changephonenoActionPerformed(evt);
            }
        });

        nic.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicKeyTyped(evt);
            }
        });

        lbl_nic.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_nic.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nic.setText("Customer NIC");

        lbl_address.setBackground(new java.awt.Color(255, 255, 255));
        lbl_address.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(255, 255, 255));
        lbl_address.setText("Customer Address");

        address.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
        });

        lbl_pass.setBackground(new java.awt.Color(255, 255, 255));
        lbl_pass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pass.setText("Advanced Amount");

        advanceAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        advanceAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                advanceAmountKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CusNameForBill)
                            .addComponent(nic)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cusphoneForBill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changephoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(address)
                            .addComponent(advanceAmount)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(142, 142, 142)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CusNameForBill, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changephoneno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cusphoneForBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(advanceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CusNameForBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusNameForBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusNameForBillActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        if(who == true)
        {
            try {
                //calling processing method name send data;
                sendData();
            } catch (Exception ex) {
                Logger.getLogger(newAdvanced.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try
                {
                    //calling processing method name add ;
                    sendData(false);
                }
            catch(Exception e)
            {
                Logger.getLogger(cashiers.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_nextActionPerformed

    private void CusNameForBillKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CusNameForBillKeyTyped
        char c = evt.getKeyChar();
        String lenth = CusNameForBill.getText();

        if (lenth.length() == 250) //setting the maximum range of customer name 
        {
            evt.consume();
        }

        if ((Character.isLetter(c)) || (Character.isWhitespace(c)) || (Character.isISOControl(c))) {
            CusNameForBill.setEditable(true);

        } else {
            evt.consume();

        }

    }//GEN-LAST:event_CusNameForBillKeyTyped

    private void cusphoneForBillKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusphoneForBillKeyTyped
        char c = evt.getKeyChar();

        if ((Character.isDigit(c)) || (Character.isISOControl(c))) {
            cusphoneForBill.setEnabled(true);
        } else {
            evt.consume();
        }

        if (c == KeyEvent.VK_ENTER) {
            try {
                //calling processing method name send data;
                sendData();
            } catch (Exception ex) {
                Logger.getLogger(newAdvanced.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_cusphoneForBillKeyTyped

    private void cusphoneForBillKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusphoneForBillKeyReleased
        String lenth = cusphoneForBill.getText();
        if ((lenth.length() == 10) || (lenth.length() == 0)) {
            lbl_phone.setText("Phone Number ok !");
            next.setEnabled(true);
            cusphoneForBill.setEnabled(false);
            changephoneno.setEnabled(true);
        } else {
            next.setEnabled(false);
        }

        try {
            char[] c = lenth.toCharArray();
            if (c[0] != '0') {
                lbl_phone.setText("Invalid Phone Number !");
                next.setEnabled(false);
            } else {
                lbl_phone.setText("Phone Number : ");
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_cusphoneForBillKeyReleased

    private void changephonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changephonenoActionPerformed
        cusphoneForBill.setText("");
        cusphoneForBill.setEnabled(true);
        changephoneno.setEnabled(false);
    }//GEN-LAST:event_changephonenoActionPerformed

    private void cusphoneForBillKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusphoneForBillKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusphoneForBillKeyPressed

    private void CusNameForBillKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CusNameForBillKeyReleased
        String lenth = CusNameForBill.getText();
        if (lenth.length() >= 2) {
            next.setEnabled(true);
        } else {
            next.setEnabled(false);
        }
    }//GEN-LAST:event_CusNameForBillKeyReleased

    private void cusphoneForBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusphoneForBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusphoneForBillActionPerformed

    private void nicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyReleased
        String lenth = nic.getText();  
    }//GEN-LAST:event_nicKeyReleased

    private void nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyTyped
        String lenth = nic.getText().trim();
        char charactor = evt.getKeyChar();
         
        if(lenth.length()==12)
            {
                evt.consume();
            }
        
        if((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) ||  (charactor==KeyEvent.VK_V ))
        {
            nic.setEditable(true);
        }
       else
        {
            evt.consume();
        }
    }//GEN-LAST:event_nicKeyTyped

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyTyped
        
       if(address.getText().length() == 240)
        {
            evt.consume();
        }
    }//GEN-LAST:event_addressKeyTyped

    private void advanceAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_advanceAmountKeyTyped
       
        String lenth = advanceAmount.getText().trim();
        char charactor = evt.getKeyChar();

        if (lenth.length() == 16) {
            evt.consume();
        }

        // IF DOT HAS TYPED THIS PART WILL BW RUN
        if (dot == false) {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) || charactor == KeyEvent.VK_PERIOD) {
                advanceAmount.setEditable(true);

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

    }//GEN-LAST:event_advanceAmountKeyTyped

    void sendData() throws Exception {

        if(advanceAmount.getText().length()>0)
         {
             //defng bigdecimal values to send to the database
                BigDecimal[] defaultValues = {new BigDecimal("0.0"),new BigDecimal("0.0"),new BigDecimal(String.valueOf(advanceAmount.getText()))};

                //setting new borrowers detials to create a new borrower in databse
                String [] namePhoneNic = {CusNameForBill.getText().trim(), cusphoneForBill.getText().trim(), nic.getText().trim() , address.getText().trim() , String.valueOf(java.time.LocalDate.now())}; // getiing new borrower details

                //sending new borrower to database
                int key = connect.storeAdvancedDealsDataIntoBase(namePhoneNic , defaultValues); // storing borrrower to db

                //displaying borrower in table
                DefaultTableModel delas = (DefaultTableModel) advanced.advancedTable.getModel();
                String [] newBorro = {controllers.primaryKeyOfdealsData , CusNameForBill.getText().trim(), cusphoneForBill.getText().trim(), nic.getText().trim() , address.getText().trim(), "0.0","0.0" , String.valueOf(advanceAmount.getText()) , String.valueOf(java.time.LocalDate.now())};
                delas.addRow(newBorro);

                setVisible(false);
         }
        else
            {
                    JOptionPane.showMessageDialog(null , "Plese insert advanced amound !");
            }
        
       
    }
    
    
  //process of new cashier
     void sendData(boolean cashier) throws Exception {

         if(advanceAmount.getText().length()>0)
         {
 
               //setting new borrowers detials to create a new borrower in databse
               String [] namePhoneNic = {CusNameForBill.getText().trim(), cusphoneForBill.getText().trim(), nic.getText().trim() , address.getText().trim() ,advanceAmount.getText()}; // getiing new borrower details

               //sending new borrower to database
               int key = connect.addNewCasher(namePhoneNic ); // storing borrrower to db

               //displaying borrower in table
               DefaultTableModel delas = (DefaultTableModel) cashiers.cTable.getModel();
               String [] newBorro = {controllers.primaryKeyOfdealsData , CusNameForBill.getText().trim(), cusphoneForBill.getText().trim(), nic.getText().trim() , address.getText().trim() ,  advanceAmount.getText().trim() , "Active"};
               delas.addRow(newBorro);

               setVisible(false);
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Please add a Password !y");
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
            java.util.logging.Logger.getLogger(newAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newAdvanced().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CusNameForBill;
    private javax.swing.JTextField address;
    private javax.swing.JTextField advanceAmount;
    private javax.swing.JButton changephoneno;
    private javax.swing.JTextField cusphoneForBill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_nic;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JButton next;
    private javax.swing.JTextField nic;
    // End of variables declaration//GEN-END:variables
}
