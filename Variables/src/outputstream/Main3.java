package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	FileOutputStream Fout = new FileOutputStream("f.txt");
	
	Fout.write(68);
	Fout.close();
	
////	String d="i am Daru";
//	byte b[]= d.getBytes();
//	Fout.write(b);
//	Fout.close();
	
	
	

	System.out.println("Success");	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
 
}
