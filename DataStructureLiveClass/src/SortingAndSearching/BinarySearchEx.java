package SortingAndSearching;

public class BinarySearchEx {
	
	// T&C for Binary Search is that  the elements should in sorted order
	// Whenever the length is divided into half the time complexity is O(log n)
	
	public static int binarySearch (int [] array, int target){

		var left=0;
		var right= array.length-1;

		while(left<=right){
			int middle=(left+right)/2;
			
			if(array[middle]==target) {
				return middle;
			}
            if (target<array[middle]) {
            	right=middle-1;
            }
            if (target> array[middle]) {
            	left=middle+1;
            }
		 }
		
		return -1;
		}

	public static void main(String[] args) {
		
		int [] numbers={5,10,12,15,20};

		var index = binarySearch(numbers,20);
       
		System.out.println(index != -1? "Element found: " +index:"Not found!");
	}

}
