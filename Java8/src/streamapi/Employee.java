package streamapi;

public class Employee {

	private String name;
	private Integer sal;
	private String dept;
	
	public Employee(String name, Integer sal, String dept) {
		super();
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}

}
