package chathurangani.book.shop;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//java.util.logging.Logger.getLogger(outgoing.class.getName()).log(java.util.logging.Level.SEVERE, null, e);

/**
 *
 * @author Dilum
 */
public class cashOuts_resons extends javax.swing.JFrame {

    /**
     * Creates new form BillOwner
     */
    public cashOuts_resons() {
        initComponents();
    }

    public cashOuts_resons(String cash, String Reson , String pk) {
        initComponents();
        next.setText("UPDATE");
        this.pk = pk;
        updater = true;
        
        cashAmount.setText(cash);
        reson.setText(Reson);
        
        cashAmount.setEnabled(false);
        reson.setEnabled(false);
    }

    // update or new adding decision holder
    boolean updater = false;
    String pk = "";
    static boolean dot = false;//for get notified wen working with floating points

    dbConnector connect = new dbConnector();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cashAmount = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        phoneerrorprint = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reson = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Name & Phone Number ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        cashAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cashAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashAmountMouseClicked(evt);
            }
        });
        cashAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashAmountActionPerformed(evt);
            }
        });
        cashAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cashAmountKeyTyped(evt);
            }
        });

        next.setBackground(new java.awt.Color(0, 153, 204));
        next.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        next.setText("ADD");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        phoneerrorprint.setBackground(new java.awt.Color(255, 255, 255));
        phoneerrorprint.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        phoneerrorprint.setForeground(new java.awt.Color(255, 255, 255));
        phoneerrorprint.setText("Reson : ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cash Amount : ");

        reson.setColumns(20);
        reson.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        reson.setRows(5);
        reson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resonMouseClicked(evt);
            }
        });
        reson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                resonKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(reson);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneerrorprint, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cashAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneerrorprint, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cashAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashAmountActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        try {
            DefaultTableModel cashOut = (DefaultTableModel) outgoing.cashOuts.getModel();

            if (cashAmount.getText().length() > 0 && reson.getText().length() > 2) {

                if (updater == false) {
    
                        //sending new out going recod to databse
                        int code = connect.Strore_outGoingdata(String.valueOf(new BigDecimal(cashAmount.getText())), reson.getText(), String.valueOf(java.time.LocalDate.now()));

                        String[] dataList = {String.valueOf(code), String.valueOf(new BigDecimal(cashAmount.getText())), reson.getText(), String.valueOf(java.time.LocalDate.now())};
                        cashOut.addRow(dataList);

                        //refreshing table
                        outgoing.clearTable();
                        connect.search_all_outgoing(java.time.LocalDate.now().toString());
                        
                        recod("Aded new cash out going recod");
                    
                } //update panel
                else 
                {
                        //updating cashamount
                        int Updatecode = connect.updateAdvanceData("outgoing" , "outgoing" , String.valueOf(new BigDecimal(cashAmount.getText())) , pk);
                       
                        //updating reson
                        int code = connect.updateAdvanceData("outgoing" , "reson" , reson.getText() , pk);
                        JOptionPane.showMessageDialog(null, "Cash Out updated successfully !");
                        
                        String[] dataList = {String.valueOf(Updatecode), String.valueOf(new BigDecimal(cashAmount.getText())), reson.getText(), String.valueOf(java.time.LocalDate.now())};
                        cashOut.addRow(dataList);
                        //refreshing table
                        recod("Updated exsiting cash out going recod");
                        outgoing.clearTable();
                        connect.search_all_outgoing(java.time.LocalDate.now().toString());
                }
                    
                dispose(); //closing window
            } 
            else {
                JOptionPane.showMessageDialog(null, "Insufficient data enterd !");
            }

            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong - cashOut_reson#226");
            connect.recod_error(e.toString()+" - cashout resons 226");
        }
    }//GEN-LAST:event_nextActionPerformed

    private void cashAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashAmountKeyTyped
        String lenth = cashAmount.getText().trim();
        char charactor = evt.getKeyChar();

        if (lenth.length() == 16) {
            evt.consume();
        }

        // IF DOT HAS TYPED THIS PART WILL BW RUN
        if (dot == false) {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) || charactor == KeyEvent.VK_PERIOD) {
                cashAmount.setEditable(true);

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


    }//GEN-LAST:event_cashAmountKeyTyped

    private void cashAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashAmountKeyReleased

    }//GEN-LAST:event_cashAmountKeyReleased

    private void resonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resonKeyTyped

        if (reson.getText().trim().length() == 249) {
            evt.consume();
        }
    }//GEN-LAST:event_resonKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cashAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashAmountMouseClicked
                
        cashAmount.setEnabled(true);
    }//GEN-LAST:event_cashAmountMouseClicked

    private void resonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resonMouseClicked
               reson.setEnabled(true);
    }//GEN-LAST:event_resonMouseClicked
    
     void recod(String activity)
        {
            //cheking if this admin or cashier
            if(controllers.systemUser == true)
                {
                try 
                {
                    connect.recoder(activity);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Something went wrong - cashOut_reson#308");
                        connect.recod_error(ex.toString()+" - cashout resons 308");
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
        
        dbConnector connect = new dbConnector();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - cashOut_reson#332");
            connect.recod_error(ex.toString()+" - cashout resons 332");
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashOuts_resons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cashAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JLabel phoneerrorprint;
    private javax.swing.JTextArea reson;
    // End of variables declaration//GEN-END:variables
}
