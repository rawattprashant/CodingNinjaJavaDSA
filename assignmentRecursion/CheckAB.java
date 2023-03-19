package assignmentRecursion;

import java.util.Scanner;

public class CheckAB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}
	
	public static boolean checkAB(String input) {
		// Write your code here
		if(input.length() == 0)
			return true;
		
		if(input.charAt(0) != 'a')
			return false;
		
		if(input.length() >= 3 && input.substring(0, 3).equals("abb"))
			return checkAB(input.substring(3));
		else
			return checkAB(input.substring(1));
	}
	
}
