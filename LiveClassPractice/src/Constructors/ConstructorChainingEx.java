package Constructors;

class employee{
	
	public employee() {
		this(1);
		System.out.println("Dafault construstor - Default");
	}
	public employee(int id) {
		this(1, "Daru");
		System.out.println("paramiterized construstor - 1 Parameter");

	}
	public employee(int id, String name ) {
		System.out.println("paramiterized construstor -2 Parameter");

	}

	
}

public class ConstructorChainingEx {
	
 public static void main(String[] args) {
	 
	 employee emp=new employee();
	
}
}
