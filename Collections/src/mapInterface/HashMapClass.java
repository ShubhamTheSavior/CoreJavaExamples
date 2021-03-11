package mapInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) throws InterruptedException {
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		String a=new String("Shubham");
		map.put("A", "AK");
		map.put("B", "Ball");
		map.put(3, 4);
		map.put(5, new Date());
		map.put("POST", "GET");
		map.put(7, "HOHO");
		map.put("POST", "GET");
		map.put(78, "HOHO");
		map.put("POST1", "GET");
		map.put(71, "HOHO");
		map.put("POST2", "GET");
		map.put(36, "HOHO");
		map.put(null, "HOHO");
		map.put(123, "HOHO");
		map.put(a, "Gadekar");
		System.out.println(map);
		a=null;
		System.gc();
		
		System.out.println(map);
		
		map.forEach((o1,o2)->{
			System.out.println(o1+"-"+o2);
		});
		
	}
	
}
