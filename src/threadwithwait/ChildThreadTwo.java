package threadwithwait;

public class ChildThreadTwo extends Thread {
	
	public synchronized void run() {
		for (int i = 0; i <=5; i++) {
			
			System.out.println("child thread two"+i);
			
		}
		
		notify();
	}

}
