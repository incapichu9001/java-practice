package java8;

import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamAPI {
	
	public static void main(String[] args){
		
		String [] arr = {"String1", "String2", "val2", "str5", "five"};
		ArrayList<String> al = new ArrayList(Arrays.asList(arr));
		
		Stream <String> s = al.stream().map(x -> x+"::");
		
		s.forEach(System.out::println);
		
	}

}
