package com.capgemini.starterkit.imagegallery.controller;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import com.capgemini.starterkit.imagegallery.dataProvider.ImageProvider;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class Controller{


@FXML
ResourceBundle resources;

@FXML
URL location;

@FXML
ImageView imageView;
@FXML
Button chooseDirectory;
@FXML
Button left;
@FXML
Button right;



List<Image> data;
int pivot;
int angle;

@FXML Button rotateRight;

@FXML Button rotateLeft;

Stage actualStage;

@FXML
GridPane child;

@FXML
GridPane main;

public Controller(Stage s){
	actualStage=s;
}

@FXML
private void initialize() {

	  imageView.fitWidthProperty().bind(actualStage.widthProperty());
	  child.prefWidthProperty().bind(main.widthProperty());
	  child.prefHeightProperty().bind(main.heightProperty());
}



@FXML
public void directoryChooserAction(ActionEvent event) throws Exception {
    DirectoryChooser directoryChooser = new DirectoryChooser();
    File selectedDirectory =
            directoryChooser.showDialog(new Stage());


	if(selectedDirectory == null){
     //TODO
    }else{
    	data=ImageProvider.getImages(selectedDirectory.getAbsolutePath());
    	pivot=0;
    	displayImage();
    }
}
@FXML
public void moveRight(){
increasePivot();
displayImage();
}

@FXML
public void moveLeft(){
	decreasePivot();
	displayImage();
}

public void increasePivot(){
	if(data!=null){
		pivot=(pivot+1)%data.size();
	}
}
public void decreasePivot(){
	if(data!=null){
		pivot=pivot-1;
		if(pivot<0)
		{pivot=data.size()-1;}
	}
}

	public void displayImage(){
	 	angle=0;
		imageView.setImage(getCurrentImage());
		imageView.setRotate(angle);
	}


	public Image getCurrentImage() {

		return data.get(pivot);
	}


@FXML
public void rotateLeft()
{
	imageView.setRotate(angle);
angle=angle-90;
}
@FXML
public void rotateRight()
{
	angle=angle+90;
	imageView.setRotate(angle);
}
}