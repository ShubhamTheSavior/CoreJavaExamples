package interthreadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		ThreadA t=new ThreadA();
		t.start();
		
		ThreadB b=new ThreadB(t);
		b.start();
		
		
		synchronized(t){
			System.out.println("main method calling wait method");
			t.wait();
			System.out.println("child thread starts calling");
			System.out.println(t.total);
		}

	}

}
