package FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataIntofile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Java Eclipse\\File_Handling\\file2.txt");
		System.out.println("Name"+f1.getName());
		System.out.println("Parent"+f1.getParent());
		String str= "This is Darakhshan Naiyer's Java Practice!";

 
	FileWriter writer;
	try {
		writer = new FileWriter (f1);
		writer.write(str);
		writer.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Data Saved!");
	
	}
	

	}


