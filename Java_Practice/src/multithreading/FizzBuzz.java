package multithreading;

public class FizzBuzz {

	public static void main(String[] args) {
		int n= 10;
		Fiz f = new Fiz(n);
		Buz b = new Buz(n);
		FizBuz fb = new FizBuz(n);
		NoFizBuz nfb = new NoFizBuz(n);
		f.start();
		b.start();
		fb.start();
		nfb.start();
	}
	
}

class Fiz extends Thread{
	int n;
	public Fiz(int n) {
		this.n =n;
	}
	public void run() {
		FizzBuzzTest.fiz(n);
	}
	
}

class Buz extends Thread{
	int n;
	public Buz(int n) {
		this.n =n;
	}
	public void run() {
		FizzBuzzTest.buz(n);
	}
	
}

class FizBuz extends Thread{
	int n;
	public FizBuz(int n) {
		this.n =n;
	}
	public void run() {
		FizzBuzzTest.fizbuz(n);
	}
	
}

class NoFizBuz extends Thread{
	int n;
	public NoFizBuz(int n) {
		this.n =n;
	}
	public void run() {
		FizzBuzzTest.nofizbuz(n);
	}
	
}

class FizzBuzzTest{
	
	public static void fiz(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0 & i%5 !=0) {
				System.out.println(i+": Fizz");
			}
		}
	}
	
	public static void buz(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3!=0 & i%5 ==0) {
				System.out.println(i+": Buzz");
			}
		}
	}
	
	public static void fizbuz(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0 & i%5 ==0) {
				System.out.println(i+": FizzBuzz");
			}
		}
	}
	public static void nofizbuz(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3!=0 & i%5 !=0) {
				System.out.println(i);
			}
		}
	}
}