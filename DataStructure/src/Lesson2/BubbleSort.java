package Lesson2;

public class BubbleSort {
	
	public static void main(String args[]) {
	int A [] = {9,8,7,6,5};
	int t;
	int flag;
	
	for (int i=0; i<A.length-1; i++) {
		 flag = 0;
		for (int j=0; j<A.length-1-i; j++) {
			if (A[j]>A[j+1]) { // {} bracket because of only one statement.
				t = A[j];
				A[j]= A[j+1];
				A[j+1]= t;
				flag=1;
				
				}
			}
		if(flag==0)
			 break; // no {} bracket because of only one statement.
		}
	for (int k=0; k<A.length; k++) {
	System.out.println("Sorted Array:"+A[k]);
	}
	}
}