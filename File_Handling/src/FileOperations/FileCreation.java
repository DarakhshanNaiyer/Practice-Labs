package FileOperations;

import java.io.IOException;
import java.io.File;

public class FileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 File f1 = new File ("C:\\Java Eclipse\\File_Handling\\file2.txt");
 
 System.out.println("Name:"+f1.getName());
 System.out.println("Parent:"+f1.getParent());
 try {
	 if (f1.createNewFile()) {
		 System.out.println(f1.getName()+"Created!");
	 }
	 else {
		 System.out.println(f1.getName()+"could not created!");
		 }}
	 catch (IOException e) {
		 e.printStackTrace();
		 
	 }
 }
	}


