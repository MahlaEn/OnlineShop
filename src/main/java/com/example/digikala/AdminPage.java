package com.example.digikala;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminPage {
    private Parent root;
    private Scene scene;
    private Stage stage;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label label;
    public void AddAdmin(ActionEvent event) {
        DigikalaService.AddAdmin(username.getText(),password.getText());
        label.setText("Done!");

    }
    public void AddSeller(ActionEvent event) {
        DigikalaService.AddSeller(username.getText(),password.getText());
        label.setText("Done!");
    }
    public void GoMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
