package SingletonClass;

public class Main {

	public static void main(String[] args) {
		
		Student student=Student.getStudentInstance();
		Student student1=Student.getStudentInstance();
		Student student3=Student.getStudentInstance();
		Student student4=Student.getStudentInstance();
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		System.out.println(student3.hashCode());
		System.out.println(student4.hashCode());
		System.out.println("***************");
		Employee e=Employee.getInstance();
		Employee e1=Employee.getInstance();
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
	}

}
