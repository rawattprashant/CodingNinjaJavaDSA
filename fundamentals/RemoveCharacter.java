package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveCharacter {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		if(str.length()==0)
			return str;
		String newString = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=ch)
				newString+=str.charAt(i);
		}
		return newString;
	}
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		char x = br.readLine().charAt(0);
		
		String ans = removeAllOccurrencesOfChar(str, x);

		System.out.println(ans);
		
	}
}
