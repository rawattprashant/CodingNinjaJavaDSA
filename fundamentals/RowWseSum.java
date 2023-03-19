package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RowWseSum {

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
    
    public static void rowWiseSum(int[][] mat) {
		//Your code goes here
    	int n = mat.length;
    	int s=0;
    	for(int i =0;i<n;i++) {
    		int m = mat[i].length;
    		for(int j=0;j<m;j++) {
    			s+= mat[i][j];
    		}
    		System.out.print(s+" ");
    		s=0;
    	}
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            rowWiseSum(mat);
            System.out.println();

            t -= 1;
        }
    }

}
