package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		PrintJob[] printJob=new PrintJob[]{new PrintJob("shubham"),new PrintJob("ak"),
				new PrintJob("rushabh"),new PrintJob("rahul")};
		
		ExecutorService service=Executors.newFixedThreadPool(3);		
		for (PrintJob printJob2 : printJob) {
			service.submit(printJob2);
		}
		service.shutdown();
	}
	
}
