package com.josegom.musicManager;

import com.josegom.musicManager.view.fx.ConfigSongController;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 * Created by jmgomez on 31/07/14.
 */
public class Launcher extends Application{

    public static void main(String[] args) {

        Application.launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        ConfigSongController configSong = new ConfigSongController();
        configSong.start(stage);
    }
}
