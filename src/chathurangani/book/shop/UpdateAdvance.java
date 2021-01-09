package chathurangani.book.shop;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UpdateAdvance extends javax.swing.JFrame {

    /**
     * Creates new form stock_item_display
     */
    
    boolean whichPanel = true; //true for borrower update anf false for cashier update
    
    public UpdateAdvance(String code, String nameis, String tp, String nicis , String addressis , String advance) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ok.png")));//setting windowicon
        name.setText(nameis);
        contact.setText(tp);
        nic.setText(nicis);
        address.setText(addressis);
        advanceBox.setText(advance);

        name.setEditable(false);
        contact.setEditable(false);
        nic.setEditable(false);
        address.setEditable(false);

        nameUpdate.setEnabled(false);
        contactUpdate.setEnabled(false);
        nicUpdate.setEnabled(false);
        addressUpdate.setEnabled(false);
        passupdate.setEnabled(false);
        

        this.primarykeyofdata = code;
    }
    
    dbConnector connect = new dbConnector();

    String primarykeyofdata;
    String WhatIsCondition;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panel_name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        CloseUpdatePannel = new javax.swing.JButton();
        nameedit = new javax.swing.JButton();
        nameUpdate = new javax.swing.JButton();
        conditionedit = new javax.swing.JButton();
        contactUpdate = new javax.swing.JButton();
        cpriceedit = new javax.swing.JButton();
        nicUpdate = new javax.swing.JButton();
        contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        addressUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_password = new javax.swing.JLabel();
        advanceBox = new javax.swing.JTextField();
        passedit = new javax.swing.JButton();
        passupdate = new javax.swing.JButton();

        jTextField9.setText("jTextField1");

        jTextField10.setText("jTextField1");

        jButton6.setText("jButton2");

        jButton8.setText("jButton2");

        jButton19.setText("jButton19");

        setTitle("Item Viewer");
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        panel_name.setBackground(new java.awt.Color(255, 255, 255));
        panel_name.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        panel_name.setForeground(new java.awt.Color(0, 0, 0));
        panel_name.setText("Advance Payments Update");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("NAME");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Contact");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nic");

        name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        nic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nic.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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

        CloseUpdatePannel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CloseUpdatePannel.setText("CLOSE  PANNEL");
        CloseUpdatePannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseUpdatePannelActionPerformed(evt);
            }
        });

        nameedit.setBackground(new java.awt.Color(255, 0, 0));
        nameedit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nameedit.setForeground(new java.awt.Color(255, 255, 255));
        nameedit.setText("Edit");
        nameedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameeditActionPerformed(evt);
            }
        });

        nameUpdate.setBackground(new java.awt.Color(0, 153, 204));
        nameUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameUpdate.setText("UPDATE");
        nameUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameUpdateActionPerformed(evt);
            }
        });

        conditionedit.setBackground(new java.awt.Color(255, 0, 0));
        conditionedit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        conditionedit.setForeground(new java.awt.Color(255, 255, 255));
        conditionedit.setText("Edit");
        conditionedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditioneditActionPerformed(evt);
            }
        });

        contactUpdate.setBackground(new java.awt.Color(0, 153, 204));
        contactUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contactUpdate.setText("UPDATE");
        contactUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactUpdateActionPerformed(evt);
            }
        });

        cpriceedit.setBackground(new java.awt.Color(255, 0, 0));
        cpriceedit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cpriceedit.setForeground(new java.awt.Color(255, 255, 255));
        cpriceedit.setText("Edit");
        cpriceedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpriceeditActionPerformed(evt);
            }
        });

        nicUpdate.setBackground(new java.awt.Color(0, 153, 204));
        nicUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nicUpdate.setText("UPDATE");
        nicUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicUpdateActionPerformed(evt);
            }
        });
        nicUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nicUpdateKeyPressed(evt);
            }
        });

        contact.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Address");

        address.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressKeyReleased(evt);
            }
        });

        addressUpdate.setBackground(new java.awt.Color(0, 153, 204));
        addressUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addressUpdate.setText("UPDATE");
        addressUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressUpdateActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbl_password.setBackground(new java.awt.Color(255, 255, 255));
        lbl_password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(0, 0, 0));
        lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_password.setText("Advance");

        advanceBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        advanceBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                advanceBoxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                advanceBoxKeyTyped(evt);
            }
        });

        passedit.setBackground(new java.awt.Color(255, 0, 0));
        passedit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passedit.setForeground(new java.awt.Color(255, 255, 255));
        passedit.setText("Edit");
        passedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passeditActionPerformed(evt);
            }
        });

        passupdate.setBackground(new java.awt.Color(0, 153, 204));
        passupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passupdate.setText("UPDATE");
        passupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CloseUpdatePannel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panel_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_password)
                                            .addComponent(jLabel5))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(conditionedit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nameedit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(cpriceedit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nicUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(contactUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(advanceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passedit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name)
                    .addComponent(nameedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(contact)
                        .addComponent(contactUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(conditionedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cpriceedit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nicUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(advanceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passedit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(CloseUpdatePannel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseUpdatePannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseUpdatePannelActionPerformed
        try {
                    advanced.clearTable();
                    connect.search_all_advanced();
                    advanced.brnhandler();
        } catch (Exception ex) {
            Logger.getLogger(UpdateAdvance.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);

    }//GEN-LAST:event_CloseUpdatePannelActionPerformed

    private void nameeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameeditActionPerformed
        name.setEditable(true);
        contact.setEditable(false);
        nic.setEditable(false);
        address.setEditable(false);

        nameUpdate.setEnabled(false);
        nicUpdate.setEnabled(false);
        addressUpdate.setEnabled(false);
    }//GEN-LAST:event_nameeditActionPerformed

    private void conditioneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditioneditActionPerformed
        name.setEditable(false);
        contact.setEditable(true);
        nic.setEditable(false);
        address.setEditable(false);

        nameUpdate.setEnabled(false);
        nicUpdate.setEnabled(false);
        addressUpdate.setEnabled(false);
    }//GEN-LAST:event_conditioneditActionPerformed

    private void cpriceeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpriceeditActionPerformed
        name.setEditable(false);
        contact.setEditable(false);
        nic.setEditable(true);
        address.setEditable(false);

        nameUpdate.setEnabled(false);
        contactUpdate.setEnabled(false);
        addressUpdate.setEnabled(false);
    }//GEN-LAST:event_cpriceeditActionPerformed

    private void nicUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicUpdateActionPerformed

        try {

              connect.updateAdvanceData("nic", nic.getText().trim(), primarykeyofdata);

        } catch (Exception ex) {
            System.out.println(ex);
        }


        nicUpdate.setEnabled(false);
        nic.setEditable(false);

    }//GEN-LAST:event_nicUpdateActionPerformed

    private void nameUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameUpdateActionPerformed
        try {

              connect.updateAdvanceData("name", name.getText().trim(), primarykeyofdata);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        nameUpdate.setEnabled(false);
        name.setEditable(false);
    }//GEN-LAST:event_nameUpdateActionPerformed

    private void contactUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUpdateActionPerformed
        
        
        try {

              connect.updateAdvanceData("phone", contact.getText().trim(), primarykeyofdata);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        contact.setEditable(false);
        contactUpdate.setEnabled(false);
    }//GEN-LAST:event_contactUpdateActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        char character = evt.getKeyChar();
        String lenth = name.getText();

        if (lenth.length() == 100) {
            evt.consume();
        }

        if ((Character.isLetter(character)) || Character.isWhitespace(character) || Character.isISOControl(character) && lenth.length() > 1) {
            name.setEnabled(true);
            nameUpdate.setEnabled(true);
        } else {
            evt.consume();
            nameUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_nameKeyTyped

    private void nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyTyped
        char character = evt.getKeyChar();

        if(nic.getText().length()==12)
            {
                evt.consume();
            }
        
        if((Character.isDigit(character)) || (Character.isISOControl(character)) ||  (character==KeyEvent.VK_V ))
        {
            nic.setEditable(true);
        }
       else
        {
            evt.consume();
        }
    }//GEN-LAST:event_nicKeyTyped

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        String lenth = name.getText();

        if (lenth.length() > 0) {
            nameUpdate.setEnabled(true);
        } else {
            nameUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_nameKeyReleased

    private void nicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyReleased
        String lenth = nic.getText();

        if (lenth.length() > 0) {
            nicUpdate.setEnabled(true);
        } else {
            nicUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_nicKeyReleased

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void nicUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicUpdateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicUpdateKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        name.setEditable(false);
        contact.setEditable(false);
        nic.setEditable(false);
        address.setEditable(true);

        nameUpdate.setEnabled(false);
        nicUpdate.setEnabled(false);
        nicUpdate.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void contactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyReleased
       String lenth = contact.getText();
    
        if (lenth.length() > 0) {
            contactUpdate.setEnabled(true);
        } else {
            contactUpdate.setEnabled(false);
        }
        
      
    
    }//GEN-LAST:event_contactKeyReleased

    private void addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyReleased
         String lenth = address.getText();

        if (lenth.length() > 0) {
            addressUpdate.setEnabled(true);
        } else {
            addressUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_addressKeyReleased

    private void addressUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressUpdateActionPerformed
        
        try {

              connect.updateAdvanceData("address", address.getText().trim(), primarykeyofdata);

        } catch (Exception ex) {
            System.out.println(ex);
        }


        address.setEditable(false);
        addressUpdate.setEnabled(false);
    }//GEN-LAST:event_addressUpdateActionPerformed

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyTyped
        char c = evt.getKeyChar();

        if ((Character.isDigit(c)) || (Character.isISOControl(c))) {
            contact.setEnabled(true);
        } else {
            evt.consume();
        }

        if (contact.getText().length() == 10) {
           evt.consume();
        }
    }//GEN-LAST:event_contactKeyTyped

    private void advanceBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_advanceBoxKeyReleased
        // TODO add your handling code here:
          String lenth = advanceBox.getText();

        if (lenth.length() > 0) {
            passupdate.setEnabled(true);
        } else {
            passupdate.setEnabled(false);
        }
        
    }//GEN-LAST:event_advanceBoxKeyReleased

    private void passeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passeditActionPerformed
       advanceBox.setEnabled(true);
    }//GEN-LAST:event_passeditActionPerformed

    private void passupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passupdateActionPerformed
       try {

              connect.updateAdvanceData("advanced", advanceBox.getText().trim(), primarykeyofdata);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        advanceBox.setEditable(false);
        passupdate.setEnabled(false);
    }//GEN-LAST:event_passupdateActionPerformed

    private void advanceBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_advanceBoxKeyTyped
        
        if(advanceBox.getText().length() == 20)
            {
                evt.consume();
            }
    }//GEN-LAST:event_advanceBoxKeyTyped

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
            java.util.logging.Logger.getLogger(UpdateAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UpdateAdvance("", "", "","","","").setVisible(true);
                } catch (Exception e) {

                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseUpdatePannel;
    private javax.swing.JTextField address;
    private javax.swing.JButton addressUpdate;
    private javax.swing.JTextField advanceBox;
    private javax.swing.JButton conditionedit;
    private javax.swing.JTextField contact;
    private javax.swing.JButton contactUpdate;
    private javax.swing.JButton cpriceedit;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField name;
    private javax.swing.JButton nameUpdate;
    private javax.swing.JButton nameedit;
    private javax.swing.JTextField nic;
    private javax.swing.JButton nicUpdate;
    private javax.swing.JLabel panel_name;
    private javax.swing.JButton passedit;
    private javax.swing.JButton passupdate;
    // End of variables declaration//GEN-END:variables
}