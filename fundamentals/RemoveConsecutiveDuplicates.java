package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveConsecutiveDuplicates {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		if(str.length()<=1)
			return str;
		if(str.charAt(0)== str.charAt(1)) {
			return removeConsecutiveDuplicates(str.substring(1));
		}
		else {
			return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
		}
		
//		int n = str.length();
//        if(n==0){ //to handle the case of empty string
//            return str;
//        }
//        String answer = ""; //we create answer string to store the output.
//        int startIndex = 0;
//        while(startIndex < n){
//            char UniqueChar = str.charAt(startIndex);
//            int nextUniqueChar = startIndex + 1;
//            while(nextUniqueChar<n && str.charAt(nextUniqueChar)==UniqueChar){
//                nextUniqueChar++;
//            }
//            answer = answer + UniqueChar;
//            startIndex = nextUniqueChar;
//        }
//        return answer;
	}
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = removeConsecutiveDuplicates(str);

		System.out.println(ans);
		
	}
}
