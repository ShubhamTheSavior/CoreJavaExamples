package withsyncronization;

public class ThreadTwo extends Thread{

Student student;
	
	public ThreadTwo(Student student) {
		this.student=student;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread1-"+i);
		}
	}
}
