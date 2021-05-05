package MultiThreading;

public class JoiningThreadEx {
	
	class MyThread1 extends Thread {
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is started.");
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(5000);

				} catch (InterruptedException ex) {
					System.out.println(ex.getMessage());
				}
				System.out.println(i);
			}
			System.out.println(Thread.currentThread().getName() + " has ended.");
		}
	}
	
public static void main(String[] args) throws Exception {
		
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		
		t1.setName("ThreadOne");
		t2.setName("ThreadTwo");
		t3.setName("ThreadThree");
		
		t1.start();
		
		t1.join();
		
		t2.start();
		t3.start();
		
	}

}
