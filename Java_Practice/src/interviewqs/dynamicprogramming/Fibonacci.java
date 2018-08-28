package interviewqs.dynamicprogramming;

import java.util.ArrayList;;
public class Fibonacci {
	
	public static void main(String args[]){
		/**
		 * 1,1,2,3,5,8,13,21,34,....
		 */
		System.out.println("Printing fibonacci series until n:");
		itr(8);
		
		System.out.println("Printing n'th fibonacci number:" + fib(0));
		
		System.out.println("Printing fibonacci series using recursion");
		int i;
		for(i=0;i<=7;i++){
			System.out.println(fib(i));
		}
		
		System.out.println("Printing fibonacci series using for loop:");
		itr2(8);
	}
	
	static void itr(int num){
		double current, next, sum;
		//current = next = 1d;
		current = 0; next = 1;
		int i=0;
		while(i< num){	       
			   System.out.println(current);
			   sum = current + next; //2
			   current = next;
			   next = sum;                
			   i++;
		   }
	}
	
	static void itr2(int num){
		double[] a = new double[num];
		a[0] = 0;
		a[1] = 1;
		int i;
		for(i=2;i<num;i++){
			a[i] = a[i-1] + a[i-2];
		}
		for(double d: a){
			System.out.println(d);
		}
	}
		
	static double fib(int n){
		if(n<=1){			
			return (double)n;			
		}		
		else {			
			return fib(n-1) + fib(n-2);
		}
	}
		


}
