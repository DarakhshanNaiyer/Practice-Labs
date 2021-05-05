package LambdaExpressionAndTopicsLesson13;

public class DefaultMethods implements Donkey {
	
	public void sayMore (String msg) {
		
		System.out.println(msg);
	}
public static void main (String  args []) {
	
	DefaultMethods DM= new DefaultMethods (); //calling default method
	
	DM.say();
	
	DM.sayMore("Example"); // calling abstract method
	
}
}

