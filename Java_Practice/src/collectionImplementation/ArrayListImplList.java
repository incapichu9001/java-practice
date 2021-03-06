package collectionImplementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListImplList<T> implements List{
	private Object[] data;
	private int size = 0;
	private int DEFAULT_SIZE  = 10;
	
	public ArrayListImplList() {
		data = new Object[this.DEFAULT_SIZE];
	}
	
	public ArrayListImplList(int size) {
		data = new Object[size];
		this.size = size;
	}

	@Override
	public int size() {
		return this.size();
	}

	@Override
	public boolean isEmpty() {
		return (this.size == 0) ? true : false;
		
	}

	@Override
	public boolean contains(Object o) {
		boolean check = false;
		for(Object i: data){
			if(o.equals(i)) {
				check = true;
			}			
		}
		return check;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		data[size] = e;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> array = new ArrayList<Integer>();	
		List<Integer> myArray = new ArrayListImplList<Integer>();
		myArray.add(2);
		myArray.add(3);
		myArray.add(0);
		System.out.println(true);
		System.out.println(myArray.contains(3));
		System.out.println(myArray.contains(10));
		
	}

}
