package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put(1, 5);//key and value
		map.put(2, "deepti");//map can't maintain order
		map.put(3, "antony");// cant allow duplicate key
		map.put(3, "antony");//can allow duplicate 'value'
		map.put(4, "sachin");//can allow one null key
		map.put(6, null);
		map.put(5, "sachin");
		map.put(null, null);// can allow multiple null value.
		System.out.println(map);
		
		Map<Integer,String> mapone = new HashMap<Integer,String>();
		mapone.put(1, "10");
		System.out.println(mapone);
		
		Map<String,String> maptwo = new HashMap<String,String>();
		maptwo.put("deeppti", "deepti");
		maptwo.put("deepti", "usa");
		System.out.println(maptwo);
		
		
		
		HashMap hmap = new HashMap();
		hmap.put(1, 5);//key and value
		hmap.put(2, "deepti");//map can't maintain order
		hmap.put(3, "antony");// cant allow duplicate key
		hmap.put(3, "antony");//can allow duplicate 'value'
		hmap.put(4, "sachin");//can allow one null key
		hmap.put(6, null);
		hmap.put(5, "sachin");
		hmap.put(null, null);// can allow multiple null value.
		System.out.println(hmap);
		
		
	}

}
