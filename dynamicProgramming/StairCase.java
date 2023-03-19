package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairCase {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution.staircase(n));
    }
    
}

class Solution {

	public static long staircase(int n) {
		//Your code goes here
		long [] count = new long[n+1];
        count[0]=1;
        // long c=0;
        for (int i = 1; i <=n ; i++) {
        
            if(i-1>=0){
                count[i]+=count[i-1];
            }
            if(i-2>=0){
                count[i]+=count[i-2];
            }
            if(i-3>=0){
                count[i]+=count[i-3];
            }
        }
        return count[n];
	}

}


/*A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. 
 * Implement a method to count and return all possible ways in which the child can run-up to the stairs.

Input format :
The first and the only line of input contains an integer value, 'n', denoting the total number of steps.

Output format :
Print the total possible number of ways.

Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec

Sample Input 1:
4

Sample Output 1:
7

Sample Input 2:
10

Sample Output 2:
274

*/