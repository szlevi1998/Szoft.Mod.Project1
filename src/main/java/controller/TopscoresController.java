package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class TopscoresController {


    @FXML
    public TableColumn gamesPlayed;

    @FXML
    public TableColumn userName;

    @FXML
    public TableColumn gamesWon;

    @FXML
    public Button exitButton;

    @FXML
    public Button backToGame;

    public void backToPlay(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void closeProgram(ActionEvent actionEvent) {
        exitButton.setOnAction(actionEvent1 -> Platform.exit());
    }
}
