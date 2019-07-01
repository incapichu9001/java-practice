package dynamicprogramming;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
    
    synchronized static public   void somemeth() {
    	
    	 
     	
    }
    
    public static void main(String[] args) {
    	//below works as calling private constructor from same class
    	LazyInitializedSingleton test = new LazyInitializedSingleton();
    	
    	
    }
}

class Test{
	
	public void SingletonTest() {
		
		/*below goves compile time error: constructor not visible
		as calling private constructor of another class
		*/
		//LazyInitializedSingleton test = new LazyInitializedSingleton();
		
		/*Below works*/
		LazyInitializedSingleton test = LazyInitializedSingleton.getInstance();
		
	}
}
