package game;

import controller.GameController;

import java.sql.SQLException;
import java.util.Random;

public class MarkTheWord {

    public static String getTheLengthWithMarks(String word) throws SQLException {
        GameController gc = new GameController();
        String mark = "";
        String c = gc.getButton_value();
        for (int i = 0;i < word.length();i++) {
            mark = mark + "_" + " ";
        }
        if(gc.getCounter() == 0){
            return mark;
        }
        else{
            for (int j = 0;j < word.length();j++) {
                if((Character.toString(word.charAt(j)).equals(c))){
                    int space = j;

                }
            }
        }
        return mark;
    }
}
