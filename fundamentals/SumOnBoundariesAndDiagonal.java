package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOnBoundariesAndDiagonal {

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < n; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }
    
    public static int getFirstDiagonalSum(int arr[][], int dimension){
        //here we start from 1st row 1st element
        int currRow = 0;
        int currCol = 0;
        int diagonalSum = 0;
        while(currRow < dimension && currCol < dimension){
            diagonalSum += arr[currRow][currCol];
            currCol++;
            currRow++;
        }
        return diagonalSum;
    }
    
    public static int getSecondDiagonalSum(int arr[][], int dimension){
      //here we start from 1st row last element
      int currRow = 0;
      int currCol = dimension - 1;
      int diagonalSum = 0;
      while(currRow<dimension && currCol >=0){
          diagonalSum += arr[currRow][currCol];
          currRow++;
          currCol--;
      }
      return diagonalSum;
    } 
    
    public static int getBoundarySum(int arr[][], int dimension){
        int sum = 0;
        for(int i=1;i<dimension-1;i++){
            //upper side 
            sum = sum + arr[0][i]; //row fixed increase col from 1 to 2nd last
            //lower side 
            sum = sum + arr[dimension-1][i]; //row fixed last row, col from 1 to 2nd last.
            //left side
            sum = sum + arr[i][0]; //col fixed , go from 2nd row to 2nd last row.
            //right side
            sum = sum + arr[i][dimension-1]; //col fixed, last column go from 2ndrow to 2nd last Row.
        }
        return sum;
    }
    
    public static void totalSum(int[][] mat) {
		//Your code goes here
    	int sum = 0;
    	int rows = mat.length;
    	if(rows == 0) {
    		System.out.println(sum);
    		return;
    	}
    	int totalSum =getFirstDiagonalSum(mat, rows) + getSecondDiagonalSum(mat, rows) +getBoundarySum(mat, rows);
    	if(rows%2!=0) {
    		totalSum = totalSum- mat[rows/2][rows/2];
    	}
    	System.out.println(totalSum);
	}

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            totalSum(mat);
            System.out.println();

            t -= 1;
        }
    }
}
