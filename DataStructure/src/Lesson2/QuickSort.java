package Lesson2;

import java.util.Arrays;

public class QuickSort {     
	
    
    
void swap(int arr, int start, int end){
	     t = arr[start];
		arr[start] = arr[end];
	     arr[end] = t;
	    }
    	
public int partition(int arr, int start, int end) {
    
    int pivot = arr[start];    

    while (start<end) 
    {
     while ( arr[start]<=pivot){
      start++; }
     
    while (arr[end]>pivot){
     end--;}

  if (start<end){
   swap (arr[start],arr[end]);
  }

  swap  (arr[start], arr[end]);
    }
  return end;
    
  }
public  void quicksort( int start, int end) {
    if(start<end) {
        int loc  = partition(int arr, start, end);
        quicksort( start, loc-1);
        quicksort( loc+1, end);
        
    }
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
int [] arr = {9,8,7,6,5,4,3,2,1};
int start;
int[] t;
int end;


  QuickSort obj= new QuickSort();
  
  obj.quicksort(0, arr.length-1);
  
  System.out.println(Arrays.toString(arr));
}


}