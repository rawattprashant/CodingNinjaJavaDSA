package fundamentals;

import java.util.Scanner;

public class MinimumLengthWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(minLengthWord(str));
	}
	
	public static String minLengthWord(String input)
		{
			// Write your code here
		int minStart = -1;
	    int minLength = Integer.MAX_VALUE;
	    int currentStart = 0;
	    int i=0;
	    for(;i<input.length();i++)
	    {
	        if(input.charAt(i)==' '){
	            int currentLength = i-currentStart;
	            if(currentLength<minLength){
	                minStart=currentStart;
	                minLength = currentLength;
	            }
	            currentStart= i+1;
	        }
	    }
	    //come out of for loop
	    if(minStart == -1){
	        return input;
	    }else{
	        int currentLength = i - currentStart;
	        if(currentLength<minLength){
	            minStart= currentStart;
	            minLength=currentLength;
	        }
	        return input.substring(minStart, minStart+minLength);
	    }
			 
	}
}
