package practice;

public class EmployeeConstructor {
	
	String name;
	int emp_id;
	
	EmployeeConstructor(String name,int emp_id){
	
	this.name=name;
	this.emp_id=emp_id;
	}
			
	public static void main(String[] args) {
		
		EmployeeConstructor ec1 =new EmployeeConstructor("deepti",101);
		EmployeeConstructor ec2 =new EmployeeConstructor("rahul",102);
		
		System.out.println("Employee 1");
		
		
	}
	

}
