package multithreading;

import java.lang.*;

public class ThreadJoin implements Runnable {

	   public void run() {
	   
	      Thread x = Thread.currentThread();
	      
	      System.out.println("thread x inside Thread t:"+x.getName());
	      
	      //checks if this thread is alive
	      System.out.println("status of x= " + x.isAlive());
	      
	   }

	   public static void main(String args[]) throws Exception {
	   
	      Thread t = new Thread(new ThreadJoin());
	      
	      // this will call run() function
	      t.start();
	      System.out.println("status of t= " + t.isAlive());
	      //waits for this thread to die
	      System.out.println("Joining thread t");
	      t.join();
	      System.out.println("Joining of thread t complete");
	      System.out.println("status of t= " + t.isAlive());
	      //t.sleep(3000);	      
	      System.out.println("thread t, the parent thread:" + t.getName());
	      System.out.println("thread t, the parent thread:" + t.getName());
	      System.out.println("thread t, the parent thread:" + t.getName());
	      //checks if this thread is alive
	      System.out.println("status of t= " + t.isAlive());
	      

	    //checks again if this thread is alive
	      System.out.println("status of t again= " + t.isAlive());
	   }
	} 