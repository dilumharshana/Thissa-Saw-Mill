/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dilum
 */
public class loanPay extends javax.swing.JFrame {

    /**
     * Creates new form loanPay
     */
    public loanPay( BigDecimal total , String Name , String code) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        this.total.setText(total.toString());
        this.name.setText(Name);
        this.pk=code;
        this.due = total;
    }

    boolean dot = false;
    static String pk;
    static BigDecimal due;
    
    dbConnector connect = new dbConnector();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        payAmount = new javax.swing.JTextField();
        pay = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Debt Payments");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Payment :");

        total.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Due Amount :");

        payment.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        payment.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Balance :");

        balance.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        balance.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Rs .");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Rs .");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rs .");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4)
                    .addContainerGap(366, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGap(119, 119, 119)))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Payment :");

        payAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        payAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payAmountKeyTyped(evt);
            }
        });

        pay.setBackground(new java.awt.Color(0, 153, 0));
        pay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setText("PAY");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAdd.setBackground(new java.awt.Color(255, 204, 255));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(payAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(payAmount))
                .addGap(31, 31, 31)
                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void payAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payAmountKeyTyped
        String lenth = payAmount.getText().trim();
        char charactor = evt.getKeyChar();

        if (lenth.length() == 16) {
            evt.consume();
        }
        
        
        // IF DOT HAS TYPED THIS PART WILL BW RUN
        if (dot == false) {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) || charactor == KeyEvent.VK_PERIOD) {
                payAmount.setEditable(true);

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

//        if (charactor == KeyEvent.VK_ENTER) {
//
//            if(!lenth.equals(""))
//                {
//                try {
//                    paymentAmountProcess();
//                } catch (Exception ex) {
//                    Logger.getLogger(loanPay.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                }
//        }
    }//GEN-LAST:event_payAmountKeyTyped

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
       
        try {
                if(Integer.parseInt(payment.getText()) > 0)
                    {
                        paymentAmountProcess();
                    }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong - LoanPay#335 !");
                connect.recod_error(ex.toString()+" - loan pay 335");      
        }
        
        
    }//GEN-LAST:event_payActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if(!payAmount.getText().trim().equals(""))
                {
                        try {
                                
                            try
                                {
                                    payment.setText(payAmount.getText());
                                }
                            catch(Exception e)
                                {
                                    payment.setText(String.valueOf(new BigDecimal(payAmount.getText().trim())));
                                    JOptionPane.showMessageDialog(null, "Something went wrong - Employees#354 !");
                                    // connect.recod_error(e.toString()+" this is not a error , loan pay 354");
                                }
                                
                                BigDecimal cash = new BigDecimal(payAmount.getText().trim());
                                int decision = cash.compareTo(due); //big decimal value comparison  payment & dueAmount

                                switch (decision) {
                                    case 0:

                                        total.setText( "0.0");
                                        balance.setText("0.0");
                                        payAmount.setText("");

                                        break;

                                    case 1:

                                        balance.setText(cash.subtract(due).toString());
                                        total.setText( "0.0");
                                        payAmount.setText("");

                                        break;

                                    case -1:

                                        total.setText(due.subtract(cash).toString());
                                        
                                        balance.setText("0.0");

                                        break;

                                    default:

                                        break;
                      }
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Something went wrong - LoanPay#391 !");
                                 connect.recod_error(ex.toString()+" - loan pay 391");
                            }
                        
                        recod(" Enterd "+payAmount.getText()+" in to debtor payment box and cheked");//recoding actities
                }
        payAmount.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    void paymentAmountProcess() throws Exception
        {
             BigDecimal cash = new BigDecimal("0.0");
             
             try
                {
                    cash = new BigDecimal(payment.getText().trim());
                }
             catch(Exception e)
                {
                    cash = new BigDecimal("0.0");
                    //connect.recod_error(e.toString()+"this is not a error ,  loan pay 410");         
                }
              
       
       int decision = cash.compareTo(due); //big decimal value comparison  payment & due  
       
        switch (decision) {
            case 0: //if payment == due amount
                
                connect.paymentServer(pk , due , cash , new BigDecimal(total.getText()) , String.valueOf(java.time.LocalDate.now()));
                recod(name+" Paid Rs. "+cash);//recoding actities
                due = new BigDecimal(total.getText());
                        
                total.setText( due.toString() );
                payment.setText("0.0");
                balance.setText("0.0");
                payAmount.setText("");
                
                connect.borrow_payment_process(due,pk);
                connect.search_all_deals();// reloading borrower window
                JOptionPane.showMessageDialog(null,"Done !");
                payAmount.setText("");
                           
                System.gc();
                dispose();
                
                break;
                
            case 1: //if payment > due amount
                connect.paymentServer(pk , due , due , new BigDecimal(total.getText()) , String.valueOf(java.time.LocalDate.now()));
                recod(name+" Paid Rs. "+due);//recoding actities
                due = new BigDecimal(total.getText());
                
                payment.setText("0.0");
                balance.setText(cash.subtract(new BigDecimal( total.getText())).toString());
                total.setText( "0.0");
                payAmount.setText("");
                
                connect.borrow_payment_process(due,pk);
                connect.search_all_deals();// reloading borrower window
                JOptionPane.showMessageDialog(null,"Paymen completed borrower deleted successfully !");
                payAmount.setText("");
                
                System.gc();
                dispose();
                
                break;
                
            case -1: //if payment < due amount
                
                connect.paymentServer(pk , due , cash , new BigDecimal(total.getText()) , String.valueOf(java.time.LocalDate.now()));
                recod(name+" Paid Rs. "+cash);//recoding actities
                connect.borrow_payment_process(new BigDecimal( total.getText().trim()) , pk); //updating due amount of borrower
                connect.search_all_deals();// reloading borrower window
                JOptionPane.showMessageDialog(null,"Paymen Ok !");
                payAmount.setText("");
                
                System.gc();
                dispose();
                
                break;
                
            default:
                break;
         }
             
             //income date databse handling
                            try {
                                
                                    //cheking is date avaible()
                                    boolean dateAvailability = connect.passdate(String.valueOf(java.time.LocalDate.now()) , true);

                                    //if date is not exsit in database then create new row for the date either update exsising dat row
                                    if (dateAvailability == true) {
                                        // adding new sellprice amount to prevois cashprice and sell price amount
                                        //new  sell price amounts are holded in controller class sellPrice variables
                                        BigDecimal updated_sellPrice = (new BigDecimal(payment.getText().trim()).subtract(new BigDecimal(balance.getText().trim()))).add(controllers.sellPrice);
                                        connect.incomedataUpdater( String.valueOf(updated_sellPrice), "sellIncome", String.valueOf(java.time.LocalDate.now()));
                                    } else {
                                        connect.Strore_incomedata(String.valueOf(new BigDecimal(payment.getText().trim()).subtract(new BigDecimal(balance.getText().trim()))) , "sellIncome",  String.valueOf(java.time.LocalDate.now()));
                                    }

                                    
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Something went wrong - LoanPay#495 !");
                                connect.recod_error(ex.toString()+" - loan pay 495");
                            }
             
                            invoice();
    }

    //bill recipt printing process
    void invoice()
        {
          try
            {   //generating bill by jasper report
                Connection con = connect.getConnection();
                HashMap map = new HashMap();
                map.put( "borrower" , java.time.LocalDate.now().toString()); 
                JasperDesign pdf  = null;
                    try
                        {
                            pdf = JRXmlLoader.load("C:\\ProgramData\\bill\\lendPay.jrxml");
                        }
                    catch(Exception e)
                        {
                            pdf = JRXmlLoader.load("C:\\ProgramData\\bill2\\lendPay.jrxml");
                            JOptionPane.showMessageDialog(null,"Your fills have been deleted please restore files !");
                        }
                JasperReport bill = JasperCompileManager.compileReport(pdf);
                JasperPrint print = JasperFillManager.fillReport(bill,map,con);
                JasperPrintManager.printReport(print, false);
               
            }
          catch(Exception e)
            {
                //Logger.getLogger(loanPay.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Something went wrong - LoanPay#531 !");
                connect.recod_error(e.toString()+" - loan pay 531");
            }
        }
    
     void recod(String activity)
        {
            //cheking if this admin or cashier
            if(controllers.systemUser == true)
                {
                try 
                {
                    connect.recoder(activity);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Your stocks may be running out - LoanPay#335 !");
                        connect.recod_error(ex.toString());
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
            JOptionPane.showMessageDialog(null, "Something went wrong - LoanPay#357 !");
            connect.recod_error(ex.toString()+" - loan pay 357");
        } 
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loanPay(new BigDecimal("0.0") , "" ,"").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JButton pay;
    private javax.swing.JTextField payAmount;
    private javax.swing.JLabel payment;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
