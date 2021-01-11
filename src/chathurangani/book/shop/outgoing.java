package chathurangani.book.shop;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class outgoing extends javax.swing.JFrame {

    /**
     * Creates new form Deal_Item_History
     */
 
 String primaryKey;
 dbConnector connect = new dbConnector();


 public outgoing( ) {
           
                initComponents();
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
                this.dateDisplay.setText("> "+java.time.LocalDate.now().toString());
            
                try {
                    connect.search_all_outgoing(java.time.LocalDate.now().toString()); //parsing current date
                } catch (Exception ex) {
                    Logger.getLogger(outgoing.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dateDisplay = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        cashTable = new javax.swing.JScrollPane();
        cashOuts = new javax.swing.JTable();
        add1 = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        dateBox = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deal History");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        dateDisplay.setBackground(new java.awt.Color(0, 0, 0));
        dateDisplay.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        dateDisplay.setForeground(new java.awt.Color(0, 0, 0));

        add.setText("DELETE");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        cashOuts.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cashOuts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Deal Code", "Cash Amount", "Reson", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cashTable.setViewportView(cashOuts);

        add1.setText("UPDATE");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        add2.setText("ADD NEW");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        dateBox.setForeground(new java.awt.Color(255, 0, 0));
        dateBox.setDateFormatString("yyyy-MM-dd");
        dateBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dateBoxAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        dateBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateBoxPropertyChange(evt);
            }
        });
        dateBox.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                dateBoxVetoableChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashTable, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cashTable, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        DefaultTableModel delas = (DefaultTableModel) cashOuts.getModel();
        int row = cashOuts.getSelectedRow();
        try {
            connect.clearOutGoing(String.valueOf(delas.getValueAt(row,0)));
            delas.removeRow(row);
        } catch (Exception ex) {
            Logger.getLogger(outgoing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
         try
            {
                DefaultTableModel delas = (DefaultTableModel) cashOuts.getModel();
                int row = cashOuts.getSelectedRow();
                
                cashOuts_resons open = new cashOuts_resons(delas.getValueAt(row, 1).toString() , delas.getValueAt(row, 2).toString() , delas.getValueAt(row, 0).toString());
                open.setVisible(true);
            }
        catch(Exception e)
            {
            
            }
    }//GEN-LAST:event_add1ActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
       
        try
            {
                cashOuts_resons open = new cashOuts_resons();
                open.setVisible(true);
            }
        catch(Exception e)
            {
            
            }
    }//GEN-LAST:event_add2ActionPerformed

    private void dateBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dateBoxAncestorAdded
       
    }//GEN-LAST:event_dateBoxAncestorAdded

    private void dateBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateBoxPropertyChange
     String date = "";
        try {  
          DateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");

            date = d1.format(dateBox.getDate());

             dateDisplay.setText("> "+date);
             clearTable();
             connect.search_all_outgoing(date);
             
         } catch (Exception ex) {
             date = java.time.LocalDate.now().toString();
         }
    }//GEN-LAST:event_dateBoxPropertyChange

    private void dateBoxVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_dateBoxVetoableChange

    }//GEN-LAST:event_dateBoxVetoableChange

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
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(outgoing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new outgoing().setVisible(true);
        });
    }
    
     public static void dealItemsToTable(String [] dealData)
        {
            DefaultTableModel delas = (DefaultTableModel) cashOuts.getModel();
            delas.addRow(dealData);
        
        }
     
     public static void clearTable()
     {
            DefaultTableModel delas = (DefaultTableModel) cashOuts.getModel();
            while(cashOuts.getRowCount() >0 )
                {
                    delas.removeRow(0);
                }
     }
     
      //THIS METHOD WILL ADD A NEW ROWTO J TABLE USING dealdata ARRAY WHICH IS PASSED BY Search_Every_Field METHOD
    public static void cashouts_ToTable(String [] dealData)
        {
            DefaultTableModel delas = (DefaultTableModel) cashOuts.getModel();
            delas.addRow(dealData);
        
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    public static javax.swing.JTable cashOuts;
    private static javax.swing.JScrollPane cashTable;
    private com.toedter.calendar.JDateChooser dateBox;
    private javax.swing.JLabel dateDisplay;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
