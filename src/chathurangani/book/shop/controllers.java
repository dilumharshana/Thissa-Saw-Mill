/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chathurangani.book.shop;

import java.math.BigDecimal;

/**
 *
 * @author Dilum
 */
public class controllers extends stater{


    
    //callin stater class constructor
    controllers()
        {
             super();
        }
    
    static String cashierName; //holding casher name
    static String primaryKeyOfdealsData; //holding primary kery after a evry deal
    static boolean QuantityTrue; // this varibale support to flow of the programme by holding a quantitiy enderd or not value
    static boolean passwordis = false; //this varibale support to flow of the programme by holding if password is exsists or not in db
    static BigDecimal borrowing , sellPrice ; // two variable sfor income amount calculation
    static boolean systemUser; // admin or cashier , when cashier login to system the value o this variable will be true . and for admin it will set false
    
    // for usage of dbconnector class;
    static String[] itemset = new String[3];
    
    public static void reset_pricedata()
        {
            sellPrice = new BigDecimal("0.0");
            
        }
    
   
}
