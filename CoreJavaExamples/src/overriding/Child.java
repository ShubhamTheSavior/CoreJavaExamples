package overriding;

public class Child extends Parent{

	@Override
	public void earnMoney() {
		System.out.println("earn money and make parents proud");
	}

	public void earnMoney(int i) {
		System.out.println("earn money and make parents proud");
	}

	@Override
	public String doWork() {
		System.out.println("I am doing work");
		return "";
	}
	
	
	
}
