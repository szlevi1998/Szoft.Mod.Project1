package controller;

import game.GetCategoryFromDB;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import lombok.Getter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class GameController {
    MyWord myWord = new MyWord(GetWordsFromDB.wordFromDB());
    GetCategoryFromDB category = new GetCategoryFromDB();
    @FXML
    private Label markLabel;

    @FXML
    private Label categoria;

    @FXML
    private String button_value;

    @FXML
    private int counter = 0;

    @FXML
    private int gamesPlayed = 0;

    @FXML
    private int gamesWon = 0;

    @FXML
    private ImageView hangManPicture;

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
        try {
            checkGameEnded();
        }
        catch (IOException exception){
            System.out.println("IOException occurred");
        }
        setHangManImage();
    }

    private void checkGameEnded() throws  IOException{
        if (counter == 11){
            gamesPlayed++;
            showLoserPopUp();
        }
        if (myWord.isGuessed()){
            gamesPlayed++;
            gamesWon++;
            showWinnerPopUp();
        }
    }

    private void setHangManImage(){
        hangManPicture.setImage(new Image(new File("/images/"+counter+".jpg").toURI().toString()));
    }

    private void showWinnerPopUp() throws  IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/winnerRestart.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void showLoserPopUp() throws  IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/restart.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void restartGame(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void goToLeaderboard(ActionEvent actionEvent) {
    }
}

