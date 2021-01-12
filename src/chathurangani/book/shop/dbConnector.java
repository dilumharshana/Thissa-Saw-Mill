package chathurangani.book.shop;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class dbConnector {

    String url = "jdbc:mysql://localhost:3306/bookshop";
    String uname = "root";
    String pass = "papapapa";
    String query, query2;

    //THIS METHOD WILL INSERT NEW ITEM DETAILS IN TO DATABASE
    void newItemToBase(String[] details, BigDecimal[] prices) throws Exception {

        query = "INSERT INTO `bookshop`.`stocks` (`itemcode`, `name`, `stock`) VALUES (?,?,?);";
        query2 = "UPDATE `bookshop`.`stocks` SET `sellprice` = '" + prices[0] + "' WHERE (`itemcode` = '" + details[0] + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);

        PreparedStatement st = con.prepareStatement(query);
        Statement st2 = con.createStatement();

        // Setting data to query
        st.setString(1, details[0]);
        st.setString(2, details[1]);
        st.setInt(3, Integer.parseInt(details[2]));

        st.executeUpdate();
        st2.executeUpdate(query2);

        st.close();
        con.close();

    }

    //SEARCH ITEMS IN STOCKS  
    public void searchIteminStock(String what) throws SQLException, ClassNotFoundException {

        System.out.println(what + " k");
        String query1 = "SELECT * from `bookshop`.`stocks` WHERE name LIKE '%" + what + "%'; ";
        String query2 = "SELECT * from `bookshop`.`stocks` where itemCode LIKE '%" + what + "%'; ";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);

        BigDecimal[] stockitemsInts = new BigDecimal[1];
        String[] stockitemsString = new String[4];

        while (rs.next()) {
            //IF USER SEARCH BY ITEM NAME THIS PART WILL BE RUN

            //this will make a emptyline after each result
            String[] linebrake = {"", "", "", ""};
            stocks.itemsToTable(linebrake, 0);

            stockitemsString[0] = rs.getString("itemcode");
            stockitemsString[1] = rs.getString("name");
            stockitemsString[3] = String.valueOf(rs.getInt("stock")); // casting to int to remove floating points [stocks amount dont have floating poits]
            stockitemsInts[0] = rs.getBigDecimal("sellprice");

            String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsInts[0]), String.valueOf(stockitemsString[3])};
            stocks.itemsToTable(itemset, 0);

        }

        ResultSet rs2 = st.executeQuery(query2);
        while (rs2.next()) {

            //IF USER SEARCH BY ITEM NAME THIS PART WILL BE RUN
            //this will make a emptyline after each result
            String[] linebrake = {"", "", "", ""};
            stocks.itemsToTable(linebrake, 0);

            stockitemsString[0] = rs2.getString("itemcode");
            stockitemsString[1] = rs2.getString("name");
            stockitemsString[3] = String.valueOf((int) rs2.getInt("stock")); // casting to int to remove floating points [stocks amount dont have floating poits]
            stockitemsInts[0] = rs2.getBigDecimal("sellprice");

            String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsInts[0]), String.valueOf(stockitemsString[3])};
            stocks.itemsToTable(itemset, 0);
        }

        st.close();
        con.close();
    }

    //SEARCH ITEMS IN STOCKS  
    static BigDecimal[] stockitemsInts = new BigDecimal[1];
    static String[] stockitemsString = new String[3];

    public void itemsForSelling(String what) throws Exception {

        String query1 = "SELECT * from `bookshop`.`stocks` where itemcode= ";
        String query2 = "SELECT * from `bookshop`.`stocks` where name= ";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1 + "'" + what + "'" + ";");

        if (rs.next()) {
            //IF USER SEARCH BY ITEM NAME THIS PART WILL BE RUN

            stockitemsString[0] = rs.getString("itemcode");
            stockitemsString[1] = rs.getString("name");

            stockitemsInts[0] = rs.getBigDecimal("sellprice");

            //Assigning values in to string array (item set) in controllers class
            controllers.itemset[0] = stockitemsString[0]; //itemcode
            controllers.itemset[1] = stockitemsString[1];//itemName
            controllers.itemset[2] = String.valueOf(stockitemsInts[0]);//selling price

            //making QuantityTrue = true to continue search process
            controllers.QuantityTrue = true;

        } else {

            //IF USER SEARCH BY ITEM NAME THIS PART WILL BE RUN
            ResultSet rs2 = st.executeQuery(query2 + "'" + what + "'" + ";");
            if (rs2.next()) {

                stockitemsString[0] = rs2.getString("itemcode");
                stockitemsString[1] = rs2.getString("name");

                stockitemsInts[0] = rs2.getBigDecimal("sellprice");

                //Assigning values in to string array (item set) in controllers class
                controllers.itemset[0] = stockitemsString[0]; //itemcode
                controllers.itemset[1] = stockitemsString[1];//itemName
                controllers.itemset[2] = String.valueOf(stockitemsInts[0]);//selling price

                //making QuantityTrue = true to continue search process
                controllers.QuantityTrue = true;

            } else {
                JOptionPane.showMessageDialog(null, "Sorry " + what + " is not available in your Stocks !");
                controllers.QuantityTrue = false;
            }

        }

        st.close();
        con.close();
    }

    //STOCK PANEL SHOW ALL BTN
    public void stockItemsShowAll() throws Exception {

        String query = "SELECT * FROM `bookshop`.`stocks` ;";
        String query2 = "SELECT * FROM `bookshop`.`raw_stocks` ;";
        String query3 = "SELECT * FROM `bookshop`.`cut_stocks` ;";
        String query4 = "SELECT * FROM `bookshop`.`stocks` WHERE `name` = 'kempas';";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query); //selling stocks

        //stocks table = new stocks();
        //DefaultTableModel additem = (DefaultTableModel)table.showstocks.getModel();
        int[] stockitemsInts = new int[2];
        String[] stockitemsString = new String[4];

        String[] linebrake = {"", "", "", "", ""};

        //clearing all stocks table befor sending new data
        stocks.clearTable();
        stocks.clearTable_raw();
        stocks.clearTable_cut();
        stocks.clear_kempasTable();

        while (rs.next()) {

            //this will make a emptyline after each result
            stocks.itemsToTable(linebrake, 0);

            stockitemsString[0] = rs.getString("itemcode");
            stockitemsString[1] = rs.getString("name");
            stockitemsString[3] = String.valueOf(rs.getBigDecimal("sellprice"));
            stockitemsInts[0] = rs.getInt("stock");

            String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsString[3]), String.valueOf(stockitemsInts[0])};
            stocks.itemsToTable(itemset, 0);
        }

        ResultSet rs2 = st.executeQuery(query2); // raw stocks

        while (rs2.next()) {

            //this will make a emptyline after each result
            stocks.timerStocks_toTable(linebrake, true);

            String[] itemset = {rs2.getString("itemcode"), rs2.getString("name"), String.valueOf(rs2.getInt("stock"))};
            stocks.timerStocks_toTable(itemset, true);
        }

        ResultSet rs3 = st.executeQuery(query3); //cutting stocks

        while (rs3.next()) {

            //this will make a emptyline after each result
            stocks.timerStocks_toTable(linebrake, false);

            String[] itemset = {rs3.getString("itemcode"), rs3.getString("name"), String.valueOf(rs3.getInt("stock"))};
            stocks.timerStocks_toTable(itemset, false);
        }

        ResultSet rs4 = st.executeQuery(query4); //kempas stocks

        while (rs4.next()) {

            //this will make a emptyline after each result
            stocks.itemsToTable(linebrake, 3);

            stockitemsString[0] = rs4.getString("itemcode");
            stockitemsString[1] = rs4.getString("name");
            stockitemsString[3] = String.valueOf(rs4.getBigDecimal("sellprice"));
            stockitemsInts[0] = rs4.getInt("stock");

            String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsString[3]), String.valueOf(stockitemsInts[0])};
            stocks.itemsToTable(itemset, 3);
        }

        st.close();
        con.close();
    }

    // SEARCH STOCK RUNNING OUT ITEMS ACCOUDINT TO CASHIER ENTERD VALUE 
    public void searchForStockOutItems(int smallerthan, int index) throws ClassNotFoundException, SQLException {

        String query = "SELECT * FROM `bookshop`.`stocks` where stock<" + smallerthan + ";";
        String query2 = "SELECT * FROM `bookshop`.`raw_stocks` where stock<" + smallerthan + ";";
        String query3 = "SELECT * FROM `bookshop`.`cut_stocks` where stock<" + smallerthan + ";";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        int[] stockitemsInts = new int[2];
        String[] stockitemsString = new String[4];

        String[] linebrake = {"", "", "", "", ""}; // line space for all tables

        switch (index) {
            case 0: // selling timer stock
                
               stocks.clearTable(); //clearing main stock table

                while (rs.next()) {
                    //this will make a emptyline after each result

                    stocks.itemsToTable(linebrake, 0);

                    stockitemsString[0] = rs.getString("itemcode");
                    stockitemsString[1] = rs.getString("name");
                    stockitemsString[3] = String.valueOf((int) rs.getDouble("sellprice"));
                    stockitemsInts[0] = rs.getInt("stock");

                    String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsString[3]), String.valueOf(stockitemsInts[0])};
                    stocks.itemsToTable(itemset, 0);
                }
                break;

            case 1: // row timer stock
                ResultSet rs2 = st.executeQuery(query2); // raw stocks

                 stocks.clearTable_raw(); //clearing raw stack table
                while (rs2.next()) {

                    //this will make a emptyline after each result
                    stocks.timerStocks_toTable(linebrake, true);

                    String[] itemset = {rs2.getString("itemcode"), rs2.getString("name"), String.valueOf(rs2.getInt("stock"))};
                    stocks.timerStocks_toTable(itemset, true);
                }

                break;

            case 2: //cutting timber stock
                ResultSet rs3 = st.executeQuery(query3); //cutting stocks
                stocks.clearTable_cut(); // clearing cutiing stock table
                while (rs3.next()) {

                    //this will make a emptyline after each result
                    stocks.timerStocks_toTable(linebrake, false);

                    String[] itemset = {rs3.getString("itemcode"), rs3.getString("name"), String.valueOf(rs3.getInt("stock"))};
                    stocks.timerStocks_toTable(itemset, false);
                }
                break;

            default:
            //nothing
        }

        st.close();
        con.close();
    }

    //UPDATE STOCK METHOD which has BIGDECIMAL data types
    public int updateStockitems(String table ,String colomn, String value, String PrimaryKey) throws Exception {
        int stock = 0;

            System.out.println(table);
            String query = "UPDATE bookshop."+table+" SET `" + colomn + "` = '" + value + "' WHERE (`itemcode` = '" + PrimaryKey + "');";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);

            st.close();
            con.close();

        return stock;

    }

    //UPDATE STOCK METHOD which has string data types
    public void updateStockitemsStrings(String table, String colomn, String value, String PrimaryKey) throws Exception {
        String query = "UPDATE `bookshop`.`"+table+"` SET `" + colomn + "` = '" + value + "' WHERE (`itemcode` = '" + PrimaryKey + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        st.executeUpdate(query);
        st.close();
        con.close();

    }

    //DELETE DATA FROM STORE
    public void deleteData(String primaryKey, String tablename ) throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM `bookshop`.`"+tablename+"` WHERE (`itemcode` = '" + primaryKey + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        int updated = st.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Item Deleted Successfully !");

        st.close();
        con.close();
    }

    //getting item price from db
    public String searchItemPrice(String what) throws SQLException, ClassNotFoundException {

        String query = "SELECT cashprice from `bookshop`.`stocks` where itemcode=";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query + "'" + what + "'" + ";");
        rs.next();
        String findprice = rs.getString("cashprice");
        st.close();
        con.close();
        return findprice;
    }

    //getting item stock from db
    public int searchItemStock(String what) throws SQLException, ClassNotFoundException {

        String query = "SELECT stock from `bookshop`.`stocks` where itemcode=";
        int findStock = 0;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query + "'" + what + "'" + ";");

        if (rs.next()) {
            findStock = rs.getInt("stock");
        }

        st.close();
        con.close();
        return findStock;
    }

    //CASH DEALS IN TO DATA BASE 
    public void storeCashDealsDataIntoBase(BigDecimal[] Gotvalues) throws ClassNotFoundException, SQLException {

        String query = "INSERT INTO `bookshop`.`cashdeals` (`TotaltValue`, `DiscountValue`, `paymentValue`, `BalanceValue` ,`date`) VALUES ('" + Gotvalues[0] + "', '" + Gotvalues[1] + "', '" + Gotvalues[2] + "', '" + Gotvalues[3] + "' ,'" + java.time.LocalDate.now() + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); //inserting values and Getting autoincremented dealno to insert items to item table,

        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        controllers.primaryKeyOfdealsData = String.valueOf(rs.getInt(1)); //stroting returned deal no to use latar.

        st.close();
        con.close();
    }

    //storing income data
    public void Strore_incomedata(String sprice, String incomeType , String date) throws Exception {
        
        String query = "";
        
        if( incomeType != "borrowing" )
            {
               query = "INSERT INTO `bookshop`.`incomedata` (`sellIncome`, `date`, `borrowing`) VALUES ('"+sprice+"', '"+date+"', '0.0');";
            }
        else
            {
                query = "INSERT INTO `bookshop`.`incomedata` (`sellIncome`, `date`, `borrowing`) VALUES ('0.0', '"+date+"', '"+sprice+"');";
            }

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query);
    }

    //update incomedate
    public void incomedataUpdater(String sprice, String incomeType , String date ) throws Exception {
        String query = "UPDATE `bookshop`.`incomedata` SET `"+incomeType+"` = '" + sprice + "' WHERE (`date` = '" + date + "');";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query);
         
    }

    //INSERTING DEAL ITEMS DEATILS ITEM CODE ITEM NAME QUANTITIY PRICE
    public void storeCashDealItemsIntoDataBase(String primarykey, String icode, String iname, BigDecimal price, String quantity, BigDecimal total) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO `bookshop`.`cashitems` (`dealNo`, `itemCode`, `itemName`,`itemPrice`, `quantity`, `price`)  VALUES ('" + primarykey + "', '" + icode + "', '" + iname + "', '" + price + "', '" + quantity + "' , '" + total + "');";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        st.executeUpdate(query);

        st.close();
        con.close();
    }

    // //BORROW DEALS IN TO DATA BASE 
    public int storeBorrowDealsDataIntoBase(String[] nameContact, BigDecimal[] defaultsValues) throws ClassNotFoundException, SQLException {

        int key = 0;

        String query = "INSERT INTO `bookshop`.`borrow` (`name`,`tp`,`nic` , `address` , `discount` , `total` ) VALUES ('" + nameContact[0] + "' , '" + nameContact[1] + "' , '" + nameContact[2] + "' , '" + nameContact[3] + "', '" + defaultsValues[0] + "', '" + defaultsValues[1] + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); //inserting values and Getting autoincremented dealno to insert items to item table,

        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        controllers.primaryKeyOfdealsData = String.valueOf(rs.getInt(1)); //stroting returned deal no to use latar.

        st.close();
        con.close();

        return key;
    }

    // //Advanced DEALS IN TO DATA BASE     //OVERLOADING
    public int store_advanced_DealsDataIntoBase(BigDecimal[] values, String pk) throws ClassNotFoundException, SQLException {

        int key = 0;

        String query = "UPDATE `bookshop`.`advanced` SET `discount` = '" + values[0] + "', `total` = '" + values[1] + "'  WHERE (`dealNo` = '" + pk + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query); //inserting values and Getting autoincremented dealno to insert items to item table,

        st.close();
        con.close();

        return key;
    }
    
       // //borrower DEALS IN TO DATA BASE     //OVERLOADING
    public int storeBorrowDealsDataIntoBase(BigDecimal[] values, String pk) throws ClassNotFoundException, SQLException {

        int key = 0;

        String query = "UPDATE `bookshop`.`borrow` SET `discount` = '" + values[0] + "', `total` = '" + values[1] + "' , `date` = '" + java.time.LocalDate.now().toString() + "'  WHERE (`dealNo` = '" + pk + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query); //inserting values and Getting autoincremented dealno to insert items to item table,

        st.close();
        con.close();

        return key;
    }

    //INSERTING DEAL ITEMS DEATILS ITEM CODE ITEM NAME QUANTITIY PRICE
    public void storeDealItemsIntoDataBase(String primarykey, String icode, String iname, String quantity, BigDecimal price , BigDecimal total) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO `bookshop`.`advanceditems` (`dealNo`, `itemCode`, `itemName`, `quantity`, `price` , `total`) VALUES ('" + primarykey + "', '" + icode + "', '" + iname + "', '" + quantity + "', '" + price + "' , '" + total + "');";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        st.executeUpdate(query);
    }

    //CHEKING DEALS FOR RETURN BILL PANNEL
//    public String[] dealCheker(String dealCode) throws Exception {
//        String query = "SELECT * FROM bookshop.cashdeals WHERE dealNo = '" + dealCode + "'";
//        String query2 = "SELECT * FROM bookshop.cashitems WHERE dealNo = '" + dealCode + "'";
//
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(query);
//
//        String[] customer = new String[6];
//
//        if (rs.next()) {
//            customer[2] = rs.getString("TotaltValue");
//            customer[3] = rs.getString("DiscountValue");
//            customer[4] = rs.getString("paymentValue");
//            customer[5] = rs.getString("BalanceValue");
//
//            ResultSet rs2 = st.executeQuery(query2);
//
//            while (rs2.next()) {
//                returns.dealItemsToTable(rs2.getString("itemCode"), rs2.getString("itemName"), rs2.getString("quantity"), rs2.getString("price"));
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "INVALID DEAL CODE !");
//        }
//        st.close();
//        con.close();
//
//        return customer;
//
//    }

    //SEARCHING FOR BORROWERS
    public void search_all_deals() throws Exception {

        {
            String query = "SELECT * FROM bookshop.borrow;";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            String[] customer = new String[8];
            borrowers.clearTable();

            while (rs.next()) {
                customer[0] = rs.getString("dealno");
                customer[1] = rs.getString("name");
                customer[2] = rs.getString("tp");
                customer[3] = rs.getString("nic");
                customer[4] = rs.getString("address");
                customer[5] = rs.getString("total");
                customer[6] = rs.getString("discount");
                customer[7] = rs.getString("date");

                borrowers.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
            }

        }
    }

    // THIS METHOD WILL SEARCH CUSTOMER DETAILS OF borrowers FROM DATABASE 
    public void search_every_field(String code) throws SQLException, ClassNotFoundException {

        String Query1 = "SELECT * FROM bookshop.borrow WHERE dealno = '" + code + "';"; // code means customer name which wants to search from DB
        String Query2 = "SELECT * FROM bookshop.borrow WHERE  name LIKE '%" + code + "%';";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        String[] customer = new String[11]; // result containing list

        //genereating results from all sugessted fields
        ResultSet rs2 = st.executeQuery(Query2);

        while (rs2.next()) {

            customer[0] = rs2.getString("dealno");
            customer[1] = rs2.getString("name");
            customer[2] = rs2.getString("tp");
            customer[3] = rs2.getString("nic");
            customer[4] = rs2.getString("address");
            customer[5] = rs2.getString("total");
            customer[6] = rs2.getString("discount");
            customer[7] = rs2.getString("date");

            borrowers.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
        }

        ResultSet rs = st.executeQuery(Query1);
        if (rs.next()) // IF ITEM CODE AVAILABLe THIS SECTION WILL RUN
        {

            customer[0] = rs.getString("dealno");
            customer[1] = rs.getString("name");
            customer[2] = rs.getString("tp");
            customer[3] = rs.getString("nic");
            customer[4] = rs.getString("address");
            customer[5] = rs.getString("total");
            customer[6] = rs.getString("discount");
            customer[7] = rs.getString("date");

            borrowers.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class

        }

    }

    // THIS METHOD WILL SEARCH CUSTOMER DETAILS FROM DATABASE
    public void search_every_field_By_Code(String code) throws SQLException, ClassNotFoundException {

        String Query1 = "SELECT * FROM bookshop.cashdeals WHERE dealno = '" + code + "';"; // code means customer name which wants to search from DB

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs2 = st.executeQuery(Query1);
        String[] customer = new String[6]; // result containing list

        if (rs2.next()) {
            customer[0] = rs2.getString("dealno");
            customer[1] = rs2.getString("TotaltValue");
            customer[2] = rs2.getString("DiscountValue");
            customer[3] = rs2.getString("paymentValue");
            customer[4] = rs2.getString("paymentValue");
            customer[5] = rs2.getString("date");

            DealHistory.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
        }
        //genereating results from all sugessted fields

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void search_for_deals(String code) throws SQLException, ClassNotFoundException {

        String Query1 = "SELECT * FROM bookshop.cashdeals WHERE dealNo = '" + code + "';"; // code means customer name which wants to search from DB

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        String[] customer = new String[11]; // result containing list

        //genereating results from all sugessted fields
        ResultSet rs = st.executeQuery(Query1);

        while (rs.next()) // IF ITEM CODE AVAILABLe THIS SECTION WILL RUN
        {

            customer[0] = String.valueOf(rs.getInt("dealNo"));
            customer[1] = String.valueOf(rs.getBigDecimal("TotaltValue"));
            customer[2] = String.valueOf(rs.getBigDecimal("DiscountValue"));
            customer[3] = String.valueOf(rs.getBigDecimal("DiscountValue"));
            customer[4] = String.valueOf(rs.getBigDecimal("BalanceValue"));
            customer[5] = String.valueOf(rs.getBigDecimal("date"));

            borrowers.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
        }
    }

    //search allresults in databse
    public void search_for_deals() throws SQLException, ClassNotFoundException {

        String Query1 = "SELECT * FROM bookshop.cashdeals ;"; // code means customer name which wants to search from DB

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        String[] customer = new String[11]; // result containing list

        //genereating results from all sugessted fields
        ResultSet rs = st.executeQuery(Query1);

        while (rs.next()) // IF ITEM CODE AVAILABLe THIS SECTION WILL RUN
        {

            customer[0] = String.valueOf(rs.getInt("dealNo"));
            customer[1] = String.valueOf(rs.getBigDecimal("TotaltValue"));
            customer[2] = String.valueOf(rs.getBigDecimal("DiscountValue"));
            customer[3] = String.valueOf(rs.getBigDecimal("paymentValue"));
            customer[4] = String.valueOf(rs.getBigDecimal("BalanceValue"));
            customer[5] = rs.getString("date");

            DealHistory.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
        }
    }

    //getting each borrowing item accorfing to customer when user select a deal
    public void getDealItems(String code) throws ClassNotFoundException, SQLException {
        String query1 = "SELECT * FROM bookshop.payments WHERE `cusCode`=" + code + ";";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        String[] itemDetails = new String[4];

        ResultSet rs = st.executeQuery(query1);

        while (rs.next()) {
            itemDetails[0] = rs.getString("date");
            itemDetails[1] = rs.getBigDecimal("due").toString();
            itemDetails[2] = rs.getBigDecimal("payment").toString();
            itemDetails[3] = rs.getBigDecimal("newAmount").toString();

            paymentHistory.dealItemsToTable(itemDetails);
        }

    }

    // CHEKIKNG IS USER GIVEN PASSWORD IS EXSISTS IN DB
    public boolean passchek(String password) throws Exception {
        boolean passVeryfied;

        String query = "SELECT * FROM bookshop.pass WHERE `pass`= ? ;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, password);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            passVeryfied = true;
        } else {
            passVeryfied = false;
        }

        st.close();
        con.close();

        return passVeryfied;
    }

    //CHANGING PASSWORD    
    void changePass(String oldPass, String newpass) throws Exception {
        String query = " UPDATE `bookshop`.`pass` SET `pass` = '" + newpass + "' WHERE (`Id` = '1');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query);

        JOptionPane.showMessageDialog(null, " PASSWORD SUCCESSFULLY UPDATE !");

        st.close();
        con.close();

    }

    //ADDING NEW PASSWROD (SETTING A PASSWORD)
    void changePass(String newpass, String question, String answer) throws Exception {
        String query = " UPDATE `bookshop`.`pass` SET `pass` = '" + newpass + "' WHERE (`Id` = '1');";
        String query2 = "UPDATE `bookshop`.`pass` SET `passState` = '1' WHERE (`Id` = '1');";
        String query3 = "UPDATE `bookshop`.`pass` SET `question` = '" + question + "' WHERE (`Id` = '1');";
        String query4 = "UPDATE `bookshop`.`pass` SET `answer` = '" + answer + "' WHERE (`Id` = '1');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query);
        st.executeUpdate(query2);
        st.executeUpdate(query3);
        st.executeUpdate(query4);

        JOptionPane.showMessageDialog(null, " PASSWORD SUCCESSFULLY UPDATE !");

        st.close();
        con.close();

    }

    //cheking is password is in active state 
    boolean isLocked() throws Exception {
        boolean locked;

        String query = " SELECT * FROM bookshop.pass;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        rs.next();

        boolean state = rs.getBoolean("passState");

        if (state == true) {
            locked = true;
        } else {
            locked = false;
        }

        st.close();
        con.close();

        return locked;
    }

    //removing passord and setting password active state to off
    void removePass() throws Exception {
        String query = " UPDATE `bookshop`.`pass` SET `pass` = '' WHERE (`Id` = '1');";
        String query2 = "UPDATE `bookshop`.`pass` SET `passState` = '0' WHERE (`Id` = '1');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query);
        st.executeUpdate(query2);

        JOptionPane.showMessageDialog(null, " PASSWORD REMOVED UPDATE !");

        st.close();
        con.close();
    }

    // CHEKIKNG IS USER GIVEN PASSWORD IS EXSISTS IN DB
    public boolean questionchek(String what, int which) throws Exception {
        boolean qestionVeryfied;

        String query = "SELECT * FROM bookshop.pass WHERE `question`= ? ;";
        String query2 = "SELECT * FROM bookshop.pass WHERE `answer`= ? ;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        ResultSet rs = null;
        PreparedStatement st = null;

        if (which == 1) {
            st = con.prepareStatement(query);
            st.setString(1, what);
            rs = st.executeQuery();
        } else {
            st = con.prepareStatement(query2);
            st.setString(1, what);
            rs = st.executeQuery();
        }

        if (rs.next()) {
            qestionVeryfied = true;
        } else {
            qestionVeryfied = false;
        }

        st.close();
        con.close();

        return qestionVeryfied;
    }

    // removing cash deals from the databse
    void clearDeals() throws Exception {
        String query = "SELECT * FROM bookshop.cashdeals;";
        String query_incomeData = "SELECT * FROM bookshop.incomedata;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement(); // for get primary key
        Statement st2 = con.createStatement(); //for remove data

        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            int primaryKey = rs.getInt("dealNo");
            String query2 = "DELETE FROM `bookshop`.`cashdeals` WHERE (`dealNo` = '" + primaryKey + "');";
            String query3 = "DELETE FROM `bookshop`.`cashitems` WHERE (`dealNo` = '" + primaryKey + "');";
            st2.executeUpdate(query2);
            st2.executeUpdate(query3);
        }

        ResultSet rs2 = st.executeQuery(query_incomeData);

        while (rs2.next()) {
            int primaryKey = rs2.getInt("incomeCode");
            String query2 = "DELETE FROM `bookshop`.`incomedata` WHERE (`incomeCode` = '" + primaryKey + "');";
            st2.executeUpdate(query2);
        }

        JOptionPane.showMessageDialog(null, " Deal deleted successfully !");

        st.close();
        con.close();
    }

    //removing borrower deals from the database  
    void clearBorrows(String primaryKey, boolean which) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement(); // for get primary key
        Statement st2 = con.createStatement(); //for remove data

        String query2 = "DELETE FROM `bookshop`.`borrow` WHERE (`dealNo` = '" + primaryKey + "');";
        String query3 = "DELETE FROM `bookshop`.`payments`  WHERE (`dealNo` = '" + primaryKey + "');";
        String query = "DELETE FROM `bookshop`.`cashier_login` WHERE (`no` = '" + primaryKey + "');";

        if (which == true) {
            st2.executeUpdate(query3);
            st2.executeUpdate(query2);
            JOptionPane.showMessageDialog(null, " Borrower deleted successfully !");
        } else {
            st2.executeUpdate(query);
            JOptionPane.showMessageDialog(null, " Cashier deleted successfully !");
        }

        st.close();
        con.close();
    }

    boolean chekNewBarCode(int newCode) throws Exception {
        boolean state = false;

        String query = "SELECT * FROM bookshop.stocks WHERE `itemcode`= ? ;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, newCode);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            state = false;
        } else {
            state = true;
        }

        st.close();
        con.close();

        return state;
    }

    // CHEKIKNG IS USER GIVEN DATE IS EXSISTS IN DB
    
    //this method is using both cashincome and borrowing data fetching. by pasing true it fetch cash income and false it fetch borring income
    public boolean passdate(String date , boolean cashincome) throws Exception {
        boolean dateVeryfied;

        String query ="SELECT * FROM bookshop.incomedata WHERE `date`= ? ;";
          
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, date);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            
               dateVeryfied = true; //mentioing a deal is available with this date
            
               if(cashincome == true) //fetching cashincome price
                {
                    controllers.sellPrice = rs.getBigDecimal("sellIncome");
                }
               else //FETCHING BORROWING INCOME TOTAL PRICE
                {
                    controllers.sellPrice = rs.getBigDecimal("borrowing");
                }
            
        } else {
            dateVeryfied = false;
        }

        st.close();
        con.close();

        return dateVeryfied;
    }

    //UPDATE STOCK METHOD which has string data types
    public void updateBorrowerData(String colomn, String value, String PrimaryKey, boolean which) throws Exception {

        //borrowers
        String query = "UPDATE `bookshop`.`borrow` SET `" + colomn + "` = '" + value + "' WHERE (`dealNo` = '" + PrimaryKey + "');";

        //cashiers
        String query2 = "UPDATE `bookshop`.`cashier_login` SET `" + colomn + "` = '" + value + "' WHERE (`no` = '" + PrimaryKey + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        if (which == true) {
             st.executeUpdate(query);
        } else {
             st.executeUpdate(query2);
        }

        JOptionPane.showMessageDialog(null, "Detail updated successfully !");

        st.close();
        con.close();

    }

    // CHEKIKNG IS advance IS EXSISTS IN DB
    public BigDecimal[] borrow_amount_Upater(String code) throws Exception {
        BigDecimal[] prices = new BigDecimal[3];

        String query = "SELECT * FROM bookshop.borrow WHERE `dealNo`= ? ;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, code);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            prices[0] = rs.getBigDecimal("discount");
            prices[1] = rs.getBigDecimal("total");
        }

        st.close();
        con.close();

        return prices;
    }
    
       // CHEKIKNG IS advance IS EXSISTS IN DB
    public BigDecimal[] advanced_amount_Upater(String code) throws Exception {
        BigDecimal[] prices = new BigDecimal[3];

        String query = "SELECT * FROM bookshop.advanced WHERE `dealNo`= ? ;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, code);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            prices[0] = rs.getBigDecimal("discount");
            prices[1] = rs.getBigDecimal("total");
        }

        st.close();
        con.close();

        return prices;
    }

    //updating income data database borrower data databse
    void borrow_payment_process(BigDecimal value, String primaryKey) throws Exception {
        String query = "UPDATE `bookshop`.`borrow` SET `total` = '" + value + "' WHERE (`dealNo` = '" + primaryKey + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        st.executeUpdate(query);

    }

//    //sending income date values to generate income report in report class
//    void get_values_of_income() throws Exception {
//
//        String query = "SELECT * FROM bookshop.incomedata WHERE (`date` = '" + java.time.LocalDate.now() + "');";
//
//        String query2 = "SELECT * FROM bookshop.outgoing WHERE (`date` = '" + java.time.LocalDate.now() + "');";
//
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        Statement st = con.createStatement();
//
//        ResultSet rs2 = st.executeQuery(query2); //execute query 2
//
//        while (rs2.next()) {
//            report.tCashOut = report.tCashOut.add(rs2.getBigDecimal("outgoing")); //total ofcash outs
//        }
//
//        ResultSet rs = st.executeQuery(query); //execute query 1
//        
//        if (rs.next()) {
//            report.tSell = rs.getBigDecimal("sellIncome");
//        }
//
//        st.close();
//        con.close();
//    }

    //sending income date values of specific date to generate income report in report class
    void get_values_of_income(String date) throws Exception {

        String query = "SELECT * FROM bookshop.outgoing WHERE (`date` = '" + date + "');";
        String query2 = "SELECT * FROM bookshop.incomedata WHERE (`date` = '" + date + "');";
        String query3 = "SELECT * FROM bookshop.borrow WHERE (`date` = '" + date + "');"; 
        String query4 = "SELECT * FROM bookshop.cashitems WHERE (`itemCode` = '" + "50" + "');";
        String query5 = "SELECT * FROM bookshop.cashitems WHERE (`itemCode` = '" + "50" + "');";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query); //execute query 1
       
        while (rs.next()) {
            report.csshout.setText(new BigDecimal(report.csshout.getText()).add(rs.getBigDecimal("outgoing")).toString()); //out goingcashdeals
        }
        
        ResultSet rs2 = st.executeQuery(query2); //execute query 2
        
        if (rs2.next()) {
            report.totalsell.setText(new BigDecimal(report.totalsell.getText()).add(rs2.getBigDecimal("sellIncome")).toString()); //income amount
        } else {
            JOptionPane.showMessageDialog(null, " No Date Excist !");
        }
        
        ResultSet rs3 = st.executeQuery(query3); //execute query 1
         while (rs3.next()) {
            report.lend.setText(new BigDecimal(report.lend.getText()).add(rs3.getBigDecimal("total")).toString()); //lending amount
        }
         
         ResultSet rs4 = st.executeQuery(query4); //execute query 1
         while (rs4.next()) {
            report.woodpowder.setText(new BigDecimal(report.woodpowder.getText()).add(rs4.getBigDecimal("price")).toString()); //wood powder amount
        }


       

        st.close();
        con.close();
    }

//    //sending income date values to generate income report in report class
//    void get_values_of_income(String from, String to) throws Exception {
//
//        String chek = "SELECT * FROM bookshop.incomedata WHERE `date` BETWEEN  '" + from + "' AND '" + to + "' ;";
//
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        Statement st = con.createStatement();
//
//        ResultSet rs = st.executeQuery(chek);
//
//        while (rs.next()) {
//            report.tCash = report.tCash.add(rs.getBigDecimal("cashIncome"));
//            report.tSell = report.tSell.add(rs.getBigDecimal("sellIncome"));
//            report.tOut = report.tOut.add(rs.getBigDecimal("outsell"));
//
//        }
//
//    }

    boolean stockout() throws Exception {
        boolean out = false;

        String query = "SELECT * FROM bookshop.stocks WHERE stock < 10 ;";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        if (rs.next()) //stocks running out
        {
            out = true;
        } else //stocks not runnig out
        {
            out = false;
        }

        st.close();
        con.close();

        return out;

    }

    //Adding new casher to system
    // //BORROW DEALS IN TO DATA BASE 
    public int addNewCasher(String[] nameContact) throws ClassNotFoundException , SQLException {

        int key = 0;

        String query = "INSERT INTO `bookshop`.`cashier_login` (`name`, `phone`, `id`, `address`, `pass`, `state`) VALUES ('" + nameContact[0] + "' , '" + nameContact[1] + "' , '" + nameContact[2] + "' , '" + nameContact[3] + "', '" + nameContact[4] + "', '" + 1 + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); //inserting values and Getting autoincremented dealno to insert items to item table,

        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        controllers.primaryKeyOfdealsData = String.valueOf(rs.getInt(1)); //stroting returned deal no to use latar.

        st.close();
        con.close();

        return key;
    }

    //SEARCHING FOR BORROWERS
    public void search_all_cashiers() throws Exception {

        {
            String query = "SELECT * FROM bookshop.cashier_login;";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            String[] customer = new String[7];
            cashiers.clearTable();

            while (rs.next()) {
                customer[0] = rs.getString("no");
                customer[1] = rs.getString("name");
                customer[2] = rs.getString("phone");
                customer[3] = rs.getString("id");
                customer[4] = rs.getString("address");
                customer[5] = rs.getString("pass");

                if (rs.getBoolean("state") == true) {
                    customer[6] = "Active";
                } else {
                    customer[6] = "Locked";
                }

                cashiers.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
            }

        }
    }

    //searching for all cashiers
    // THIS METHOD WILL SEARCH CUSTOMER DETAILS OF borrowers FROM DATABASE 
    public void search_every_cashier(String code) throws SQLException, ClassNotFoundException {

        String Query1 = "SELECT * FROM bookshop.cashier_login WHERE no = '" + code + "';"; // code means customer name which wants to search from DB
        String Query2 = "SELECT * FROM bookshop.cashier_login WHERE  name LIKE '%" + code + "%';";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        String[] customer = new String[11]; // result containing list

        //genereating results from all sugessted fields
        ResultSet rs2 = st.executeQuery(Query2);

        while (rs2.next()) {

            customer[0] = rs2.getString("no");
            customer[1] = rs2.getString("name");
            customer[2] = rs2.getString("phone");
            customer[3] = rs2.getString("id");
            customer[4] = rs2.getString("address");
            customer[5] = rs2.getString("pass");

            if (rs2.getBoolean("state") == true) {
                customer[6] = "Active";
            } else {
                customer[6] = "Locked";
            }

            cashiers.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
        }

        ResultSet rs = st.executeQuery(Query1);
        if (rs.next()) // IF ITEM CODE AVAILABLe THIS SECTION WILL RUN
        {

            customer[0] = rs.getString("no");
            customer[1] = rs.getString("name");
            customer[2] = rs.getString("phone");
            customer[3] = rs.getString("id");
            customer[4] = rs.getString("address");
            customer[5] = rs.getString("pass");

            if (rs.getBoolean("state") == true) {
                customer[6] = "Active";
            } else {
                customer[6] = "Locked";
            }

            cashiers.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class

        }

    }

    //cashier password cheking
    // CHEKIKNG IS USER GIVEN PASSWORD IS EXSISTS IN DB
    public boolean passchek_cashier(String username, String password) throws Exception {
        boolean passVeryfied = false;

        String query = "SELECT * FROM bookshop.cashier_login WHERE name= ? and pass= ? ;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, username);
        st.setString(2, password);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            if (rs.getBoolean("state") == true) {
                passVeryfied = true;
            } else {
                JOptionPane.showMessageDialog(null, "Sorry , your Account has been Locked !");
            }

        } else {
            passVeryfied = false;

            //displaying alert
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password !");

        }

        st.close();
        con.close();

        return passVeryfied;
    }

    //cashier account unlock
    boolean activeCashier(String index, int what) throws Exception {

        String query = " UPDATE `bookshop`.`cashier_login` SET `state` = '" + what + "' WHERE (`no` = '" + index + "');";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        st.executeUpdate(query);

        return true;

    }

    //saving borrower payment in to database
    void paymentServer(String cuscode, BigDecimal due, BigDecimal payments, BigDecimal balance, String date) throws Exception {

        String query = "INSERT INTO `bookshop`.`payments` (`cusCode`, `due`, `payment`, `newAmount`, `date`) VALUES (?,?,?,?,?);";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);

        PreparedStatement st = con.prepareStatement(query);

        st.setString(1, cuscode);
        st.setBigDecimal(2, due);
        st.setBigDecimal(3, payments);
        st.setBigDecimal(4, balance);
        st.setString(5, date);

        st.executeUpdate();

    }

    //updating raw timber stock and cutting timber stock
    void timber_ItemToBase(String[] details, int index) throws Exception {

        query = "INSERT INTO `bookshop`.`raw_stocks` (`itemcode`, `name`, `stock`) VALUES (?,?,?);";
        query2 = "INSERT INTO `bookshop`.`cut_stocks` (`itemcode`, `name`, `stock`) VALUES (?,?,?);";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);

        switch (index) {
            case 1:

                PreparedStatement st = con.prepareStatement(query);
                // Setting data to query
                st.setString(1, details[0]);
                st.setString(2, details[1]);
                st.setInt(3, Integer.parseInt(details[2]));
                st.executeUpdate();
                st.close();

                break;

            case 2:

                PreparedStatement st2 = con.prepareStatement(query2);

                st2.setString(1, details[0]);
                st2.setString(2, details[1]);
                st2.setInt(3, Integer.parseInt(details[2]));

                st2.executeUpdate();
                st2.close();
        }

        con.close();
    }

    //SEARCH ITEMS IN RAW STOCKS  
    public void search_row_IteminStock(String what) throws SQLException, ClassNotFoundException {

        String query1 = "SELECT * from `bookshop`.`raw_stocks` WHERE name LIKE '%" + what + "%'; ";
        String query2 = "SELECT * from `bookshop`.`raw_stocks` where itemCode LIKE '%" + what + "%'; ";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query1);

        String[] stockitemsString = new String[4];

        while (rs.next()) {
            //IF USER SEARCH BY ITEM NAME THIS PART WILL BE RUN

            //this will make a emptyline after each result
            String[] linebrake = {"", "", ""};
            stocks.timerStocks_toTable(linebrake, true);
            //in here by parsing true value then "timerStocks_toTable" knows that to set thises data to raw stock table

            stockitemsString[0] = rs.getString("itemcode");
            stockitemsString[1] = rs.getString("name");
            stockitemsString[3] = String.valueOf(rs.getInt("stock")); // casting to int to remove floating points [stocks amount dont have floating poits]

            String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsString[3])};
            stocks.timerStocks_toTable(itemset, true);

        }

        ResultSet rs2 = st.executeQuery(query2);
        while (rs2.next()) {
            //IF USER SEARCH BY ITEM NAME THIS PART WILL BE RUN

            //this will make a emptyline after each result
            String[] linebrake = {"", "", ""};
            stocks.timerStocks_toTable(linebrake, true);
            //in here by parsing true value then "timerStocks_toTable" knows that to set thises data to raw stock table

            stockitemsString[0] = rs2.getString("itemcode");
            stockitemsString[1] = rs2.getString("name");
            stockitemsString[3] = String.valueOf(rs2.getInt("stock")); // casting to int to remove floating points [stocks amount dont have floating poits]

            String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsString[3])};
            stocks.timerStocks_toTable(itemset, true);

        }
    }

    //SEARCH ITEMS IN cutting STOCKS  
    public void search_cut_IteminStock(String what) throws SQLException, ClassNotFoundException {

        String query1 = "SELECT * from `bookshop`.`cut_stocks` WHERE name LIKE '%" + what + "%'; ";
        String query2 = "SELECT * from `bookshop`.`cut_stocks` where itemCode LIKE '%" + what + "%'; ";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);

        String[] stockitemsString = new String[4];

        while (rs.next()) {
            //IF USER SEARCH BY ITEM NAME THIS PART WILL BE RUN

            //this will make a emptyline after each result
            String[] linebrake = {"", "", ""};
            stocks.timerStocks_toTable(linebrake, false);
            //in here by parsing true value then "timerStocks_toTable" knows that to set thises data to raw stock table

            stockitemsString[0] = rs.getString("itemcode");
            stockitemsString[1] = rs.getString("name");
            stockitemsString[3] = String.valueOf(rs.getInt("stock")); // casting to int to remove floating points [stocks amount dont have floating poits]

            String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsString[3])};
            stocks.timerStocks_toTable(itemset, false);

        }

        ResultSet rs2 = st.executeQuery(query2);
        while (rs2.next()) {
            //IF USER SEARCH BY ITEM NAME THIS PART WILL BE RUN

            //this will make a emptyline after each result
            String[] linebrake = {"", "", ""};
            stocks.timerStocks_toTable(linebrake, false);
            //in here by parsing true value then "timerStocks_toTable" knows that to set thises data to raw stock table

            stockitemsString[0] = rs2.getString("itemcode");
            stockitemsString[1] = rs2.getString("name");
            stockitemsString[3] = String.valueOf(rs2.getInt("stock")); // casting to int to remove floating points [stocks amount dont have floating poits]

            String[] itemset = {stockitemsString[0], stockitemsString[1], String.valueOf(stockitemsString[3])};
            stocks.timerStocks_toTable(itemset, false);

        }
    }
    
    
     //Advanced payment DEALS IN TO DATA BASE 
    public int storeAdvancedDealsDataIntoBase(String[] nameContact, BigDecimal[] defaultsValues) throws ClassNotFoundException, SQLException {

        int key = 0;

        String query = "INSERT INTO `bookshop`.`advanced` (`name`,`phone`,`nic` , `address` , `discount` , `total` , `advanced` , `date`) VALUES ('" + nameContact[0] + "' , '" + nameContact[1] + "' , '" + nameContact[2] + "' , '" + nameContact[3] + "', '" + defaultsValues[0] + "', '" + defaultsValues[1] + "' , '" + defaultsValues[2] + "' , '" + nameContact[4] + "' );";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); //inserting values and Getting autoincremented dealno to insert items to item table,

        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        controllers.primaryKeyOfdealsData = String.valueOf(rs.getInt(1)); //stroting returned deal no to use latar.

        st.close();
        con.close();

        return key;
    }
    
    
    //removing advanced deals from the database  
    void clearAdvanced(String primaryKey) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement(); // for get primary key
        Statement st2 = con.createStatement(); //for remove data

        String query2 = "DELETE FROM `bookshop`.`advanced` WHERE (`dealNo` = '" + primaryKey + "');";
        String query3 = "DELETE FROM `bookshop`.`advanceditems`  WHERE (`dealNo` = '" + primaryKey + "');";

        st2.executeUpdate(query3);
        st2.executeUpdate(query2);
        JOptionPane.showMessageDialog(null, " Advanced deleted successfully !");

        st.close();
        con.close();
    }
    
        //SEARCHING FOR BORROWERS
        public void search_all_advanced() throws Exception {

            {
                String query = "SELECT * FROM bookshop.advanced;";

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                String[] customer = new String[9];
                advanced.clearTable();

                while (rs.next()) {
                    customer[0] = rs.getString("dealno");
                    customer[1] = rs.getString("name");
                    customer[2] = rs.getString("phone");
                    customer[3] = rs.getString("nic");
                    customer[4] = rs.getString("address");
                    customer[5] = String.valueOf(rs.getBigDecimal("total"));
                    customer[6] = String.valueOf(rs.getBigDecimal("discount"));
                    customer[7] = String.valueOf(rs.getBigDecimal("advanced"));
                    customer[8] = rs.getString("date");

                    advanced.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
                }

            }
        }
        
        
        public int updateAdvanceData(String table , String colomn, String value, String PrimaryKey) throws Exception {

        //borrowers
        String query = "UPDATE `bookshop`.`"+table+"` SET `" + colomn + "` = '" + value + "' WHERE (`dealNo` = '" + PrimaryKey + "');";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        int updated = st.executeUpdate(query);

        st.close();
        con.close();
        
        return 0;

    }
        
       
     //getting each borrowing item accorfing to customer when user select a deal
      //here which is for data to advance item viwing panel to payment billing panel
    public void getAdvancetems(String code , boolean which) throws ClassNotFoundException, SQLException { 
        String query = "SELECT * FROM bookshop.advanceditems WHERE `dealNo`=" + code + ";";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        String[] itemDetails = new String[5];

        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {

            if(which == true)
                {
                    itemDetails[0]= rs.getString("itemName");
                    itemDetails[1] = rs.getString("quantity");
                    itemDetails[2] = rs.getBigDecimal("total").toString();
                    advancedItems.dealItemsToTable(itemDetails); // displying data to advance payments item viwing panel
                }
            else
                  {
                      itemDetails[0]= rs.getString("itemCode");
                      itemDetails[1]= rs.getString("itemName");
                      itemDetails[2] = rs.getString("quantity");
                      itemDetails[3] = rs.getBigDecimal("price").toString();
                      itemDetails[4] = rs.getBigDecimal("total").toString();
                      MAIN_FRAME.advancedItems_searchItemsToTable(itemDetails); // displying data to billing pannel for create bill 
                  }
             }
         }
    
       //searching for all cashiers
    // THIS METHOD WILL SEARCH CUSTOMER DETAILS OF borrowers FROM DATABASE 
    public void search_every_advanced(String code) throws SQLException, ClassNotFoundException {

        String Query1 = "SELECT * FROM bookshop.advanced WHERE dealno = '" + code + "';"; // code means customer name which wants to search from DB
        String Query2 = "SELECT * FROM bookshop.advanced WHERE  name LIKE '%" + code + "%';";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        String[] customer = new String[9]; // result containing list

        //genereating results from all sugessted fields
        ResultSet rs = st.executeQuery(Query1);

        while (rs.next()) {

                    customer[0] = rs.getString("dealno");
                    customer[1] = rs.getString("name");
                    customer[2] = rs.getString("phone");
                    customer[3] = rs.getString("nic");
                    customer[4] = rs.getString("address");
                    customer[5] = String.valueOf(rs.getBigDecimal("total"));
                    customer[6] = String.valueOf(rs.getBigDecimal("discount"));
                    customer[7] = String.valueOf(rs.getBigDecimal("advanced"));
                    customer[8] = rs.getString("date");

                    advanced.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
                }
        
        ResultSet rs2 = st.executeQuery(Query2);
        
          while (rs2.next()) {

                    customer[0] = rs2.getString("dealno");
                    customer[1] = rs2.getString("name");
                    customer[2] = rs2.getString("phone");
                    customer[3] = rs2.getString("nic");
                    customer[4] = rs2.getString("address");
                    customer[5] = String.valueOf(rs2.getBigDecimal("total"));
                    customer[6] = String.valueOf(rs2.getBigDecimal("discount"));
                    customer[7] = String.valueOf(rs2.getBigDecimal("advanced"));
                    customer[8] = rs2.getString("date");

                    advanced.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
                }
        }
       
    
     //storing income data
    public int Strore_outGoingdata(String sprice, String reson , String date) throws Exception {
        
        String query = "INSERT INTO `bookshop`.`outgoing` (`outgoing`, `reson`, `date`) VALUES ('"+sprice+"', '"+reson+"', '"+date+"');";
  
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

       int code = st.executeUpdate(query , Statement.RETURN_GENERATED_KEYS);
        
        return code;
    }
    
      //SEARCHING FOR Out going cash
        public void search_all_outgoing(String date) throws Exception {

            {
                String query = "SELECT * FROM bookshop.outgoing WHERE `date` = '"+date+"' ;";

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                String[] customer = new String[9];
                outgoing.clearTable();

                while (rs.next()) {
                    customer[0] = rs.getString("dealNo");
                    customer[1] = rs.getString("outgoing");
                    customer[2] = rs.getString("reson");
                    customer[3] = rs.getString("date");
       
                    outgoing.cashouts_ToTable(customer); // calling data items setting to table method in dealHistory class
                }

            }
        }
        
        
         //removing advanced deals from the database  
        void clearOutGoing(String primaryKey) throws Exception {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement(); // for get primary key
            Statement st2 = con.createStatement(); //for remove data

            String query = "DELETE FROM `bookshop`.`outgoing` WHERE (`dealNo` = '" + primaryKey + "');";

            st2.executeUpdate(query);
            JOptionPane.showMessageDialog(null, " Cash Out deleted successfully !");

            st.close();
            con.close();
        }

}
