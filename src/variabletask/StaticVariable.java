package variabletask;

public class StaticVariable {

	static int a = 22;
	static int b = 44;
	static int c = 0;

	public void add() {

		c = a + b;
		System.out.println(c);

	}

	public void mul() {

		a = 9;
		b = 9;
		c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		StaticVariable staticvariable = new StaticVariable();
		staticvariable.add();
		staticvariable.mul();
		System.out.println(c);

	}

}
