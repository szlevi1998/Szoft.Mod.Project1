package DB;
import java.sql.*;

public class Database {
    static Connection con;
    public Database() throws SQLException {
        con = DriverManager.getConnection("jdbc:h2:~/test", "admin", "");
    }

    public static Connection getCon() {
        return con;
    }
}
