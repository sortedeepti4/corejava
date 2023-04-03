package practice;

public class Student {
	String name;
	private int maths;
	private int science;
	
	public void getTotal() {
		 int total=this.maths + this.science;
		 System.out.println(total);
	}
	
	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths1) {
		this.maths = maths1;
	}
	

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public static void main(String[] args) {
		Student st= new Student();
		st.setMaths(20);
		st.setName("dipti");
		st.setScience(20);

	}
	

}
