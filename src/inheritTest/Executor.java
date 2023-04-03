package inheritTest;

import java.io.FileNotFoundException;

public class Executor {

	public static void testMethod() throws Exception {
		System.out.println("in test method");
		throw new ArithmeticException("error aali");
	}
	public static void testMethod2() throws Exception  {
		System.out.println("in test2 method");
		testMethod();
	}
	public static void main(String[] args)   {
		Student s=new Student();
		Dipti d=new Student();
		API api=new Student();
		Object o=new Student();
		
		API r=new Rahul();
		api=r;
		
		d=s;
		d=null;
				
		//testMethod2();		
			
		System.out.println("excecuted testmethod");
		
		//System.out.println("Printing x of Dipti "+d.x);
		try {
			throw new ArithmeticException("error aali");
			
		}catch(NullPointerException ne) {
			d=new Dipti();			
			System.out.println("Null error occured");
		}catch(ArithmeticException ae) {
			d=new Dipti();			
			System.out.println("Arithmatic error occured"+ae.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("We completed code");
	//	Student x= new Object();
	//	Student x2=new Dipti();

	}

}
