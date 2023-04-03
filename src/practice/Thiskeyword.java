package practice;

public class Thiskeyword {
	int i;
	
	void setvalue(int i) {
		this. i=i;
	}
	
	void show() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Thiskeyword tk= new Thiskeyword();
		tk.setvalue(10);
		tk.show();
	}

}
