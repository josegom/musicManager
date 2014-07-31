package com.josegom.musicManager.view.fx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
*
* @author cdea
*/
public class InitializeConfigSong implements Initializable{


    @FXML
    private GridPane greadpane;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));
        greadpane.add(label, 0, 0);
    }
}
