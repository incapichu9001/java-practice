package multithreading;

import java.lang.Runnable;
import java.lang.Thread;

public class AnonymousThread {
	
	public static void main(String args[]){
		
		/**create new thread object with an instance of anonyous 
		 * runnable implementation as constructor argument**/		
		Thread obj = new Thread(new Runnable() {
			public void run(){
				System.out.println("Anonymous thread name :" + 
			Thread.currentThread().getName());
			}
		});
		
		obj.start();
		
     /**create anonymous thread instance, with an instance of, anonymous
	  * runnable implementation as constructor argument for thread instance**/		
		new Thread(new Runnable(){
			public void run(){
				System.out.println("This anonymous thread sleeps 3 secs");
				try{
				   Thread.sleep(3000);
				}catch(Exception e){
					System.out.println("Exception Handled");
				}
			}
		}).start();
	}

}
