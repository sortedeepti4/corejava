package variables;

public class FinalVariable {
	final int a = 10;
	final int b = 10;
	final int c = 0;

	public void add() {
		final int c = a + b;
		System.out.println(c);
	}

	public void mul() {
		// a=20;
		// b=20;
		// c=a*b;
	}

	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable();
		finalVariable.add();
		System.out.println(finalVariable.a);

	}

}
