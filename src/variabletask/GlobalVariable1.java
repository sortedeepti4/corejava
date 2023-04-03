package variabletask;

public class GlobalVariable1 {
	int a =20;
	int b =60;
	int c =0;
	public void add() {
		int d =a+b+c;
		System.out.println(d);
	}
	public void div() {
		c =b/a;
		System.out.println(c);
	}
	public void mul() {
		c=a*b;
	}
	

	public static void main(String[] args) {
		GlobalVariable1 globalvariable = new GlobalVariable1();
		globalvariable.add();
		globalvariable.div();
		globalvariable.mul();
		System.out.println(globalvariable.c);
		
		
	}
}
