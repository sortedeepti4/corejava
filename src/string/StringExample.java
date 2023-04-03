package string;

public class StringExample {

	public static void main(String[] args) {
		String s = new String();
		System.out.println(s);
		
		s = "aaaffhhjjkhgjkkkhhk";
		
		String s1 = "deepti";
		System.out.println(s1);
		
		String s2 = new String("suni");
		System.out.println(s2);
		
		char c = s.charAt(3);
		System.out.println(c);
		
		
		
		String studentName = "deepti";
		char filtername = studentName.charAt(2);
		System.out.println(filtername);
		
		
		String ff= s.concat("angular");
		System.out.println(ff);
		

		String aa = s.toUpperCase();
		System.out.println(aa);

		String bb = "bbbbbbb";
		System.out.println(bb.length());

		String cc = " Deepti ";
		System.out.println(cc.trim());

		String d1 = "";
		String d2 = "deepti";

		System.out.println(d1.isEmpty());
		System.out.println(d2.isEmpty());

		String ee = "deepti kautkar";

		System.out.println(ee.startsWith("dee"));
		System.out.println(ee.startsWith("ka", 7));
		
		String name1 = " deepti";
		String ss = String.format("antony is my trainer %s",name1);
		System.out.println(ss);
		System.out.println("asdfg"+name1);
		String s3= String.format("my tax is %.2f",47.3);
		System.out.println(s3);
		
		String s4= String.format("my tax is %03d",55);
		System.out.println(s4);
		
		String s5= String.format("%c",'k');
		System.out.println(s5);
		
		String data= "sony";
		byte [] b= data.getBytes();
		System.out.println(b[0]);
	}
}
