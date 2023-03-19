package assignmentRecursion;

import java.util.Scanner;

public class SumOfDigitsRecursive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
	}
	
	public static int sumOfDigits(int input){
		// Write your code here
		int sum;
		if(input<10)
			return input;
		sum = (input%10) + sumOfDigits(input/10);
		return sum;
	}
	
}
