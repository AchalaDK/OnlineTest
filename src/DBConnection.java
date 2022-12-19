import java.sql.*;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection(){
        try{
            //load Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url = "jdbc:mysql://localhost:3306/Test4?useSSL = false";
            String username = "root";
            String password = "Achala@2019";
            con = DriverManager.getConnection(url, username, password);
        }catch(Exception e){
            e.printStackTrace();
        }

        return con;
    }
}
