/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chathurangani.book.shop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dilum
 */
public class stater {

    public stater() {

            try {

                this.lock = connect.isLocked();

            } catch (Exception ex) {
                Logger.getLogger(MAIN_FRAME.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    static boolean lock;

    dbConnector connect = new dbConnector();
            public static void main(String[] args) {

                //try to runny own constructor 
                controllers call = new controllers();
                 
                if (lock == true) {
                    Adimin_login open = new Adimin_login();
                    open.setVisible(true);
                } else {
                    MAIN_FRAME open = new MAIN_FRAME();
                    open.setVisible(true);
                }

            }
}

