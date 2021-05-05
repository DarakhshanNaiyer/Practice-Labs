package Constructors;

class Person{

int id;
String name;

public Person() {
	super();
	this.id = 101;
	this.name = "King";
}

	public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

	public void display() {
		System.out.println("Id: " +id + "Name: " +name);


	}
}

class Customer extends Person{
	
	float amount;

	public Customer() {
		super();
		this.amount = 1054.98F;
	}
	
	public Customer(int id, String name, float amount) {
		super();
		this.amount = amount;
	}

	public void display() {
		super.display(); // to call values of parent class also
		System.out.println("Amount:"+amount);
	
	}

}

public class ConstructorChainingEx2 {

	public static void main(String[]args) {
			
//   Customer customer= new Customer();
//   
//   customer.display();
//   
		// below code is calling only paramiterized constructor
		
		Customer customer= new Customer(101,"King",10000 ); 
		   
		   customer.display();
		   
	}

}
