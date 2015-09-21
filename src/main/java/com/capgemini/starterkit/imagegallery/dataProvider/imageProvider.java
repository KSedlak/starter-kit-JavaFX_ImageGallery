package com.capgemini.starterkit.imagegallery.dataProvider;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import com.capgemini.starterkit.imagegallery.imageReader.imageReader;
import javafx.scene.image.Image;

public class imageProvider {

	private static void filterFiles(String path, List<Image> listImages) throws Exception {

		Files.list(new File(path).toPath()).filter(p -> p.getFileName().toString().endsWith(".jpg"))
				.forEach(imagePath -> listImages.add(imageReader.convertFileToImage((imagePath.toFile()))));
	}

	public static List<Image> getImages(String path) throws Exception {
		List<Image> list = new ArrayList<Image>();
		filterFiles(path, list);
		return list;
	}

}
