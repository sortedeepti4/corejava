package polymorphism;

public class Methodoverloading {
	
	public int add(int a, int b ) {
		int c=a+b;
		return c;
	}
	
	public int add(int a,int b,int c,char x) {
		int d=a+b+c;
		return d;
	}
	
	public void add(int a, int b, int c,int f) {
		int d= a+b+c+f;
	
	}
	public static void main(String[] args) {
		Methodoverloading mo = new Methodoverloading();
		int x=mo.add(10, 10);
		System.out.println(x);
		int y=mo.add(x, 5, 10,'c');
		System.out.println(y);
		
	}
	

	
	

}
