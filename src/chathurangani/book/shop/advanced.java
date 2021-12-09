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
import net.sf.jasperreports.view.JasperViewer;
///Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);

public class advanced extends javax.swing.JFrame {

    public advanced() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        try {
            connect.search_all_advanced();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - advanced#18");
            connect.recod_error(ex.toString()+" - advanced 18");
        }
        
        viewItem.setEnabled(false);
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
        viewItem = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        newBorrower = new javax.swing.JButton();
        updateFromBill = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        advancedTable = new javax.swing.JTable();
        cusName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deals");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        viewItem.setBackground(new java.awt.Color(153, 255, 153));
        viewItem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viewItem.setForeground(new java.awt.Color(0, 0, 0));
        viewItem.setText("VIEW ITEM");
        viewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemActionPerformed(evt);
            }
        });

        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
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
        newBorrower.setText("NEW ADVANCE");
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
        jLabel3.setText("Advanced Bills");

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        advancedTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        advancedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Deal No", "Customer", "Phone No", "NIC", "Address", "Bill Amount", "Discounted", "Advance", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        advancedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                advancedTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(advancedTable);

        cusName.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        cusName.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateFromBill, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cusName, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updateFromBill, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(newBorrower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void viewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemActionPerformed
        
       try
        {
           DefaultTableModel getRow = (DefaultTableModel)advancedTable.getModel();
            int row = advancedTable.getSelectedRow();

            String primary = (String)getRow.getValueAt(row,0);
            String customer = (String)getRow.getValueAt(row,1);

            advancedItems open = new advancedItems(primary , customer);
            recod("Opend "+customer+" Advanced items");

            open.setVisible(true);
        }
        catch(Exception e)
              {
                 JOptionPane.showMessageDialog(null , "Please select a Advance !");
                 connect.recod_error(e.toString()+" this is not a error, advanced 18");
              }
        
    }//GEN-LAST:event_viewItemActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

  String[] option = {"YES , DELETE THIS ADVANCED ACCOUNT " , "NO NOT NOW"};
       
        int choice  = JOptionPane.showOptionDialog(null,"ARE YOU SURE TO DELETE THIS ADVANCED ACCOUNT ? ", "SALES MANAGER.." , JOptionPane.INFORMATION_MESSAGE ,JOptionPane.PLAIN_MESSAGE,null,option,option[0] );
        
        if( choice == 0)
            {        
                try
                 {
                      saveDB(); //creating backup of db
                     
                      DefaultTableModel delas = (DefaultTableModel) advancedTable.getModel();

                         int row = advancedTable.getSelectedRow();
                         String primary = String.valueOf(advancedTable.getValueAt(row , 0));

                         try {
                             connect.clearAdvanced(primary);
                             recod("Deleted "+advancedTable.getValueAt( row ,1).toString()+" Advanced account when bill amount was "+advancedTable.getValueAt( row ,5).toString()+"and advanced amount was "+advancedTable.getValueAt( row ,7).toString());
                         } catch (Exception ex) {
                             JOptionPane.showMessageDialog(null, "Something went wrong - advanced#287");
                             connect.recod_error(ex.toString()+" - advanced 287");
                         }

                          delas.removeRow(row);

                 }
                catch(Exception e)
                   {
                      JOptionPane.showMessageDialog(null , "Please select a Advance !");
                      connect.recod_error(e.toString()+" this is not a error , advanced 297");
                   }
            }
                   
    }//GEN-LAST:event_deleteActionPerformed

    private void newBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBorrowerActionPerformed
        try
            {
                    newAdvanced open = new newAdvanced();
                    open.setVisible(true);
                    recod("Opend new advanced bill crating window ");
             }
         catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Sorry unable to open New Advanced Account - advanced#311");
                connect.recod_error(e.toString()+" - advanced 312");
            }
    }//GEN-LAST:event_newBorrowerActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try
            {
                DefaultTableModel delas = (DefaultTableModel) advancedTable.getModel();
                int row = advancedTable.getSelectedRow();

                String pk = String.valueOf(delas.getValueAt(row, 0));
                String name = String.valueOf(delas.getValueAt(row, 1));
                String tp = String.valueOf(delas.getValueAt(row, 2));
                String nice = String.valueOf(delas.getValueAt(row, 3));
                String address = String.valueOf(delas.getValueAt(row, 4));
                String advance = String.valueOf(delas.getValueAt(row, 7));

                UpdateAdvance open = new UpdateAdvance( pk , name ,tp ,nice , address , advance);
                open.setVisible(true);
                recod("Opend Advanced deal updator window for the customer "+name);
            }
         catch(Exception e)
              {
                 JOptionPane.showMessageDialog(null , "Please select a Advance !");
                 connect.recod_error(e.toString()+" this is not a error , advanced 336");
              }
    }//GEN-LAST:event_updateActionPerformed

    private void updateFromBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFromBillActionPerformed
      
       String[] option = {"YES , UPDATE THIS ACCOUNT FROM THE BILL " , "NO NOT NOW"};
       
        int choice  = JOptionPane.showOptionDialog(null,"DO YOU WANT UPDATE THIS ACCOUNT FROM THE BILL ? ", "SALES MANAGER.." , JOptionPane.INFORMATION_MESSAGE ,JOptionPane.PLAIN_MESSAGE,null,option,option[0] );
        
        if( choice == 0)
            {
            boolean situation = true; // for print bill to know is this bill is for new account or existing one cuz it need to take advanced id for its procedd
                
                if(!(MAIN_FRAME.staticTotal.getText().trim()).equals(""))
                {
  
                           // DefaultTableModel itemTable = (DefaultTableModel) MAIN_FRAME.selltable.getModel(); // BILLING PANEL ITEMS TABLE
                            DefaultTableModel borrower = (DefaultTableModel) advancedTable.getModel(); // BORROWER PANEL BORRWER DATA SHOWIG TABLE 

                            int dealNo = advancedTable.getSelectedRow(); 
                            int rowcount = MAIN_FRAME.selltable.getRowCount();


                    if(rowcount>0)
                        {
                        try {
                            BigDecimal totalGet = MAIN_FRAME.statTotal; //getting total bill amount from main frame jlable
                            BigDecimal discountGet = new BigDecimal(MAIN_FRAME.discAmount.getText().trim());//getting discount amount from main frame jlable
                            
                            //calling to storeBorrowDealsDataIntoBase in dbconnector class to stor borrow deal data in to database
                            
                            //taking exsists borrowers current due amount from database
                            BigDecimal[] current_value = connect.advanced_amount_Upater(String.valueOf(borrower.getValueAt(dealNo,0)));
                            
                            // adding new total amount and discount amounts to exsisting total and discount values
                            BigDecimal [] values = {current_value[0].add(discountGet) , current_value[1].add(totalGet)};
                            
                            //storing new updated discount and total values in to database
                             connect.store_advanced_DealsDataIntoBase(values, String.valueOf(advancedTable.getValueAt(dealNo,0)));
                            
                             //cheking if at one time if this user hasbeen update by cheking bill amount
                             int preUpdatedUser = new BigDecimal(String.valueOf(borrower.getValueAt(dealNo,5))).compareTo(new BigDecimal("0.0"));
                             if(preUpdatedUser == 0 ) //in bigdecimal cmparison 0 means equal
                                {
                                     boolean dateAvailability = connect.passdate(String.valueOf(java.time.LocalDate.now()) , true);
                            
                                        //if date is not exsit in database then create new row for the date either update exsising dat row
                                        if (dateAvailability == true) {
                                            // adding new sellprice amount to prevois  sell price amount
                                            //new sell price amounts are holded in controller class sellPrice variables
                                            BigDecimal updated_sellPrice = new BigDecimal(borrower.getValueAt(dealNo,7).toString()).add(controllers.sellPrice);
                                            connect.incomedataUpdater(String.valueOf(updated_sellPrice), "sellIncome" , String.valueOf(java.time.LocalDate.now()));
                                        } else {
                                            connect.Strore_incomedata( borrower.getValueAt(dealNo,7).toString(), "sellIncome" ,String.valueOf(java.time.LocalDate.now()));
                                        }
                                }
                             else
                                {
                                    situation = false;
                                }
                            
                            // loop for send each borrow item to database frim MAiN FRAME panel
                            for(int i=0; i < rowcount; i++)
                            {
                                String cheker = String.valueOf(MAIN_FRAME.selltable.getValueAt(i,0));
                                
                                if(!cheker.equals(""))
                                {
                                    String pk , code , name , quantity;
                                    BigDecimal  price , total;
                                    
                                    pk = advancedTable.getValueAt(dealNo,0).toString(); //primarykey
                                    code = MAIN_FRAME.selltable.getValueAt(i,0).toString(); //item code
                                    name = MAIN_FRAME.selltable.getValueAt(i,1).toString(); //item name
                                    price = new BigDecimal(MAIN_FRAME.selltable.getValueAt(i,2).toString());// unit prce
                                    quantity = MAIN_FRAME.selltable.getValueAt(i,3).toString(); //quantity
                                    total =new BigDecimal( MAIN_FRAME.selltable.getValueAt(i,4).toString()); //quantity
                                    
                                    //store item details in to databse
                                    connect.storeDealItemsIntoDataBase(pk,code, name, quantity, price , total);
                                    
                                    if(situation)//here situation is a boolean value which is represnt this bill is for new debtor or exixsint one.
                                        {
                                            invoice(controllers.primaryKeyOfdealsData);
                                        }
                                    else{
                                            invoice(pk);
                                        }
                                     
  
                                }
                            }
                            
                            //refreing borrower window to show new updated data as wel
                            connect.search_all_advanced();
                            
                            //reseting MAIN FRAME window
                            recod(" New Rs. "+MAIN_FRAME.staticTotal.getText()+" aded to "+String.valueOf(borrower.getValueAt(dealNo,1))+" account");
                            MAIN_FRAME.refreshWindow();
                            JOptionPane.showMessageDialog(null," Item added to Advanced successfully !");
                            
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Something went wrong - advanced#422");
                                connect.recod_error(ex.toString()+" - advanced 422");
                            }


                        }
                        }
                    else
                        {
                            JOptionPane.showMessageDialog(null , "Please create a new advanced payment account !");
                        }
            }
                
      
    }//GEN-LAST:event_updateFromBillActionPerformed
 //bill recipt printing process
    void invoice(String advanced_id)
        {
          try
            {   //generating bill by jasper report
                Connection con = connect.getConnection();
                HashMap map = new HashMap();
                map.put( "billNo" , advanced_id); 
                JasperDesign pdf  = null;
                  try
                        {
                            pdf = JRXmlLoader.load("C:\\ProgramData\\bill\\advanced.jrxml");
                        }
                  catch(Exception e)
                        {
                            pdf = JRXmlLoader.load("C:\\ProgramData\\bill2\\advanced.jrxml");
                            JOptionPane.showMessageDialog(null,"Your fills have been deleted please restore files !");
                        }
               JasperReport bill = JasperCompileManager.compileReport(pdf);
               JasperPrint print = JasperFillManager.fillReport(bill,map,con);
               JasperPrintManager.printReport(print, false);
                
            }
          catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "Sorry some thing went wrong ! - advanced#477!");
              connect.recod_error(e.toString()+" Main Frame 477");
                //Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    
    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
            
           
           if(MAIN_FRAME.selltable.getRowCount()==0) //cheking if main billing panelisempty ?
            {
                
                    int row = advancedTable.getSelectedRow(); //selected row
                  //setting customer advanced items to billing panel table
                   try
                        {
                            MAIN_FRAME.refreshWindow();
                            connect.getAdvancetems(advancedTable.getValueAt( row ,0).toString() , false);
                            recod("Took "+advancedTable.getValueAt( row ,1).toString()+" bill to billing pannel from advaced window ");
                            
                        }
                    catch(Exception e)
                        {
                           JOptionPane.showMessageDialog(null , "Please select a Advance !");
                           connect.recod_error(e.toString()+" this is not a error, advanced 454");
                        }
                   
                    //setting cash amout to billoing panel

             //subtracting advanced from total billa amount     
                    MAIN_FRAME.advanced = new BigDecimal(advancedTable.getValueAt( row ,7).toString());
                    MAIN_FRAME.staticTotal.setText("Rs. "+String.valueOf(new BigDecimal(advancedTable.getValueAt( row ,5).toString())));
                    MAIN_FRAME.statTotal = new BigDecimal(String.valueOf(new BigDecimal(advancedTable.getValueAt( row ,5).toString())));
                    MAIN_FRAME.lbl_advanced.setText(" Advanced : "+ advancedTable.getValueAt( row ,7).toString());
                    MAIN_FRAME.lbl_advanced.setVisible(true);
                    MAIN_FRAME.discLable.setVisible(true);
                    MAIN_FRAME.discAmount.setText(" Discounted : "+ advancedTable.getValueAt( row ,6).toString());
                    MAIN_FRAME.discAmount.setVisible(true);
                    MAIN_FRAME.total.setText(String.valueOf(new BigDecimal(advancedTable.getValueAt( row ,5).toString()) .subtract((new BigDecimal(advancedTable.getValueAt( row ,7).toString()).add(new BigDecimal(advancedTable.getValueAt( row ,6).toString()))))));
                    MAIN_FRAME.discAmount.setText(advancedTable.getValueAt( row ,6).toString());

                    dispose();
        }
    else
       {
           JOptionPane.showMessageDialog(null , "Main Billing Window is not empty");
       }
    }//GEN-LAST:event_paymentActionPerformed

    private void advancedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advancedTableMouseClicked
       
         int borrowerRow = advancedTable.getSelectedRow(); 
         cusName.setText(advancedTable.getValueAt(borrowerRow,1).toString());
        
        viewItem.setEnabled(true);
        update.setEnabled(true);
        updateFromBill.setEnabled(true);
        payment.setEnabled(true);
        delete.setEnabled(true);
        
        recod("Selected "+advancedTable.getValueAt(borrowerRow,1).toString()+" from Advanced deal table");
    }//GEN-LAST:event_advancedTableMouseClicked

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String lenth = searchBar.getText().trim();
        recod("Searched "+lenth+" from advanced accounts"); 
        if(lenth.length() == 0)
            {
                clearTable();
               try {
                   connect.search_all_advanced();
               } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong - advanced#503");
                   connect.recod_error(ex.toString()+" - advanced 503");     
               }
            }
          try {
            clearTable();
            connect.search_every_advanced(lenth);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - advanced#511");
            connect.recod_error(ex.toString()+" - advanced 511");
        }
    }//GEN-LAST:event_searchBarKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String code = searchBar.getText().trim();
        
        try {
            clearTable();
            connect.search_every_field(code);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - advanced#523");
            connect.recod_error(ex.toString()+" - advanced 523");
        }
    }//GEN-LAST:event_searchActionPerformed

      void recod(String activity)
        {
            //cheking if this admin or cashier
            if(controllers.systemUser == true)
                {
                try 
                {
                    connect.recoder(activity);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Something went wrong - advanced#537");
                        connect.recod_error(ex.toString()+" - advanced 537");
                    }
                }
        }
      
    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

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
             JOptionPane.showMessageDialog(null, "Something went wrong - advanced#568");
             connect.recod_error(ex.toString()+" - advanced 568");
        } 
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new advanced().setVisible(true);
            }
        });
    }
    
     public static void clearTable()
        {
            DefaultTableModel delas = (DefaultTableModel) advancedTable.getModel();
            
            while(delas.getRowCount() > 0)
                {
                    delas.removeRow(0);
                }
        }
    
    //THIS METHOD WILL ADD A NEW ROWTO J TABLE USING dealdata ARRAY WHICH IS PASSED BY Search_Every_Field METHOD
    public static void dealItemsToTable(String [] dealData)
        {
            DefaultTableModel delas = (DefaultTableModel) advancedTable.getModel();
            delas.addRow(dealData);
        
        }
    //btns disabling
    static void brnhandler()
        {
            viewItem.setEnabled(false);
            update.setEnabled(false);
            updateFromBill.setEnabled(false);
            payment.setEnabled(false);
            delete.setEnabled(true);
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
    public static javax.swing.JTable advancedTable;
    private javax.swing.JLabel cusName;
    private static javax.swing.JButton delete;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newBorrower;
    private static javax.swing.JButton payment;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchBar;
    private static javax.swing.JButton update;
    private static javax.swing.JButton updateFromBill;
    private static javax.swing.JButton viewItem;
    // End of variables declaration//GEN-END:variables
}
