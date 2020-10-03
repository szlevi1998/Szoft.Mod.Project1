package game;

import java.util.ArrayList;

public class MyWord {
    private ArrayList<CharOfWord> word = new ArrayList<>();
    private ArrayList<Character> wordMarks = new ArrayList<>();


    public MyWord(String word) {
        for (int i = 0; i < word.length();i++) {
            this.word.add(new CharOfWord(word.charAt(i)));
        }
    }

    public ArrayList<Character> displayWord(){
        if (wordMarks.isEmpty()) {
            for (int j = 0; j < this.word.size(); j++) {
                wordMarks.add(word.get(j).displayedValue());
            }
            System.out.println(wordMarks);
            return wordMarks;
        }
        else {
            wordMarks.clear();
            for (int j = 0; j < this.word.size(); j++) {
                wordMarks.add(word.get(j).displayedValue());
            }
            System.out.println(wordMarks);
            return wordMarks;
        }
    }

    public String getStringRepresentation(ArrayList<Character> wordMarks)
    {
        StringBuilder builder = new StringBuilder(wordMarks.size());
        for(Character ch: wordMarks)
        {
            builder.append(ch);
        }
        return builder.toString();
    }
}
