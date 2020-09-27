package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class LaunchController {

    @FXML
    private TextField userNameField;

    @FXML
    private ChoiceBox korOsztaly;

    @FXML
    private ChoiceBox kategoria;

    @FXML
    private Label kategoriaNev;

    @FXML
    private Label korOsztalyNev;

    @FXML
    private Label errorLabel;


    public LaunchController() {
    }

    public void notEmpty(KeyEvent keyEvent) {

            visible();

    }

    public void startAction(ActionEvent actionEvent) throws IOException {

        if (userNameField.getText().isEmpty()){

            errorLabel.setVisible(true);
        } else{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }


    private void visible() {
        korOsztaly.setVisible(true);
        korOsztalyNev.setVisible(true);
        kategoria.setVisible(true);
        kategoriaNev.setVisible(true);
    }


}



