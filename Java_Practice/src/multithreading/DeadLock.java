package multithreading;

public class DeadLock {
String str1 = "Java";
String str2 = "UNIX";
 
Thread trd1 = new Thread("My Thread 1"){
    public void run(){
            synchronized(str1){
            	System.out.println("Thread-1 holds lock on str1");
            	try{
            		Thread.sleep(1000);
            	}catch(InterruptedException  e){}
            	System.out.println("Thread-1 is waitng forlock on str2");
                synchronized(str2){
                	System.out.println("Thread-1 holds lock on str1 and str2");
                }
                
            }
        
    }
};
 
Thread trd2 = new Thread("My Thread 2"){
    public void run(){
        
            synchronized(str1){
            	System.out.println("Thread-2 holds lock on str2");
            	try{
            		Thread.sleep(1000);
            	} catch(InterruptedException e){}
            	System.out.println("Thread-2 is waitng forlock on str1");
                synchronized(str2){
                	System.out.println("Thread-2 holds lock on str2 and str1");
                }
            }
        
    }
};
 
public static void main(String a[]){
    DeadLock mdl = new DeadLock();
    mdl.trd1.start();
    mdl.trd2.start();
}
}
