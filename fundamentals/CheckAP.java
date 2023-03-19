package fundamentals;

import java.util.Scanner;

public class CheckAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3,d1= n2-n1,d=0;
		int flag=0;
		for(int i = 2;i<n;i++) {
			n3 = s.nextInt();
			d=n3-n2;
			if(d!=d1) {
				flag++;
			}
			n2=n3;
		}
		if(flag==0)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
