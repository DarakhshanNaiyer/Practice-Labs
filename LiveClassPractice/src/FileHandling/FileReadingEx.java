package FileHandling;

import java.io.FileReader;
import java.io.IOException; //Note: IOexception is parent of file not found exception also

public class FileReadingEx {

	public static void main(String[] args) throws IOException {
    
		try {
			FileReader reader = new FileReader("d://demo.txt");
//			FileReader reader = new FileReader("d://demo1.txt"); // if in case try reading the file which does not exist!

			int i;

			while ((i=reader.read())!=-1){
			System.out.println((char)i);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	}
