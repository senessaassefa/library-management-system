
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author margaa
 */
@ManagedBean
@RequestScoped
public class Userbean {
  public List <Getuser> userflist;
    public List <Getuser> getuserinformation(){
        userflist=new ArrayList<>(); 

    
    try{
        
           DBConnection dbc = new DBConnection();
            Connection con = dbc.connMethod();
          
             ResultSet resultset = con.createStatement().executeQuery("select * from ADDUSR");
                 while (resultset.next()) {
             
                String fname = resultset.getString("FRISTNAME");                             
               String  lname = resultset.getString("LASTNAME");
                String  studentid = resultset.getString("STUDENTID");
                   String gender = resultset.getString("GENDER");                 
                    String  department = resultset.getString("DEPARTMENT");
                     String  college = resultset.getString("COLLEGE");
              
                userflist.add(new Getuser(fname,lname,studentid,gender,department,college));
            } 
             
    }catch( SQLException | ClassNotFoundException e)
    {
    
    } 
      
    return userflist;
    }
}

