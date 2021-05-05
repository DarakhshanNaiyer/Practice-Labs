package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
           
		Queue <Integer> queue = new ArrayDeque<Integer>();

		queue.add(100);
		queue.add(200);
		queue.add(300);
		
		System.out.println(queue);
		System.out.println("Element Dequed:" +queue.remove());
		System.out.println(queue);
		System.out.println("Element ready to dequeue:"+queue.element()); // keyword element is used instead peek to
		                                                                   //check next item to be deleted 
		
		System.out.println("Element ready to dequeue:"+queue.peek());   // element and peek both can be used on users choice
	}

}
