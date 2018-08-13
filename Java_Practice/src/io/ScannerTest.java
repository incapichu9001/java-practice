package io;
import java.util.Scanner;
import java.util.ArrayList;

public class ScannerTest {
	
	//static as we need to acess it from main()
	static Scanner price = new Scanner(System.in);
	
   public static void main(String[] args){	   
	   
	   ArrayList<Integer> Prices = new ArrayList<Integer>();
	   System.out.println("Enter list of prices");
	   for(int i=0; i<5; i++){
		   Prices.add(price.nextInt());
	   }
	   System.out.println("This list of prices are ");
	   for(int p: Prices){
		   System.out.println(p);
	   }	   
	   
   }
}
