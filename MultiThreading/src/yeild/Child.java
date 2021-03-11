package yeild;

public class Child extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("child1 thread-"+i);
			
		}
	}
	
}
