package Lesson2;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergesort (int a[]) {
		    
	if (a==null) {
		return;
	}
		
	if (a.length>1) {
		int mid = a.length/2;
		int left[]= new int[mid];
		int right[]= new int [a.length-mid];
		
		for (int i=0; i<mid; i++) {
			left[i]=a[i];}
		
		for (int i=mid; i<a.length; i++) {
			right[i-mid] = a[i];
		}
		
		mergesort(left);
		mergesort(right);
		int i=0;
		int j=0;
		int k=0;
	
 
	while (i<left.length && j<right.length) {
		if (left[i]<right[j]) {
			a[k]=left[i];
			i++; k++;}
		else {
			a[k]=right[j];
		     j++; k++;}
	}
    while (i<left.length) {
    	a[k]=left[i];
    	i++; k++;
    	
    }
    while (j<right.length){
    	a[k]=right[j];
    	j++; k++;
    }
	}
	 
}		 
 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {33,23,24,43,98,67,83,56,63};
		
		MergeSort QS= new MergeSort();
		
		QS.mergesort(a);
		
		System.out.println(Arrays.toString(a));
			}


}