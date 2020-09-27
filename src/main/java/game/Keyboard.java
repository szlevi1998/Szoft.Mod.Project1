package game;

import java.util.ArrayList;

public class Keyboard {
    private static ArrayList<Character> array = new ArrayList<>();

    public Keyboard() {
        char c;
        for (c = 'a';c <='z';++c){
            array.add(c);
        }
        System.out.println(array);
    }

    public int checkElement(char c) {
        if (array.contains(c)){
            for(int i = 0;i<array.size();i++){
                if(array.get(i) == c){
                    return i;
                }
            }
        }
        return -1;
    }

    public ArrayList<Character> deleteElement(char c){
        array.remove(checkElement(c));
        return array;
    }
}
