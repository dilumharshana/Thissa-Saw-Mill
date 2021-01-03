/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chathurangani.book.shop;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Dilum
 */
public class printer implements Printable{



    public double bHeight;
    boolean returns = false ; //for know to pront if main billing pannel or return panel
    
    public printer(boolean returns)
        {
            this.returns = true;
        }
    
    public printer()
        {
            
        }
    
    
    public PageFormat pf(PrinterJob pj)
            {
                PageFormat pf = pj.defaultPage();
                Paper paper = pf.getPaper();
                
                double bodyHeight = bHeight;
                double header = 5.0;
                double footer = 5.0;
                double width = cm2pp(8);
                double height = cm2pp(header+bodyHeight+footer);

                paper.setSize(width , height);
                
                pf.setOrientation(PageFormat.PORTRAIT);
                pf.setPaper(paper);
                
                
                return pf;
            }
    
    public static double cm2pp(double cm)
        {
            return toPPI(cm * 0.393600787);
        }
    
    private static double toPPI(double inch)
        
        {
            return inch * 72d;
        }

    
    
    @Override
    public int print(Graphics grphcs, PageFormat pf, int index) throws PrinterException {
        
        DefaultTableModel items = null;
        
        if(returns == false)
            {
                items = (DefaultTableModel)MAIN_FRAME.selltable.getModel(); //to getting itemm count 
            }
        if(returns == true)
            {
                items = (DefaultTableModel)ReturnFrame.selltable.getModel(); //to getting itemm count 
            }
        
        int itemNo = items.getRowCount();
        int result = NO_SUCH_PAGE;
        
        if(index == 0)
            {
                Graphics2D g = (Graphics2D) grphcs;
                
                try
                    {
                        int y = 20;
                        int yShift = 10;
                        int headerHeight = 15;
                        
                        g.setFont(new Font("Arial" , Font.PLAIN , 9));
                        g.drawString("---------------------------------------------",12,y);y+=yShift;
                        g.drawString("         CHATHURANGANI BOOK SHOP             ",12,y);y+=yShift;
                        g.drawString("                  abc                        ",12,y);y+=yShift;
                        g.drawString("                abcdef                       ",12,y);y+=yShift;
                        g.drawString("-             0766324349                     ",12,y);y+=yShift;
                        g.drawString("   chathuranganibookshop@gmail.com           ",12,y);y+=yShift;
                        g.drawString("BILL NUMBER : "+controllers.primaryKeyOfdealsData,12,y);y+=yShift;
                        g.drawString("---------------------------------------------",12,y);y+=headerHeight;
                        
                        g.drawString(" Item              Price    Quan      Total  ",12,y);y+=yShift;
                        
                        g.drawString("---------------------------------------------",12,y);y+=yShift;
                        
                        for(int i =0 ; i<itemNo ; i++)
                            {
                                String itemis = MAIN_FRAME.selltable.getValueAt(i,1).toString();
                                String price = MAIN_FRAME.selltable.getValueAt(i,2).toString();
                                String qty = MAIN_FRAME.selltable.getValueAt(i,3).toString();
                                String total = MAIN_FRAME.selltable.getValueAt(i,4).toString();
                                
                        g.drawString(" "+itemis+"    "+price+"    "+qty+"  "+total,12,y);y+=yShift;    
                        
                            }
                        g.drawString("---------------------------------------------",12,y);y+=yShift;
                        g.drawString("Total Amount : "+MAIN_FRAME.staticTotal,12,y);y+=yShift;
                        g.drawString("Discount : "+MAIN_FRAME.discAmount,12,y);y+=yShift;
                        g.drawString("SUB TOTAL : "+MAIN_FRAME.total,12,y);y+=yShift;
                        g.drawString("Payment : "+MAIN_FRAME.paymentForBill,12,y);y+=yShift;
                        g.drawString("BALANCE : "+MAIN_FRAME.total,12,y);y+=yShift;
                        
                        g.drawString("      ******************************         ",12,y);y+=yShift;
                        g.drawString("           THANK YOU FOR SHOPING !           ",12,y);y+=yShift;
    
                    }
                catch(Exception e)
                    {
                    
                    }
                //result = PAGE_EXISTS;
            }
        return result;
    }
    
}
