package dynamicprogramming;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		int i;
		for(i=1;i<=10;i++) {
		  s.push(i*5);
		
		}
		
		print(s);
		int p1 = (int)s.pop();
		System.out.println("popped:"+p1);
		print(s);
		int p2 = (int)s.pop();
		
		System.out.println("popped:"+p2);
		System.out.println("current size:"+s.size());
		print(s);		
		
	}
	
	static void print(Stack s) {
		System.out.println("Printing current stack, Last at top:");
		int i;
		for(i=s.size()-1;i>=0;i--) {
			System.out.println(s.get(i));
		}
		
		for(Object o: s) {
			
		}
	}
}
