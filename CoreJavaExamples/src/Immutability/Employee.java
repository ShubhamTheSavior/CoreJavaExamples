package Immutability;

public final class Employee {

	private int empId;
	private String empName;
	private Address address;
	
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	
	public Employee modify(Employee e) {
		if(e.empId==this.empId) {
			return this;
		}else {
			return new Employee(e.empId,e.empName,e.address);
		}
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Address getAddress() {
		return address;
	}

	
	
}
