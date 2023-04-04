package exception;

public class Stackmechanism {
	
	public static void main(String[] args) {
		test1();
		
	}
	public static void test1() {
	
		System.out.println("test one");
		test2();
		
	}
	
	public static void test2() {
		
		System.out.println("test two");
		test3();
	}
	
	public static void test3() {
		
		System.out.println("test three");
		test4();
	}
	
	public static void test4() {
		
		System.out.println("test four");
	}

}
