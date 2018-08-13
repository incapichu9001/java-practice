package multithreading;

import java.lang.Runnable;
import java.lang.Thread;

class MyThread extends Thread {	
	
	@Override
	public void run() {
		System.out.println("MyThread name is: "
	                        +Thread.currentThread().getName());
	}	
}

class MyRunnableThread implements Runnable {
	@Override
	public void run(){		
		try{
			System.out.println("MyRunnable Thread id is: "
		                       +Thread.currentThread().getId());
			//Thread.sleep(3000);
		}catch (Exception e){
			System.out.println("ExceptionCaught");
		}
	}
}


public class MultiThreading {

	public static void main(String args[]){
		
		Thread t0 = new Thread();
		
		Thread t1 = new Thread("New Thread");
		t1.start();
		
		for(int i=0; i<2; i++){
			Thread newThread = new Thread(new MyRunnableThread());
			newThread.start();
			

			try{
				newThread.join();
				newThread.sleep(3000);
			}   
			catch(InterruptedException e){
				System.out.println("Interrupted Exception Occured While waiting");
			}			
		}
		
		for(int i=0; i<2; i++){
			Thread myNewThread = new MyThread();
			myNewThread.start();
			try{
				myNewThread.sleep(3000);
			}   
			catch(InterruptedException e){
				System.out.println("Interrupted Exception Occured While waiting");
			}
		
		}		
	}
}
