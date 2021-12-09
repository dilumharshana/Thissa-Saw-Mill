package chathurangani.book.shop;

import java.awt.Toolkit;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
//Logger.getLogger(borrowers.class.getName()).log(Level.SEVERE, null, ex);

public class borrowers extends javax.swing.JFrame {

    public borrowers() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        try {
            connect.search_all_deals();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#18");
            connect.recod_error(ex.toString()+" - borrowers 18");
        }

        history.setEnabled(false);
        update.setEnabled(false);
        updateFromBill.setEnabled(false);
        payment.setEnabled(false);
        delete.setEnabled(false);
    }

    dbConnector connect = new dbConnector();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        newBorrower = new javax.swing.JButton();
        updateFromBill = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dealTable = new javax.swing.JTable();
        cusName = new javax.swing.JLabel();
        history = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deals");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        search.setBackground(new java.awt.Color(255, 0, 0));
        search.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH ");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(153, 255, 153));
        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        newBorrower.setBackground(new java.awt.Color(153, 0, 255));
        newBorrower.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        newBorrower.setForeground(new java.awt.Color(255, 255, 255));
        newBorrower.setText("NEW DEBTOR");
        newBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBorrowerActionPerformed(evt);
            }
        });

        updateFromBill.setBackground(new java.awt.Color(255, 0, 0));
        updateFromBill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        updateFromBill.setForeground(new java.awt.Color(255, 255, 255));
        updateFromBill.setText("UPDATE FROM BILL");
        updateFromBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFromBillActionPerformed(evt);
            }
        });

        payment.setBackground(new java.awt.Color(0, 153, 204));
        payment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        payment.setForeground(new java.awt.Color(255, 255, 255));
        payment.setText("PAY");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(153, 255, 153));
        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DEBTORS");

        dealTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dealTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Deal No", "Customer", "Phone No", "NIC", "Address", "Bill Amount", "Discounted", "Date "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dealTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dealTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dealTable);

        cusName.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        cusName.setForeground(new java.awt.Color(255, 255, 255));

        history.setBackground(new java.awt.Color(204, 255, 204));
        history.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        history.setForeground(new java.awt.Color(0, 0, 0));
        history.setText("HISTORY");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateFromBill, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(newBorrower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateFromBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

  String[] option = {"YES , DELETE THIS DEBTOR ACCOUNT " , "NO NOT NOW"};
       
        int choice  = JOptionPane.showOptionDialog(null,"ARE YOU SURE TO DELETE THIS DEBTOR ACCOUNT ? ", "SALES MANAGER.." , JOptionPane.INFORMATION_MESSAGE ,JOptionPane.PLAIN_MESSAGE,null,option,option[0] );
        
        if( choice == 0)
            {  
        
                try {
                    saveDB(); //creating a database backup
                    DefaultTableModel delas = (DefaultTableModel) dealTable.getModel();

                    int row = dealTable.getSelectedRow();
                    String primary = String.valueOf(dealTable.getValueAt(row, 0));

                    try {
                        connect.clearBorrows(primary, 0);
                        recod("Deleted "+dealTable.getValueAt(row, 1).toString()+" from debtros when due amount was Rs. "+dealTable.getValueAt(row, 5).toString());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#249");
                        connect.recod_error(ex.toString()+" - borrowers 249");
                    }

                    delas.removeRow(row);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please select a Borrower !");
                    connect.recod_error(e.toString()+" this is not a error , borrowers 255");
                }
            }
    }//GEN-LAST:event_deleteActionPerformed

    private void newBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBorrowerActionPerformed
        BillOwner open = new BillOwner();
        open.setVisible(true);
        recod("Opend New Debtor window");
    }//GEN-LAST:event_newBorrowerActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            DefaultTableModel delas = (DefaultTableModel) dealTable.getModel();
            int row = dealTable.getSelectedRow();

            String pk = String.valueOf(delas.getValueAt(row, 0));
            String name = String.valueOf(delas.getValueAt(row, 1));
            String tp = String.valueOf(delas.getValueAt(row, 2));
            String nice = String.valueOf(delas.getValueAt(row, 3));
            String address = String.valueOf(delas.getValueAt(row, 4));

            UpdateBorrowers open = new UpdateBorrowers(pk, name, tp, nice, address);
            open.setVisible(true);
            recod("Opend Debtors pDetails Update window");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a Borrower !");
            connect.recod_error(e.toString()+" this is not a error  - borrowers 282");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void updateFromBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFromBillActionPerformed

        try {
            if (!(MAIN_FRAME.staticTotal.getText().trim()).equals("")) {
                DefaultTableModel borrower = (DefaultTableModel) dealTable.getModel(); // BORROWER PANEL BORRWER DATA SHOWIG TABLE 

                int borrowerRow = dealTable.getSelectedRow();
                int rowcount = MAIN_FRAME.selltable.getRowCount();

                if (rowcount > 0) {
                    BigDecimal totalGet = new BigDecimal(MAIN_FRAME.total.getText()); //getting total bill amount from main frame jlable
                    BigDecimal discountGet = new BigDecimal(MAIN_FRAME.discAmount.getText().trim());//getting discount amount from main frame jlable

                    //calling to storeBorrowDealsDataIntoBase in dbconnector class to stor borrow deal data in to database
                    //taking exsists borrowers current due amount from database
                    BigDecimal[] current_value = connect.borrow_amount_Upater(String.valueOf(borrower.getValueAt(borrowerRow, 0)));

                    // adding new total amount and discount amounts to exsisting total and discount values
                    BigDecimal[] values = {current_value[0].add(discountGet), current_value[1].add(totalGet)};

                    //storing new updated discount and total values in to database
                    connect.storeBorrowDealsDataIntoBase(values, String.valueOf(dealTable.getValueAt(borrowerRow, 0)));


                    // loop for send each borrow item to database frim MAiN FRAME panel
                    for (int i = 0; i < rowcount; i++) {
                        String cheker = String.valueOf(MAIN_FRAME.selltable.getValueAt(i, 0));

                        if (!cheker.equals("")) {
                            
                            String pk, code, name, quantity, priceget;
                            BigDecimal price, totalis;
                                    
                                                pk = dealTable.getValueAt(borrowerRow,0).toString(); //primarykey
                                                code = MAIN_FRAME.selltable.getValueAt(i, 0).toString();//itemcode
                                                name = MAIN_FRAME.selltable.getValueAt(i, 1).toString();//item name
                                                priceget = MAIN_FRAME.selltable.getValueAt(i, 2).toString();
                                                quantity = MAIN_FRAME.selltable.getValueAt(i, 3).toString();
                                                totalis = new BigDecimal(MAIN_FRAME.selltable.getValueAt(i, 4).toString());
                                                price = new BigDecimal(priceget);

                            //store item details in to databse
                            connect.storeCashDealItemsIntoDataBase(pk, code, name, price, quantity, totalGet , java.time.LocalDate.now().toString());
                            
                              //income date databse handling
                            try {
                                
                                    //cheking is date avaible()
                                    boolean dateAvailability = connect.passdate(String.valueOf(java.time.LocalDate.now()) , false);

                                    //if date is not exsit in database then create new row for the date either update exsising dat row
                                    if (dateAvailability == true) {
                                        // adding new sellprice amount to prevois cashprice and sell price amount
                                        //new  sell price amounts are holded in controller class sellPrice variables
                                        BigDecimal updated_sellPrice = new BigDecimal(MAIN_FRAME.total.getText().trim()).add(controllers.sellPrice);
                                        connect.incomedataUpdater( String.valueOf(updated_sellPrice), "borrowing", String.valueOf(java.time.LocalDate.now()));
                                    } else {
                                        connect.Strore_incomedata( MAIN_FRAME.total.getText(), "borrowing",  String.valueOf(java.time.LocalDate.now()));
                                    }
                                    
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#349");
                                 connect.recod_error(ex.toString()+" - borrowers 349");
                            }

                            //decreasing stock of out items
                            int stock = connect.searchItemStock(code); //cheking for current stock
                            if (stock > 0) {

                                if (stock > Integer.valueOf(quantity)) {
                                    stock = stock - Integer.parseInt(quantity); //updatin stock
                                    connect.updateStockitems("stocks","stock", String.valueOf(stock), code);
                                      boolean out = connect.stockout();

                                                if(out == true)
                                                    {   
                                                           MAIN_FRAME.bell.setVisible(true);
                                                    }
                                                else
                                                    {
                                                            MAIN_FRAME.bell.setVisible(false);
                                                    }
                                } else // if customer buys items more than in stock it automaticly set stocl items to 0.
                                {
                                    connect.updateStockitems("stocks","stock", String.valueOf(0), code);
                                    JOptionPane.showMessageDialog(null, " Done !");
                                }

                            }
                        }
                    }

                    //refreing borrower window to show new updated data as wel
                    invoice(dealTable.getValueAt(borrowerRow,0).toString());
                    cusName.setText("");
                    connect.search_all_deals();

                    //reseting MAIN FRAME window
                    recod("Aded new Rs. "+MAIN_FRAME.total.getText()+" to "+borrower.getValueAt(borrowerRow, 0).toString()+" account");
                    MAIN_FRAME.refreshWindow();
                    JOptionPane.showMessageDialog(null, " Item added to debtor successfully !");

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#392");
            connect.recod_error(e.toString()+" - borrowers 392");
           // Logger.getLogger(borrowers.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_updateFromBillActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed

        try {
            int borrowerRow = dealTable.getSelectedRow();

            BigDecimal amount = new BigDecimal(dealTable.getValueAt(borrowerRow, 5).toString());
            String name = dealTable.getValueAt(borrowerRow, 1).toString();
            String code = dealTable.getValueAt(borrowerRow, 0).toString();

            loanPay open = new loanPay(amount, name, code);
            open.setVisible(true);
             recod("Opened Debtor payment window");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a Borrower !");
            connect.recod_error(e.toString()+" this is not a error , borrowers 409");
        }
    }//GEN-LAST:event_paymentActionPerformed

    private void dealTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dealTableMouseClicked

        try
            {
                DefaultTableModel borrower = (DefaultTableModel) dealTable.getModel(); // BORROWER PANEL BORRWER DATA SHOWIG TABLE 
                int borrowerRow = dealTable.getSelectedRow();
                cusName.setText(dealTable.getValueAt(borrowerRow, 1).toString());

                history.setEnabled(true);
                update.setEnabled(true);
                updateFromBill.setEnabled(true);
                payment.setEnabled(true);
                delete.setEnabled(true);
            }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#431");
                connect.recod_error(e.toString()+" - borrowers 431");
            }
    }//GEN-LAST:event_dealTableMouseClicked

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String lenth = searchBar.getText().trim();
        if (lenth.length() == 0) {
            clearTable();
            try {
                connect.search_all_deals();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#443");
                connect.recod_error(ex.toString()+" - borrowers 443");
            }
        }
        try {
            clearTable();
            connect.search_every_field(lenth);
            recod("Searched for "+lenth);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#452");
           connect.recod_error(ex.toString()+" - borrowers 452");
        }
    }//GEN-LAST:event_searchBarKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String code = searchBar.getText().trim();

        try {
            clearTable();
            connect.search_every_field(code);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#464");
            connect.recod_error(ex.toString()+" - borrowers 464");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
             try {
                    DefaultTableModel getRow = (DefaultTableModel) dealTable.getModel();
                    int row = dealTable.getSelectedRow();

                    String primary = (String) getRow.getValueAt(row, 0);
                    String customer = (String) getRow.getValueAt(row, 1);

                    paymentHistory open = new paymentHistory(primary, customer);
                    open.setVisible(true);
                    recod("Opend Debtors payment History window");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a Borrower !");
            connect.recod_error(e.toString()+" this is not a error , borrowers 480");
        }
    }//GEN-LAST:event_historyActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         System.gc();
    }//GEN-LAST:event_formWindowClosing

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
            JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#18");
            connect.recod_error(ex.toString());
        } 
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrowers().setVisible(true);
            }
        });
    }

    public static void clearTable() {
        DefaultTableModel delas = (DefaultTableModel) dealTable.getModel();

        while (delas.getRowCount() > 0) {
            delas.removeRow(0);
        }
    }
    
    
      //bill recipt printing process
    void invoice(String pk)
        {
          try
            {   //generating bill by jasper report
                Connection con = connect.getConnection();
                HashMap map = new HashMap();
                map.put( "billNo" , pk); 
                JasperDesign pdf  = null;
                  try
                        {
                            pdf = JRXmlLoader.load("C:\\ProgramData\\bill\\debtors.jrxml");
                        }
                  catch(Exception e)
                        {
                            pdf = JRXmlLoader.load("C:\\ProgramData\\bill2\\debtors.jrxml");
                            JOptionPane.showMessageDialog(null,"Your fills have been deleted please restore files !");
                        }
                JasperReport bill = JasperCompileManager.compileReport(pdf);
                JasperPrint print = JasperFillManager.fillReport(bill,map,con);
                JasperPrintManager.printReport(print, false);
               //JasperViewer.viewReport(print);
                
            }
          catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "Sorry some thing went wrong ! - Main_Frame#893!");
              connect.recod_error(e.toString()+" Main Frame 893");
              // Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    //THIS METHOD WILL ADD A NEW ROWTO J TABLE USING dealdata ARRAY WHICH IS PASSED BY Search_Every_Field METHOD
    public static void dealItemsToTable(String[] dealData) {
        DefaultTableModel delas = (DefaultTableModel) dealTable.getModel();
        delas.addRow(dealData);

    }

    //btns disabling
    static void brnhandler() {
        history.setEnabled(false);
        update.setEnabled(false);
        updateFromBill.setEnabled(false);
        payment.setEnabled(false);
        delete.setEnabled(true);
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
                       JOptionPane.showMessageDialog(null, "Something went wrong - Borrowers#551");
                       connect.recod_error(ex.toString()+" - borrowers 551");     
                    }
                }
        }
    
   
   //database backup  
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cusName;
    public static javax.swing.JTable dealTable;
    private static javax.swing.JButton delete;
    private static javax.swing.JButton history;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newBorrower;
    private static javax.swing.JButton payment;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchBar;
    private static javax.swing.JButton update;
    private static javax.swing.JButton updateFromBill;
    // End of variables declaration//GEN-END:variables
}
