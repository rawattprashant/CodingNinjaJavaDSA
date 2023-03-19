package fundamentals;

import java.util.Scanner;

public class Probability {

	public static int probability(int n,int x){
        
        /* Your class should be named Solution
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Return output and don't print it.
        * Taking input and printing output is handled automatically.
        */
		int favourableOutcome = NCR(4, x) * NCR(4, n - x);
		int totalOutcome = NCR(8, n);
		int ans = (favourableOutcome*100) / totalOutcome;
		return ans;

    }
	
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int NCR(int n, int r) {
		int factn = factorial(n);
		int factr = factorial(r);
		int factnr = factorial(n - r);
		return factn / (factr * factnr);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x=s.nextInt();
		System.out.println(probability(n,x));
		s.close();
	}

}
