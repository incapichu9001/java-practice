package String;
/**
 * ->StrinBuffers is  growable string class - unlike String class which is fixed
 * ->Mutable
 * ->offer methods for string manipulation : append, insert, replace, substring, subsequence, 
 * ->takes more memory
 * 
 */

public class StringBuffers {
	public static void main(String[] args){
	
	 StringBuffer str = new StringBuffer("some String");
	 System.out.println(str);
	 
	 //append string
	 str = str.append(" some more string ");
	 System.out.println(str);
	 
	 //append other types: boolean, float, double etc..
	 str.append(false);
	 System.out.println(str);
	 
	 str.append(245.567);
	 System.out.println(str);
	 
	 //character array, offset position of array, no of characters from offset
	 str.append(new char[]{' ', 's', 'i', 'l', 'h','u', 't'}, 0, 4);
	 
	 System.out.println(str);
	 
	 str.reverse(); //replces existing buffer with reverse of the character sequence	 
	 System.out.println(str);
	 str.reverse(); 
	 	 
	 String strstr = str.toString();
	 
	 //first occurance of the substring within the buffer
	 System.out.println("Index of 'more' "+ str.indexOf("more")); 
	//first occurance of the substring within the buffer after a given index
	 System.out.println("Index of 'some' after postion 4: "+ str.indexOf("some", 4));
	 
	 System.out.println(str.replace(17, 21, "even"));
	 
	 System.out.println(str.substring(4, 21)); //returns a string
	 System.out.println(str.subSequence(3, 23)); //returns a CharSequence object	 
	                                             //CharSequence chseq = str.subSequence(3, 23);	 
	 System.out.println(str.charAt(30));
	 
	 System.out.println(str.insert(15, " random insert "));
	 
	 System.out.println(str.replace(15, 29, " selected replace "));
	 
	 
	}
	
}
