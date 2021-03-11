package overloading;

public class Main {

	public static void main(String[] args) {
		Parent p=new Child();
		p.displayParent(p); //display parent
		
		Parent p1=new Parent();
		p1.displayParent(p1); //display parent
		
		//Child c1=new Parent(); // Cannot conver from parent to child
		
		Child c1=new Child();
		c1.displayParent(c1); // display child
		
		
		
	}
	
}
