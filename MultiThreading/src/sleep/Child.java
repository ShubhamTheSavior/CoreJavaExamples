package sleep;

public class Child extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child1 thread-"+i);
			try {
				Child.sleep(5000);
				
			} catch (InterruptedException e) {
				System.out.println("I got interrupted");
				e.printStackTrace();
			}
		}
	}
	
}
