package LambdaExpressionAndTopicsLesson13;

public interface Donkey {
	//interface for default method
	default void say () { //default method 
		System.out.println("Hello, This is default method.");
	}
	void sayMore (String msg) ; //Abstract Method
}
