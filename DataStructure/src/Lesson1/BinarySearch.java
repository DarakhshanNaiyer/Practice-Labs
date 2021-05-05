package Lesson1;


// Example of Logarithmic Complexity Algorithm

public class BinarySearch {
	
	public boolean binarysearch (int x /*Number to be searched*/, int[] sortedNumbers/*Where to search*/) {
		
		int end = sortedNumbers.length-1;
		int start=0;
		while(start<=end) {
			int mid= (end-start)/2+start;
			if(sortedNumbers[mid]==x)
				return true;
		
		    else if(sortedNumbers[mid]>x)
		    	end=mid-1; 
		
		    else start=mid+1;
		}
		return false;
	}

	public static void main(String[] args) {
		BinarySearch BN = new BinarySearch();
		
		System.out.println(BN.binarysearch(7, new int [] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(BN.binarysearch(0, new int[] {1,2,3,4,5,6,7,8,9,10}));
	}

}
