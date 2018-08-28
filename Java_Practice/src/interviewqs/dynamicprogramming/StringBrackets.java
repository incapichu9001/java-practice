package interviewqs.dynamicprogramming;
import java.util.*;
public class StringBrackets {

	static Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	
	static int addPairs(String str, int i){
		System.out.println("calling from i:"+i);
	
	     if(str.charAt(i+1) == ']'){
               m.put(i, i+1);
               System.out.println(String.format("inserted1: (%d, %d) ", i, (i+1)));
               System.out.println("returned1: "+(i+2));
               System.out.println("returning to i:"+i);
               return i+2 ;
		}

		
	     int r = addPairs(str, i+1); 
		 if(str.charAt(r) == '[') {
			 r = addPairs(str, r);
		  }
		 
		 if(str.charAt(r) == ']'){
		  m.put(i, r);
		  System.out.println(String.format("inserted2: (%d, %d) ", i, r));
		  System.out.println("returning to i:"+i);
		  return r+1;
		 }
		 else {
		    r=addPairs(str, r);
		    m.put(i, r);	    
		    System.out.println(String.format("inserted2: (%d, %d) ", i, r));
		    System.out.println("returning to i:"+i);
		    return r+1;
		 }

			  
	  }
	
	public static void main(String[] args){
	String str = "[[][][]][]";
	addPairs(str, 0);
	int i;
	for(int k: m.keySet()) {
		System.out.format("(%d, %d)", k, m.get(k));
	}
	
	}
	
}
