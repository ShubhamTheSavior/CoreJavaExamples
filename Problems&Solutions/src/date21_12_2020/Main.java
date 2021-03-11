package date21_12_2020;

import java.util.ArrayList;
import java.util.List;

class Main {

	  public static String FindIntersection(String[] strArr) {
	    String[] a1=strArr[0].split(",");
	    String[] a2=strArr[1].split(",");
	    List<String> a3=new ArrayList<String>();
	    String result="";
	    for(int i=0;i<a1.length;i++){
	      for(int j=0;j<a2.length;j++){
	        if(a1[i].equals(a2[j])){
	          if(!a3.contains(a1[i])){
	            a3.add(a1[i]);
	          }
	        }
	      }
	    }
	    for(String k:a3){
	      result=result+","+k;
	    }
	    return result;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	   
	    System.out.print(FindIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"})); 
	  }

	}