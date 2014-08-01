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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
*
* @author cdea
*/
public class ConfigSongForm {


    FileManager fileManager = new FileManager();
    String[] files;
    int fileIndex = 0;

    @FXML
    private Text textField;


    public Text getTextField()
    {
        return textField ;
    }


    public void setTextField(Text textField) {
        this.textField = textField;
    }



    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        ;
    }

    public StringProperty textProperty() {
        return textField.textProperty();
    }

    @FXML protected void aceptAction(ActionEvent event){
        System.out.println("aceptAction");
    }

    @FXML protected void playAction(ActionEvent event){
        RytmboxPlayer player = new RytmboxPlayer();

        files = fileManager.readAllSourcesFiles();
        System.out.println(files[fileIndex]);
        player.play(fileManager.getMusicPath()+ File.separator+files[fileIndex]);
    }
    @FXML protected void nextAction(ActionEvent event){
        fileIndex++;
        System.out.println(fileIndex);

    }

    @FXML
    public void initialize()
    {
        System.out.println("Swear a lot!");

        System.out.println(textField);
        textProperty().set("Configure Song");
    }


}
