package Others;

class LinkedList{

   private class Node {
    int value;
    Node next;

        public Node (int value ){
          this.value=value;
         }
   }

       Node First;
       Node last;

 public void addLast(int item){
  
      Node node = new Node(item);
 
       if (isEmpty()){
         First=last=node;
       } else{
       last.next=node;
       last=node;
             }
  }
 
 public void addFirst(int item){

	 Node node = new Node (item);
	  if (isEmpty()) {
	    First=last=node;
	   }else{
	         node.next=First; 
	          First=node;
	           }
	  	}
 
  public boolean isEmpty(){
	   return First==null;
  }
  
  public int indexOf(int item){

	  int index=0;
	   Node current=First;
	   while(current!=null){
	     if(current.value==item){
	              return index;
	     }
	   
	  current = current.next;
	  index++;
	  }
	   return -1;
  }
  
  public void print(int item) {
	  
		 Node node = new Node (item);

	  for (i=0; i<next; i++) {
		  System.out.println();
	  }
	 
	 
  } 
  
 }

public class CustomLinkedList {
	

	public static void main(String[] args) {
          
		LinkedList list = new LinkedList();

		  list.addLast(100);
		  list.addLast(100);
		  
		  list.addFirst(50);
		  
		  list.print();
		  
		  System.out.println(list.isEmpty()? "Empty":"Not Empty");
		  
		  var index =list.indexOf(250);
		  
		  System.out.println((index!=1)? index : "Index not found!");

	}

}
