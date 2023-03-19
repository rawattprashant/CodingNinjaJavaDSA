package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinStepstoOne {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution1.countMinStepsToOne(n));
    }
    
}


class Solution1 {

	public static int countMinStepsToOne(int n) {
		//Your code goes here
		
		if(n == 1){
			return 0;
		}
		int op1 = countMinStepsToOne(n - 1);
		int minSteps = op1;
		if(n % 3 == 0){
			int op2 = countMinStepsToOne(n / 3);
			if(op2 < minSteps){
				minSteps = op2;
			}
		}
		if(n % 2 == 0){
			int op3 = countMinStepsToOne(n / 2);
			if(op3 < minSteps){
				minSteps = op3;
			}
		}
		return 1 + minSteps;
	}
	
	public static int countMinStepsToOneDP(int n) {
		//Your code goes here
        int dp[] = new int[n + 1];
		dp[1] = 0;
		for(int i = 2; i <= n; i++){
			int min = dp[i - 1];
			if(i % 3 == 0){
				if(min > dp[i / 3]){
					min = dp[i / 3];
				}
			}
			if(i % 2 == 0){
				if(min > dp[i / 2]){
					min = dp[i / 2];
				}
			}
			dp[i] = 1 + min;
		}
		return dp[n];
	}
	
	//Brute Force Method
//	public static int countMinStepsToOneBF(int n) {
//		//Your code goes here
//		int count =0;
//		if(n==1){
//			return 0;
//		}
//
//		while(n>1){
//			if(n%2==0){
//				n=n/2;
//				count++;
//			}
//			else if(n%3==0){
//				n= n/3;
//				count++;
//			}
//			else{
//				n=n-1;
//			}
//		}
//		return count;
//	}
}

/*
 * public static int countMinStepsToOne(int n) {
		//Your code goes here
        
        int [] count=new int[n+1];
        for (int i = 2; i <=n ; i++) {
            count[i]=-1;
        }
        return countTo1(n,count);
	}

    public static int countTo1(int n,int [] count){

        for (int i = 2; i <=n ; i++) {
            int c1=Integer.MAX_VALUE;
            int c2=Integer.MAX_VALUE;
            if(i%3==0)
                c1=1+count[i/3];
            
            if(i%2==0)
                c2=1+count[i/2];
            
            int c3=1+count[i-1];
            count[i]=Math.min(c1,Math.min(c2,c3));
        }
        
        return count[n];
    }
 */