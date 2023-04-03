package variabletask;

public class LocalVariable1 {

	public void add() {
		int a = 14;
		int b = 14;
		int d = a + b;
		System.out.println(d);
	}

	public static void main(String[] args) {
		LocalVariable1 localvariable = new LocalVariable1();
		localvariable.add();
		System.out.println("----------");

	}

}
