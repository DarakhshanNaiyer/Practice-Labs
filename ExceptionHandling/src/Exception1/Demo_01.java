package Exception1;

public class Demo_01 {
	
	public static void main (String [] args) {
  int [] arr = new int[3];
 try {
	 arr [5]=15;
	 System.out.println("The value ;" +arr[3]);
 }
 catch (ArrayIndexOutOfBoundsException e) {
	 e.printStackTrace();
 }
}
}

