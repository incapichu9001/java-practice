package interviewqs.dynamicprogramming;

public class Sorting{

	 public void insertionSort(int[] a){	 
	   int i, l = a.length;
	   for(i=1; i< l; i++){   
		//insertion loop
		int temp = a[i];
		int k =i-1;
		while(k>= 0 && temp < a[k]){			  
		  a[k+1] = a[k];
		  k--;
	    }
		a[k+1] = temp;
	  }
	   int d;
	  System.out.println("Sorted List:");
	  for(d=0; d< l; d++){
	    System.out.print(a[d]+ " ");
	  }
	  
	 }
	 
	 static void insertionSortRecursive(int arr[], int n)
	    {
	        // Base case
	        if (n <= 1)
	            return;
	      
	        // Sort first n-1 elements
	        System.out.println("n:"+n);
	        System.out.println("Calling for n-1:"+ (n-1));
	        insertionSortRecursive( arr, n-1 );
	      
	        // Insert last element at its correct position
	        // in sorted array.
	       
	        int last = arr[n-1];
	        int j = n-2;
	        System.out.println("j:"+j);
	        System.out.println("last:"+last);
	        /* Move elements of arr[0..i-1], that are
	          greater than key, to one position ahead
	          of their current position */
	        while (j >= 0 && arr[j] > last)
	        {
	            arr[j+1] = arr[j];
	            j--;
	        }
	        arr[j+1] = last;
	    }
	 
	 public static void main(String[] args){
	 
	  int[] a = {1,5,3,2,7,11,23,12,22};
	  Sorting s = new Sorting();
	  //s.insertionSort(a);
	  insertionSortRecursive(a, a.length);
	  
	  int d;
	  for(d=0; d< a.length; d++){
		    System.out.print(a[d]+ " ");
		  }
	  


	 }


}
