package game;

import java.sql.SQLException;
import java.util.Random;

public class GenerateRandom {

    public static int generateRandom() throws SQLException {
        Random rand = new Random();
        int rand_int = rand.nextInt(Get_Words_number.getWordsNumber());
        return rand_int;
    }
}
