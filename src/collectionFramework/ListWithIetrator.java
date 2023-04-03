package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListWithIetrator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("raja");
		list.add("antony");
		list.add("salman");
		list.add("varun");
		list.add("govinda");
		list.add("akshay");
		System.out.println(list);
		System.out.println("==========");
		
		System.out.println("itaretor");
		Iterator it = list.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
	}
		System.out.println("===for-each===");
		//For-Each loop
		for(String name:list) {
			System.out.println(name);
			//if(name=="deepti") {
			//System.out.println(name);	
			}
		
		System.out.println("==forloop===");
		//Forloop
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
		

	
}
	}
	
