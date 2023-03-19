package test4;

import java.util.Scanner;

public class MinimumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			System.out.println(minCount(num));
	}
	
	public static int minCount(int n){
		/* Your class should be named Solution
	 	 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		*/
		if(n<=3)
			return n;
		
		int res = n;
		for(int i = 1;i<=n;i++) {
			int temp = i*i;
			if(temp>n)
				break;
			else
				res = Math.min(res,1+minCount(n-temp));
		}
		
		return res;
	}
	
}
