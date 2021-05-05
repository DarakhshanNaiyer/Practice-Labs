package Serialization_Derserialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
  private static final long serialVersionUID = -8764299968164266189L;
	
     int id;
     String Name;
     transient String Departement;
     transient Address address;
    

	public Employee(int id, String name, String departement) {
		super();
		this.id = id;
		Name = name;
		Departement = departement;
	}
	 
		public Employee(int id, String name, String departement, Address address) {
		super();
		this.id = id;
		Name = name;
		Departement = departement;
		this.address = address;
	}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", Name=" + Name + ", Departement=" + Departement + ", address=" + address
					+ "]";
		}

		
}
