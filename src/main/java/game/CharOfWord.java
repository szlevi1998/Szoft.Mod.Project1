package game;

public class CharOfWord {
    private boolean isFound;
    private char letterValue;

    public CharOfWord(char myWordChar){
        this.letterValue = myWordChar;
        isFound = false;
    }

    public char displayedValue(){
        if(isFound){
            return letterValue;
        }else{
            return '_';
        }
    }

    public boolean isFound() {
        return isFound;
    }

    public void setFound(boolean found) {
        isFound = found;
    }

    public char getLetterValue() {
        return letterValue;
    }
}
