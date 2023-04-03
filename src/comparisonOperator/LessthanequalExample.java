package comparisonOperator;

public class LessthanequalExample {
	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		if (a <= b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		int childage = 5;
		if (childage <= 4) {
			System.out.println("child is allowed");
		} else {
			System.out.println("child not allowed");
		}

		int shopping = 1000;
		if (shopping <= 500) {
			System.out.println("dont send alert");
		} else {
			System.out.println("send alert");
		}
		int balance = 30;
		if (balance <= 50) {
			System.out.println("get call from center");
		} else {
			System.out.println("no call");
		}

		int books = 3;
		if (books <= 5) {
			System.out.println("allowed");
		} else {
			System.out.println("not allowed");
		}

	}

}
