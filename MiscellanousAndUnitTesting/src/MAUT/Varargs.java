package MAUT;

public class Varargs {
	
	static void display (String...Values) {
		System.out.println("Sample Varargs method");
		System.out.println(Values.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       display (); //Zero arguments
       display("i","am","arrays","method");//four arguments
       
	}

}
