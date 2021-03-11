package withsyncronization;

public class Main {

	public static void main(String[] args) {
		
		
		
		Student obj = new Student();//only one object  
		ThreadOne t1=new ThreadOne(obj);  
		ThreadTwo t2=new ThreadTwo(obj);  
		t1.start();  
		t2.start();  
		
		
	}
}
