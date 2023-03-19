package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimunNoOfSquares {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            int n = Integer.parseInt(br.readLine().trim());
            int []dp = new int[n+1];
            for(int i=0;i<dp.length;i++) {
            	dp[i]=-1;
            }
            System.out.println(minCount(n, dp));
    }
    
    public static int minCount(int n, int[] dp) {
		//Your code goes here
    	if(n ==0)
    		return 0;
    	
    	int minAns = Integer.MAX_VALUE;
    	for(int i=1;i*i <=n;i++) {
    		
    		int currAns;
    		if(dp[n-(i*i)] == -1) {
    			currAns = minCount(n-(i*i), dp);
    			dp[n-(i*i)] = currAns;
    		}
    		else {
    			currAns = dp[n-(i*i)];
    		}
    		if(minAns> currAns)
    			minAns = currAns;
    	}
    	int myAns = 1+ minAns;
    	return myAns;
	}
    
    public static int minCountI(int n) {
		//Your code goes here
    	int[] dp = new int[n+1];
    	dp[0] = 0;
    	
    	for(int i=1;i<=n;i++) {
    		int minAns= Integer.MAX_VALUE;
    		for(int j=1;j*j<=i;j++) {
    			int currAns = dp[n-(j*j)];
    			if(minAns> currAns)
    				minAns = currAns;
    		}
    		dp[i] = 1+ minAns;
    	}
    	
    	return dp[n];
	}
}


//public static int minCount(int n) {
//Your code goes here
//if(n ==0)
//	return 0;
//
//int minAns = Integer.MAX_VALUE;
//for(int i=1;i*i <=n;i++) {
//	
//	int currAns = minCount(n-(i*i));
//	if(minAns> currAns)
//		minAns = currAns;
//}
//int myAns = 1+ minAns;
//return myAns;
//}
