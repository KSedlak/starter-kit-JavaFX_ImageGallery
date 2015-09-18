package com.capgemini.starterkit.imagegallery.dataProvider;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

public  class imageProvider {

List<Image>listImages=new ArrayList<>();

int pivot=0;;




public  void listRecursive(String path) throws Exception {
	Files.list(new File(path).toPath())
    .filter(p -> p.getFileName()
                   .toString().endsWith(".jpg"))
    .forEach(imagePath -> listImages.add(convertFileToImage((imagePath.toFile())))

    );
}




public Image getCurrentImage(){

	return listImages.get(pivot);
}



public Image convertFileToImage(File f){
	 Image image = null;
	 try {
         BufferedImage bufferedImage = ImageIO.read(f);
         image = SwingFXUtils.toFXImage(bufferedImage, null);

     } catch (IOException ex) {

     }

	return image;
}



}
