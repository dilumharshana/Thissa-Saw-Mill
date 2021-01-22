/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chathurangani.book.shop;

import javax.swing.JOptionPane;


/**
 *
 * @author Dilum
 */
public class stater {

    public stater() {
    }

    static boolean lock;  
            public static void main(String[] args) {
               dbConnector connect  = new dbConnector();
              try
                {
                    Adimin_login open = new Adimin_login();
                    open.setVisible(true);
                    
                }
              catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Sorry , Login Screen cant be open !");
                    connect.recod_error(e.toString()+"- stater 31");
                }

            }
}

