package exceptionhandling;
//import java.lang.Exception;
//import java.lang.RuntimeException;
import java.util.*;

//we hanlde RuntimeExceptions in this class
public class ExceptionHandling {
	
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args){
		
		//divideByZero(2);
		System.out.println("Inpu the Age");
		int age = getAge();
		if(age !=0){
			System.out.println("You are " + age + " years old");
		}
		
	}
     
	//make the methods static so we can call them directly without creating objects
	public static void divideByZero(int a){
		
      //int k = (a/0);
		try{
			System.out.println(a/0);
		}
		catch(ArithmeticException e){
			System.out.println("Can't Devide by Zero");
			System.out.println(e.getMessage()); //Exception description
			System.out.println(e.toString()); //Exception Name and description
			e.printStackTrace();
		}
	}
	
	public static int getAge(){
		try{
			return userInput.nextInt();
		}
		catch(InputMismatchException e){
		    userInput.next();//discard user input
		    System.out.println("Ths isn't a whole number");
		    return 0;
		}
	}
}
