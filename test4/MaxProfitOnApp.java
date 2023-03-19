package test4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProfitOnApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfit(input));
	}
	
	public static int maximumProfit(int budget[]) {
		// Write your code here
		//return maximumProfit(budget,budget.length-1);
		// time : O(n * log n) and space : O(1)
		int price =0;
		Arrays.sort(budget);
		int  n= budget.length;
		int profit = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int count =(n-i);
			
			
			if(profit < count * budget[i]) {
				price = budget[i];
				profit = count * budget[i];
			}
		}
		
		return profit;
	}
	
//	public static int maximumProfit(int[] budget, int index) {
//		Arrays.sort(budget);
//		int n = budget.length;
//		if(n-index<0)
//			return 0;
//		int profit = (n-index)* budget[index];
//		if(index == 0)
//			return profit;
//		return Math.max(profit, maximumProfit(budget, index-1));
//	}

}
