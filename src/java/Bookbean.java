
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author margaa
 */
public class Bookbean {
    public List <Getbook> userfList;
       
   
  
    
    
    public List <Getbook> getuserinformation(){
    userfList = new ArrayList<>();
    
    try{
        
           DBConnection dbc = new DBConnection();
            Connection con = dbc.connMethod();
          
             ResultSet resultset = con.createStatement().executeQuery("select * from USERPAGE ");
                 while (resultset.next()) {
             
                String bookname = resultset.getString("BOOKNAME");                             
               String  bookid = resultset.getString("BOOKID");
                   String author = resultset.getString("AUTHOR");
                   Double  price = resultset.getDouble("PRICE");
              
                userfList.add(new Getbook(bookname, bookid, author,price));
            } 
             
    }catch( SQLException | ClassNotFoundException e)
    {
    
    
    }
    
    return userfList;
    }
}
