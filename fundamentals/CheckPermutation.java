package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CheckPermutation {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i =0; i < str1.length();i++) {
			if(ch1[i]!=ch2[i])
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str1 = br.readLine();
		if (str1 != null) {
			str1 = str1.trim();
		} else {
			str1 = "";
		}

		String str2 = br.readLine();
		if (str2 != null) {
			str2 = str2.trim();
		} else {
			str2 = "";
		}

		boolean ans = isPermutation(str1, str2);

		System.out.println(ans);
		
	}
	
}
