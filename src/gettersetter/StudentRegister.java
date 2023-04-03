package gettersetter;

public class StudentRegister {// practice

	public static void register(Student student) {
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getPhone());

	}

	public static void main(String[] args) {

		Student so = new Student();

		so.setId(5);
		so.setName("dipti");
		so.setAddress("usa");
		so.setPhone(123456);
		register(so);

	}
}
