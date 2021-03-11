package interthreadcommunication;

public class ThreadB extends Thread{

	ThreadA a;
	
	public ThreadB(ThreadA a) {
		this.a=a;
	}
	
	int bTotal=15;
	@Override
	public void run() {
		 synchronized(a){
			 System.out.println("Thread B called wait on this method");
			 try {
				a.wait();
				System.out.println("ThreadB-"+(a.total+15));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 
		 }
	}

	
	
}
