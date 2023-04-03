package arithmaticOperator;

public class ArithmaticOperator {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("addition value is" + c);
	}

	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("substraction value is" + c);

	}

	public void mul(int a, int b) {
		int c = a * b;
		System.out.println("multiplication value is" + c);
	}

	public void div(int a, int b) {
		int c = a / b;
		System.out.println("division value is" + c);
	}

	public void modulus(int a, int b) {
		int c = a % b;
		System.out.println("modulus value is" + c);
	}

	public static void main(String[] args) {

		ArithmaticOperator operator = new ArithmaticOperator();
		operator.add(30, 30);
		operator.sub(60, 20);
		operator.mul(40, 10);
		operator.div(80, 20);
		operator.modulus(97, 2);
	}

}
