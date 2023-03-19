package fundamentals;

import java.util.Scanner;

public class NumberStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=n;j>=1;j--) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}

}
