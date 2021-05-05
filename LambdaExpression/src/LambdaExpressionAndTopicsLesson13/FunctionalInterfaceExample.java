package LambdaExpressionAndTopicsLesson13;

public class FunctionalInterfaceExample implements Sayable2{
	
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		FunctionalInterfaceExample File = new FunctionalInterfaceExample ();
		
          File.say("Hello There!");
	}
}
