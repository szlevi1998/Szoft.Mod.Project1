package game;

import DB.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Get_Words_number {

    public static int getWordsNumber() throws SQLException {
        Statement st;
        ResultSet rs;
        ArrayList<String> array = new ArrayList<>();
        String query = "select szo from szavak";

        st = Database.getCon().createStatement();
        rs = st.executeQuery(query);
        rs.next();
        while(rs.next()){
            array.add(rs.getString("szo"));
        }
        int value = array.size();
        rs.close();
        return value;
    }
}
