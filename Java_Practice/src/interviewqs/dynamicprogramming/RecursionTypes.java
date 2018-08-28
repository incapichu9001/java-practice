package interviewqs.dynamicprogramming;



public class RecursionTypes {
	
	 public static void procedureRecusion(int i) {
			
			if(i==10) {
				return;
			}
			i++;
			System.out.println(i);
			System.out.println("Do something Before");
			procedureRecusion(i);
			System.out.println("DO something After");		
		}
	 
	 public static int mathRecusion(int i) {			
			if(i<=10) {
				return 0;
			}
			i++;
			System.out.println(i);
			System.out.println("Before");
			return i*i+ mathRecusion(i);			
			
		}
	 
	 public static String strRevrsRecusion(String s) {			
			if(s.length()>=0) {
				return s;
			}
			
			return s.substring(1)+ s.substring(0,1);			
			
		}

}
