package mapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		Comparator<Object> c=(obj1,obj2)->{
			String s1=(String)obj1;
			String s2=(String)obj2;
			return -s1.compareTo(s2);
		};
		TreeMap<Object,Object> treeMap=new TreeMap<Object,Object>(c);
				treeMap.put("B", "all");
				treeMap.put("A", "Apple");
				
				
				
				System.out.println(treeMap);
		
	}

}
