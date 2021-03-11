package callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] m=new MyCallable[] {new MyCallable<Object>("Shubham"),new MyCallable<Object>("ak"),
				new MyCallable<Object>("Rushabh"),new MyCallable<Object>("rahul")};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		for (MyCallable<?> myCallable : m) {
			Future f=service.submit(myCallable);
			System.out.println(f.get());
		}
	}
	
}
