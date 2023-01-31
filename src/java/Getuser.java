
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
@ManagedBean
public class Getuser {
    private String fname;
    private String lname;
    private String studentid;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getStudentid() {
        return studentid;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public String getCollege() {
        return college;
    }
    private String gender;
    private String department;
    private String college;
    public  Getuser(String fname,String lname,String studentid,String gender,String department,String college){
  this.fname=fname;
       this.lname=lname;
        this.studentid=studentid;
          this.gender=gender;       
          this.department=department;       
          this.college=college;
}
}