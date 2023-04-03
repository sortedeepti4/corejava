package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add("varun");
		
		
		
		HashSet hs = new HashSet();
		hs.add("deepti");
		hs.add("govinda");//not maintain order
		hs.add("sugi");//no duplicate
		hs.add("deepti");
		hs.add(null);//allow null value
		System.out.println(hs);
		hs.addAll(arraylist);
		System.out.println(hs);
		
		
		
		
				
		
		
		
		
	}

}
