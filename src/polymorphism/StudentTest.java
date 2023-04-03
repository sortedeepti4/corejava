/**
 * 
 */
package polymorphism;

import practice.Student;

/**
 * @author rahul
 *
 */
public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student st= new Student();
		st.setMaths(20);
		st.setName("dipti");
		
		st.setScience(20);
		
		st.getTotal();
		
		Student st1= new Student();
		st1.setMaths(50);
		st1.setScience(200);
		st1.setName("Rahul");
		
		st1.getTotal();
	}

}
