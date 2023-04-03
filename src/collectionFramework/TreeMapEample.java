package collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEample {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		
		tm.put(1, "varun");// cant maintain order
		tm.put(2, "deepti");//cant allow duplicate key
		tm.put(3, "antony");// can allow duplicate value
		tm.put(3, "antony");
		tm.put(4, "sachin");//follow ascending order of key.
		tm.put(6, null);
		tm.put(5, "sachin");
		tm.put(7, null);
	tm.put(null, "sony");//cant allow null key , throws nullpoint exception
		tm.put(null, null);
		System.out.println(tm);
		
		System.out.println("====Map.Entry=============  ");
		for(Map.Entry entry : tm.entrySet() ) {
			
		System.out.println(entry.getKey() + "===" + entry.getValue());// gives ascending order of key.
		
	}
		System.out.println("====get keyset===");
		
		for(Integer key:tm.keySet()) {
			
			System.out.println(key);//follow ascending order of key.
		}
		
		System.out.println("===get value====");
		
		for(String name:tm.values()) {
			
			System.out.println(name);//returns the value in ascendind order of the  corresponding key.
		}
		
		System.out.println("====input key-- output value=====");
		
		for(int key:tm.keySet()) {
			if(key==1) {
				String name= tm.get(key);
				System.out.println(name);
			}
			
		}

}
	}

