package datatypes;


public class DataTypes {
	//int i=40;
	static int i=11;
	static public void  test() {
		i=30;
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		byte b=127;		
		System.out.println(b);		
		short s=3276;		
		System.out.println(s);		
		i=21;
		test();//i=30;
		System.out.println(i);		
		long l=12345678912345678L;
		System.out.println(l);		
		float f=1000.33f;		
		System.out.println(f);		
		double d=1000.33;		
		System.out.println(d);		
		float x=1000.356f;		
		float y=623.45f;		
		float z=x/y;		
		System.out.println(z);		
		double dd=x/y;		
		System.out.println(dd);		
		boolean bb=false;		
		System.out.println(bb);		
		char c='A';		
		System.out.println(c);
		
		char cc='a';
		
		String name="dipti";
		
	}

}
