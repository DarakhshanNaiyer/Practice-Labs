package ExceptionHandling;

class ArithmeticTest{

public static void division (int num1, int num2){
	
     int result=0;
    		 
     try { 
    	 result=num1/num2;
     System.out.println("result:"+result);
     }
     catch(ArithmeticException Ex){
    	 System.out.println(Ex.getMessage());
    	 System.out.println("Number can not be divided by zero");
    	 }
     catch(ArrayIndexOutOfBoundsException Ex){
    	 System.out.println();
    	      }
     
     finally {
    	 System.out.println("Result:"+result);
     }
     
     }

}
public class ExceptionEx1 {
	public static void main(String[] args) {
		
//		ArithmaticTest.division(100,20);
//		ArithmaticTest.division(0,20);
		ArithmeticTest.division(20,0);

	}
}
