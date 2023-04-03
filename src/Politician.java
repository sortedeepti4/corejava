
public class Politician {
	public void sharadPawar() {
		int age = 85;
		long phone =9013334444L;
		System.out.println("sharadPawar");
		System.out.println("sharad pawar age:"+age);
		System.out.println("sharad pawar age:"+phone);
		int a =25;
		int b =20;
		if(a>b) {
			System.out.println("a is big");
		}
	}
	public void yashwantraoChawhan() {
		System.out.println("yashwantraoChawhan");
		String name ="rahul";
		System.out.println(name.charAt(1));
	}
	public void devendraFadnavis() {
		System.out.println("devendraFadnavis");
		int age = 48;
		long phone = 90134345678L;
		String name = "Devendra fadnavis";
		System.out.println(name+age);
		System.out.println(name);
	}
	public void soniaGandhi() {
		System.out.println("soniaGandhi");
	}
	public void arvidKejriwal() {
		System.out.println("arvidKejriwal");
		int age = 50;
		System.out.println("arvind kejriwal:"+age);
	
	}
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("-----------------");
		Politician obj = new Politician();
		obj.sharadPawar();
		obj.yashwantraoChawhan();
		obj.devendraFadnavis();
		obj.soniaGandhi();
		obj.arvidKejriwal();
		System.out.println("-----------------");
}
}
