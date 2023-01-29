
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
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
@ManagedBean (name="adduser") 
public class Adduser {
    private String fname;
    private String lname;
    private String studentid;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollege() {
        return college;
    }
    List<String> genderList;
    public void setCollege(String college) {
        this.college = college;
    }
       private String department;
        private String college;
        private String gender;



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

 public Adduser() {
     
 genderList = new ArrayList<>();
   genderList.add("Male");
        genderList.add("Female");

 }

    
         public void userInsert() {
      
        try {
            
            Adduser reg = new Adduser();
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String sql = "Insert into ADDUSR(FIRSTNAME,LASTNAME,GENDER,STUDENTID,DEPARTMENT,COLLEGE) values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, gender);
            ps.setString(4, studentid);
            ps.setString(5, department);
            ps.setString(6, college);
    
            ps.executeUpdate();
           
            System.err.println("success");
        } catch (Exception e) {
            
        }
    }

}
