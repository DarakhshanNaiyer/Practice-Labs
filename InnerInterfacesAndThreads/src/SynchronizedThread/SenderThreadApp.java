package SynchronizedThread;

public class SenderThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME");
		Sender sender =new Sender ();
		
		SenderThread t1= new SenderThread (sender, "Hello");
		SenderThread t2= new SenderThread (sender, "welcome");
		SenderThread t3= new SenderThread (sender, "to");
		SenderThread t4= new SenderThread (sender, "java");
		SenderThread t5= new SenderThread (sender, "programming");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
            t4.join();
			t5.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.out.println("End of program");		

	}

}
