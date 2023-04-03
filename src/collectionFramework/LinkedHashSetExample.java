package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample{
	public static void main(String[] args) {
		
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add("deepti");
	lhs.add("deepti");//no duplicate
	lhs.add("tony");// maintain insertion order
	lhs.add("salman");
	lhs.add("sachin");
	lhs.add("vinod");
	lhs.add(null);//allow null value 
	
	System.out.println(lhs);
	
		

		
	}

}
