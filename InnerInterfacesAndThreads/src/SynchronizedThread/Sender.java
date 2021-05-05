package SynchronizedThread;

public class Sender {
	
public static void send (String msg) {
	System.out.println("Sending:" +msg);
	
	try { 
		Thread.sleep(500);
	}
	catch
	(InterruptedException e) { 
		e.printStackTrace();
		}
	System.out.println("Sent:"+msg);
	}
}
