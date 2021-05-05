package LambdaExpressionAndTopicsLesson13;

public class Methodreference {
	
	public static void saysomething() {
			 System.out.println("Hello, this is static method");
		 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//referring static method
		
		Sayable sayable= Methodreference ::saysomething;
		
		// Calling interface method
		
		sayable.say();
		

	}

}
