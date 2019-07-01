package dynamicprogramming;
/*
 * This class demonstrates reversing a string (1) with loops (2) with iterative functions 
 */
public class StringReversal {

	static final String  str = "this is a long string";
	
	String itrReverse(String s) {
		 
		char[] c = s.toCharArray();
		char[] n = new char[c.length];
		int i, j=0;
		
		for(i=c.length-1;i>=0;i--) {
			n[j] = c[i];
			j++;
		}
		return new String(n);
	}
	
    String recReverse(String s) {
    	
    	
		return reverse(s);
	}
    
    String reverse(String s) {
    	if(s.length()<=1) {
    		return s;
    	}
    	return reverse(s.substring(1))+s.charAt(0);
    }
    
    public static void main(String[] args) {
    	
    	//System.out.println("Reversed string iteratively: " + new StringReversal().itrReverse(str));
    	
    	//System.out.println("Reversed string recursively: " + new StringReversal().recReverse(str));
    	
    	String a = new String("abc");
    	String b = new String("abc");
    	String c = a;
    	
    	System.out.println(a==b);
    	System.out.println(a==c);
    	System.out.println(c==b);
    }
}
