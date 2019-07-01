package dynamicprogramming;

public class PolyMorphism {
	
  public void reciveObject(MyAbstractClass o) {
	  System.out.println(o.toString());
  }
	
  public static void main(String[] args) {
	  
	  MyClass c = new MyClass();
	  
	  MyAbstractClass c2 = c.getObject();
	  
	  
	  System.out.println(c2.getClass());
	  PolyMorphism p = new PolyMorphism();
	  p.reciveObject(c2);
	  
	  MyInterface c3 = new MyClass2();
	  //calls getData from MyClass2 as object belongs to MyClass2
	  System.out.println(c3.getData());
	  //but cannot call printString() or getObject() methods from c3 as the reference is of type MyInterface 
	  //and those sub class methods not in interface
	  //c3.getObject();
	  
	  
	  
  }
  
  
}

interface MyInterface {
	
	public String getData();
}

abstract class MyAbstractClass implements MyInterface{
		
	
	public String getData(){
		
		return "Overriding MyInterface";
		
	}
	
	private static int n;
	
}

class MyClass extends MyAbstractClass {
	
	@Override
	public String getData(){
				
		return "Overriding MyAbstractClass";
	}
	
	public MyClass getObject(){
		
		System.out.println("Getting Object");
		MyClass c = new MyClass();
		return c;

	}
	
	public void printString() {
		System.out.println("This is MyClass object");
	}
	@Override 
	public String toString(){
		return "MyClass";
		
	}
	
}

class MyClass2 extends MyClass {
	
	@Override
	public String getData(){
				
		return "Overriding MyClass";
	}
	
	public MyClass getObject(){
		
		System.out.println("Getting Object");
		MyClass2 c = new MyClass2();
		return c;

	}
	@Override 
	public String toString(){
		return "MyClass";
		
	}
	
}