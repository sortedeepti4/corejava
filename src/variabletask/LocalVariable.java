package variabletask;

public class LocalVariable {

	public void add() {
		int a = 12;
		int b = 22;
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		LocalVariable localvariable = new LocalVariable();
		localvariable.add();

	}

}
