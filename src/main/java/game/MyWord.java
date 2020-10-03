package game;

import java.util.ArrayList;

public class MyWord {
    private ArrayList<CharOfWord> word = new ArrayList<>();

    public MyWord(String word) {
        for (int i = 0; i < word.length();i++) {
            this.word.add(new CharOfWord(word.charAt(i)));
        }
    }


}
