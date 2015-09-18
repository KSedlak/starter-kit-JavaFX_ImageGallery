package com.capgemini.starterkit.imagegallery.dataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import javafx.scene.image.Image;

public class imageProvider {

	List<Image> listImagesInDirectory;
	String directory;
	public String getDirectory() {
		return directory;
	}
	public imageProvider(String directory) {
		super();
		this.directory = directory;
	}




public void Raz(String path) throws IOException{
	listRecursive(path);
}

private static void listRecursive(String path) throws IOException {
	Files.list(new File(path).toPath())
    .filter(p -> !p.getFileName()
                   .toString().endsWith(".jpg"))
    .forEach(System.out::println);
}












}
