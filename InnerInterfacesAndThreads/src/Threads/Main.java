package Threads;

public class Main {

	public static void main(String[] args) {
		// for thread practical
		
		HelloRunner r=new HelloRunner ();
		
		Thread t= new Thread(r);
		
		t.start();

	}

}
