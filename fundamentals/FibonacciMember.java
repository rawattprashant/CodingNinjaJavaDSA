package fundamentals;

import java.util.Scanner;

public class FibonacciMember {
	
	public static boolean checkMember(int n){
		
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
		int a = 0, b = 1, c;
		if(n==0 || n==1)
			return true;
		for(int i=1;i<=n;i++) {
			c = a+b;
			a=b;
			b=c;
			if(c==n || n==a || n==b)
				return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(checkMember(n)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
