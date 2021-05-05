package Stack;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
            
		Stack <Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println(stack);
		System.out.println("Popped out Element"+stack.pop()); // stack pop deletes the latest element or entry
		System.out.println("Element ready to Pop"+stack.peek());   // stack that is at the top
		System.out.println(stack.isEmpty() ? "Stack is Empty":"Stack is not Empty");  //checking if empty or have something
		System.out.println (stack);

	}

}
