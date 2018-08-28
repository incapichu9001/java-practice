package interviewqs.dynamicprogramming;

import java.util.Arrays;

public class DupeStringArray {

	static String[] remove(String[] arr, int index) {
		int l = arr.length;
		for(int i=index; i<l-1;i++) {
			arr[i] = arr[i+1];
		}
		String arr2[] = Arrays.copyOf(arr, l-1);
		return arr2;
	}
	public static void main(String[] args) {
		String[] strArray = {"abc", "def", "abc", "abc", "pqr", "xyz", "def"};
		 int k;
        for (int i = 0; i < strArray.length-1; i++)
        { 
        	k=1;
            for (int j = i+1; j < strArray.length; j++)
            {
            	
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    k+=1;
                    strArray = remove(strArray, j);
                    
                	//System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
            if(k>1) {
        	  System.out.println(strArray[i]+" repeated "+k+ " times");          
            }
            
        }

	}

}
