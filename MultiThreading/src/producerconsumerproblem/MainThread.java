package producerconsumerproblem;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		PC pc=new PC();
		
		Runnable r1=()->{
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		
		
		Runnable r2=()->{
			try {
				pc.consume();;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(r2);
		t2.start();
		
		t1.join(); 
        t2.join();
	}
	
}
