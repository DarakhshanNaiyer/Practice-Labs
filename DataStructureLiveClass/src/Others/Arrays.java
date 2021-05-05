package Others;

class  Array {
	    
	      int [] items;
	      int count;

	 public Array(int length){
	       items = new int [length];
	 }    
	  public void insert (int item){

	    	 //if the array is full, resize it.
	     if (items.length==count){
	    	 
	    	   //create array and (Twice the size of original array)
	    	 int []  newItems = new int[count*2];

	    	   for (int i=0; i<count; i++){
	    	    newItems[i]=items[i];
	    	   }
	    	   
	    	 // copy all the existing item into new array
	    	 items=newItems;
	    	   }
	    	 
	    	 //Otherwise add the new item at the end
	    	 items[count] = item;
	    	 count++;

	    	 //or items[count++]=item;
	    	 }
	 
	 public void removeAt(int index){
		 
		  // validate the index
		 if (index <0 || index>=count){
		    throw new IllegalArgumentException();
		    }
		 
		 // Shift the elements to left to fill the holes and
		 for (int i=index; i<count; i++){
		   items [i] = items [i+1];
		  }
		 count--;
	 }



	 public void print (){
	     System.out.println("Printing Elements:");
	      System.out.println("Array Length:"+items.length);
	        for (int i=0; i<count; i++){
	          System.out.println(items[i]);
	       }

	 }
}


public class Arrays {
	public static void main(String[] args) {
           
		 Array array = new Array(3);
         
		 array.insert(100);
		 array.insert(200);
		 array.insert(300);
		 array.insert(400);
		 array.insert(500);
		 array.insert(600);
		 array.insert(700);
		 array.insert(800);
		 
		 array.print();
		 array.removeAt(1);
		 System.out.println("---------------------");
		 array.print();

	}

}
