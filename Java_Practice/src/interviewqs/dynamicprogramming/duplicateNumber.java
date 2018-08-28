package interviewqs.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateNumber {
	
	public static void main(String[] args){
		
		int [] list = {1,2,3,4,5,5,6,7,8,9,9};
	    System.out.println("The duplicate from algo sol:"+duplicate(list));
	    //System.out.println("The duplicate from amth sol :"+dupeMath(list));
    }
	
	/*Alogrithmic solution*/
	/*time complexity worst case: O(N^2)~O(N-1* N-2)*/
	static int duplicate(int[] a ) {
	int i, j, l = a.length;
	int dupe  = 0;
	outer:for(i=0;i<l;i++){
		System.out.println("\nOuter Loop "+a[i]);
		for(j=i+1;j<l;j++){
			System.out.println("Inner Loop "+a[j]);
			if(a[i]==a[j]){
				dupe = a[i];	
				break outer;
			}
			
		}
		
	}
	return dupe;
    }
	
	/*Math Solution*/ 
	/*time complexity O(N)*/
	static int dupeMath(int[] a){
		int sum = getSum(a);
		int n = a.length-1;
        int total = n*(n+1)/2;
        int dupeNum = sum - total;
         return dupeNum;       
	}
	
	static int getSum(int[] ar){
		int i, sum = 0;;
		for(i=0;i<ar.length;i++){
			sum += ar[i];
		}
		return sum;
	}
	
}
