package gettersetter;

public class EmployeeRegister {
	public static void register(Employee e) {
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getEmployeecode());
		System.out.println(e.getAddress());
		System.out.println(e.getPhone());

	}

	public static void demo(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("dipti");
		emp.setSalary(40000);
		emp.setEmployeecode("A12");
		emp.setAddress("usa");
		emp.setPhone(12345);
		register(emp);

		Employee rahul = new Employee();
		emp.setId(5);
		emp.setName("rahul");
		emp.setSalary(40000);
		emp.setEmployeecode("A12");
		emp.setAddress("usa");
		emp.setPhone(12345);
		register(rahul);
		
		String name1 = "deepti";
		demo(name1);

	}

}
