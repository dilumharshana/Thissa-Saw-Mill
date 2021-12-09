
package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class stocks extends javax.swing.JFrame {

    dbConnector connect = new dbConnector();

    Object stocktable;
    static int index;

    public stocks() throws ClassNotFoundException, SQLException {

        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));

        updatebtn.setEnabled(false);
        delete.setEnabled(false);

        //Displaing data to table when statrt up 
        try {
            connect.stockItemsShowAll();
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#32! ");
          connect.recod_error(ex.toString()+"- stocks 32 ");
           // Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
        }

        //formating table
      
        this.index = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        stockname = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        showAllstock = new javax.swing.JButton();
        outofstocks = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add_NewI_tem_Btn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        stockcounter = new javax.swing.JTextField();
        searchbar = new javax.swing.JTextField();
        searchForItem = new javax.swing.JButton();
        tablePane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stockitemstable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rawtable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        kempasTable = new javax.swing.JTable();

        jLabel6.setText("Item Name");

        jLabel7.setText("jLabel3");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thissa Saw Mill - Stocks");
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stockname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        stockname.setForeground(new java.awt.Color(255, 255, 0));
        stockname.setText("Tissa Saw Mill Stocks");

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
                .addComponent(stockname, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stockname, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
        stockcounter.setText("250");
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchbarKeyTyped(evt);
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

        tablePane.setBackground(new java.awt.Color(204, 0, 0));
        tablePane.setForeground(new java.awt.Color(255, 255, 255));
        tablePane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablePane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tablePaneStateChanged(evt);
            }
        });
        tablePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePaneMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stockitemstable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stockitemstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Selling Price", "Stocks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        tablePane.addTab("SELLING STOCKS", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rawtable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rawtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Stocks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rawtable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rawtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rawtableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rawtableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rawtableMouseExited(evt);
            }
        });
        jScrollPane3.setViewportView(rawtable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        tablePane.addTab("RAW STOCKS", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        kempasTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        kempasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Selling Price", "Stocks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kempasTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kempasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kempasTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kempasTableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kempasTableMouseExited(evt);
            }
        });
        jScrollPane5.setViewportView(kempasTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        tablePane.addTab("KEMPAS STOCKS", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(searchForItem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchForItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        tablePane.getAccessibleContext().setAccessibleName("selling");

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
            recod(" Refreshed all stocks ");
            sizes(stockitemstable.getColumnModel());
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#433! ");
          connect.recod_error(e.toString()+"- stocks 433 ");
        }

    }//GEN-LAST:event_showAllstockActionPerformed

    private void outofstocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outofstocksActionPerformed

        int Smallerthan;
        try { //cheking if user enters a null value !
            Smallerthan = Integer.parseInt(stockcounter.getText());

            if (Smallerthan <= 0 || String.valueOf(Smallerthan) == "") {

                switch (index) {
                    case 0: // selling timer stock
                        Smallerthan = 250;
                        stockcounter.setText("100");
                        break;

                    case 1: // row timer stock
                        Smallerthan = 200;
                        stockcounter.setText("200");
                        break;

                    case 3: //cempus stock
                        Smallerthan = 250;
                        stockcounter.setText("250");
                        break;

                    default:
                    //nothing
                    }
            }
        } catch (Exception e) {

            Smallerthan = 200;
            stockcounter.setText("200");
            //connect.recod_error(e.toString()+" this is not a error ,  stocks 472 ");
        }

        try {
            connect.searchForStockOutItems(Smallerthan, index);
            recod(" Searched for stock out items less than - "+Smallerthan);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#479! ");
            connect.recod_error(ex.toString()+"- stocks 479 ");
            //Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_outofstocksActionPerformed

    private void searchForItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchForItemActionPerformed

        //calling searchbar process method
        searchBarProcess();
    }//GEN-LAST:event_searchForItemActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

        //disabaling delete btn to avoid errors
        delete.setEnabled(false);
  
          switch (index)
                {
                
                case 0:

                          if (!stockitemstable.getValueAt(stockitemstable.getSelectedRow(), 0).equals("")) {

                            try {
                                String[] items = new String[4];
                                for (int i = 0; i < 4; i++) {

                                    items[i] = String.valueOf(stockitemstable.getValueAt(stockitemstable.getSelectedRow(), i));
                                }

                                stock_item_display updateitemSet = new stock_item_display(items[0], items[1], items[2], items[3], "stocks");
                                updateitemSet.setVisible(true);
                                updatebtn.setEnabled(false);
                                recod("Opend Selling Stocks Items Update window");
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Please select an item to Update !");
                                updatebtn.setEnabled(false);

                                //connect.recod_error(e.toString()+" this is not a error ,  stocks 519 ");
                                //Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, e);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please select a valid row !");
                        }
                        clearTable();
                        break;
                case 1:
                    
                        if (!rawtable.getValueAt(rawtable.getSelectedRow(), 0).equals("")) {

                            try {
                                String[] items = new String[3];
                                for (int i = 0; i < 3; i++) {

                                    items[i] = String.valueOf(rawtable.getValueAt(rawtable.getSelectedRow(), i));
                                }

                                stock_item_display updateitemSet = new stock_item_display(items[0], items[1], items[2], "raw_stocks");
                                updateitemSet.setVisible(true);
                                updatebtn.setEnabled(false);
                                recod("Opend Raw Stocks Items Update window");
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Please select an item to Update !");
                                updatebtn.setEnabled(false);
                                
                                // connect.recod_error(e.toString()+" this is not a error , stocks 546 ");
                                //Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, e);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please select a valid row !");
                        }
                        
                        clearTable_raw();
                        break;
                                
                case 2:
                    
                       if (!kempasTable.getValueAt(kempasTable.getSelectedRow(), 0).equals("")) {

                            try {
                                String[] items = new String[4];
                                for (int i = 0; i < 4; i++) {

                                    items[i] = String.valueOf(kempasTable.getValueAt(kempasTable.getSelectedRow(), i));
                                }

                                stock_item_display updateitemSet = new stock_item_display(items[0], items[1], items[2], items[3], "stocks");
                                updateitemSet.setVisible(true);
                                updatebtn.setEnabled(false);
                                recod("Opend Kempas Stocks Items Update window");
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Please select an item to Update !");
                                updatebtn.setEnabled(false);

                                connect.recod_error(e.toString()+"- stocks 575 ");
                               // Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, e);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please select a valid row !");
                        }
                       
                        clear_kempasTable();
                        break;
                
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

    private void add_NewI_tem_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_NewI_tem_BtnActionPerformed
        AddStocks add_item = new AddStocks(index);
        add_item.setVisible(true);
        recod("Opend Stocks Add New Item window");
    }//GEN-LAST:event_add_NewI_tem_BtnActionPerformed

    private void searchbarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyPressed


    }//GEN-LAST:event_searchbarKeyPressed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        searchbar.setText("");
        updatebtn.setEnabled(false);
        delete.setEnabled(false);

        try {
            connect.stockItemsShowAll();
            recod("Refresed stock window");
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#623! ");
          connect.recod_error(e.toString()+"- stocks 623 ");
        }


    }//GEN-LAST:event_refreshActionPerformed

    int whichRow; // for delete btn action perfomr table choosing purpose
    DefaultTableModel table_is = null;
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        //disabaling updte btn to avoid errors
        updatebtn.setEnabled(false);

        String tablename = ""; // database tablename

        switch (index) {
            case 0:
                table_is = (DefaultTableModel) stockitemstable.getModel(); //selecting table model
                whichRow = stockitemstable.getSelectedRow(); // main stock items displyng table
                tablename = "stocks";
                break;

            case 1:
                table_is = (DefaultTableModel) rawtable.getModel(); //selecting table model
                whichRow = rawtable.getSelectedRow(); // raw stock table
                tablename = "raw_stocks";
                break;

            case 3:
                table_is = (DefaultTableModel) kempasTable.getModel(); //selecting table model
                whichRow = kempasTable.getSelectedRow(); //kempas stock table
                tablename = "stocks";
                break;

            default:
            //nothing
            }

        if (!stockitemstable.getValueAt(whichRow, 0).equals("")) {

            try {
                int deleteok = JOptionPane.showConfirmDialog(null, "Are you sure to delete this item from the stocks");

                if (deleteok == 0) {
                    //calling to delete method
                    connect.deleteData(table_is.getValueAt(whichRow, 0).toString(), tablename);
                    recod("Deleted "+table_is.getValueAt(whichRow, 1).toString()+" from "+tablename);

                    //refreshing the table
                    clearTable();
                    connect.stockItemsShowAll();
                }

            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#679! ");
               connect.recod_error(ex.toString()+"- stocks 679 ");
               // Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
            }

            delete.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Please select an item to Remove !");
            delete.setEnabled(false);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchbarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyReleased
        searchBarProcess();
        recod("Searched for "+searchbar.getText()+" in stocks");
    }//GEN-LAST:event_searchbarKeyReleased

    private void searchbarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyTyped

        int lenth = searchbar.getText().length();
        char space = evt.getKeyChar();

        if (lenth == 0 && space == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_searchbarKeyTyped

    private void tablePaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePaneMouseClicked

    }//GEN-LAST:event_tablePaneMouseClicked

    private void tablePaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tablePaneStateChanged
        int count = tablePane.getSelectedIndex();
        searchbar.setText("");

        switch (count) {
            case 0: // selling timer stock
            index = 0;
            stockname.setText(" Selling Stocks");
            stockcounter.setText("250");

            showAllstock.setVisible(true);
            stockcounter.setVisible(true);
            outofstocks.setVisible(true);
            add_NewI_tem_Btn.setVisible(true);

            searchbar.setEnabled(true);
            searchForItem.setEnabled(true);
            sizes(stockitemstable.getColumnModel());

            break;

            case 1: // row timer stock
            index = 1;
            stockname.setText(" Raw Stocks");
            stockcounter.setText("200");

            showAllstock.setVisible(true);
            stockcounter.setVisible(true);
            outofstocks.setVisible(true);
            add_NewI_tem_Btn.setVisible(true);

            searchbar.setEnabled(true);
            searchForItem.setEnabled(true);
            
                TableColumnModel size = (rawtable.getColumnModel());
                size.getColumn(0).setPreferredWidth(40);
                size.getColumn(1).setPreferredWidth(300);
                size.getColumn(2).setPreferredWidth(150);

            break;


            case 3: //cempus stock
            index = 3;
            stockname.setText(" Kempas Stocks");
            stockcounter.setText("250");

            //these btns are not nessery to cempus stock
            showAllstock.setVisible(false);
            stockcounter.setVisible(false);
            outofstocks.setVisible(false);
            add_NewI_tem_Btn.setVisible(false);

            searchbar.setEnabled(false);
            searchForItem.setEnabled(false);
            sizes(kempasTable.getColumnModel());
            break;

            default:
            //nothing
        }
    }//GEN-LAST:event_tablePaneStateChanged

    private void kempasTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kempasTableMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_kempasTableMouseExited

    private void kempasTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kempasTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_kempasTableMouseEntered

    private void kempasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kempasTableMouseClicked
        //enabling btns of upating and deleting
        updatebtn.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_kempasTableMouseClicked

    private void rawtableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rawtableMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_rawtableMouseExited

    private void rawtableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rawtableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_rawtableMouseEntered

    private void rawtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rawtableMouseClicked
        //enabling btns of upating and deleting
        updatebtn.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_rawtableMouseClicked

    private void stockitemstableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockitemstableMouseExited

    }//GEN-LAST:event_stockitemstableMouseExited

    private void stockitemstableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockitemstableMouseEntered

    }//GEN-LAST:event_stockitemstableMouseEntered

    private void stockitemstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockitemstableMouseClicked
        updatebtn.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_stockitemstableMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.gc();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            dbConnector connect = new dbConnector();
            public void run() {
                try {
                    new stocks().setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#822! ");
                    connect.recod_error(ex.toString()+"- stocks 823 ");
                    //Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void itemsToTable(String[] stockdata, int index) //INSERTING DATA IN TO STOCK TABLE BY GETTING DATA FROM stockItemsShowAll method in dbconnector class.
    {

        switch (index) {
            case 0:

                DefaultTableModel stockshow = (DefaultTableModel) stockitemstable.getModel();
                stockshow.addRow(stockdata);
                break;

            case 3:

                DefaultTableModel kempasStock = (DefaultTableModel) kempasTable.getModel();
                kempasStock.addRow(stockdata);

                break;
            //nothing

        }

    }

    public static void timerStocks_toTable(String[] stock, boolean which) // if which == true then set to raw stock if false the set data to cutting stock
    {
        if (which == true) //raw timer stock
        {
            DefaultTableModel stockshow = (DefaultTableModel) rawtable.getModel();
            stockshow.addRow(stock);
        } 
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

        while (stockshow.getRowCount() > 0) //removeing main stock table content
        {
            stockshow.removeRow(0); //main stock clearing

        }

    }

    public static void clear_kempasTable() {

        DefaultTableModel kempas_stock = (DefaultTableModel) kempasTable.getModel();

        while (kempas_stock.getRowCount() > 0) //removeing main stock table content
        {
            kempas_stock.removeRow(0); //main stock clearing

        }

    }

    public static void clearTable_raw() // raw timber table clear
    {
        DefaultTableModel rawstock = (DefaultTableModel) rawtable.getModel();

        while (rawstock.getRowCount() > 0) //removeing raw timber stock table content
        {
            rawstock.removeRow(0);
        }
    }


    //seacr bar process
    void searchBarProcess() {

        switch (index) {

            case 0: // main stock panel

                clearTable();

                if (searchbar.getText().length() == 0) {
                    try {
                        connect.stockItemsShowAll();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#921 ");
                        connect.recod_error(ex.toString()+"- stocks 32 ");
                       // Logger.getLogger(borrowers.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    updatebtn.setEnabled(false);
                    delete.setEnabled(false);
                    String item = searchbar.getText().trim();
                    try {
                        connect.searchIteminStock(item);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#932! ");
                        connect.recod_error(ex.toString()+"- stocks 932 ");
                        //Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                break;

            case 1://raw stocks panel

                clearTable_raw();

                if (searchbar.getText().length() == 0) {
                    try {
                        connect.stockItemsShowAll();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#948! ");
                        connect.recod_error(ex.toString()+"- stocks 948 ");
                        //Logger.getLogger(borrowers.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    updatebtn.setEnabled(false);
                    delete.setEnabled(false);
                    String item = searchbar.getText().trim();
                    try {
                        connect.search_row_IteminStock(item);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#958! ");
                        connect.recod_error(ex.toString()+"- stocks 960 ");
                       // Logger.getLogger(stocks.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

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
                        JOptionPane.showMessageDialog(null, " Something went wrong - Stocks#979! ");
                        connect.recod_error(ex.toString()+"- stocks 979 ");
                        //Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
        
        void sizes(TableColumnModel size)
            {
                size.getColumn(0).setPreferredWidth(40);
                size.getColumn(1).setPreferredWidth(300);
                size.getColumn(2).setPreferredWidth(150);
                size.getColumn(3).setPreferredWidth(150);
            }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_NewI_tem_Btn;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTable kempasTable;
    private javax.swing.JButton outofstocks;
    public static javax.swing.JTable rawtable;
    public javax.swing.JButton refresh;
    private javax.swing.JButton searchForItem;
    private static javax.swing.JTextField searchbar;
    private javax.swing.JButton showAllstock;
    private javax.swing.JTextField stockcounter;
    public static javax.swing.JTable stockitemstable;
    private javax.swing.JLabel stockname;
    private javax.swing.JTabbedPane tablePane;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
