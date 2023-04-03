package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;//interface

public class SetExample {
	public static void main(String[] args) {
		Set set= new HashSet();
		set.add("deepti");
		set.add("deepti");//no duplicate
		set.add("antony");//no order maintain
		set.add(null);//allow null value
		set.add("tony");
		//set.add(null);//allow single null value
		System.out.println(set);
		//set.clear();
		System.out.println(set);
		System.out.println(set.size());
		
		
		Set setone = new HashSet();
		setone.add("deepti1");
		setone.addAll(set);
		System.out.println(setone);
		System.out.println(setone.isEmpty());
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		hs.add(null);
		hs.add("four");
		hs.add(null);
		System.out.println(hs);
		System.out.println("=======");
		
		
		Iterator it= hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String name:hs) {//if u want to use for-each,wehave to pass generics
			System.out.println(name);
		}
	//Hashset does not support forloop.
		System.out.println("======how to store different data type");
		
		System.out.println("======use bean object=====");
		Student student = new Student();
		student.setSno(10);
		student.setName("deepti");
		student.setSalary(40000);
		student.setTax(10.5f);
		
		HashSet<Student> data= new HashSet<Student>();
		data.add(student);
		System.out.println("-------------------");
		
		for(Student details:data) {
			System.out.println(details.getSno());
			System.out.println(details.getName());
			System.out.println(details.getSalary());
			System.out.println(details.getTax());
			
		}
		
		System.out.println("-----------------");
		
		
		
		
	}
	
	
	

}
