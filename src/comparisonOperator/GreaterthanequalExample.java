package comparisonOperator;

public class GreaterthanequalExample {
	public static void main(String[] args) {

		int a = 34;
		int b = 33;

		if (a >= b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int expences = 1000;
		if (expences >= 700) {
			System.out.println("send email");
		} else {
			System.out.println("dont send email");
		}

		int height = 176;
		if (height >= 170) {
			System.out.println("allowed for training");
		} else {
			System.out.println("not allowed");
		}

		int score = 1400;
		if (score >= 1300) {
			System.out.println("get addmission");
		} else {
			System.out.println("denial");
		}
	}

}
