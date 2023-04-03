package threadwithsleep;

import java.util.Iterator;

public class ChildThreadOne extends Thread{
	
	public void run() {
		 for (int i = 0; i <= 5; i++) {
			 
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			 System.out.println("child thread one"+i);
		}
	}
	

}
