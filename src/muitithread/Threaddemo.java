package muitithread;

public class Threaddemo {
	
	public static void main(String[] args) {
		
		NewThread nt= new NewThread();
		
		nt.start();// it will create new thread
		
		for(int i=0; i<5;i++) {
			
			System.out.println("main thread"+i);
			
		}
		
	}

}
