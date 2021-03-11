package mapInterface;

import java.util.Date;
import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapClass {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<Object,Object> map=new WeakHashMap<Object,Object>();
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
		Thread.sleep(5000);
		System.out.println(map);

	}

}
