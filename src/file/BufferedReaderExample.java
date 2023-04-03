package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {

		String filepath = "c:\\java3\\demo2.txt";

		try {

			FileReader fr = new FileReader(filepath);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();

			while (line != null) {

				System.out.println(line);
				line = br.readLine();

			}

			System.out.println("success");

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
