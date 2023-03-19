package assignmentRecursion;

import java.util.Scanner;

public class PairStar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
	}
	
	public static String addStars(String s) {
		// Write your code here
		if(s.length()<=1)
			return s;
		String smallOutput= addStars(s.substring(1));
		if(s.charAt(0)==s.charAt(1)) {
			smallOutput = s.charAt(0)+"*"+s.charAt(1) + smallOutput.substring(1);
		}
		else
			smallOutput = s.charAt(0) + smallOutput;
		return smallOutput ;
	}
	
}
