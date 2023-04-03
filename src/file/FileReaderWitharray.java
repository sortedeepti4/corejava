package file;

import java.io.File;
import java.io.FileReader;

public class FileReaderWitharray {
	public static void main(String[] args) {
		String filepath="c:\\java3\\test.txt";
		
		try {
			File f = new File(filepath);
		int filesize=(int)f.length();
		
		char[] array=new char[filesize];
		System.out.println(filesize);
			FileReader fr= new FileReader(f);
			fr.read(array);
			System.out.println(array);
			for(char a:array) {
				System.out.println(a);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			
		}
		
		
	}

}
