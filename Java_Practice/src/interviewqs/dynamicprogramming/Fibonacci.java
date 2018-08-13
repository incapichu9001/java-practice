package interviewqs.dynamicprogramming;

public class Fibonacci {
	
	public static void main(String args[]){
		/**
		 * 1,1,2,3,5,8,13,21,34,....
		 */
		
		int current, next, sum;
		current = next = 1;
		int i=0;
		while(i< 15){	       
			   System.out.println(current);
			   sum = current + next; //2
			   current = next;
			   next = sum;
                
			   i++;
		   }		   
	}

}
