/*
 An integer matrix of size (M x N) has been given. Find out the minimum cost to reach from the cell (0, 0) to (M - 1, N - 1).
From a cell (i, j), you can move in three directions:
1. ((i + 1),  j) which is, "down"
2. (i, (j + 1)) which is, "to the right"
3. ((i+1), (j+1)) which is, "to the diagonal"
The cost of a path is defined as the sum of each cell's values through which the route passes.
 Input format :
The first line of the test case contains two integer values, 'M' and 'N', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

The second line onwards, the next 'M' lines or rows represent the ith row values.

Each of the ith row constitutes 'N' column values separated by a single space.
Output format :
Print the minimum cost to reach the destination.
Constraints :
1 <= M <= 10 ^ 2
1 <= N <=  10 ^ 2

Time Limit: 1sec
Sample Input 1 :
3 4
3 4 1 2
2 1 8 9
4 7 8 1

Sample Output 1 :
13

Sample Input 2 :

3 4
10 6 9 0
-23 8 9 90
-200 0 89 200

Sample Output 2 :
76

Sample Input 3 :
5 6
9 6 0 12 90 1
2 7 8 5 78 6
1 6 0 5 10 -4 
9 6 2 -10 7 4
10 -2 0 5 5 7

Sample Output 3 :
188

*/


package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinCostPath {

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int mRows = Integer.parseInt(strRowsCols[0]);
        int nCols = Integer.parseInt(strRowsCols[1]);

        if (mRows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[mRows][nCols];

        for (int row = 0; row < mRows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < nCols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int[][] mat = take2DInput();
        System.out.println(minCostPath(mat));
    }
    
    public static int minCostPath(int[][] input) {
		//Your code goes here
    	return minCostPath(input, 0, 0);
	}
    
 // Min Cost Path from cell (i, j) to cell (m - 1, n - 1)
 	private static int minCostPath(int[][] arr, int i, int j) {
 		int m = arr.length;
 		int n = arr[0].length;
 		if(i == m - 1 && j == n - 1){
 			return arr[i][j];
 		}
 		if(i >= m || j >= n){
 			return Integer.MAX_VALUE;
 		}
 		int op1 = minCostPath(arr, i , j + 1);
 		int op2 = minCostPath(arr, i + 1 , j + 1);
 		int op3 = minCostPath(arr, i + 1, j );

 		return arr[i][j] + Math.min(op1,  Math.min(op2, op3));
 	}

 	//Memoization
 	public static int minCostPathM(int arr[][]){
 		int m = arr.length;
 		int n = arr[0].length;
 		int storage[][] = new int[m][n];
 		for(int i = 0; i < m ; i++){
 			for(int j = 0; j < n; j++){
 				storage[i][j] = -1;
 			}
 		}
 		return minCostPathM(arr, 0, 0, storage);
 	}

 	//Memoization
 	private static int minCostPathM(int[][] arr, int i, int j, int[][] storage) {
 		int m = arr.length;
 		int n = arr[0].length;

 		if(i >= m || j >= n){
 			return Integer.MAX_VALUE;
 		}

 		if(i == m - 1 && j == n - 1){
 			storage[m - 1][n - 1] = arr[i][j];
 			return storage[i][j];
 		}

 		if(storage[i][j] != -1){
 			return storage[i][j];
 		}

 		int op1 = minCostPathM(arr, i , j + 1, storage);
 		int op2 = minCostPathM(arr, i + 1 , j + 1, storage);
 		int op3 = minCostPathM(arr, i + 1, j, storage );
 		storage[i][j] = arr[i][j] + Math.min(op1,  Math.min(op2, op3));
 		return storage[i][j];
 	}
 	
 	//DP
 	public  static int minCostPathDP(int arr[][]){
 		int m = arr.length;
 		int n = arr[0].length;
 		int storage[][] = new int[m][n];
 		
 		storage[m - 1][n - 1] = arr[m - 1][n - 1];
 		// Last Row
 		for(int j = n - 2; j >= 0; j--){
 			storage[m - 1][j] = storage[m - 1][j + 1] + arr[m - 1][j];
 		}
 		// Last Column
 		for(int i = m - 2; i >= 0; i--){
 			storage[i][n - 1] = storage[i + 1][n - 1] + arr[i][n - 1];
 		}
 		
 		for(int i = m - 2; i >= 0; i--){
 			for(int j = n - 2; j >= 0; j--){
 				storage[i][j] = arr[i][j] +  Math.min(storage[i][j + 1], 
 						Math.min(storage[i + 1][j + 1], storage[i + 1][j]));
 			}
 		}
 		return storage[0][0];
 	}
    
}
