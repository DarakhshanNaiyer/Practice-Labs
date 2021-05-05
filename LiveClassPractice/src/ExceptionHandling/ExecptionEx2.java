package ExceptionHandling;

class arithmetictest2 {

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
     System.out.println("Finally block will always be executed even if the catch block is missing in case of exception");
     }
}
public class ExecptionEx2 {

	public static void main(String[] args) {
//		ArithmaticTest.division(100,20);
//		ArithmaticTest.division(0,20);
		arithmetictest2.division(20,0);
	}

}
