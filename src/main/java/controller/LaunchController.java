package controller;

import game.Names;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.Getter;

import java.io.IOException;
import java.sql.SQLException;

@Getter
public class LaunchController {

    @FXML
    public Button closeButtonAction;

    @FXML
    private String userName;

    @FXML
    private TextField userNameField;

    @FXML
    private Label errorLabel;

    public LaunchController() {
    }

    public void startAction(ActionEvent actionEvent) throws IOException, SQLException {
        if (userNameField.getText().isEmpty()) {
            errorLabel.setVisible(true);
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            Names name = new Names();
            name.askConnectionInsert(userNameField.getText());
        }
    }

    public void exitProgram(ActionEvent actionEvent) {
        closeButtonAction.setOnAction(actionEvent1 -> Platform.exit());
    }
}



