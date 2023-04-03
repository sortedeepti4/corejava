package jumpingStatement;

public class BreaksStatement {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
			System.out.println("===========");
		}
		System.out.println("----------------------------------------");

		for (int i = 20; i <= 20; i--) {
			if (i == 10) {
				break;
			}
			System.out.println(i);

		}
	}
}
