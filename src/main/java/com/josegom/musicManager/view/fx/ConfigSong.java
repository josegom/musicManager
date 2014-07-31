package com.josegom.musicManager.view.fx;

import javafx.application.Application;
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
public class ConfigSong {


    @FXML
    private GridPane greadpane;

		public void print(Stage stage) {

            Parent root = null;
            try {





                URL resource = getClass().getResource("SongInformation.fxml");
                root = FXMLLoader.load(resource);
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.setTitle("MusicManager Welcome");

                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }

		}


}
