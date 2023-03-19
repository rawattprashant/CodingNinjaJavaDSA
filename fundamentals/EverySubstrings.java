package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EverySubstrings {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void printSubstrings(String str) {
		//Your code goes here
		
//		for(int i=0;i<str.length();i++) {
//			for(int j = i+1;j<=str.length();j++) {
//				System.out.println(str.substring(i, j));
//			}
//		}
		
		int n = str.length(); //calculates length of string and stores it in n
        //here we are printing substrings length wise 
        //i.e, first 1, 2, 3, 4 from 1 to n
        for(int len=1;len<=n;len++){
            for(int start =0;start<=n-len;start++){
                //for each length we are changing the start and end 
                //and printing all possible value for a given start and end
                int end = start+len;
                System.out.println(str.substring(start, end));
            }
        }    
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		printSubstrings(str);
		
	}
	
}
