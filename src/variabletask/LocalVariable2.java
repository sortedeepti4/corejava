package variabletask;

public class LocalVariable2 {
	
	public void mul() {
		
		int d=15;
		int f=15;
		int g=d*f;
		System.out.println(g);
	}
	public void add() {
		int d=12;
		int h=12;
		int j=d+h;
		System.out.println(j);
	}
	
	
	
	
	public static void main(String[] args) {
		LocalVariable2 localvariable = new LocalVariable2();
		localvariable.mul();
		localvariable.add();		
		
	}

}
