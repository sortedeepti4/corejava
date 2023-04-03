package polymorphism;

public class Son extends Father {
	public String phone(String phmodel) {
		
		return "son";

	}

	public static void main(String[] args) {
		Son so = new Son();
		String phone = so.phone("iphone");
		System.out.println(phone);
	}
}
