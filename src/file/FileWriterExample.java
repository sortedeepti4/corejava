package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) {
		
		String filePath= "c:\\Java3\\test.txt";
		
		File f= new File(filePath);
		
		System.out.println("file creation");
		
		if(f.exists()) {
			System.out.println("file alredy created");
			
		}else {
			
			try {
				
				f.createNewFile();
			} catch ( IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				
				System.out.println(e);
			}
		}
		System.out.println("file ceated successfully");
		
		//File Writer------------------------
		
		try {
			
			FileWriter fw= new FileWriter(filePath);
			fw.write("hello deepti how r u dfgdfgdfgggfg ghjghjj");
			fw.write("\tdeepti");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
