package controller;

import game.GetWordsFromDB;
import game.MyWord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import lombok.Getter;

import java.io.IOException;
import java.sql.SQLException;

public class GameController {
    MyWord myWord = new MyWord(GetWordsFromDB.wordFromDB());
    GetCategoryFromDB category = new GetCategoryFromDB();
    @FXML
    private Label markLabel;

    @FXML
    private Label lost;

    @FXML
    private String button_value;

    @FXML
    private int counter = 0;

    public GameController() throws SQLException {
    }

    @FXML
    private void initialize() throws SQLException {
        new MyWord(GetWordsFromDB.wordFromDB());
        markLabel.setText(myWord.getDisplayWord());
        categoria.setText(category.categoryFromDB());
    }

    public void buttonClick(ActionEvent actionEvent) throws IOException, SQLException {
        ((Button)actionEvent.getSource()).setVisible(false);
        button_value = ((Button)actionEvent.getSource()).getText();
        if(myWord.checkTheValue(button_value.charAt(0))){
            markLabel.setText(myWord.getDisplayWord());
        }
        else{
            increaseCounter();
        }
    }

    public int getCounter() {
        return counter;
    }

    public String getButton_value() {
       return button_value;
    }

    public void increaseCounter(){
        counter += 1;

        if (counter == 11){
            lost.setText("You lost");
        }
    }
}

