
import java.sql.*;
public class conn {
    Connection c;
    static Statement s;
    
    public conn() {
        try {
            // Registering the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Building the connection string
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsystem", "root", "WEARE11");
            
            // Creating a Statement object
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


