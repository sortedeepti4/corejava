package collectionFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		
		LinkedHashMap lhm= new LinkedHashMap();
		
		lhm.put(1, 5);
		lhm.put(2, "tony");//follow insertion order
		lhm.put(3, "sachin");// duplicate key is not allow , one nullkey allowed
		lhm.put(4, "virat");// duplicate values are allowed
		lhm.put(5, "virat");//muitiple null values are allowed
		lhm.put(5, "deepti");
		lhm.put(null, "virat");
		lhm.put(6, null);
		lhm.put(8, null);
		lhm.put(null, "virat");
		lhm.put(7, null);
		//lhm.put(null, "virat");
		
		System.out.println(lhm);
	}

}
