package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MaximumSubarraySum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 public static void main(String[] args) throws NumberFormatException, IOException {
			// Write your code here
		 	String[] strInput;
		 	strInput = br.readLine().split("\\s");
		 
		 	int n = Integer.parseInt(strInput[0]);
		 	int k = Integer.parseInt(strInput[1]);
	        int[] input = new int[n];
	        
	        String[] strNums; 
	        strNums = br.readLine().split("\\s");
	        
	        
	        for (int i = 0; i < n; ++i) {
	            input[i] = Integer.parseInt(strNums[i]);
	        } 	
	        
	        calcSum(input, n, k);
	        
	 }
	 
	 static void calcSum(int arr[], int n, int k)
	 {
	    
	     // Loop to consider every 
	     // subarray of size K
		 int maxSum= Integer.MIN_VALUE;
	     for (int i = 0; i <= n - k; i++) {
	            
	         // Initialize sum = 0
	         int sum = 0;
	    
	         // Calculate sum of all elements
	         // of current subarray
	         for (int j = i; j < k + i; j++)
	             sum += arr[j];
	         if(maxSum<=sum)
	        	 maxSum =sum;
	         // Print sum of each subarray
	         
	     }
	     System.out.print(maxSum+ " ");
	 }
	 
	 
}
