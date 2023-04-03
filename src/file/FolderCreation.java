package file;

import java.io.File;
import java.io.IOException;

public class FolderCreation {
	
	
	public static void main(String[] args) {
		
		//Folder creation
		
		String folderPath="Java3\\core\\demo";
		
		File f=new File(folderPath);
		
		boolean d=f.exists();
		System.out.println(d);
		   try {
			   f.mkdirs();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
			
			
			System.out.println("--------------");
		
		
		
		
	
	

}
	}
