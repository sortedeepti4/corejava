package multilevelInheritanceOops;

public class Son extends Father {
	public void phone() {

		System.out.println("iphone");
	}

	public static void main(String[] args) {

		Son son = new Son();
		son.phone();
		son.bike();
		son.house();
	}

}
