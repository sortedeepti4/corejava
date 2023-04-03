package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {

		String filepath = "c:\\java3\\demo2.txt";

		try {
			FileWriter fw = new FileWriter(filepath);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("hello how ru");
			bw.newLine();
			bw.write("welcome to core java");
			bw.flush();
			bw.close();
			System.out.println("successfully created");

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
