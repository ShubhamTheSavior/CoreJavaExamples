package ListInterface;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		
		al.add("shubham");
		al.add("shubham");
		al.add(2);
		al.add("rushabh");
		al.add(new Date());
		
		System.out.println(al);
		
		
		
	}
	
}
