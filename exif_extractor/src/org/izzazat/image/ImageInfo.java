package org.izzazat.image;

import java.io.File;
import java.io.IOException;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

public class ImageInfo {

	
public static void main(String args[]){
	
	File jpegFile = new File("IMG_0140.jpg");
	try {
		Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);
		
		for (Directory directory : metadata.getDirectories()) {
		    for (Tag tag : directory.getTags()) {
		        System.out.println(tag);
		    }
		}
		
	} catch (ImageProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
