package liveClassesProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class NthFactorialLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
		
        int ans = findLastTwoDigitNterm(n);
        if(ans < 10)
            System.out.println("0" + ans);
        else
            System.out.println(ans);
        
	}
	
	public static int findLastTwoDigitNterm(int N){
	       //Write code here
			BigInteger t1 = new BigInteger("0");
			BigInteger t2 = new BigInteger("1");
			BigInteger nt = new BigInteger("1");
			for(int i=2;i<=N;i++){
				nt = t1.add(t2);
				t1=t2;
				t2=nt;
			}
			System.out.println(nt);
			BigInteger d = new BigInteger("100");
			// BigInteger res =  nt.mod(d);
			// int ans = res.intValue
			//return ans;
			return (nt.mod(d)).intValue();
			
	    }

}
