package arithmaticOperator;

public class DecrementOperator {

	public void postdecrement() {
		int j = 5;
		System.out.println(j--);

	}

	public void predecrement() {

		int j = 7;
		System.out.println(--j);
	}

	public static void main(String[] args) {

		DecrementOperator operator = new DecrementOperator();
		operator.postdecrement();
		operator.predecrement();

	}

}
