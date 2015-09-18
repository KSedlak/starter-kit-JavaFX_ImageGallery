package com.capgemini.starterkit.imagegallery.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.capgemini.starterkit.imagegallery.dataProvider.imageProvider;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;


public class Controller {


@FXML
ResourceBundle resources;

@FXML
URL location;

@FXML
ImageView imageView;
@FXML
Button chooseButton;






@FXML
public void directoryChooserAction(ActionEvent event) throws Exception {
    DirectoryChooser directoryChooser = new DirectoryChooser();
    File selectedDirectory =
            directoryChooser.showDialog(new Stage());


	if(selectedDirectory == null){
     //TODO
    }else{
    	imageProvider im =new imageProvider();
    im.listRecursive(selectedDirectory.getAbsolutePath());
    imageView.setImage(im.getCurrentImage());
    }
}



}