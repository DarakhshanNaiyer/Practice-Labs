package ThreadsLiveClassPracticals;

public class MyThread extends Thread {
	public void run() {
		System.out.println("WELCOME");
		
		for (int c=0; c<10; c++) {
			try { 
				Thread.sleep(300);
			}
			catch (InterruptedException e) {
				System.out.println("inside of main:"+c);
				
			
			
		}
	}

}
}
