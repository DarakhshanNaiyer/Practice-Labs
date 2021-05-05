package OverridingNOverloading;
	
public class Villas extends House {

		// Child class for Overriding method
		void shelter () {
	 		System.out.println(" This is my house");
		}
public static void main(String[] args) {

      Villas obj = new Villas ();
       obj.shelter();
     
		
	}

}
