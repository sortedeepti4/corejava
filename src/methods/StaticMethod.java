package methods;

public class StaticMethod {

	static int a = 4;
	static {
		int b = 4;
	}

	public void add1() {
		System.out.println(a);
		
		int f = 20;
		int g = 20;
		a = f + g;
		System.out.println(a);

	}

	public static void add() {
		int a = 50;
		int b = 50;
		int c = a + b;
		System.out.println(c);
	}

	public static void mul() {

		int b = 6;
		int c = a + b;
		System.out.println(c);

	}

	public static void main(String[] args) {
// static method has super power if u want to call static add method we just want to call by methode name
		
		StaticMethod method = new StaticMethod();
		method.add1();
		add();
		mul();
	}

}
