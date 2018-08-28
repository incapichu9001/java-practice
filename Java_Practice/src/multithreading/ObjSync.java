package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ObjSync {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		SomeThread t1 = new SomeThread(obj, "t-1");
		SomeThread t2 = new SomeThread(obj, "t-2");
		SomeThread t3 = new SomeThread(obj, "t-3");
		SomeThread t4 = new SomeThread(obj, "t-4");
		SomeThread t5 = new SomeThread(obj, "t-5");
		/*The order in which below thread gets submitted is not gurenteed*/
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}

class SomeThread extends Thread{
	private String name;
	private MyObject myobj;

	
	public SomeThread(MyObject o, String n){
		this.myobj = o;
		this.name = n;
	}
	
	public void run() {
		myobj.foo(name);
		
	}	
}

class MyObject {
	String str;
	int balance =100;
	private Lock lock;

	public MyObject(){
		this.lock = new ReentrantLock();
	}
	
	/*try below method with and without synchronized/locks to see the order of execution*/
	public void foo(String name) {
		lock.lock();
		try {
			str = name;
			System.out.println("Thread "+ name +".foo() starting");
			balance= balance -10;
			System.out.println("Balance from "+name + " before is :"+ balance);
			Thread.sleep(5000);
			balance= balance-10;
			System.out.println("Balance from "+name + " after is :"+ balance);
			System.out.println("Thread "+ name +".foo() ending");
		}catch(InterruptedException e) {
			System.out.println("Thread "+ name +" interrupted");			
		}
		lock.unlock();
		
	}
}