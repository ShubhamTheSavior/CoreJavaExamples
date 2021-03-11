package SingletonClass;

public class Student {

	private static Student singletonInstance=null;

	public static Student getStudentInstance() {
		if(singletonInstance==null) {
			System.out.println("new object created");
			singletonInstance=new Student();
			return new Student();
		}
		else {
			System.out.println("old object gets returned");
			return singletonInstance;
		}
	}
	
}
