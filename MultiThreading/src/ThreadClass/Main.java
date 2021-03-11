package ThreadClass;

public class Main {

	
	public static void main(String[] args) {
		Child c=new Child();
		
		c.start();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread-"+i);
		}
		
		c.run(8);
	}
}
