package overloading;

public class SimpleConcept {

	// The method sum(int, long) is ambiguous 
	//  The method sum(long b,int a) is ambiguous
	   
	public void sum(int a,long b) {
		System.out.println("sum(int a,long b)");
	}
		
	public void sum(long b,int a) {
		System.out.println("sum(long b,int a)");
	}
		

	public String display(String name) {
		System.out.println(name);
		return name;
	}
	
	public Object display(Object name) {
		return name;
	}
	
	public void display(int a,String b, double d) {
		System.out.println();
	}
	
	public void display(long d,String b, int a) {
		System.out.println();
	}
	
	public int sum1(int a,int b,String c) {
		System.out.println(a+b);
		return a+b;
	}
		
	public long sum1(String c,int b,int a) {
		System.out.println(a+b);
		return a+b;
	}
	
	private void p1(String one,int b) {
		System.out.println("p1");
	}
	
	private void p1(int a,String s) {
		System.out.println("p12");
	}
	
	public static void main(String[] args) {
		SimpleConcept s=new SimpleConcept();
		s.display("shubham");
		// s.sum(10, 10); The method sum(int, long) is ambiguous for the type SimpleConcept
		s.display(10, "shubham",10.0);
		s.sum1(1, 2, "c");
		s.sum1( "c",2, 2);
		s.p1(10,"j");
	}
	
}

