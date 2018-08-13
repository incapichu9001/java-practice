package exceptionhandling;
import java.io.*;

public class CheckedEx {
	
	public static void main(String[] args){
		getfile("./somefile.txt"); 
		
		try{
			getAnotherFile("./nofile.txt");
		}
	    catch(Exception e){
			System.out.println(e.toString());
			System.out.println("This exception is thrown by called method");
			
		}
		
		justThrowException("pillow");
	}

	public static void getfile(String filename){
		//without try catch it won't compile
		try{
			FileInputStream file = new FileInputStream(filename);
		}
		catch(FileNotFoundException e){
			System.out.println("That file not found");			
		}
		//with multiple catch blocks, first matching one executed
		catch(IOException e){
			System.out.println("IO Exception occured");
		}
		
		//use lease specific in the end
		catch(Exception e){} //catch an exception and do nothing

		//catch(Exception e | IOException e) - 
	}
	
	public static void getAnotherFile(String filename)throws 
	                                      IOException, FileNotFoundException{
		//without try catch it won't compile
		
			FileInputStream file = new FileInputStream(filename);	
	}
	
	public static void justThrowException(String filename)throws 
    IllegalArgumentException{
		try{
			throw new IllegalArgumentException("Throw Testing");//Throw exception to be handled in catch()
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		finally{
			//Throw a seperate exception to calling method
			throw new IllegalArgumentException("This is exception is handled in calling func ");
		}
	}
}