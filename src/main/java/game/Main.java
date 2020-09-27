package game;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Names name = new Names();
        //name.askConnectionQuery();
        //name.askConnectionInsert();
        Word first = new Word();
        first.checkIt();
        //first.getTheLengthWithMarks();
        //first.wordAskConnectionQuery();
    }
}
