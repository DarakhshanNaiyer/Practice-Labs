package Threads;

public class HelloRunner implements Runnable{
	
	int i;
	public void run() {
		i=0;
		while (true) {
			System.out.println("Hello"+i++);
			if (i==20) {
				break;
			}
		}
	}

}
