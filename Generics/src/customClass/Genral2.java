package customClass;

public class Genral2<T> {

	private T object;
	
	public Genral2() {
		
	}
	
	public void add(T object) {
		this.object=object;
	}
	
	public T get() {
		return object;
	}
	
}
