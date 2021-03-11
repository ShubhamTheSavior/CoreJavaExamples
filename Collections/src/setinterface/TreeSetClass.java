package setinterface;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		Comparator<Integer> c=(s1,s2)->{
			return -s1.compareTo(s2);
		};
		TreeSet<Integer> treeSet=new TreeSet<Integer>(c);
		treeSet.add(5);
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(6);
		
		
		
		System.out.println(treeSet);
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.headSet(10));
		System.out.println(treeSet.tailSet(1));
		System.out.println(treeSet.subSet(10, 5));
		
	}

}
