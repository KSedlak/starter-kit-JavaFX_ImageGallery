package com.capgemini.starterkit.imagegallery;





import com.capgemini.starterkit.imagegallery.controller.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {



    	FXMLLoader loader = new FXMLLoader(App.class.getResource("fxml/" + "primary" + ".fxml"));
		loader.setController(new Controller(primaryStage));// to share
																	// model
																	// between
																	// controlers
		Scene primaryScene= new Scene(loader.load());
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        primaryScene.getStylesheets().add(getClass().getResource("css/standard.css").toExternalForm());
    //	FlatterFX.style();
    }






}