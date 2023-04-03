package threadwithwait;

public class ChildThreadOne extends Thread {

	public synchronized void run() {

		for (int i = 0; i <=5; i++) {
			
			try {
				this.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child thread one"+i);
		} 
	}

}