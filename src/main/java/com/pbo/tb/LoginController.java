package com.pbo.tb;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    @FXML
    public void login() throws IOException {

        Window owner = submitButton.getScene().getWindow();

        String emailText = emailField.getText();
        String passwordText = passwordField.getText();

        boolean flag = emailText.equals("Dimaz") &&  passwordText.equals("12345");

        if (!flag) {
            showAlert(Alert.AlertType.ERROR,owner, "Login Error", "Please enter correct Email and Password");
        } else {
            showAlert(Alert.AlertType.INFORMATION,owner, "Login Success", "Your Login is Successfully !");
            Main.showMainView();
        }
    }


    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}