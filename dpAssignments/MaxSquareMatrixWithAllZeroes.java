/* Given an NxM matrix that contains only 0s and 1s, find out the size of the maximum square sub-matrix with all 0s. You need to return the size of the square matrix with all 0s.
Input format :
The first line of the test case contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively.

Second-line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith rows constitutes column values separated by a single space (Either 0 or 1).
Output Format:
Print the size of maximum square sub-matrix.
 Constraints :
0 <= N <= 10^4
0 <= M <= 10^4

Time Limit: 1 sec
Sample Input 1:
3 3
1 1 0
1 1 1
1 1 1
Sample Output 1:
1
Sample Input 2:
4 4
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
Sample Output 2:
4
*/

package dpAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSquareMatrixWithAllZeroes {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[][] takeInput() throws IOException {

        String[] nm;
        nm = br.readLine().split("\\s");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
		int arr[][]=new int[n][m];

        if (n == 0) {
            return arr;
        }
        

		String[] strNums;
        for (int i = 0; i < n; ++i) {            
            strNums = br.readLine().split("\\s");
            for (int j = 0; j < m; ++j){
                arr[i][j] = Integer.parseInt(strNums[j]);
            }
            
        }

        return arr;
    }

	public static void main(String[] args) throws IOException {

        int[][] arr = takeInput();
		System.out.println(findMaxSquareWithAllZeros(arr));
	}
	
	public static int findMaxSquareWithAllZeros(int[][] input){
        
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		
		int m=input.length;
        if(m==0)
            return 0;
        int n=input[0].length;
        int [][] storage=new int[m][n];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            storage[0][i]=(input[0][i]==0)?1:0;
            if(storage[0][i]>max)
                max=storage[0][i];
        }

        for (int i = 0; i < m; i++) {
            storage[i][0]=(input[i][0]==0)?1:0;
            if(storage[i][0]>max)
                max=storage[i][0];
        }

        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                if(input[i][j]==1){
                    storage[i][j]=0;
                    continue;
                }
                storage[i][j]=1+Math.min(storage[i-1][j-1],Math.min(storage[i][j-1],storage[i-1][j]));
                if(storage[i][j]>max)
                    max=storage[i][j];
            }
        }
        return max;
		}
	
	public static int findMaxSquareWithAllZeros1(int[][] input){
        //check for empty array first
        if(input.length==0 || input[0].length==0) return 0;

       int[][] storage = new int[input.length][input[0].length];
       int max = Integer.MIN_VALUE;
        //Initialize first column if it is 0 then 1 else 0
       for(int i=0;i<input.length;i++) {
           storage[i][0] = input[i][0] ==0 ? 1: 0;
           max = Math.max(storage[i][0], max);
       }
        //Initialize first row if it is 0 then 1 else 0
       for(int i=0;i<input[0].length;i++) {
           storage[0][i] = input[0][i] ==0 ? 1: 0;
           max = Math.max(storage[0][i], max);
       }


       for(int i=1;i<input.length;i++) {
           for(int j=1;j<input[0].length;j++ ) {
               if(input[i][j]==1){
					storage[i][j] = 0;
               }
               else{
                   storage[i][j] = Math.min(Math.min(storage[i-1][j-1], storage[i-1][j] ),
                                            storage[i][j-1]
                                           ) + 1 ;
               }
               max = Math.max(storage[i][j], max);

           }
       }
       return max;
	}

	
}
