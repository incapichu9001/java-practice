package interviewqs.java;

public class EqualsAndEqualsOperator {

	public static void main(String[] args){
		//== when used on primitive compare values, on objects compare reference points
		//equals used used on objects or object vars and compare values (hash values)
		String s1="mohan";
		String s2="mohan";
		
		if(s1.equals(s2)) System.out.println("Two string objects has same hash value");
		else System.out.println("Two Strings objects has different hash value");
		
		if(s1==s2) System.out.println("s1 and s2 point to same Objects");
		else System.out.println("s1 and s2 point to different Objects");
		
		String a1 = new String("krish");
		String a2 = new String("krish");
		
		if(a1==a2 && a1.equals(a2)) 
			System.out.println("a1 and a2 point to same strings object and has same value");
		else if(a1!=a2 && a1.equals(a2))
			System.out.println("a1 and a2 point to different strings objects but have same value");
		else if(a1!=a2 && !a1.equals(a2))
			System.out.println("a1 and a2 point to different strings objects and have different values");

		int i1=10;
		int i2=10;
		
		if(i1==i2) System.out.println("Two variable have same value w.r.t ==");
		else System.out.println("values different");

		if(new Integer(i1).equals(new Integer(i1))) {
			System.out.println("Two Integer vars pointing to same object");
		}
		Integer I1 = new Integer(i1);
		Integer I2 = new Integer(i2);
		//For integer Objects "values" are compared instead of references. Integer class overrides equals() method from Object class
		if(I1.equals(I2)) {
			System.out.println("Two Integer Objects are same");
		} else System.out.println("Not Same Objects");
		
		if(I1==I2) System.out.println("Two Objects same(referencing same  w.r.t == operator");
		else System.out.println("Two Objects Different w.r.t == operator");
	}

}

