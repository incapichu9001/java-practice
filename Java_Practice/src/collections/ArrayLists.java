package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ArrayLists {	

	public static void main(String[] args) {
		String[] s; //reference variable for an array;
	    String[] y = new String[10]; //create a blank array of fixed length.
	    //y = {"a", "b"};
		
		String[] x = {"1","2","3","4"}; //creation and initialization of fixed size array
		int[] i = {1,2,3,4,5};
		float[] z = {1,4,3};
		for(float element: z){
			System.out.println(element);
		}
		//re assigning values to array object.arrays are mutable.
		z= new float[]{6,7,9, 11, 34};
		for(float element: z){
			System.out.println(element);
		}
		//Below assignment syntax for array is not allowed
		//x = {1,2,3,};//
		
		//ArrayList is of variable size and mutable
		//This will declares a variable but no allocation
		ArrayList list1;
		//This step creates an object of type ArrayList and assign the reference to variable
		list1 = new ArrayList();
		//ArrayLIst in one line
		/*ArrayList list2 = new ArrayList();
		//Arraylist of only specific types
		ArrayList<String> names = new ArrayList();
		//add an element (add()can take a value or a variable)
		names.add("Mohan");
		names.add("Ramesh");
		names.add(2,"Amesh");
		String n = "Bupesh";
		names.add(n);
		//get() method to get values of at an index
		for(int i=0; i<names.size(); i++){
			System.out.println(names.get(i));
		}
		names.remove(2);
		names.add("Kumar");
		names.set(1, "Babu");//Replace an element at an index
		
		//print whole list
		System.out.println(names);
		//enhance for loop for(datatype element: list), no need to use get() method to obtain individual elements 
		for(String s: names){
			System.out.println(s);			
		}
		//Generic ArrayList
		ArrayList nameCopy = new ArrayList();
		//Copy one list to another
		nameCopy.addAll(names);
		System.out.println("Items copied to nameCopy: "+nameCopy);
		
		//Compare Lists. Doesn't check for duplicates
		if(nameCopy.containsAll(names)){
			System.out.println("nameCopy Has everything names has");
		}
		names.add(n);//adding an existing element
		System.out.println("Updates 'names':"+names);
		//Compare Lists
		if(nameCopy.containsAll(names)){
			System.out.println("Second compare: nameCopy Has everything names has");
		}
		names.add("Prasad");
		if(nameCopy.containsAll(names)){
			System.out.println("Third compare: nameCopy Has everything names has");
		}else if(names.containsAll(nameCopy)){
			System.out.println("Third compare: nameCopy is subset of names");
		}
		*/

	}

}
