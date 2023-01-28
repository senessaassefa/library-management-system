/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author margaa
 */
@ManagedBean
@RequestScoped
public class loginbeans {
    
private String usern;
private String pass;

    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        this.usern = usern;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
 
    public loginbeans() {
        
    }
    
}
