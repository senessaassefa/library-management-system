
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author margaa
 */
@ManagedBean (name="addbook")
public class Addbook {
   private String bookname;
     private String bookid;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
      private String author;
      private Double price;
         public void bookInsert() {
        //List<FirstManagedBean> list = new ArrayList<>();
        try {
            
            Adduser reg = new Adduser();
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String sql = "Insert into ADDBOOK(BOOKNAME,BOOKID,AUTHOR,PRICE) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, bookname);
            ps.setString(2, bookid);
            ps.setString(3, author);
            ps.setDouble(4, price);
        
    
            ps.executeUpdate();
           
            System.err.println("success");
        } catch (Exception e) {
            
        }
    
     
  
}   public void delete() throws ClassNotFoundException, SQLException{
    
            
          
          Boolean status=false;
            String query = "delete from ADDBOOK where BOOKID='"+bookid+"'";
            DBConnection connection1 = new DBConnection();
            Connection connection = connection1.connMethod();
            Statement statement = null;
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try{
                status=statement.execute(query);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
}