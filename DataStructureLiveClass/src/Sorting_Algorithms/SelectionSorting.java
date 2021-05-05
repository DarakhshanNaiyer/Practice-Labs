package Sorting_Algorithms;

import java.util.Arrays;

public class SelectionSorting {
	
	private static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			swap(array, minIndex, i);
		}
	}
	
	public static void swap(int[] array, int index1, int index2) {
		var temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {2,8,4,1,3};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	


}
