package withsyncronization;

public class ThreadOne extends Thread{

	Student student;
	
	public ThreadOne(Student student) {
		this.student=student;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread1-"+i);
		}
	}
	
	
	
}
