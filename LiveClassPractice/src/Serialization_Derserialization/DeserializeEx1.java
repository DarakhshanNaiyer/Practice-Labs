package Serialization_Derserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEx1 {
	
  public static void main(String[] args)throws IOException, ClassNotFoundException {
	

	FileInputStream fin = new FileInputStream ("d://employee.ser");
	
	ObjectInputStream outIn = new ObjectInputStream(fin);
	
	Employee emp = (Employee)outIn.readObject();
	
	System.out.println(emp);
    System.out.println("Object has been read successfully!");
	outIn.close();
	fin.close();
}
}