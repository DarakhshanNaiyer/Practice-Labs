package Keywords;

public class Animal {
	// Super Keyword practical
	String color= "Black";
}
 class Cat extends Animal{
	 String color= "White";
	   
	 void printcolor() {
	   System.out.println(color); // print of cat color
	   System.out.println(super.color); // Animal
		 
	 }
}