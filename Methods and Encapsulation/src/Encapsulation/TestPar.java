package Encapsulation;

public class TestPar {
	
	public static void main(String[] args) {

		      TestPar p= new TestPar ();
		      p.amethod ();
}   
	public void amethod() {
		PassingObjectByReference t = new PassingObjectByReference ();
	     t.i =10;
		System.out.println("Before another = "+t.i);
		another (t);
		System.out.println("After Another="+t.i);
		//End of a method
		}

	public void another(PassingObjectByReference t) {
		t.i=20;
		System.out.println("In Another="+t.i);
		//End of method
		
	}
	
	
		


}
