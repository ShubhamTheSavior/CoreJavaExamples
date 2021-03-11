package ConcurrrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	
	public static void main(String[] args) {
		Map<Integer,Integer> a=new HashMap<Integer,Integer>();
		a.put(1,5);
		a.put(2,4);
		a.put(3,3);
		a.put(4,2);
		a.put(5,1);
		
		Iterator<Entry<Integer, Integer>> i=a.entrySet().iterator();
		
		
		a.forEach((i1,i2)->{System.out.println(i1);});
		
		Runnable r=()->{
			a.forEach((i1,i2)->{a.put(i1, i2+5);System.out.println("called");});
			;
		};
		Thread t=new Thread(r);
		t.start();
		System.out.println(a);
	}
}
