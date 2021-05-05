package array;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a [] = new int [5]; //declaration and instantiation
//		
//		a[0]=10; //Initialization
//		a[1]=20;
//		a[2]=60;
//		a[3]=40;
//		a[4]=50;
//		//printing array
//		
//		System.out.println(a[0]);
//		
//		for (int i=0; i<a.length; i++) {
//			//length is property of Array
//			System.out.println(a[i]);
//		}
//		
		int[] MyArray= { 10,20,30 };
		
		MyArray[1]=50; // Overriding MyArray values.	
		System.out.println(MyArray[MyArray.length-1]);//to print last value of Array
		for (int i=0; i<MyArray.length; i++) {
		System.out.println(MyArray[i]);
		}
		
		int a [] = new int [] {1,2,3,4,5}; //Another way to declare and initialize.


	}

}
