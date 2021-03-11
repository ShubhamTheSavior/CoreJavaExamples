package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> data=new ArrayList<Integer>();
		data.add(5);
		data.add(1);
		data.add(2);
		data.add(7);
		data.add(6);
		data.add(6);
		
		Collections.sort(data);
		System.out.println(data);
		
		ArrayList<Student> data1=new ArrayList<Student>();
		data1.add(new Student(1,5));
		data1.add(new Student(2,1));
		data1.add(new Student(3,2));
		data1.add(new Student(4,7));
		data1.add(new Student(5,6));
		data1.add(new Student(6,6));
		
		/*
		 * Collections.sort(data1, new MyComparator()); System.out.println(data1);
		 */
		
		Comparator<Student> c =(Student s1,Student s2)->{
			return (s1.getMarks()<s2.getMarks()?1:s1.getMarks()>s2.getMarks()?-1:0);
		};
		
		Collections.sort(data1, c);
		System.out.println(data1);
		
		System.out.println(data1.hashCode());
		
		List<Student> data2=data1.stream().filter
				((Student s)->s.getMarks()>5).collect(Collectors.toList());
		System.out.println(data2);	
		
		List<Long> data3=data1.stream().map((Student s1)->s1.getMarks()+1).collect(Collectors.toList());
		System.out.println(data3);
		
	}
	
}
