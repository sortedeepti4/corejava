import java.util.ArrayList;

public class WrapperClassExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("deepti");
		
		ArrayList<Integer> all = new ArrayList<Integer>();
		
		//how to create String variable
		String name = "deepti";
		String name1= new String();
		System.out.println(name1+"======");
		String name2 = new String("deepti");
		System.out.println(name2+"=====");
		
		
		//how to create Integer variable
		int a= 10;
		Integer no = 15;
		Integer aa = new Integer(123);
		int x =  Integer.parseInt("500");
		System.out.println(aa);
		aa= 10;
		Integer aa1=a;
		
		
		
	}

}
