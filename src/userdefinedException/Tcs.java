package userdefinedException;

public class Tcs {
public static void main(String[] args) {
	
	EmployeeRegister emp = new EmployeeRegister();
	
	try {
		
		String x=emp.register("antony");
		System.out.println(x);
		
	} catch(DeeptiException de) {
		
		de.printStackTrace();
	}
	
}
}
