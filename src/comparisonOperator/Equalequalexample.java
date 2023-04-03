package comparisonOperator;

public class Equalequalexample {
	public static void main(String[] args) {
		 int a =10;
		 int b =15;
		 System.out.println(b+"------");
		 b=a;
		 System.out.println(b+"-------");
		 a=b;
		 System.out.println("============");
		 System.out.println(a+"---"+b);
		 if(a==b) {
			 System.out.println(a+"-----");
			 System.out.println("true");
		 }else {
			 System.out.println(a+"00000000");
		 }
		 b=a+25;
		 a=25+b;
		 b=a;
		 System.out.println(b+"-----------");
		 
	}

}
