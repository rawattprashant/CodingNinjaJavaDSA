package recursion1;

import java.util.Scanner;

public class CheckNumberInArray {

	static Scanner s = new Scanner(System.in);

	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return checkNumber(input, x, 0);
	}
	
	static boolean checkNumber(int[] input, int x, int startIndex) {
		// TODO Auto-generated method stub
		if(startIndex==input.length){
            return false;   
        }
        
        if(input[startIndex]==x){
            return true;
        }
        
		return checkNumber(input,x,startIndex+1);
		
	}

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}
	
}
