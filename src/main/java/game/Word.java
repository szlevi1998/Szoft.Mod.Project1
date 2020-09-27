package game;

import java.util.Scanner;

public class Word {
    Scanner scan = new Scanner(System.in);
    String s = "kutya";
    String c;
    int tips = 0;
    int counter = s.length();

    public void checkIt() {
        System.out.println(s);
        while(counter > 0 && tips != 11){
            c = scan.nextLine();
            while (containSpecialCharacter(c) == true) {
                System.out.println("You are wrong!, do it again.");
                c = scan.nextLine();
            }
            if (s.contains(c)) {
                counter -= 1;
                s = s.replace(c,"");
                System.out.println(s + " " + counter);
            }
            else {
                tips++;
                System.out.println(tips);
            }
        }
        if (counter == 0){
        System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }
    }

    public boolean containSpecialCharacter(String s) {
        return (s == null) ? false : s.matches("[^a-z]");
    }

}
