package LambdaExpressionAndTopicsLesson13;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		int [] arr = {5,4,6,3,7,2,8};
		 for (int i:arr) {
			 System.out.println(i+"");
			 
			 //Practice 
//			 String  [] arr = {"Daru", "Abhi", "Bob", "Calley"};
//			 for (String i:arr) {
//				 System.out.println(i+"");
			 
		 }
  Arrays.parallelSort(arr);
  
  System.out.println("\nArray Elements after sorting");
  
  for (int i:arr)
  {
	  System.out.println(i+"");
  }
	}

}
