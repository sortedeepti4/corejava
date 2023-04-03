package variables;

public class StaicVariable {
	static int a=10;
	static int b=10;
	static int c=0;
	
	
	public static void add() {
		c=a+b;
		System.out.println(c);
		
	} 
	public void mul() {
		a=20;
		b=20;
		c=a*b;
		System.out.println(c);
	}
	
public static void main(String[] args) {
	StaicVariable staicVariable=new StaicVariable();
	add();
	staicVariable.mul();
	System.out.println(a);
	System.out.println(c);
	add();
}
}
