/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import javax.swing.JOptionPane;
///java.util.logging.Logger.getLogger(AddStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

public class AddStocks extends javax.swing.JFrame {

    /**
     * Creates new form AddStocks
     * @param index
     */
    
    public AddStocks(int index) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));
        
        submit.setEnabled(false);
        switch (index) 
            {
            
            case 1:

                lbl_sellprice.setVisible(false); //hide cashprice panel
                sprice.setVisible(false);
                filledChek[2]=true; //enebaling all fields filled cheking array cashprice value
                break;
            case 2:
                
                lbl_sellprice.setVisible(false);
                sprice.setVisible(false);
                filledChek[2]=true; //enebaling all fields filled cheking array cashprice value
                break;
            
            default:

            }
        

            this.index = index; //identifying which panel is this 
    }

    static boolean[] filledChek = {false, false, false, false};
    int icount = 1;
    boolean dot = false; //cheking if " . " is tyoe at one time
    dbConnector connect = new dbConnector(); //databse connection
    static int index;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        itemCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        lbl_sellprice = new javax.swing.JLabel();
        sprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        itemCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Items");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Items");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Item Code");

        itemCode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        itemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemCodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemCodeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Item Name");

        name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        lbl_sellprice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_sellprice.setText("Selling Price");

        sprice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriceActionPerformed(evt);
            }
        });
        sprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spriceKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Stock");

        stock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_sellprice, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sprice, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemCode)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemCode, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sprice)
                    .addComponent(lbl_sellprice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stock)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        submit.setBackground(new java.awt.Color(0, 255, 255));
        submit.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("ADD ITEM");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        itemCount.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        itemCount.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(itemCount, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemCount, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
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

    private void itemCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemCodeKeyReleased
        String lenth = itemCode.getText().trim();

        if (lenth.isEmpty()) {
            filledChek[0] = false;
        } else {
            filledChek[0] = true;
        }

        if (filledChek[0] == true && filledChek[1] == true && filledChek[2] == true && filledChek[3] == true) {
            submit.setEnabled(true);
        } else {
            submit.setEnabled(false);
        }
    }//GEN-LAST:event_itemCodeKeyReleased

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        String lenth = name.getText().trim();

        if (lenth.isEmpty()) {
            filledChek[1] = false;
        } else {
            filledChek[1] = true;
        }

        if (filledChek[0] == true && filledChek[1] == true && filledChek[2] == true && filledChek[3] == true ) {
            submit.setEnabled(true);
        } else {
            submit.setEnabled(false);
        }
    }//GEN-LAST:event_nameKeyReleased

    private void spriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spriceKeyReleased
        String lenth = sprice.getText().trim();

        if (lenth.isEmpty()) {
            filledChek[2] = false;
        } else {
            filledChek[2] = true;
        }

        if (filledChek[0] == true && filledChek[1] == true && filledChek[2] == true && filledChek[3] == true ) {
            submit.setEnabled(true);
        } else {
            submit.setEnabled(false);
        }
    }//GEN-LAST:event_spriceKeyReleased

    private void stockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyReleased
        String lenth = stock.getText().trim();

        if (lenth.isEmpty()) {
            filledChek[3] = false;
        } else {
            filledChek[3] = true;
        }
        
        if (filledChek[0] == true && filledChek[1] == true && filledChek[2] == true && filledChek[3] == true ) {
            submit.setEnabled(true);
        } else {
            submit.setEnabled(false);
        }
    }//GEN-LAST:event_stockKeyReleased

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped

        String lenth = name.getText().trim();

        if (lenth.length() == 100) {
            evt.consume();
        }

    }//GEN-LAST:event_nameKeyTyped
    
    private void spriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spriceKeyTyped
        String lenth = sprice.getText().trim();
        char charactor = evt.getKeyChar();

       if (lenth.length() == 16) 
           {
              evt.consume();
           }

           // IF DOT HAS TYPED THIS PART WILL BW RUN
        if(dot == false)
            {
                            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) || charactor == KeyEvent.VK_PERIOD)
                            {
                               sprice.setEditable(true);
                                
                            } else {
                                
                               evt.consume();
                            }
                             
            }
        
        else
            {
   // IF DOT DOES NOT HAS TYPED THIS PART WILL RUN
                            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) )
                                {
                                    if(lenth.length() == lenth.indexOf(".")+3)
                                        {
                                         evt.consume();
                                        }
                                }
                            else
                                {
                                       evt.consume();
                                }
            }
   
  
    //CHAKING IF ALREADY " . " IN TEXT BOX
        if(!lenth.contains("."))
            {
                dot=false;
                
            }
     
    //MAKE dot VARIABLE TRUE IF USER PRESSED " . "
        if(charactor == KeyEvent.VK_PERIOD)
            {
                dot = true;
           }

    
    }//GEN-LAST:event_spriceKeyTyped

    private void stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyTyped
        String lenth = stock.getText().trim();
        char charactor = evt.getKeyChar();

        if (lenth.length() == 8) {
            evt.consume();
        }

        if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor))) {
            stock.setEditable(true);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_stockKeyTyped

    private void itemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemCodeKeyPressed
        String lenth = itemCode.getText().trim();

        if (lenth.isEmpty()) {
            filledChek[0] = false;
        } else {
            filledChek[0] = true;
        }

        if (filledChek[0] == true && filledChek[1] == true && filledChek[2] == true && filledChek[3]) {
            submit.setEnabled(true);
        } else {
            submit.setEnabled(false);
        }
    }//GEN-LAST:event_itemCodeKeyPressed

    @SuppressWarnings("empty-statement")
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        String[] itemData = new String[3];
        BigDecimal[] prices = new BigDecimal[1];
        
         switch (index) 
            {
             case 0:
                 
                            try {
                                itemData[0] = itemCode.getText().trim();
                                itemData[1] = name.getText().trim();
                                itemData[2] = stock.getText().trim();

                                prices[0] = new BigDecimal(String.valueOf(sprice.getText().trim()));

                                //creating object of database controlling class
                                //calling newItemToBase methos in dbConnector class
                                connect.newItemToBase(itemData, prices);
                                recod("Aded "+itemData[1]+" to stocks");
                                //notifing by lable
                                itemCount.setText(icount + " Items Added !");
                                icount++;
                                
                                //setting default values to text filef filled cheker array
                                filledChek[0]=false;
                                filledChek[1]=false;
                                filledChek[2]=false;
                                filledChek[3]=false;
                                
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Please select another ITEM CODE , This Item Code is already in your stocks !", "Same Item Code Found ",JOptionPane.WARNING_MESSAGE);
                                //setting default values to text filef filled cheker array
                                filledChek[0]=false;
                                filledChek[1]=false;
                                filledChek[2]=false;
                                filledChek[3]=false;
                                connect.recod_error(e.toString()+"this is duplicate primary key error");
                            }

                            catch(Exception e)
                            {
                                JOptionPane.showMessageDialog(null, "Enter valid data !");
                                //setting default values to text filef filled cheker array
                                filledChek[0]=false;
                                filledChek[1]=false;
                                filledChek[2]=false;
                                filledChek[3]=false;
                                connect.recod_error(e.toString());
                                
                            }

                            break;
                
            case 1:
                
                        try {
                            itemData[0] = itemCode.getText().trim();
                            itemData[1] = name.getText().trim();
                            itemData[2] = stock.getText().trim();

                            //creating object of database controlling class
                            //calling newItemToBase methos in dbConnector class
                            connect.timber_ItemToBase(itemData, index);

                            //notifing by lable
                            itemCount.setText(icount + " Items Added !");
                            icount++;

                        //setting default values to text filef filled cheker array
                        filledChek[0]=false;
                        filledChek[1]=false;
                        filledChek[3]=false;
                        
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "Please select another ITEM CODE , This Item Code is already in your stocks !", "Same Item Code Found ",JOptionPane.WARNING_MESSAGE);
                            //setting default values to text filef filled cheker array
                            filledChek[0]=false;
                            filledChek[1]=false;
                            filledChek[3]=false;
                            connect.recod_error(e.toString());
                        }

                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, "Enter valid data !");
                            //setting default values to text filef filled cheker array
                            filledChek[0]=false;
                            filledChek[1]=false;
                            filledChek[3]=false;
                            connect.recod_error(e.toString());
                        }

                        break;

            case 2:
                
                        try {
                            itemData[0] = itemCode.getText().trim();
                            itemData[1] = name.getText().trim();
                            itemData[2] = stock.getText().trim();

                            //creating object of database controlling class
                            //calling newItemToBase methos in dbConnector class
                            connect.timber_ItemToBase(itemData, index);

                            //notifing by lable
                            itemCount.setText(icount + " Items Added !");
                            icount++;
                            
                           //setting default values to text filef filled cheker array
                            filledChek[0]=false;
                            filledChek[1]=false;
                            filledChek[3]=false;

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "Please select another ITEM CODE , This Item Code is already in your stocks !", "Same Item Code Found ",JOptionPane.WARNING_MESSAGE);
                            //setting default values to text filef filled cheker array
                            filledChek[0]=false;
                            filledChek[1]=false;
                            filledChek[3]=false;
                            connect.recod_error(e.toString());
                        }

                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, "Enter valid data !");
                            //setting default values to text filef filled cheker array
                            filledChek[0]=false;
                            filledChek[1]=false;
                            filledChek[3]=false;
                            connect.recod_error(e.toString());
                        }

                        break;
            
            default:
                //nothing
            }
         
        itemCode.setText(" ");
        name.setText(" ");
        sprice.setText(" ");
        stock.setText(" ");
        
        try {
            connect.stockItemsShowAll();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Restart your Computer -AddStocks#584");
            connect.recod_error(ex.toString());
        }
        submit.setEnabled(false);
        

    }//GEN-LAST:event_submitActionPerformed

    private void spriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spriceActionPerformed

    private void itemCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemCodeKeyTyped
        if(itemCode.getText().length()==16)
            {
                evt.consume();
            }
    }//GEN-LAST:event_itemCodeKeyTyped

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
            JOptionPane.showMessageDialog(null, "Restart your Computer -AddStocks#584");
            dbConnector connect = new dbConnector();
            connect.recod_error(ex.toString());
            
        } 
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStocks(index).setVisible(true);
            }
        });
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
                         JOptionPane.showMessageDialog(null, "Your stocks may be running out - AddStocks#644");
                         connect.recod_error(ex.toString()+"- AddStocks#644");
                    }
                }
        }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField itemCode;
    private javax.swing.JLabel itemCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_sellprice;
    private javax.swing.JTextField name;
    private javax.swing.JTextField sprice;
    private javax.swing.JTextField stock;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
