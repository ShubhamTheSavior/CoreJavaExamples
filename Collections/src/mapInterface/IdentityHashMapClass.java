package mapInterface;

import java.util.IdentityHashMap;

public class IdentityHashMapClass {

	public static void main(String[] args) {
		IdentityHashMap<Object,Object> map=new IdentityHashMap<Object,Object>();
		map.put(new String("A"), "AK");
		map.put(new String("A"), "AK");
		System.out.println(map);
		
	}
	
}
	