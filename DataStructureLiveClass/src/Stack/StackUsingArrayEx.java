package Stack;

import java.util.Arrays;

class Stack{

	  private int [] items = new int [5];
	  private int count;

	public void push(int item){
	    if (count == items.length){
	       throw new StackOverflowError();
	     }
	      items [count++]=item;
	  }

	public int pop(){

	   if (count==0){
	    throw new IllegalStateException();
	    }
	   return items[--count];
	 }

	@Override
	public String toString() {
		
		  int [] content = Arrays.copyOfRange(items, 0, count);
		  return Arrays.toString(content);
		  
		  //		  return Arrays.toString(Arrays.copyOfRange(items, 0, count)); // above can be written this way

	}

	public int peek() {
		// TODO Auto-generated method stub
		return items[count-1];
	}
	  
	  
	}
public class StackUsingArrayEx {

	public static void main(String[] args) {
		Stack stack= new Stack();

		stack.push(100);
		stack.push(200);
		stack.push(300);
//		stack.push(400); // leaving array memory empty will print 0 0 ..hence line 29 and 30 is added to 
		                   //avoid printing less numbers than array limit
		stack.push(500);

		System.out.println(stack);
		
		System.out.println("Element Popped out is:"+stack.pop());
		
		System.out.println("Element Popped out is:"+stack.peek());
 
		System.out.println(stack);

	}

}
