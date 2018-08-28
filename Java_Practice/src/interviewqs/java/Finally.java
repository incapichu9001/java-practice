package interviewqs.java;

public class Finally {
	
	public int retTest(String str) {
		System.out.println("Called retTest from " + str + " return statement");
	    return 0;
	}

	public int foo() {
		try {
			int y=0;
			int x =5;
			System.out.println("Stating try");
			System.out.println("returning from try");
			return retTest("try") + x/y;				
		}catch(Exception e) {
			System.out.println("Stating catch as exception caught");
			System.out.println("returning from catch");			
			return retTest("catch");
		}
		finally {
			System.out.println("Stating finally");
			System.out.println("returning from finally");			
		}
	}
	
	public static void main(String[] args) {
		Finally f = new Finally();
		int r = f.foo();
		System.out.println("Foor returned: "+r);
	}
}
