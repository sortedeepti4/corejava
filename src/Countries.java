
public class Countries {
	public void india() {
		System.out.println("India");
	}
	public void usa() {
		System.out.println("USA");
	}
	public void china() {
		System.out.println("China");
	}
	public void france() {
		System.out.println("France");
	}
	public void england() {
		System.out.println("england");
	}
	
	public static void main(String[] args) {
		System.out.println("countries");
		System.out.println("-----------------");
		Countries obj = new Countries();
		obj.india();
		obj.usa();
		obj.china();
		obj.france();
		obj.england();
	}

}
