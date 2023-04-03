package variabletask;

public class StaticVariable2 {
	
	static int a=3;
	static int b=3;
	static int c=0;		
	
	public void add() {
		a=6;
		b=6;
		c=a+b;
		System.out.println(c);
	}
	
	public void mul() {
		a=7;
		b=7;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		StaticVariable2 staticvariable = new StaticVariable2();
		staticvariable.add();
		staticvariable.mul();
		System.out.println(c);
	
	
		
		
	}

}
