package dynamicprogramming;

import dynamicprogramming.LazyInitializedSingleton;

public class TestClass {
	
  public static void main(String[] args) {
    	
	     //constructor not visible
    	//LazyInitializedSingleton test = new LazyInitializedSingleton();   
	  
	  for(int i=10;i>=0;i--) {
		  System.out.println(--i);
		  i++;		  
	  }
    	
    }

}
