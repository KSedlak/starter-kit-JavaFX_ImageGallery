package com.capgemini.starterkit.imagegallery;



import java.io.IOException;

import com.guigarage.flatterfx.FlatterFX;
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


    	Scene primaryScene=getSceneFromFXML("primary");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        primaryScene.getStylesheets().add(getClass().getResource("css/standard.css").toExternalForm());
    	FlatterFX.style();
    }


	   private  static Scene getSceneFromFXML(String fxmlName) throws IOException{
		   	return  new Scene(FXMLLoader.load(App.class.getResource("fxml/"+fxmlName+".fxml")));

		    }





}