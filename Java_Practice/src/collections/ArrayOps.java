package collections;
/*
 * ->Arrays are series of elements stored in contiguous memory locations
 * ->Every array is associated with a class whose parent class is Object
 * ->length is public 'final' field
 * -> Aarrays are faster to access than arrayList as they placed in contiguous memery locations
 * -> But arrays are not suitable when sixxe is very large
 */

import java.util.Arrays;
import java.util.ArrayList; 
import java.util.List; 

public class ArrayOps {
	
public static void main(String[] args){		
		//Character array
		char[] carr; //declare reference
		carr  =  new char[10]; //allocate memory
		
		String [] strarray = new String[10]; //declaration and allocation in one step
		//assign values to individual array elements
		carr[1] = 'a';
		carr[2] = '2';
		
		//reassign value at a specific index:
		carr[1] = '1';
		
		//note assignement is like premitive, creation like a class using new Type[size]
		char arr[];
		arr = new char[]{'s', 'o', 'l', 'i', 'd'}; //array literal assignment
		arr[2] = 't';
		
		//iterate through array
		for(char c: arr){
			System.out.print("'"+c+"'"+",");
		}
		
		//cloning an arry object
		char[] arr2 = arr.clone();
		
		/*Arrays to other Collections' operations*/
		
		//character array to string;
		String arrayString = new String(arr); //character array to string constructor
		String fromArray = String.copyValueOf(arr); //using static method from String Class
		String arrayVal = String.valueOf(arr); //using static method valueOf()
		
		//intiger Arrays to ArrayList
		ArrayList<Integer> alist = new ArrayList(Arrays.asList(new int []{34,67,1109,3456}));
		//string to character array
		
		
		//array of objects
	}

}
