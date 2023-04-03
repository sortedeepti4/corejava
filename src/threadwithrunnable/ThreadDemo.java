package threadwithrunnable;

public class ThreadDemo {
	public static void main(String[] args) {
		
		NewThread nt= new NewThread();
		
		Thread th = new Thread(nt);
		
		th.start();
	}

}
