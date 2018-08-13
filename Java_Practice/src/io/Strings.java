package io;
import java.util.Collections;
import java.util.Arrays;

public class Strings {
	
	public static void main(String[] args){
    
    String str = "123456789";
    char[] rev = new char[str.length()];
    int i, j= str.length()-1;
    char p, n;
    for(i=0;i<str.length();i++){    	
    	rev[i] = str.charAt(j);
    	j--;
    }

    System.out.println("Reversed string :" + new String(rev));
    
	}

}
