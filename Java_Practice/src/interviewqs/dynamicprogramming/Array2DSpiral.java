package interviewqs.dynamicprogramming;

public class Array2DSpiral {
	
	public static void main(String[] args){
		
		int[][] arr = new int[7][7];
		//fill array
		int i,j, n=1;
	   while(n<=49){
		for(i=0;i<7;i++){
			for(j=0;j<7;j++){
				arr[i][j] = n;
				n++;
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
	   }
	   
	   System.out.println("Printing in spiraling order");
	   int[][] s = new int[7][7];
	   int rs, ds; //number of shifts right, down required, 
	               //increments by two(+2) for next level (first pair of shifts)
	   int r, d; //incrementing var whithin a level (by +1)
	   rs = ds = 1;
	   int ls, us, l, u;
	   ls = us = 2; //second pair of directions has 2 to fill 
	                //in first level and +2 there after
	   
	   i = j = 3;
	   int num = 49;
	   s[3][3] = 1;
	   n = 2;
	   outer: while(n< 49){
		   try{
		   //add right shift elements
		   System.out.println("rs:"+rs);
		   for(r=0;r<rs;r++){ 			   
			   //if(j<6) {
				j++;			   
			   s[i][j] = n;
			   System.out.format("\nrn:%d (%d, %d) ", n, i, j); 
			   System.out.println();
			   if(n<49) { n++;} else {break outer;}
			   
			   //}
		   }
		   rs = rs+2;
		   
		   //add down shift elements		   
		   for(d=0;d<ds;d++){
			   //if(i<6) { 
			   i++;
			   s[i][j] = n;
			   System.out.format("dn:%d (%d, %d) ", n, i, j);
			   System.out.println();
			   if(n<49) { n++;} else {break outer;}
			   			   

			   //}
		   }
		   ds = ds+2;
		   for(l=0;l<ls;l++){
			   {j--;}
			   s[i][j] = n;
			   if(n<49) { n++;} else {break outer;}			   
			   System.out.format("ln:%d (%d, %d) ", n, i, j); 
			   System.out.println();
		   }
		   ls = ls+2;
		   for(u=0;u<us;u++){
			   {i--;}
			   s[i][j] = n;
			   System.out.format("un:%d (%d, %d) ", n, i, j);
			   System.out.println();			   
			   if(n<49) { n++;} else {break outer;}
		   }
		   us = us +2;
		   System.out.println("while loop ended: "+ n);
	      } catch ( ArrayIndexOutOfBoundsException e) {}
	   }
	   
	   for(i=0;i<7;i++){
			for(j=0;j<7;j++){				
				System.out.format(" %02d ", s[i][j]);
			}
			System.out.println();
		}
	   
	}

	}
