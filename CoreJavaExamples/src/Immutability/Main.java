package Immutability;

public class Main {

	public static void main(String[] args) {
		Simple simple=new Simple(1,"Shubham");
		Simple simple1=simple.modify(new Simple(2,"Rushhabh"));
		Simple simple3=simple.modify(new Simple(1,"Shubham"));
		System.out.println(simple==simple1);
		System.out.println(simple==simple3);
		
		Employee e=new Employee(1,"Shubham",new Address(1,"Akola"));
		Employee e1=e.modify(new Employee(1,"Shubham",new Address(1,"Akola")));
		Employee e2=e.modify(new Employee(2,"Shubham",new Address(1,"Akola")));
		System.out.println(e==e1);
		System.out.println(e==e2);
	}
	
}
