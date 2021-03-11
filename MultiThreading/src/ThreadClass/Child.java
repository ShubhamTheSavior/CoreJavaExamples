package ThreadClass;

public class Child extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread-"+i);
		}
	}
	
	public int run(int i) {
		System.out.println("i");
		return i;
	}

	/*Not recommended to override start method 
	
	@Override
	public synchronized void start() {
		System.out.println("start");
	}
	
	*/
	

	
	
}
