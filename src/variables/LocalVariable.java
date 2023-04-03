package variables;

public class LocalVariable {
	
	
	public void add() {
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		System.out.println("-----");
		LocalVariable localVariable = new LocalVariable();
				localVariable.add();
				

	}

}
