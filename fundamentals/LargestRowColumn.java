package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestRowColumn {

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

    public static void findLargest(int mat[][]){
		//Your code goes here
    	int largest = Integer.MIN_VALUE;
    	int index = 0;
    	int rows = mat.length;
    	 if(rows==0){ //for blank array
             System.out.println("row "+index+" "+ largest);
             return;
           }
    	int cols = mat[0].length;
    	boolean isRow = true;
    	for(int i=0;i<rows;i++) {
    		int rowSum =0;
    		for(int j=0;j<cols;j++) {
    			rowSum+=mat[i][j];
    		}
    		if(rowSum>largest) {
    			largest= rowSum;
    			index =i;
    		}
    	}
    	
    	for(int i=0;i<cols;i++) {
    		int colSum =0;
    		for(int j=0;j<rows;j++) {
    			colSum+=mat[j][i];
    		}
    		if(colSum>largest) {
    			largest= colSum;
    			index =i;
    			isRow= false;
    		}
    	}
    	
    	if(isRow) {
    		System.out.println("row "+index+" "+largest);
    	}
    	else {
    		System.out.println("colum "+index+" "+largest);
    	}
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            findLargest(mat);
            System.out.println();

            t -= 1;
        }
    }
}
