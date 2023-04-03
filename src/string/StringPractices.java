package string;

public class StringPractices {

	public static void main(String[] args) {

		String aa = "America";
		System.out.println(aa);
		// String b =aa.startsWith("A");
		boolean c = aa.startsWith("A");
		System.out.println(aa.startsWith("A"));

		String a = aa.toUpperCase();
		System.out.println(a);

		String bb = "India ";
		System.out.println(bb + "remove white space from string");
		String cc = bb.trim();
		System.out.println(cc + "remove white space from string");

		String dd = "DEEPTI";
		String e = dd.toLowerCase();
		System.out.println(e);

		String username1 = "deepti";
		String username2 = "sugi";
		boolean status = username1.equals(username2);
		System.out.println(status);

		if (status) {
			System.out.println("valid username");
		} else {
			System.out.println("in valid username");
		}

		String hh = "new jersey";
		char h = hh.charAt(5);
		System.out.println(h);

		String g1 = "pune";
		String g2 = "mumbai";
		String g3 = "kolahapur";
		String g4 = g1.concat(g2);
		String g5 = g2.concat(g3);
		System.out.println(g4);
		System.out.println(g5);

		String jj = "it is valid username";
		boolean j = jj.contains("valid");
		System.out.println(j);
		System.out.println(jj.contains("username"));

		String k = "java is logical";
		boolean kk = k.endsWith("logical");
		System.out.println(kk);
		System.out.println(k.endsWith("java"));

		String s1 = "r";
		String s2 = "s";
		int s3 = s1.compareTo(s2);
		System.out.println(s3);
		// 114-115

		String str1 = "hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = "java";

		boolean b4 = str1.equals(str2);//  equals()
		System.out.println(b4);

		if (str1.equals(str3)) {
			System.out.println("str1 is equal to str2");
		} else {
			System.out.println("not equals");
		}

		boolean b5 = str1.equalsIgnoreCase(str4);//equals ignorcase()
		boolean b6 = str3.equalsIgnoreCase(str2);
		System.out.println(b5);
		System.out.println(b6);
	}
}
