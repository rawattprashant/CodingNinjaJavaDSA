package recursion1;

import java.util.Scanner;

public class SumOfArray {

	static Scanner s = new Scanner(System.in);

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return sum(input, 0);
	}
	
	static int sum(int[] input, int startIndex) {
		// TODO Auto-generated method stub
		if(startIndex == input.length) {
			return 0;
		}
		return input[startIndex] + sum(input, startIndex+1);
	}

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}
	
}
