package methods;

public class MethodWithParameter {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void signup(String name, String address, long passportno, long phone) {
		System.out.println(name);
		System.out.println(address);
		System.out.println(passportno);
		System.out.println(phone);
	}

	public void apple(float a, float b, long truckno) {

		float c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		MethodWithParameter parameter = new MethodWithParameter();
		parameter.add(30, 40);
		parameter.signup("niki", "new jersey", 123456789, 2013445634);
		parameter.apple(15.66f, 24.67f, 1245466677l);
	}

}
