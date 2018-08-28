package interviewqs.dynamicprogramming;

import java.util.*;
public class ExcelColToInt {

	static Map<Character, Integer> atn = new HashMap<Character, Integer>();
	static {
		
		 atn.put('A',1);
		 atn.put('B',2);
		 atn.put('C',3);
		 atn.put('D',4);
		 atn.put('E',5);
		 atn.put('F',6);
		 atn.put('G',7);
		 atn.put('H',8);
		 atn.put('I',9);
		 atn.put('J',10);
		 atn.put('K',11);
		 atn.put('L',12);
		 atn.put('M',13);
		 atn.put('N',14);
		 atn.put('O',15);
		 atn.put('P',16);
		 atn.put('Q',17);
		 atn.put('R',18);
		 atn.put('S',19);
		 atn.put('T',20);
		 atn.put('U',21);
		 atn.put('V',22);
		 atn.put('W',23);
		 atn.put('X',24);
		 atn.put('Y',25);
		 atn.put('Z',26);
	}
	
	public static double colToNum(String col) {
		int l = col.length();
		int i, p,sum = 0;
		p=0;
		for(i=l-1; i >=0; i--) {
			sum += atn.get(col.charAt(i)) *Math.pow(26, p);
			p++;
		}
		return sum;
		
	}	

	public static double colToNumRecur(String col) {
		if(col.length()==1) {
			return atn.get(col.charAt(0));
		}
		else {
			int p = col.length()-1;
			return  colToNumRecur(col.substring(1)) + atn.get(col.charAt(0))*Math.pow(26, p);
		}		
	}
	

	
	public static void main(String[] args) {
		
		//System.out.println(colToNum("A"));
		//System.out.println(colToNum("Z"));
		//System.out.println(colToNum("AZ"));
		//System.out.println(colToNum("KZ"));
		System.out.println(colToNum("ABZ"));
		System.out.println(colToNumRecur("ABZ"));
		
		
	}
}
