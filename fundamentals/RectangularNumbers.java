package fundamentals;

import java.util.Scanner;

public class RectangularNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		print(n);
        s.close();
	}
	
	public static void print(int n) {
		//Write your code here
		int i, j, a;
        for (i = -(n - 1); i < n; i++) {
            a = n;
            for (j = -(n - 1); j < n; j++) {
                if (Math.abs(i) < Math.abs(j)) {
                    if (j < 0) {
                        System.out.print(a);
                        a--;
                    } else {
                        a++;
                        System.out.print(a);
                    }
                } else {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
	}
}
