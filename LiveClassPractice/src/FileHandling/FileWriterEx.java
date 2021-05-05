package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("D://demo.txt");
			writer.write("Hello world!");
			writer.close();
            System.out.println("Content Written to the file successfully!");
            
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
