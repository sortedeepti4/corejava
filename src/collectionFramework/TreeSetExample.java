package collectionFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add("raja");//no duplicate
		ts.add("raja");
		ts.add("tony");
		ts.add("govinda");
		ts.add("sachin");//follow natural order
		ts.add("null");//allow null value
		System.out.println(ts);
		
		System.out.println("===========");
		
		
		ArrayList arraylist = new ArrayList();
		arraylist.add("raja");//allow duplicate
		arraylist.add("raja");
		arraylist.add("tony");
		arraylist.add("govinda");
		arraylist.add("varun");//follow insertion order
		arraylist.add("null");//allow null value
		ts.addAll(arraylist);
		System.out.println(ts);
		System.out.println(arraylist);
	}

}
