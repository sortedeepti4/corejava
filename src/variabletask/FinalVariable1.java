package variabletask;

public class FinalVariable1 {

	final int s = 200; //final variable is constant.can create final variable inside the method
	final int t = 500;
	final int r = 0;

	public void add() {

		final int r = s+t;
		System.out.println(r);
		
	}

	public void mul() {

		final int R = s * t;
		System.out.println(R);

	}

	public static void main(String[] args) {
		FinalVariable1 finalvariable = new FinalVariable1();
		finalvariable.add();
		finalvariable.mul();
		System.out.println(finalvariable.r);
	}

}
