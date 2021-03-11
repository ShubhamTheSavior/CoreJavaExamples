package setinterface;

import java.util.Date;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	
	public static void main(String[] args) {
		LinkedHashSet<Object> hashSet=new LinkedHashSet<Object>();
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
