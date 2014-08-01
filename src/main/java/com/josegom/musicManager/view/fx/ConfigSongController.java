package com.josegom.musicManager.view.fx;

import com.josegom.musicManager.fileManager.FileManager;
import com.josegom.musicManager.musicPlayer.RytmboxPlayer;
import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
*
* @author cdea
*/
public class ConfigSongController extends  Application{


    FileManager fileManager = new FileManager();
    String[] files;
    int fileIndex = 0;



		public void start(Stage stage) {

            Parent root = null;
            try {

                files = fileManager.readAllSourcesFiles();
                FXMLLoader loader = new FXMLLoader();
                URL resource = getClass().getResource("SongInformation.fxml");

                root = loader.load(resource);
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.setTitle("MusicManager Welcome");

                stage.show();

                System.out.println("End");
            } catch (IOException e) {
                e.printStackTrace();
            }

		}









}
