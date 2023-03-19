package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinTower {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            String[] strNums = br.readLine().trim().split("\\s");
            int n = Integer.parseInt(strNums[0]);
            int x = Integer.parseInt(strNums[1]);
            int y = Integer.parseInt(strNums[2]);

            System.out.println(findWinner(n, x, y));
            
    }
    
    public static String findWinner(int n, int x, int y) {
		//Your code goes here
    	
    	int [] win=new int[n+1];
        
        win[1]=1;
        for(int i=2;i<=n;i++){
            if(i==x || i==y){
                win[i]=1;
                continue;
            }

            int v1=(win[i-1]+1)%2;
            if(i-x>0)
                v1=v1| ((win[i-x]+1)%2);
            if(i-y>0)
                v1=v1| ((win[i-y]+1)%2);

            win[i]=v1;
        }

        if(win[n]==1)
             return "Beerus";
        return "Whis";
	}

}


//public static String findWinner(int n, int x, int y) {
//	//Your code goes here
//// Write your code here .
//    int dp [] = new int[n+1];
//
//    dp[1] = 1;
//
//    int a1 = 0;
//    int a2 = 0;
//    int a3 = 0;
//
//    for(int i=2;i<dp.length;i++){
//        if(i == x || i == y){
//            dp[i] = 1;
//            continue;
//            
//        }
//        //here xor is used to toggle the options
//        if(i-x >= 1){
//            a1 = dp[i-x] ^ 1;
//        }
//        if(i-y >= 1){
//            a2 = dp[i-y] ^ 1;
//        }
//
//        a3 = dp[i-1] ^ 1;
//
//        dp[i] = Math.max(a1 ,Math.max(a2 ,a3));
//    }
//
//    if(dp[n] != 0){
//        return "Beerus";
//    }else{
//         return "Whis";
//    }
//
//}