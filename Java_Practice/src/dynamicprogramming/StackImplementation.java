package dynamicprogramming;

import java.util.Vector;
import java.util.List;

public class StackImplementation {
	
	private Vector<Integer> v = new Vector<Integer>();
	private int size;
	
	public void push(int element) {
		v.add(element);
		
	}
	
	public int pop() {
		
		int r = v.remove(v.size()-1);
		
		return r;
	}
	
	public int get(int index) {
		
		return v.get(index);
		
	}
	
	public int size() {
		this.size = v.size();
		return size;
	}
	
	
	

}
