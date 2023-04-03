package threadwithwait;

public class ThreadWithWait {
	
	public static void main(String[] args) {
		
		ChildThreadOne ct1= new ChildThreadOne();
		
		ChildThreadTwo ct2= new ChildThreadTwo();
		
		ct1.start();
		
		ct2.start();
		
	}

}
