package withoutsyncronization;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		Student s1=new Student();
		List<Student> studentList=s1.getStudentList();
	
		Runnable r=()->{
			studentList.forEach(s->{if(s.getStudentName().equals("Shubham"))
				studentList.remove(0);});
		};
		
		Thread t=new Thread(r);
		t.start();
		
		Runnable r1=()->{
			studentList.forEach(s->{if(s.getStudentName().equals("Shubham"))
				studentList.add(new Student("Unknown"));});
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		System.out.println(studentList);
	}
}
