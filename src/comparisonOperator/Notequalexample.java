package comparisonOperator;

public class Notequalexample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if (a != b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		int c = 100;
		if (c != 101) {
			System.out.println(c);
		}
		int rollno = 126;
		if (rollno != 124) {//124 is stable and rollno value ia changing
			System.out.println("allowed");
		} else {
			System.out.println("not allowed");
		}
	}
}
