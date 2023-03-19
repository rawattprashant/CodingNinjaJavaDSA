package fundamentals;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(max_number(n));
	}
	
	 public static int max_number(int n){
         
	        /* Your class should be named Solution
	        * Don't write main().
	        * Don't read input, it is passed as function argument.
	        * Return output and don't print it.
	        * Taking input and printing output is handled automatically.
	        */
		 int ans = 0;
         int i = 1;
         while (n / i > 0) {

             int temp = (n / (i * 10))
                            * i
                        + (n % i);
             i *= 10;
             ans = Math.max(ans, temp);
         }
         n = ans;
         return n;

	    }

}
