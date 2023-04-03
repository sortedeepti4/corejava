package exception;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int a= 30;
		int b= 0;
		try {
			
		int c= a/b;
		System.out.println(c);
		System.out.println("====");
		}catch (Exception e){
			e.printStackTrace();
			
		}
		System.out.println("===============");
	}
}
