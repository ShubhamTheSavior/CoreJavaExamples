package TypeCasting;

public class Main {

	public static void main(String[] args) {
		String s=new String("Shubham");
		Object o=(Object)s;
		System.out.println(s.hashCode());
		System.out.println(o.hashCode());
	}

}
