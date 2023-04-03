package hirarcheyInheritanceOops;

public class Daughter extends Father {

	public void car() {
		System.out.println("santro");
	}

	public static void main(String[] args) {

		Daughter daughter = new Daughter();
		daughter.car();
		daughter.bike();
	}

}
