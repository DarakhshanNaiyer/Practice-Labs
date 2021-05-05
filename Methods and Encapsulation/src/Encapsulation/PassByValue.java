package Encapsulation;

public class PassByValue {

	public static void main(String[] args) {
		PassByValue p = new PassByValue();
		p.amethod();
		
	}//end of Par1
	  public void amethod () {
		  int i=10;
		  System.out.println("Before Another i="+i);
		  another(i);
		  System.out.println("After Another i="+i);
	  } 	
	  
	  //end of amethod
	  
	public void another(int i) {
	    i = i+10;
		System.out.println("In Another i=" +i);
		
		}//end of another

}
