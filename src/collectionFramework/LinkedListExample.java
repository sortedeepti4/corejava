package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList linkedList= new LinkedList();
		linkedList.add("raja");
		linkedList.add("raja");
		linkedList.add("tony");
		linkedList.add("deepti");
		linkedList.add("salman");
		linkedList.add("sachin");
		linkedList.add(null);
		linkedList.add(3,"varun");
		linkedList.addLast("ccccc");//addFirst()
		linkedList.addFirst("dddd");//addLast()
		System.out.println(linkedList);
		
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("raja");
		arraylist.add("raja");
		arraylist.add("tony");
		arraylist.add("deepti");
		arraylist.add("salman");
		arraylist.add("sachin");
		arraylist.add(null);
		//arraylist.addFast("ccccc");Arraylist doesnot support addLast and addFast method
		//arraylist.addLast("dddd");
		System.out.println(arraylist);
		
	}

}
