package fundamentals;

import java.util.Scanner;

public class NumStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i,j,k,postStars,preStars;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(preStars=n;preStars>i;preStars--) {
				System.out.print("*");
			}
			for(preStars=n;preStars>i;preStars--) {
				System.out.print("*");
			}
			for(k=i;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
			
		}
	}

}
