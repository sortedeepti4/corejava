
public class Flowers {
	public void rose() {
		System.out.println("rose");
	}

	public void jasmin() {
		System.out.println("jasmin");
	}

	public void marigold() {
		System.out.println("marigold");
	}

	public void aster() {
		System.out.println("aster");
	}

	public void lotus() {
		System.out.println("lotus");
	}

	public static void main(String[] args) {
		System.out.println("flower");
		System.out.println("------------------------------");
		Flowers obj = new Flowers();
		//obj.rose();
		
		obj.marigold();
		obj.jasmin();
		obj.jasmin();
		obj.aster();
		obj.lotus();
		System.out.println("------------------------");
		
	}

}
