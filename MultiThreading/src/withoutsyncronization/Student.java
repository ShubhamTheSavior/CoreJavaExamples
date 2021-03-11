package withoutsyncronization;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String studentName;
	
	public Student() {}
	
	public Student(String studentName) {
		this.studentName=studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public List<Student> getStudentList(){
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student("Shubham"));
		studentList.add(new Student("rushabh"));
		studentList.add(new Student("ak"));
		studentList.add(new Student("mayur"));
		studentList.add(new Student("srushti"));
		return studentList;
	}
	
	
	
}
