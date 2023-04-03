package returntype;

public class Test {

	public int newAdd(int total, int c) {

		int sum = total + c;

		return sum;

	}

	public static void main(String[] args) {

		ArithmaticOprator ao = new ArithmaticOprator();

		int total = ao.add(10, 10);

		Test t = new Test();

		int z = t.newAdd(total, 10);

		System.out.println(z);
	}

}
