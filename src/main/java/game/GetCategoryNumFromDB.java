package game;
import DB.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class GetCategoryNumFromDB {

    public static int categoryNumFromDB() throws SQLException {
        Statement st;
        ResultSet rs;
        String query = "select fk_kategoria from szavak where szo = \'" + GetWordsFromDB.wordFromDB() + "\'";
        st = Database.getCon().createStatement();
        rs = st.executeQuery(query);
        rs.next();
        String categoryNum = rs.getString("fk_kategoria");
        int categoryNumber = Integer.parseInt(categoryNum);
        rs.close();
        return categoryNumber;
    }
}