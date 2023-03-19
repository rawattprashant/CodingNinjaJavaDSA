package fundamentals;

import java.util.Scanner;

public class LeadersInArray {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		int max = Integer.MIN_VALUE;
        for(int i=input.length-1;i>=0;i--){
            if(input[i]>=max){
                System.out.print(input[i]+ " ");
                max = input[i];
            }
        }		
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		leaders(input);		
	}
}
