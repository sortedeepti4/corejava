package controlStatement;

public class Ifelseifstatement {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 5;
		int d = 45;

		if (a > b) {
			System.out.println("1--a is big");
		} else if (a < c) {
			System.out.println("2--a is big");
		} else if (a > d) {
			System.out.println("3--a is big");
		} else {
			System.out.println("0--a is small");
		} // if one of condition is true, it will not check other condition.
			// if all condition fails it print else statement.
		int u = 100;
		int u1 = 201;
		int u2 = 302;
		int amount = 0;

		if (u <= 100) {
			amount = u * 1;
			System.out.println(amount);
		} else if (u <= 200) {
			amount = 100 * 1 + (u1 - 100) * 2;
			//System.out.println(amount);
		} else if (u <= 300) {
			amount = 100 * 1 + 100 * 2 + (u2 - 100) * 3;
		} else {
			//System.out.println(amount);
		}

	}
}