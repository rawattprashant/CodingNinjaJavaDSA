package dynamicProgramming;

import java.util.Scanner;

public class Fibonacci_DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] dp = new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
		
		System.out.println(fibbonacci_dp(n,dp));
	}
	
// recursion + storing values = MEMOIZATION
	
	private static int fibbonacci_dp(int n, int[] dp) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
			return n;
		int ans1, ans2;
		
		if(dp[n-1] == -1) {
			ans1 = fibbonacci_dp(n-1, dp);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		if(dp[n-2] == -1) {
			ans2 = fibbonacci_dp(n-2, dp);
			dp[n-1] = ans1;
		}
		else {
			ans2 = dp[n-2];
		}
		
		return ans1 + ans2;
	}

}
