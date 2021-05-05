package SynchronizedThread;

public class SenderThread extends Thread {
	Sender sender;
	String msg;
	public SenderThread (Sender sender, String msg) {
	
     this.sender=sender;
     this.msg=msg;
	}

       public void run() {
	  synchronized (sender) {
		  Sender.send(msg);
		  
		  
		  
		
	}

       }
       }

