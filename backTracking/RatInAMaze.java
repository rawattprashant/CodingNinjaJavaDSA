package backTracking;
import java.util.Scanner;
public class RatInAMaze {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		System.out.println(Solution.ratInAMaze(maze));	
	}
}

class Solution {

	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 

        int [][] visited=new int[maze.length][maze.length];
        return helper(maze,visited,0,0,maze.length);
	}
    
    public static boolean helper(int [][] maze,int [][] visited,int r,int c, int N){
        if(r<0 || r>=N || c<0 || c>=N)
            return false;
        if(r==N-1 && c==N-1)
            return true;
        if(maze[r][c]==0 || visited[r][c]==1)
            return false;
        
        visited[r][c]=1;
        boolean ans=false;
        ans = helper(maze,visited,r-1,c,N) || helper(maze,visited,r,c+1,N) || helper(maze,visited,r+1,c,N)
            || helper(maze,visited,r,c-1,N);
        visited[r][c]=0;
        return ans;
    }

	
}
