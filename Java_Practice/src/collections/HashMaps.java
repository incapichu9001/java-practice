package collections;
import java.util.*;

public class HashMaps {
	
    public static void main(String[] args){
    	/**declare an empty has map**/
    	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    	Map<String, Integer> nameAndId = new HashMap<String, Integer>(); //polymorphic declaration
    	/**Add elements to it **/
    	hmap.put(2, "two");
    	hmap.put(340, "three hundred and four");
    	hmap.put(34, "someval");
    	/**Remove element **/
    	String removedVal= hmap.remove(34);
    	System.out.println("value removed: "+removedVal);
    	/**Remove element and confirm**/
    	Boolean isRemoved = hmap.remove(34, "val");
    	System.out.println("is key value pair, 34-val removed?: "+isRemoved);
    	/**Replace an element**/
        String replacedVal = hmap.replace(2,"tworeplaced");
        System.out.println("replaced value: "+replacedVal);
        Boolean isValReplaced = hmap.replace(3, "three", "newThree");
        System.out.println("Is value 'three' replaced: "+isValReplaced);       
    	System.out.println(hmap.get(2));
    	System.out.println(hmap.get(340));
    	HashMap<String, String> hmap2 = new HashMap<String, String>();   
    	//hmap.clear();
    	System.out.println(hmap.size());
    	System.out.println(hmap.containsKey(340));
    	
    	/**Iterate over hashmap and print key,value pairs**/
    	hmap.put(12, "twelve");
    	hmap.put(15, "fifteen");
    	for(int key: hmap.keySet()){
    		System.out.format("The key value pair is %d:%s\n", key, hmap.get(key));
    	}
    	
    	/**get set of keys and iterate over them**/
    	Set<Integer> hkeys = hmap.keySet();
    	Iterator<Integer> keyiter = hkeys.iterator();
    	System.out.println("Printing Keys:");
    	while(keyiter.hasNext()){
    		System.out.println(keyiter.next());
    		
    	}

    	/**get collection of values and iterate over them**/
    	Collection<String> hvals = hmap.values(); //returns an iterator of Type Collection (interface)
    	List<String> hvalsList = new ArrayList<String>(hmap.values()); //iterator to arraylistconversion
    	System.out.println("Printing Values:");    	
        for(String val: hvalsList) {
        	System.out.print(val+", ");
        	
        }
       
}
    
    public Map readKvPairs(String filePath) {
    	    	
    	return new HashMap();
    	
    }
}
