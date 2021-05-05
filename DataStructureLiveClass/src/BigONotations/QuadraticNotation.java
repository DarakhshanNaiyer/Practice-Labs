package BigONotations;

public class QuadraticNotation {

	public static void display(int [] numbers){
		
		// Overall Complexity O(n^2+n)=O(n^2)
		
		// O(n*n)
		//O(n^2) - Quadratic Notation
		
		//**** Nested for loop is always a Big O(n^2)
		
		for (int first:numbers){                        //O(n)
		     for (int second:numbers){                  //O(n)
		         System.out.println(first+":"+second);
		  }
		     
		}
		
		//O(n)
		// O(n^2+n)=O(n^2)
		for (int third:numbers){                  //O(n)
	         System.out.println(third);
		}
	}
	
public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6};
		
		String[] Names = {"Daru","Layba","D"};
		
 		display(numbers);
	}

}
