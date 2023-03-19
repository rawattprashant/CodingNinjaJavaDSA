package recursion1;

import java.util.Scanner;

public class NumberOfDigits {

	public static int count(int n){
		//Write your code here
		if(n==0)
			return 0;
		int smallRes = count(n/10);
		smallRes = smallRes + 1;
		return smallRes;
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(count(n));
	}
	
}
