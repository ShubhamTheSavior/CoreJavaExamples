package Immutability;

public final class Simple {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public Simple(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Simple modify(Simple simple) {
		if(simple.getName().equals(this.getName()) && 
				simple.getId()==this.getId()) {
			return this;
		}else {
			return new Simple(simple.getId(),simple.getName());
		}
	}
	
	
}
