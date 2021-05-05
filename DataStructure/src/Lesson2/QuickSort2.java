package Lesson2;
import java.util.Arrays;
public class QuickSort2 {
    
    
    
    void swap( int[] arr,  int pos1,  int pos2){
     int temp = arr[pos1];
     arr[pos1] = arr[pos2];
     arr[pos2] = temp;
    }
    
    
    public int partition(int[] arr, int start, int end) {
        
        int pivot = arr[end];    
    
//        while(start<end) {
//        
//            while(arr[start]<= pivot) {
//                start++;
//            }
//        
//            while(arr[end]>pivot) {
//                end--;        
//            }
//        
//            if(start<end) {
//                swap( arr, arr[start], arr[end] );
//            }
//        
//        }
         int x = start-1;
         for(int i=start; i<end; i++) {
        	 if (arr[i]<pivot) {
        		 x++; 
        		 swap (arr,x,i);
        	 }
         }
        
        swap(arr, x+1 ,end);
        return x+1;
        
    }
    
    
    
    public  void quicksort(int[] arr, int start, int end) {
        if(start<end) {
            int loc  = partition(arr, start, end);
            quicksort(arr, start, loc-1);
            quicksort(arr, loc+1, end);
            
        }
    }
    
    public static void main(String[] args) {
        
        int[] num = {2,6,7,3,6,9,2,3,4};
        QuickSort2 q = new QuickSort2();
        q.quicksort(num, 0, num.length-1);
        
        System.out.println(Arrays.toString(num));
        
    }
}