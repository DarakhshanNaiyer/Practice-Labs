package Sorting_Algorithms;

import java.util.Arrays;

public class MergeSorting {

private static void sort(int[] array) {
		
		if(array.length < 2)
			return;

		// 1. Divide the array into Half

		int middle = array.length / 2;

		int[] left = new int[middle];
		for (int i = 0; i < middle; i++) {
			left[i] = array[i];
		}

		int[] right = new int[array.length - middle];
		for (int i = middle; i < array.length; i++) {
			right[i - middle] = array[i];
		}

		// Sort Each Half
		sort(left);
		sort(right);

		// Merge the Result
		merge(left, right, array);

	}

	public static void merge(int[] left, int[] right, int[] result) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j])
				result[k++] = left[i++];
			else
				result[k++] = right[j++];
		}
		
		while (i < left.length) {
			result[k++] = left[i++];
		}
		while (j < right.length) {
			result[k++] = right[j++];
		}

	}

	public static void main(String[] args) {

		int[] numbers = { 2, 8, 4, 1, 3 };
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
