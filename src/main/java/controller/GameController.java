package controller;

import game.GetCategoryFromDB;
import game.GetWordsFromDB;
import game.MyWord;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

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
    public Button closeProgram;

    @FXML
    public Button giveUpButton;

    @FXML
    private int counter = 0;

    @FXML
    private int gamesPlayed = 0;

    @FXML
    private int gamesWon = 0;

    @FXML
    private ImageView hangManPicture;

    private StateController stateController = new StateController();


    public GameController() throws SQLException {
    }

    @FXML
    private void initialize() throws SQLException {
        new MyWord(GetWordsFromDB.wordFromDB());
        markLabel.setText(myWord.getDisplayWord());
        categoria.setText(category.categoryFromDB());
    }

    public void buttonClick(ActionEvent actionEvent) throws IOException, SQLException {
        ((Button) actionEvent.getSource()).setVisible(false);
        button_value = ((Button) actionEvent.getSource()).getText();
        if (myWord.checkTheValue(button_value.charAt(0))) {
            markLabel.setText(myWord.getDisplayWord());
        } else {
            increaseCounter();
        }
    }

    public int getCounter() {
        return counter;
    }

    public String getButton_value() {
        return button_value;
    }

    public void increaseCounter() {
        counter += 1;
        try {
            checkGameEnded();
        } catch (IOException exception) {
            System.out.println("IOException occurred");
        }
        setHangManImage();
    }

    private void checkGameEnded() throws IOException {
        if (counter == 11) {
            gamesPlayed++;
            stateController.showLoserPopUp();
        }
        if (myWord.isGuessed()) {
            gamesPlayed++;
            gamesWon++;
            stateController.showWinnerPopUp();
        }
    }

    private void setHangManImage() {
        // Még mielőtt elindítod a programot, a működéshez megkell változtatni a fájl elérési helyét.

        File file = new File("C:/Users/szlev/IdeaProjects/Szoft.Mod.Project1/src/main/resources/images/" + counter + ".jpg");
        System.out.println(file.toString());
        hangManPicture.setImage(new Image(file.toURI().toString()));
    }


    public void exitProgram(ActionEvent actionEvent) {
        closeProgram.setOnAction(actionEvent1 -> Platform.exit());
    }

    public void goToLeaderboard(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/leaderboard.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

