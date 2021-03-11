package customClass;

public class Genral<T,U,V> {

	private T object;
	private U object1;
	private V object2;
	
	
	public Genral() {
		
	}
	
	public void add(T object,U object1,V object2) {
		this.object=object;
		this.object1=object1;
		this.object2=object2;
	}
	
	
	
	public T get() {
		return object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public U getObject1() {
		return object1;
	}

	public void setObject1(U object1) {
		this.object1 = object1;
	}

	public V getObject2() {
		return object2;
	}

	public void setObject2(V object2) {
		this.object2 = object2;
	}

	@Override
	public String toString() {
		return "Genral [object=" + object + ", object1=" + object1 + ", object2=" + object2 + "]";
	}

	
	
	
	
}
