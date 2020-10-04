package game;
import DB.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class GetCategoryFromDB {

    public String categoryFromDB() throws SQLException {
        Statement st;
        ResultSet rs;
        String query = "select neve from kategoria where id = " + GetCategoryNumFromDB.categoryNumFromDB();
        st = Database.getCon().createStatement();
        rs = st.executeQuery(query);
        rs.next();
        String category = rs.getString("neve");
        rs.close();
        return category;
    }
}