package callable;

import java.util.concurrent.Callable;

public class MyCallable<Object> implements Callable<Object> {

	private String name;
	public MyCallable(String name) {
		this.name=name;
	}
	
	
	
	@Override
	public Object call() throws Exception {
		return (Object) name;
	}

}
