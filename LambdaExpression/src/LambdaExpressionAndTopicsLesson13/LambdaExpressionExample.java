package LambdaExpressionAndTopicsLesson13;

public class LambdaExpressionExample {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width=10;
		
//with Lambda
		Drawable d2=() -> 
			System.out.println("Drawing "+width);
		
d2.draw();
 
	}
}