package Package1;

import java.util.Scanner;

public class Students {

	private String name;
	private int age;
	private int id;
	
	protected Scanner Scanner= new Scanner(System.in);
	
	public void acceptdetails() {
		System.out.println("Enter Name:");
		this.name=Scanner.nextLine();
		System.out.println("Enter Id:");
		this.id=Scanner.nextInt();

		System.out.println("Enter age");
		this.age=Scanner.nextInt();
	}
	
	public void displaydetails() {
		System.out.println("Details:");
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);

	}
	
	
		
}
