package setinterface;

import java.util.Date;
import java.util.HashSet;

public class HashSetClass {
	
	public static void main(String[] args) {
		HashSet<Object> hashSet=new HashSet<Object>();
		hashSet.add("shubham");
		System.out.println(hashSet.add("shubham"));
		hashSet.add(2);
		hashSet.add("rushabh");
		hashSet.add(new Date());
		hashSet.add("asdf");
		hashSet.add("b");
		hashSet.add("f");
		hashSet.add("r");
		
		
		System.out.println(hashSet);
	}
}
