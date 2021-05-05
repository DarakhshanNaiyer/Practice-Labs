package BigONotations;

public class ConstantNotation {
	
	public static void  display(int [] numbers){
		
		// Time complexity o(1) as the program is executing only once
		
        // O(1)
		System.out.println(numbers[0]);	
		
		
		//O(1)
		System.out.println(numbers[1]);
		// O(1)+O(1)=O(1) // Overall complexity of this Program
		}
	

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		display(numbers);
	}

}
