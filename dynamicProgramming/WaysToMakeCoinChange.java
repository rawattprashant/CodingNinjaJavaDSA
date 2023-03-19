package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaysToMakeCoinChange {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {

		int numDenominations = Integer.parseInt(br.readLine().trim());

		int denominations[] = new int[numDenominations];
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
        for (int i = 0; i < numDenominations; ++i) {
            denominations[i] = Integer.parseInt(strNums[i]);
        }
		int value = Integer.parseInt(br.readLine().trim());

		
		System.out.println(countWaysToMakeChange(denominations, value));
		
	}
	
	public static int countWaysToMakeChange(int denominations[], int value){
        // Write your code here
		// table[i] will be storing the number of solutions for
	    // value i. We need n+1 rows as the table is constructed
	    // in bottom up manner using the base case (n = 0)
	    int table[]=new int[value+1];
	 
	    // Base case (If given value is 0)
	    table[0] = 1;
	 
	    // Pick all coins one by one and update the table[] values
	    // after the index greater than or equal to the value of the
	    // picked coin
	    for(int i=0; i<denominations.length; i++)
	        for(int j=denominations[i]; j<=value; j++)
	            table[j] += table[j-denominations[i]];
	 
	    return table[value];
	}
	
}
