package abstractionOops;

public class Deeptimobile extends Android {
	public void address() {
		System.out.println("USA");
	}
	public void phone() {
		System.out.println("123456");
	}
	public void settings() {
		System.out.println("dsetting");
	}
	public static void main(String[] args) {
		Deeptimobile deepti = new Deeptimobile();
		deepti.address();
		deepti.phone();
		deepti.settings();
		deepti.name("Deepti");
		
	}
	

}
