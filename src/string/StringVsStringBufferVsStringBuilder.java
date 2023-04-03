package string;

public class StringVsStringBufferVsStringBuilder {
	public static void main(String[] args) {
		System.out.println("=====STRING IMMUTABLE START===");
		String name= "deepti";
		System.out.println(name);
		String name1="deepti";
		System.out.println(name==name1);
		String name2= new String("deepti");
		System.out.println(name==name2);
		
		System.out.println(name.hashCode());
		
		name = name+"JAVA";
		System.out.println(name);
		System.out.println(name.hashCode());
		
		
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println("=====STRING REVERSE===");
		
		name= "angular";
		int length=name.length();
		String reverse="";
		for(int i=length-1; i>=0; i--){
			reverse=reverse+name.charAt(i);
			System.out.println("--"+name.charAt(i));
			System.out.println(reverse);
			}
		System.out.println(reverse);
		System.out.println("=====STRING IMMUTABLE END===");
		System.out.println("=====STRINGBUFFER MUTABLE START===");
		
		
		StringBuffer sb= new StringBuffer("deepti");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		//at the end we can add a string
		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.reverse());
		
		StringBuffer sb1= new StringBuffer("level");
		StringBuffer sb2= new StringBuffer("level");
		System.out.println(sb1==sb2);
		System.out.println("0000000000000"+sb1);
		
		System.out.println("===StringBuilder Mutable Start");
		
		StringBuilder sbi= new StringBuilder("deepti");
		System.out.println(sbi);
		System.out.println(sbi.hashCode());
		
		//at the end we can add a string
		sb1.append("java");
		System.out.println(sbi);
		System.out.println(sbi.hashCode());
		System.out.println(sbi.reverse());
		
		
		
		
		
		
		
		
		
	}

}
