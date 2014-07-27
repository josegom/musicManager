package com.josegom.musicManager.fileManager.view.fx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
*
* @author cdea
*/
public class HelloWorldMain extends Application {
         /**
		* @param args the command line arguments
		*/
		public static void main(String[] args) {
		Application.launch(args);
		}
		@Override
		public void start(Stage primaryStage) {
			Group root = new Group();
			Scene scene = new Scene(root, 300, 250, Color.WHITE);
		primaryStage.setTitle("Completar Canción");
		GridPane gridpane = new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setHgap(5);
		gridpane.setVgap(5);
		Label fNameLbl = new Label("Título");
		TextField fNameFld = new TextField();
		Label lNameLbl = new Label("Cantante");
		TextField lNameFld = new TextField();
		Button saveButt = new Button("Save");
		// First name label
		GridPane.setHalignment(fNameLbl, HPos.RIGHT);
		gridpane.add(fNameLbl, 0, 0);
		// Last name label
		GridPane.setHalignment(lNameLbl, HPos.RIGHT);
		gridpane.add(lNameLbl, 0, 1);
		// First name field
		GridPane.setHalignment(fNameFld, HPos.LEFT);
		gridpane.add(fNameFld, 1, 0);
		// Last name field
		GridPane.setHalignment(lNameFld, HPos.LEFT);
		gridpane.add(lNameFld, 1, 1);
		// Save button
		GridPane.setHalignment(saveButt, HPos.RIGHT);
		gridpane.add(saveButt, 1, 2);
		root.getChildren().add(gridpane);
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		}
