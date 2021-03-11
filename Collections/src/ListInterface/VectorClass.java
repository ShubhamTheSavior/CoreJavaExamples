package ListInterface;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Object> vector=new Vector<Object>();
		vector.add("shubham");
		vector.add(2);
		vector.add("rushabh");
		vector.add(new Date());
		
		Enumeration<Object> e=vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Runnable r=()->{
			vector.forEach(s->System.out.println("1-"+s));
		};
		
		Thread t=new Thread(r);
		t.setPriority(10);
		t.start();
		
		Runnable r1=()->{
			vector.forEach(s->System.out.println("2-"+s));
		};
		
		Thread t1=new Thread(r1);
		t1.start();
	}
	
}
