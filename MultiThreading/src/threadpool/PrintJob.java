package threadpool;

public class PrintJob implements Runnable {

	private String name;
	
	public PrintJob(String name) {
		this.name=name;
	}
	
	
	@Override
	public void run() {

		String op=name+" job started by thread : "+Thread.currentThread().getName();
		System.out.println(op);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			String op1=name+" job completed by thread : "+Thread.currentThread().getName();
			System.out.println(op1);
		}
	}

}
