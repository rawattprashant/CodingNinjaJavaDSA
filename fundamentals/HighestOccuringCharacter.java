package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighestOccuringCharacter {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public static char highestOccuringChar (String str) {
		//Your code goes here
		int freq[]=new int[256];

        for(int i=0;i<str.length();i++)
        {
            int ch=str.charAt(i);
            freq[ch]=freq[ch]+1;
        }
        
        int largest = 0;
        char indexToChar = str.charAt(0);
        for(int i=0;i<str.length();i++)
        {
        	int index = str.charAt(i);
            if(freq[index] > largest){
                indexToChar = str.charAt(i);
                largest = freq[index];
            }
        }
        
		
		return indexToChar;
		
	}
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine ();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		char ans = highestOccuringChar(str);

		System.out.println(ans);
		
	}
}
