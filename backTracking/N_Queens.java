package backTracking;

import java.util.*;

public class N_Queens {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Solution2.placeNQueens(n);	
	}
	
}

class Solution2 {
	
	
public static void placeNQueens(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Print output as specified in the question
	 */

	int board[][] = new int[n][n];
    placeQueen(board,0);
    
	}
	
public static boolean isSafe(int [][] board,int r,int c){
    int [] x_dir={-1,-1,-1};
    int [] y_dir={-1,0,1};
    for (int i = 0; i < x_dir.length; i++) {
        int x=r+x_dir[i];
        int y=c+y_dir[i];
        while (x>=0 && y>=0 && y<board.length){
            if(board[x][y]==1)
                return false;
            x+=x_dir[i];
            y+=y_dir[i];
        }
    }

    return true;
}

public static void placeQueen(int [][] board,int r)
	{
    	if(r==board.length){
    		for (int i = 0; i < board.length; i++) {
    			for (int j = 0; j < board.length; j++) {
    				System.out.print(board[i][j]+" ");
    			}
    		}
    		System.out.println();
    		return;
    	}

    	//checking each column if it's safe or not
    	for (int i = 0; i < board.length; i++) {
    		if(isSafe(board,r,i)) {
    			board[r][i]=1;
    			placeQueen(board, r + 1);
            	board[r][i]=0;
        	}
    	}
	}
}