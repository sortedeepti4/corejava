package arithmaticOperator;

public class IncrementOperator {

	public void postincrement() {
		int j = 5;

		System.out.println(j++);
		System.out.println(j);
	}

	public void preincrement() {

		int j = 8;
		System.out.println(++j);
		System.out.println(j);
	}

	public static void main(String[] args) {
		IncrementOperator operator = new IncrementOperator();
		operator.postincrement();
		operator.preincrement();

	}

}
