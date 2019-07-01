package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class LikedListReverse {
	
}

class myLinkedList<T> {
	
	final static List<Integer> i = new ArrayList<Integer>();
	{
		i.add(222);
		i.remove(222);
		i.add(2344);
	}
	
	private Node<T> head;
	private Node<T> tail;
		
	public void add(T element) {
		Node<T> n = new Node<T>();
		n.setValue(element);
		while(true) {
		  Node<T> tmp  = head;
		  if(tmp == null) {
			  head = n;
			  break;
		  }
		  else if(tmp.getNext() == null) {
			  tmp.setNext(n);
			  break;
		  }
		  else {
			  tmp = tmp.getNext();
		  }
		  
		}
	} 
	
	public void reverse() {
		
		
	}
	
	private Node<T> reverseList(Node<T> h) {
		Node<T> temp = tail;
		//tail.next = tail;
		
		
		while(true) {
			
		}
	}
	
}

class Node<T> {
	private T data;
	private Node<T> next;	

	public T getValue() {
		return data;
	}
	public void setValue(T val) {
		this.data = val;
	}
	public Node<T> getNext() {
		return next;
	}	
	public void setNext(Node<T> n) {
		this.next = n.next;
	}
	
}