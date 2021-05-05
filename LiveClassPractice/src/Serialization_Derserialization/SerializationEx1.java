package Serialization_Derserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx1 {

	public static void main(String[] args) throws IOException {
		
		Address address= new Address("Civil Lines", "Delhi", "india");
        		
		Employee emp = new Employee(101, "King", "Sales", address);

		FileOutputStream fout = new FileOutputStream ("d://employee.ser");// .ser extension is mandatory for serialization.

		ObjectOutputStream outStream = new ObjectOutputStream(fout);

		outStream.writeObject(emp);
		
		System.out.println("Obeject is serialized successfully.");
		outStream.close();
		fout.close();

	}

}
