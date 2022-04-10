package com.java.app.students;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ControllerStartWin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button singIn_button;

    @FXML
    private Button singUp_button;

    @FXML
    private AnchorPane start_anchorPane;

    @FXML
    void singUpButtonMouseEntered(MouseEvent event) {
        //66A5D1
        //0A64A3
        singUp_button.setStyle("-fx-background-color: #0A64A3");
    }

    @FXML
    void singUpButtonMouseExited(MouseEvent event) {
        singUp_button.setStyle("-fx-background-color: #66A5D1");
    }
    @FXML
    void singInButtonMouseEntered(MouseEvent event) {
        //66A5D1
        //0A64A3
        singIn_button.setStyle("-fx-background-color: #0A64A3");
    }

    @FXML
    void singInButtonMouseExited(MouseEvent event) {
        singIn_button.setStyle("-fx-background-color: #66A5D1");
    }

    @FXML
    void initialize() {
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'adminWin.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'adminWin.fxml'.";
        assert singIn_button != null : "fx:id=\"singIn_button\" was not injected: check your FXML file 'adminWin.fxml'.";
        assert singUp_button != null : "fx:id=\"singUp_button\" was not injected: check your FXML file 'adminWin.fxml'.";
        assert start_anchorPane != null : "fx:id=\"start_anchorPane\" was not injected: check your FXML file 'adminWin.fxml'.";

    }

}
