package game;

import java.util.ArrayList;

public class MyWord {
    private ArrayList<CharOfWord> word = new ArrayList<>();

    public MyWord(String word) {
        word = word.toUpperCase();
        for (int i = 0; i < word.length();i++) {
            this.word.add(new CharOfWord(word.charAt(i)));
        }
    }

    public String getDisplayWord(){
        StringBuilder builder = new StringBuilder(word.size());
        for(CharOfWord ch: word){
            builder.append(ch.displayedValue());
        }
        return builder.toString();
    }

    public boolean checkTheValue(char value){
        boolean validGuess = false;
        for (var pina : word) {
            if(pina.getLetterValue() == value) {
                pina.setFound(true);
                validGuess = true;
            }
        }
        return validGuess;
    }
}
