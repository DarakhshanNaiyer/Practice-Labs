package ExceptionHandling;

public class ThrowKeywordEx1 {
	
	static void validate (int age) {
		if(age<18){
			throw new ArithmeticException("You are not valid to vote");
		}
	else {
		System.out.println("You are valid to vote");
	}
	}
 public static void main(String[] args) {
	 
	 try{
		 
		 validate (14); 
	 }catch(ArithmeticException e) {
		 System.out.println(e.getMessage());
	 }
}
}
