package DB;
import java.sql.*;

public class Database {
    static Connection con;
    public static Connection getCon() throws SQLException {
            con = DriverManager.getConnection("jdbc:h2:~/test", "admin", "");
        return con;
    }
}
