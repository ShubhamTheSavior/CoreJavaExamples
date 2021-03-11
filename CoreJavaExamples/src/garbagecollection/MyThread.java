package garbagecollection;

import java.util.Date;

public class MyThread {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		for(int i=0;i<10000000;i++) {
			Date d=new Date();
			d=null;
		}
		r.gc();
	}
	
	
}
