package variables;

public class GlobalVariable {
	int a = 10;
	int b = 10;
	int c = 0;

	public void add() {
		c = a + b;
		System.out.println(c);

	}

	public void mul() {
		a = 20;
		b = 20;
		c = a * b;
		System.out.println(c);

	}

	public void div() {
		a = 40;
		b = 15;
		c = a / b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		GlobalVariable globalVariable = new GlobalVariable();
		globalVariable.add();
		globalVariable.mul();
		globalVariable.div();
		System.out.println(globalVariable.c);
		System.out.println(globalVariable.a);
		System.out.println(globalVariable.b);

	}

}
