
package chathurangani.book.shop;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Logger.getLogger(emplyoees.class.getName()).log(Level.SEVERE, null, ex);

public class emplyoees extends javax.swing.JFrame {

    public emplyoees() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        try {
            connect.search_all_cashiers("emplyoees");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - Employees#19 !");
            connect.recod_error(ex.toString()+" - employees 19");
        }
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
        update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eTable = new javax.swing.JTable();
        cusName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deals");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

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
        newBorrower.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newBorrower.setForeground(new java.awt.Color(255, 255, 255));
        newBorrower.setText("NEW EMPLOYEE");
        newBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBorrowerActionPerformed(evt);
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
        jLabel3.setText("Employees");

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        eTable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        eTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Index", "Name", "Phone No", "NIC", "Address", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(eTable);

        cusName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cusName.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(newBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBorrower, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try {
            DefaultTableModel delas = (DefaultTableModel) eTable.getModel();

            int row = eTable.getSelectedRow();
            String primary = String.valueOf(eTable.getValueAt(row, 0));

            try {
                connect.clearBorrows(primary, 2);
                recod("Deleted "+String.valueOf(eTable.getValueAt(row, 0))+"from emplyooes"); 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong - Employees#209 !");
                connect.recod_error(ex.toString()+" - employees 209");
            }

            delas.removeRow(row);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a Cashier !");
            connect.recod_error(e.toString()+" this is not a error , employees 215");
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void newBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBorrowerActionPerformed
        try
            {
                newEmplyoee open = new newEmplyoee(false );
                open.setVisible(true);
                recod("Open new employee account creator window"); 
            }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Please select a Cashier !");
                connect.recod_error(e.toString()+" this is not a error , employees 230");
            }
    }//GEN-LAST:event_newBorrowerActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            DefaultTableModel delas = (DefaultTableModel) eTable.getModel();
            int row = eTable.getSelectedRow();

            String pk = String.valueOf(delas.getValueAt(row, 0));
            String name = String.valueOf(delas.getValueAt(row, 1));
            String tp = String.valueOf(delas.getValueAt(row, 2));
            String nice = String.valueOf(delas.getValueAt(row, 3));
            String address = String.valueOf(delas.getValueAt(row, 4));
            String salary = String.valueOf(delas.getValueAt(row, 5));

            UpdateBorrowers open = new UpdateBorrowers(pk, name, tp, nice, address, salary , 2);
            open.setVisible(true);
            recod("Opend employee data updator window for employee -"+name); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a Employee !");
            connect.recod_error(e.toString()+" this is not a error , employees 251");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void eTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTableMouseClicked

        DefaultTableModel borrower = (DefaultTableModel) eTable.getModel(); // BORROWER PANEL BORRWER DATA SHOWIG TABLE 
        int borrowerRow = eTable.getSelectedRow();
        cusName.setText(eTable.getValueAt(borrowerRow, 1).toString());
        recod("Selected "+eTable.getValueAt(borrowerRow, 1).toString()+"from employees"); 
        update.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_eTableMouseClicked

     void recod(String activity)
        {
            //cheking if this admin or cashier
            if(controllers.systemUser == true)
                {
                try 
                {
                    connect.recoder(activity);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Your storage may be running out - Employees#275 !");
                        connect.recod_error(ex.toString()+" - employees 275");
                    }
                }
        }
     
    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String lenth = searchBar.getText().trim();
        if (lenth.length() == 0) {
            clearTable();
            try {
                connect.search_all_cashiers("emplyoees");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong - Employees#288 !");
                connect.recod_error(ex.toString()+" - employees 288");
            }
        }
        try {
            clearTable();
            connect.search_every_cashier(lenth , "emplyoees");
            recod("Searched "+lenth+" fro employees");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - Employees#297 !");
            connect.recod_error(ex.toString()+" - employees 297");
        }
    }//GEN-LAST:event_searchBarKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String code = searchBar.getText().trim();

        try {
            clearTable();
            connect.search_every_cashier(code , "emplyoees");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong - Employees#308 !");
            connect.recod_error(ex.toString()+" - employees 308");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

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
            JOptionPane.showMessageDialog(null, "Something went wrong - Employees#336 !");
            connect.recod_error(ex.toString()+" this is not a error , employees 336");
        } 
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emplyoees().setVisible(true);
            }
        });
    }

    public static void clearTable() {
        DefaultTableModel delas = (DefaultTableModel) eTable.getModel();

        while (delas.getRowCount() > 0) {
            delas.removeRow(0);
        }
    }

    //THIS METHOD WILL ADD A NEW ROWTO J TABLE USING dealdata ARRAY WHICH IS PASSED BY Search_Every_Field METHOD
    public static void dealItemsToTable(String[] dealData) {
        DefaultTableModel delas = (DefaultTableModel) eTable.getModel();
        delas.addRow(dealData);

    }

    //btns disabling
    static void brnhandler() {
        update.setEnabled(false);
        delete.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cusName;
    private static javax.swing.JButton delete;
    public static javax.swing.JTable eTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newBorrower;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchBar;
    private static javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
