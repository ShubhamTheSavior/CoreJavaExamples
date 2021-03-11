package mapInterface;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args) {
		Hashtable<Object,Object> hashTable=
				new Hashtable<Object,Object>();
		hashTable.put("B", "Ball");
		hashTable.put("A", "Apple");
		hashTable.put(1, 2);
		//hashTable.put(null, 2);
		System.out.println(hashTable);
	}
	
}
