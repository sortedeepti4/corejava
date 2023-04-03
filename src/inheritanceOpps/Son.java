package inheritanceOpps;

public class Son extends Father {
//this is single inheritance example.father is base class
	// son is sub class. to get property of base class , sub class extends the base
	// class
	public void phone() {

		System.out.println("iphone");
	}

	public static void main(String[] args) {

		Son son = new Son();
		son.phone();
		son.bike();
	}
}
