package fundamentals;

import java.util.Scanner;

public class FahrenheitConversion {
	
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		int c;
		for(int i = start; i<= end;i+=step) {
			c= (5*(i-32))/9;
			System.out.println(i+" "+c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		
		printFahrenheitTable(S, E, W);
		s.close();
	}

}
