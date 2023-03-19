package fundamentals;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int d,n = num,rev = 0;
		while(n>0) {
			d=n%10;
			rev = (rev*10) +d;
			n/=10;
		}
		if(rev == num) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
