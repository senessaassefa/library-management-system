
import java.sql.*;

public class DBConnection {

    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    static final String USER = "JAVA";
    static final String PASS = "1234";
    Connection con = null;

    public Connection connMethod() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
       System.out.println("Connecting to a selected database...");
        con = DriverManager.getConnection(DB_URL, USER, PASS);     
        if (con != null) {
         System.out.println("Connected database successfully...");
       } else {
           System.out.println("nFailed to connect to Oracle DB");
     }
        return con;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        DBConnection db=new DBConnection();
           db.connMethod();
    }
}

