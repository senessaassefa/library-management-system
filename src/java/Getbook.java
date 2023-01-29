/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author margaa
 */
public class Getbook {
    private String bookname;
     private String bookid;
    public String getBookname() {
        return bookname;
    }

    public String getBookid() {
        return bookid;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }
      private String author;
       private Double price;
    
         public  Getbook(String bookname,String bookid,String author,Double price){
  this.bookname=bookname;
       this.bookid=bookid;
         this.author=author;
          this.price=price;
      


}
}
