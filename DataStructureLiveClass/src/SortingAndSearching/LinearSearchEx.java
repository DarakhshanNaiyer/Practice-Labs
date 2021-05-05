package SortingAndSearching;

public class LinearSearchEx {
	
	 // Simplest search algorithm 
	//Time complexity in Best case is O(1)
	//Time complexity in Best case is O(n)

	
	public static int linearSearch(int array[], int target){

		for (int i=0; i<array.length; i++) {
		  if (array[i]==target){
		   return i;
		  }

		}
        return -1;
}

	public static void main(String[] args) {
       
		int [] numbers={7,1,3,6,5};

		var index = linearSearch(numbers,6);
       
		System.out.println(index != -1? "Element found":"Not found!");
	}

}
