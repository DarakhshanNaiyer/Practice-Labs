package BigONotations;

public class LinearNotation {
	
	public static void display(int [] numbers, String Names[]){
		
		// Time Complexity is o(n) as length is not always defined and the loop is being executed till the length of array
		
		//O(n)
		for (int i=0; i<numbers.length; i++)
		System.out.println(numbers[i]);
		
		
	    //O(n)
		// O(n)+O(n)=O(n)
	    for (int number: numbers){
		System.out.println(number);
		}
	    
	    
	    //O(m)
	    //O(n)+O(m)=O(n) //Overall complexity of this Program
	    for(String name: Names) {
	    	System.out.println(name);
	    }
	    
	}
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6};
		
		String[] Names = {"Daru","Layba","D"};
		
 		display(numbers, Names);
	}

}
