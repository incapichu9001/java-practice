package interviewqs.dynamicprogramming;

import java.nio.charset.Charset;
import java.util.HashMap;
public class RomanToInt {
	
	static HashMap<Character, Integer> romans = new HashMap<Character, Integer>();
    static {
    romans.put('I', 1);
    romans.put('V', 5);
    romans.put('X', 10);
    romans.put('L', 50);
    romans.put('C', 100);
    romans.put('D', 500);
    romans.put('M', 1000); }
    
	public static int getInt(String roman){
		//"MCDLXVII"
		int val = 0;
		char [] a = roman.toCharArray();
		int i = 0;
		while(i<a.length){
			if(i!=a.length-1 && (romans.get(a[i]) < romans.get(a[i+1]))){
			  val = val+ romans.get(a[i+1])- romans.get(a[i]);
			  i += 2;
			}
			else { 
				val = val + romans.get(a[i]); 
			i+=1;
			}
		}
		return val;
	}
	
	public static void main(String[] args){
		String r = "CDXLIX";
	    System.out.println("The integer equivalent of " + r+ "is: "+getInt(r));
	    
	}

}
