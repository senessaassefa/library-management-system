
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

//import com.journaldev.jsf.util.SessionUtils;
@ManagedBean (name="login") 
@SessionScoped
public class Login implements Serializable {

    private static final long serialVersionUID = 1094801825228386363L;

    private String pwd;
    private String msg;
    private String user;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    //validate login
    public String login() throws SQLException, ClassNotFoundException {
        boolean valid = Loginvalid.validate(user, pwd);
        if (valid) {
              DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select USERTYPE from LOTB where USERNAME=?");
            ps.setString(1, user);       
            ResultSet rs = ps.executeQuery();
            rs.next();
            String userType =rs.getString(1);
            if ("admin".equals(userType)) {
                return "Adminpage";
            } else {
                return "Adminpage";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "index";
        }
    }
}
