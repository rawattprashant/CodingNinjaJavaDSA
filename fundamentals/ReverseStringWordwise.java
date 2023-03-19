package fundamentals;

import java.util.Scanner;

public class ReverseStringWordwise {

	public static String reverseWordWise(String input) {
		// Write your code here
		String reversedString="";
		int i,start =0;
		for( i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				reversedString = " " + input.substring(start, i) + reversedString;
				start = i+1;
			}
		}
		reversedString = input.substring(start, i)+ reversedString;
		return reversedString;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
	}
}
