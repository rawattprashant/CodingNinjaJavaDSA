/*
 You are given a set of N integers. You have to return true if there exists a subset that sum up to K, otherwise return false.
Input Format
The first line of the test case contains an integer 'N' representing the total elements in the set.

The second line of the input contains N integers separated by a single space.    

The third line of the input contains a single integer, denoting the value of K.
Output Format
Output Yes if there exists a subset whose sum is k, else output No.
Constraints :
1 <= N <= 10^3
1 <= a[i] <= 10^3, where a[i] denotes an element of the set 
1 <= K <= 10^3

Time Limit: 1 sec
Sample Input 1 :
4
4 3 5 2
13
Sample Output 1 :
No
Sample Input 2 :
5
4 2 5 6 7
14
Sample Output 2 :
Yes
 */
package dpAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsetSum {

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            System.out.print("No");
            return;
        }
        
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        int sum = Integer.parseInt(br.readLine().trim());
        if (isSubsetPresent(input,size,sum)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
        
        static boolean isSubsetPresent(int[] arr, int n, int sum) {

            /* Your class should be named Solution
    		 * Don't write main().
    		 * Don't read input, it is passed as function argument.
    		 * Return output and don't print it.
    	 	 * Taking input and printing output is handled automatically.
            */
        	
        	boolean [][] storage = new boolean[n+1][sum+1];
            for(int i=0;i<=n;i++){
                storage[i][0]=true;
            }
            for(int i=1;i<=sum;i++){
                storage[n][i]=false;
            }

            for(int i=n-1;i>=0;i--){
                for(int j=1;j<=sum;j++){
                    if(arr[i]>j){
                        // If element at index 'i' > 'j' then simply exclude the element and move to next index.
                        storage[i][j]=storage[i+1][j];
                    }else{ 
                        // If element at index 'i' is <= 'j' then either we can pick it or exclude it.
                        storage[i][j]=storage[i+1][j-arr[i]] || storage[i+1][j];
                    }
                }
            }

            return storage[0][sum];
        }

}

/*

int [][] s=new int [arr.length+1][sum+1];
for(int i=0;i<s.length;i++){
  for(int j=0;j<s[0].length;j++)
      s[i][j]=-1;
}

return helper1(arr,0,sum,s);
 return helper1(arr,0,sum);

private static boolean helper1(int [] arr,int n,int sum,int [][] s){
    if(sum==0)
        return true;
    if(n>=arr.length || sum<0)
        return false;
    if(s[n][sum]!=-1){
        return s[n][sum]==1;
    }
    
    boolean v= helper1(arr,n+1,sum-arr[n],s) || helper1(arr,n+1,sum,s);
    if(v)
        s[n][sum]=1;
    else
        s[n][sum]=0;
    
    return v;
}

private static boolean helper1(int [] arr,int n,int sum){
    if(sum==0)
        return true;
    if(n>=arr.length || sum<0)
        return false;

    
    return helper1(arr,n+1,sum-arr[n]) || helper1(arr,n+1,sum);
    
}
*/