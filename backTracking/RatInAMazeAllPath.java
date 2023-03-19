package backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RatInAMazeAllPath {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] maze = new int[20][20];
        for (int i = 0; i < n; i++)
        {
            StringTokenizer tk = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++)
            {
                maze[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        Solution1.ratInAMaze(maze, n);
    }
	
}

class Solution1 {


	static void ratInAMaze(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
		int [][] m=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                m[i][j]=maze[i][j];
        }
        int [][] visited=new int[n][n];
        helper(m,0,0,visited);
		
	}
	
public static void helper(int [][] m, int r,int c,int [][] visited){
        
        int n=m.length;
        if(r<0 || r>=n || c<0 || c>=n || m[r][c]==0 || visited[r][c]==1)
            return;
        
        if(r==(n-1) && c==(n-1)){
            visited[r][c]=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(visited[i][j]+" ");                
                }
            }
            System.out.println();
            visited[r][c]=0;
            return;
        }
        
        visited[r][c]=1;
        helper(m,r-1,c,visited);
        helper(m,r+1,c,visited);
        helper(m,r,c-1,visited);
        helper(m,r,c+1,visited);
        visited[r][c]=0;
    
    }

}
