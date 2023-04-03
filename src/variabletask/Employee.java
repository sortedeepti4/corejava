package variabletask;

public class Employee {
	int eid;
	int salary;
	static String ceo;      //it will store into class loader memory.not into heap memory.
	                      // it will applicable to all objects
	
	static {           // this is called static block, it is used for initialize static variables. 
		ceo="sagar";     //static block will executed before constructor.after the class load static block will executed.
	}
	
	public Employee() {     //constructor will be executed after object creation
		eid= 1;
		salary= 6000;
	}
	
	
	public void show() {
		System.out.println(eid+" "+salary+" "+ceo);
	}
}
