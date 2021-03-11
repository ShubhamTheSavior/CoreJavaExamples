package sleep;

public class Child2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child2 thread-"+i);
			Child.interrupted();
		}
	}
	
}
