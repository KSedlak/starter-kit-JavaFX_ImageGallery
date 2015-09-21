package com.capgemini.starterkit.imagegallery.imageReader;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

public class imageReader {



public  static Image convertFileToImage(File f){
	 Image image = null;
	 try {
         BufferedImage bufferedImage = ImageIO.read(f);
         image = SwingFXUtils.toFXImage(bufferedImage, null);

     } catch (IOException ex) {

     }

	return image;
}


}
