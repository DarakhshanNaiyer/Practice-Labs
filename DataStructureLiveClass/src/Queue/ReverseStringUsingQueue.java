package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseStringUsingQueue {
	
	public static void reverse (Queue<Integer> queue){

		Stack <Integer> stack = new Stack <Integer>();

		while (!queue.isEmpty()){
		  stack.push(queue.remove());

		 }
		while(!stack.isEmpty()) {
			  queue.add(stack.pop());
	    }
 }
	
public static void main(String[] args) {
		
	    
	Queue <Integer> queue = new ArrayDeque<Integer>();

		queue.add(100);
		queue.add(200);
		queue.add(300);
		
		System.out.println("Original String: "+queue);
		reverse(queue);
		System.out.println("Reversed String: "+queue);
}

}
