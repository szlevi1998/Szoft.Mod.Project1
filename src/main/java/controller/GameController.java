package controller;

import game.GetWordsFromDB;
import game.MarkTheWord;
import game.MyWord;
import game.Names;
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
    @FXML
    MyWord myWord = new MyWord(GetWordsFromDB.wordFromDB());
    @FXML
    private Label markLabel;

    @FXML
    private String button_value;

    @FXML
    private int counter = 0;

    public GameController() throws SQLException {
    }

    @FXML
    private void initialize() throws SQLException {
        new MyWord(GetWordsFromDB.wordFromDB()).displayWord();
        markLabel.setText(myWord.getStringRepresentation(myWord.displayWord()));
    }

    public void buttonClick(ActionEvent actionEvent) throws IOException, SQLException {
        ((Button)actionEvent.getSource()).setVisible(false);
        button_value = ((Button)actionEvent.getSource()).getText();
        counter += counter;
    }

    public int getCounter() {
        return counter;
    }

    public String getButton_value() {
        return button_value;
    }
}

