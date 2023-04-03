package variabletask;

public class GlobalVariable {

	int a = 100;
	int b = 200;
	int c = 0;

	public void add() {

		c = a + b;
		System.out.println(c);
	}
	public void div() {
		int d=400;
		c=d/b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		GlobalVariable globalvariable = new GlobalVariable();
		globalvariable.add();
		globalvariable.div();
		System.out.println(globalvariable.c);

	}

}
