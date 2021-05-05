package Queue;

import java.util.Arrays;

class ArrayQueue{

    private int [] items;
    private int rare;
    private int count;
    private int front;

   public ArrayQueue (int capacity){
	   
     items= new int [capacity];
   }

   public void enqueue (int item){
  
          if (count ==items.length){
              throw new IllegalStateException();
          }

          items[rare++]= item;
                count++;
    }

   public int dequeue(){
           var item =  items [front];
              items[front++]=0;
              count--;
           return item;
    }

@Override
   public String toString() {
   return Arrays.toString(Arrays.copyOfRange(items, front, rare)); 


   }
}


public class QueueUsingArrayEx {
	
	
	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue (5);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue);
         System.out.println("Element Dequeue:" +queue.dequeue());
          System.out.println(queue);

	}

}
