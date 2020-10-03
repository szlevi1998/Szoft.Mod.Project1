package game;

import java.util.ArrayList;

public class Keyboard {
    private static ArrayList<String> stringArray = new ArrayList<>();

    public Keyboard() {
        char c;
        String s;
        for (c = 'a';c <='z';c++){
            s = String.valueOf(c);
            stringArray.add(s);
        }
    }
    public String getValueFromArray(int num){
        return stringArray.get(num);
    }
}
