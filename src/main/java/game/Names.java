package game;
import DB.Database;
import java.sql.*;
import java.util.ArrayList;

public class Names {
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    String query = "select * from user";
    String query2 = "insert into user(nev,jatszott,nyert) values(?,?,?)";
    ArrayList<String> array = new ArrayList<>();

    public void askConnectionQuery() throws SQLException {
        Database db = new Database();
        st = Database.getCon().createStatement();
        rs = st.executeQuery(query);
        while(rs.next()){
            array.add(rs.getString("nev"));
        }
        System.out.println(array);
        st.close();
    }

    public void askConnectionInsert() throws SQLException {
        Database db = new Database();
        st = Database.getCon().createStatement();
        pst = Database.getCon().prepareStatement(query2);
        pst.setString(1,"Martin");
        pst.setInt(2,0);
        pst.setInt(3,0);
        int count = pst.executeUpdate();

        System.out.println(count + "row/s affected");

        pst.close();
    }
}
