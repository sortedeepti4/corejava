package variabletask;

public class StaticVariable1 {
	static int d=50;
	static int f=60;
	static int g=0;
	
	public void add() {
		
		g=f+d;
		System.out.println(g);
	}
	public void mul() {
		d=30;
		f=60;
		g=d*f;
		System.out.println(g);
		
	}
	
	public static void main(String[] args) {
		StaticVariable1 staticvariable = new StaticVariable1();
		staticvariable.add();
		staticvariable.mul();
		
	}

}
