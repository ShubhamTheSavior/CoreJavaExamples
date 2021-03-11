package SingletonClass;

public class Employee {

	public static final Employee employeeInstance=
			new Employee();
	
	public static Employee getInstance() {
		return employeeInstance;
	}
	
}
