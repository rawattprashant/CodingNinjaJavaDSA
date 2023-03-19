package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWords {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int countWords(String str) {	
		//Your code goes here
		int wordCount =1;
		if(str.length()==0)
			return 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				wordCount++;
		}
		return wordCount;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		int count = countWords(str);
		System.out.println(count);
	}
}
