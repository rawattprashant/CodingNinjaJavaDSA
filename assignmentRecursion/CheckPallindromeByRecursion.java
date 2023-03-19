package assignmentRecursion;

import java.util.Scanner;

public class CheckPallindromeByRecursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}
	
	public static boolean isStringPalindrome(String input) {
		// Write your code here
		return isPallindrome(input, 0 , input.length()-1);
	}

	private static boolean isPallindrome(String str, int start, int end) {
		// TODO Auto-generated method stub
		if(start>=end)
			return true;
		
		if(str.charAt(start)!= str.charAt(end))
			return false;
		
		return isPallindrome(str, start+1, end-1);
	}
}
