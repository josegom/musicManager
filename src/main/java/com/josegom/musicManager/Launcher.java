package com.josegom.musicManager;

import com.josegom.musicManager.view.fx.ConfigSongController;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 * This class must launchs the applicataion.
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
