package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		//file creation
		String filePath= "c:\\Java3\\test.txt";
		File f= new File(filePath);
		
		if(f.exists()) {
			System.out.println("file already created");
		}else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			
			System.out.println("file successfully");
		}
		System.out.println("-----file writer----");
		
		try {
			FileWriter fw= new FileWriter(filePath,true);
			fw.write("hello deepti how r u");
			fw.write("\tdeepti");
			fw.write("                                       x");
			fw.flush();
			fw.close();
			
			System.out.println("file write successfully");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("File Reader");
		
		try {
			FileReader fr= new FileReader(filePath);
			int word=fr.read();
		System.out.println(word);

		while(word!=-1) {
				System.out.println((char)word);//convert int into char
			word=fr.read();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
				
	}

}
