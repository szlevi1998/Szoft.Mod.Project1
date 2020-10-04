package game;

import DB.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetWordsFromDB {

    public static String wordFromDB() throws SQLException {
        Statement st;
        ResultSet rs;
        String query = "select szo from szavak where id =" + GenerateRandom.generateRandom();

        st = Database.getCon().createStatement();
        rs = st.executeQuery(query);
        rs.next();
        String wordOfDB = rs.getString("szo");

        rs.close();
        return wordOfDB;
    }

}
