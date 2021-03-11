package overriding;

public class Main {

	public static void main(String[] args) {

		Parent p=new Parent();
		p.doWork();
		p.earnMoney();
		
		Child c=new Child();
		c.doWork();
		c.earnMoney();
		
		Parent p1=new Child();
		p1.doWork();
		p1.earnMoney();
		
		//Child c1=new Parent(); child refrance cannot be used to hold child object
		
	}

}
