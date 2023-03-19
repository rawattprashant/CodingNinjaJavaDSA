package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralPrint {

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }
    
    public static void spiralPrint(int matrix[][]){
		//Your code goes here
    	int rows = matrix.length; //gives the total length of rows
        if(rows == 0){
            return;
        }
        int cols = matrix[0].length;
        int i, rowStart=0, colStart=0;
        int numberOfElements = rows*cols, count = 0;
        while(count<numberOfElements){
            //Section 1
            for(i=colStart;count<numberOfElements && i<cols;i++){
                System.out.print(matrix[rowStart][i]+ " ");
                count++; //always increase count when you print one element.
            }
            rowStart++;

            //Section 2
            for(i=rowStart;count<numberOfElements && i<rows;i++){
                System.out.print(matrix[i][cols-1]+ " ");
                count++;
            }
            cols--;

            //Section 3
            for(i=cols-1;count<numberOfElements && i>=colStart;i--){
                System.out.print(matrix[rows-1][i]+ " ");
                count++;
            }
            rows--;

            //Section 4
            for(i=rows-1;count<numberOfElements && i>=rowStart;i--){
                System.out.print(matrix[i][colStart]+ " ");
                count++;
            }
            colStart++;
        }
	}

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }
}
