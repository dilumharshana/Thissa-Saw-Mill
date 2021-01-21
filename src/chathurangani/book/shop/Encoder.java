
package chathurangani.book.shop;

import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 
import javax.swing.JOptionPane;
/**
 *
 * @author Dilum
 */
public class Encoder {
    
     
// Java program to calculate MD5 hash value 
    
    public static String getMd5(String input) 
    { 
        try { 
  
            // Static getInstance method is called with hashing MD5 
            MessageDigest md_5 = MessageDigest.getInstance("MD5");
  
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte [] hash = md_5.digest(input.getBytes());
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, hash); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            JOptionPane.showMessageDialog(null, "Something went wrong - Encoder#41");
            dbConnector connect = new dbConnector();
            connect.recod_error(e.toString());
        } 
        return null;
    } 
  
}
    
