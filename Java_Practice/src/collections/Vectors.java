package collections;

/*
 * ->Vector is a collection implements LIst interface
 * ->Synchronized and thread safe
 * ->so it is slow
 * ->ordered collection
 * ->allows duplicates like Array List
 * ->older archaic aollection , user arrayLit or concurrent arrayList instead
 */
import java.util.Collection;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;

public class Vectors {
	
	public static void main(String[] args) {
		Vector<String> vList = new Vector<String>();
		
		vList.add("First Name");
		vList.add(1, "Address");
		
		//vList.add(4, "Something"); //-> fails with ArrayIndexOutOFBoundsException
		
		//4 ways of creating a vector
		//Vector()
		//Vector(Collection<? extends E> c)
		//Vector(int initialCapacity)
		//Vector(int initialCapacity, int capacityIncrement)
		
		String address = vList.get(1);
		System.out.println(vList.contains("Last Name"));
		
		Object vList2 = vList.clone(); //clone gives a vector 
		//?? how to convert object collection to specific collection??//
		
		Vector cloned = new Vector(vList); //create new clone by passing old list as argument
		
		cloned.add("Rand");
		String [] strarray = {"zipcode", "countyCode", "ssn", "psn"};
		int i;
		for(i=0; i<strarray.length;i++){
			cloned.add(strarray[i]);
		}
		
		cloned.addAll(vList);
		System.out.println(cloned.containsAll(vList)); //return true
		
		List<String> alist= new ArrayList<String>();
		alist.add("one");
		alist.add("two");
		
		System.out.println(cloned.containsAll(alist)); //containsAll takes a collection . //returns false
		
		String[] arr2 = new String[cloned.size()];
		cloned.copyInto(arr2); //copies collection into an array -> to copy collection to an array
		
		printArray(arr2);
		
		System.out.println("The capacity of the vector closed is: " +cloned.capacity());
		
		cloned.remove(3);
		cloned.remove("psn");
		cloned.remove("sddf"); //won'r give any error is if string "sddf" is not there in the collection
		cloned.removeAll(alist);
		cloned.removeIf(p-> p == "Rand");
		printCollection(cloned);
	}
	
	static void printArray(String[] arr) {
		
		System.out.println("\nPrinting the array:\n");
		int i;
		for(i=0;i< arr.length;i++){
		   System.out.println(arr[i]);	
			
		}
	}
	
	static void printCollection(List c) {
		
		System.out.println("\nPrinting the Collection:\n");
		int i;
		for(i=0;i< c.size();i++){
		   System.out.println(c.get(i));	
			
		}
	}
	

}
