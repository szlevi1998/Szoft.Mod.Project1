package game;

import DB.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Word {
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    String query = "select szo from szavak where id =" + generateRandom();
    Scanner scan = new Scanner(System.in);
    String s = wordAskConnectionQuery();
    ArrayList<Character> solution = new ArrayList<>(s.length());

    public Word() throws SQLException {
    }

    public void checkIt(){
        System.out.println(s);
        int tips = 0;
        int counter = s.length();
        while(counter > 0 && tips != 11){
            String c = scan.nextLine();
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
        System.out.println("You won!" + solution);
        }
        else {
            System.out.println("You lost!");
        }
    }

    public boolean containSpecialCharacter(String s) {
        return (s == null) ? false : s.matches("[^a-z]");
    }

    public String getTheLengthWithMarks() {
        String mark = "";
        for (int i = 0;i < s.length();i++) {
            mark = mark + "_" + " ";
        }
        System.out.println(mark);
        return mark;
    }
    public int generateRandom() {
        Random rand = new Random();
        int rand_int = rand.nextInt(9);
        return rand_int;
    }

    public String wordAskConnectionQuery() throws SQLException {
        Database db = new Database();
        st = Database.getCon().createStatement();
        rs = st.executeQuery(query);
        rs.next();
        String wordOfDB = rs.getString("szo");
        rs.close();
        return wordOfDB;
    }
}
