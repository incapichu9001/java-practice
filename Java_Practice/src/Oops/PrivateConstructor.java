package Oops;

public class PrivateConstructor {

	private PrivateConstructor() {
		
	}
	
	public PrivateConstructor(String name){
		
	}
	
	private int a = 15;
	private int methd(int a){
		return a*a;
	}
	
	public static void main(String[] args){
		
		PrivateConstructor pc = new PrivateConstructor();
		System.out.println(pc.methd(pc.a));
		
	}
}


class another extends PrivateConstructor {
	/*With Private constructor , class cannot be extended and compiler complains about
	*super class constructor is private	
	*/
	public another() {
		super("bill"); //if there is no public constructor , can't extend class
	}

}

class callPrivateContrcutor{
	public void method2(){
		//below won't compile - class with private constructor can't be instantiated outside class
		//PrivateConstructor pc = new PrivateConstructor();
		
		//below will work instead - calling a public constructor
		PrivateConstructor pc = new PrivateConstructor("game");
	}
}
 