package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class stocks extends javax.swing.JFrame {

    dbConnector connect = new dbConnector();

    Object stocktable;

    public stocks() throws ClassNotFoundException, SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        updatebtn.setEnabled(false);
        delete.setEnabled(false);
       
    //Displaing data to table when statrt up 
        try {
            connect.stockItemsShowAll();
        } catch (Exception ex) {
            Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stockitemstable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        showAllstock = new javax.swing.JButton();
        outofstocks = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add_NewI_tem_Btn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        stockcounter = new javax.swing.JTextField();
        searchbar = new javax.swing.JTextField();
        searchForItem = new javax.swing.JButton();

        jLabel6.setText("Item Name");

        jLabel7.setText("jLabel3");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mangala Motors - Stocks");
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHATHURANGANI BOOK SHOP STOCKS");

        refresh.setBackground(new java.awt.Color(51, 51, 51));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_package/images/unnamed.png"))); // NOI18N
        refresh.setBorder(null);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stockitemstable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stockitemstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Cash Price", "Selling Price", "Stocks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockitemstable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockitemstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockitemstableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockitemstableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockitemstableMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(stockitemstable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showAllstock.setBackground(new java.awt.Color(0, 153, 0));
        showAllstock.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        showAllstock.setForeground(new java.awt.Color(255, 255, 255));
        showAllstock.setText("SHOW ALL");
        showAllstock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showAllstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllstockActionPerformed(evt);
            }
        });
        jPanel3.add(showAllstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 50));

        outofstocks.setBackground(new java.awt.Color(255, 0, 0));
        outofstocks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        outofstocks.setForeground(new java.awt.Color(255, 255, 255));
        outofstocks.setText("OUT OF STOCKS");
        outofstocks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        outofstocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outofstocksActionPerformed(evt);
            }
        });
        jPanel3.add(outofstocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 170, 50));

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE ");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 120, 50));

        add_NewI_tem_Btn.setBackground(new java.awt.Color(0, 153, 255));
        add_NewI_tem_Btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add_NewI_tem_Btn.setForeground(new java.awt.Color(255, 255, 255));
        add_NewI_tem_Btn.setText("ADD NEW ITEMS");
        add_NewI_tem_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_NewI_tem_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_NewI_tem_BtnActionPerformed(evt);
            }
        });
        jPanel3.add(add_NewI_tem_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 210, 50));

        updatebtn.setBackground(new java.awt.Color(102, 102, 255));
        updatebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("VIEW AND UPDATE");
        updatebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 190, 50));

        stockcounter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stockcounter.setText("20");
        stockcounter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        stockcounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockcounterActionPerformed(evt);
            }
        });
        stockcounter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockcounterKeyTyped(evt);
            }
        });
        jPanel3.add(stockcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 80, 50));

        searchbar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarActionPerformed(evt);
            }
        });
        searchbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchbarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbarKeyReleased(evt);
            }
        });

        searchForItem.setBackground(new java.awt.Color(255, 0, 0));
        searchForItem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        searchForItem.setForeground(new java.awt.Color(255, 255, 255));
        searchForItem.setText("SEARCH");
        searchForItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchForItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchForItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(searchForItem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchForItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbarActionPerformed

    private void showAllstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllstockActionPerformed
        //celar current contetnt in table
        clearTable();
        updatebtn.setEnabled(false);
        delete.setEnabled(false);

        try {
            connect.stockItemsShowAll();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_showAllstockActionPerformed

    private void outofstocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outofstocksActionPerformed
        DefaultTableModel stockshow = (DefaultTableModel) stockitemstable.getModel();
        int Smallerthan;
        try { //cheking if user enters a null value !
            Smallerthan = Integer.parseInt(stockcounter.getText());

            if (Smallerthan == 0 || String.valueOf(Smallerthan) == "") {
                Smallerthan = 20;
                stockcounter.setText("20");
            }
        } catch (Exception e) {

            Smallerthan = 20;
            stockcounter.setText("20");
        }

        clearTable();

        try {
            connect.searchForStockOutItems(Smallerthan);
        } catch (Exception ex) {
            Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_outofstocksActionPerformed

    private void searchForItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchForItemActionPerformed
        
        //calling searchbar process method
        searchBarProcess();
    }//GEN-LAST:event_searchForItemActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

         //disabaling delete btn to avoid errors
        delete.setEnabled(false);
        
        int whichRow = stockitemstable.getSelectedRow();
        System.out.println(whichRow);

        if (!stockitemstable.getValueAt(whichRow, 0).equals("")) {

            try {
                String[] items = new String[5];
                for (int i = 0; i < 5; i++) {
                    items[i] = String.valueOf(stockitemstable.getValueAt(whichRow, i));
                }

                stock_item_display updateitemSet = new stock_item_display(items[0], items[1], items[2], items[3], items[4]);
                updateitemSet.setVisible(true);
                updatebtn.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please select an item to Update !");
                updatebtn.setEnabled(false);     
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid row !");
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void stockcounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockcounterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockcounterActionPerformed

    private void stockcounterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockcounterKeyTyped
        char charactertyped = evt.getKeyChar();
        if (!(Character.isDigit(charactertyped)) || (charactertyped == KeyEvent.VK_BACK_SPACE) || (charactertyped == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_stockcounterKeyTyped

    private void stockitemstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockitemstableMouseClicked
        updatebtn.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_stockitemstableMouseClicked

    private void stockitemstableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockitemstableMouseExited

    }//GEN-LAST:event_stockitemstableMouseExited

    private void add_NewI_tem_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_NewI_tem_BtnActionPerformed
        AddStocks add_item = new AddStocks();
        add_item.setVisible(true);
    }//GEN-LAST:event_add_NewI_tem_BtnActionPerformed

    private void searchbarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyPressed

        
    }//GEN-LAST:event_searchbarKeyPressed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
         //celar current contetnt in table
        clearTable();
        updatebtn.setEnabled(false);
        delete.setEnabled(false);

        try {
            connect.stockItemsShowAll();
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }//GEN-LAST:event_refreshActionPerformed

    private void stockitemstableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockitemstableMouseEntered

    }//GEN-LAST:event_stockitemstableMouseEntered

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
        //disabaling updte btn to avoid errors
        updatebtn.setEnabled(false);
        
        int whichRow = stockitemstable.getSelectedRow();
        
        if (!stockitemstable.getValueAt(whichRow, 0).equals(""))
            { 
        
                try {
                    int deleteok = JOptionPane.showConfirmDialog(null , "Are you sure to delete this item from the stocks");
                    
                    if(deleteok == 0)
                        {
                             //calling to delete method
                            connect.deleteData(stockitemstable.getValueAt(whichRow , 0).toString());

                            //refreshing the table
                            clearTable();
                            connect.stockItemsShowAll();
                        }

                } catch (Exception ex) {
                    Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
                }

                delete.setEnabled(false);
            }
        else
            {
                 JOptionPane.showMessageDialog(null, "Please select an item to Remove !");
                 delete.setEnabled(false);
            }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchbarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyReleased
       searchBarProcess();
    }//GEN-LAST:event_searchbarKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new stocks().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void itemsToTable(String[] stockdata) //INSERTING DATA IN TO STOCK TABLE BY GETTING DATA FROM stockItemsShowAll method in dbconnector class.
    {

        DefaultTableModel stockshow = (DefaultTableModel) stockitemstable.getModel();
        stockshow.addRow(stockdata);
    }

    public static void setItemsToTable(String[] stockdata) {

        DefaultTableModel stockshow = (DefaultTableModel) stockitemstable.getModel();
        stockshow.addRow(stockdata);
    }

    public static void searchItemsFromStock(String[] stockdata) {

        DefaultTableModel stockshow = (DefaultTableModel) stockitemstable.getModel();
        stockshow.addRow(stockdata);
    }

    public static void clearTable() {
        DefaultTableModel stockshow = (DefaultTableModel) stockitemstable.getModel();
        while (stockshow.getRowCount() > 0) //removeing current table content
        {
            stockshow.removeRow(0);
        }
        
    }

    //seacr bar process
    void searchBarProcess() {
        clearTable();
        updatebtn.setEnabled(false);
        delete.setEnabled(false);
        String item = searchbar.getText().trim();
        try {
            connect.searchIteminStock(item);
        } catch (Exception ex) {
            Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_NewI_tem_Btn;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton outofstocks;
    public javax.swing.JButton refresh;
    private javax.swing.JButton searchForItem;
    private static javax.swing.JTextField searchbar;
    private javax.swing.JButton showAllstock;
    private javax.swing.JTextField stockcounter;
    public static javax.swing.JTable stockitemstable;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
