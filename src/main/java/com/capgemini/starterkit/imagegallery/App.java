package com.capgemini.starterkit.imagegallery;



import com.guigarage.flatterfx.FlatterFX;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    	Parent root = FXMLLoader.load(getClass().getResource("fxml/primary.fxml"));
    	Scene primaryScene=new Scene(root);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        primaryScene.getStylesheets().add(getClass().getResource("css/standard.css").toExternalForm());
    	FlatterFX.style();
    }
}