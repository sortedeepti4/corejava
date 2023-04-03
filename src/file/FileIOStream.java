package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOStream {
	
	public static void main(String[] args) {
		
		int a= 10;
		
		String readLocation= "c:\\java3\\Ayurvedic.jpg";
		String writeLocation="c:\\java4\\demo.jpg";
		try {
			InputStream is= new FileInputStream(readLocation);
			
			OutputStream os= new FileOutputStream(writeLocation);
			
			int content=is.read();
			
			while(content!=-1) {
				os.write(content);
				 content=is.read();
			}
			os.flush();
			os.close();
			
			System.out.println("file copied successfully");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
