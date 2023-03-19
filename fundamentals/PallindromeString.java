package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PallindromeString {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static boolean isPalindrome(String str) {
		//Your code goes here
		int n = str.length();
		int i =0 , j = n-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		boolean ans = isPalindrome(str);
		System.out.println(ans);
	}
}
