package recursion2;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input));
    }
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length() <= 1)
			return s;
		
		if(s.charAt(0)==s.charAt(1)) {
			return removeConsecutiveDuplicates(s.substring(1));
		}
		else{
			String small = removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + small;
		}
	}
}
