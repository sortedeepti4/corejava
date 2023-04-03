package variabletask;

public class GlobalVariable2 {
	int z = 333;
	int x = 444;
	int y = 0;

	public void add() {
		y = z + x;
		System.out.println(y);

	}

	public void mul() {
		x = 600;
		z = 4;
		int v = 0;
		v = x * z;
		System.out.println(v);
	}

	public static void main(String[] args) {

		GlobalVariable2 globalvariable = new GlobalVariable2();
		globalvariable.add();
		globalvariable.mul();
		System.out.println(globalvariable.y);

	}

}
