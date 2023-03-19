package recursion3;

import java.util.Scanner;

public class SubsetOfArray {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = Ssolution.subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}

class Ssolution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
		return helper(input);
	}
	public static int[][] helper(int [] arr){

        if(arr.length==0){
            return new int[0][0];
        }

        int [] n=new int[1];
        n[0]=arr[0];
        int [] arr1=new int[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            arr1[i-1]=arr[i];
        }
        int [][] sa1=helper(arr1);
        int [][] sa2=helper(arr1);
        int [][] ans = {};
        if(sa1.length==0){
            ans=new int[1][];
            ans[0]=new int[]{};
        }
        if(sa2.length==0){
            int [][] ans1=new int[ans.length+1][];
            int k=0;
            while (k<ans.length){
                ans1[k]=ans[k];
                k++;
            }
            ans1[k]=n;
            ans=ans1;
            return ans;
        }

        ans =new int[sa1.length+ sa2.length][];
        int k=0;
        for (int i = 0; i < sa1.length; i++) {
            ans[i]=sa1[i];
            k++;
        }

        for (int i = 0; i < sa2.length; i++) {
            ans[k]=new int[sa2[i].length+1];
            ans[k][0]=n[0];
            for (int j = 0; j < sa2[i].length; j++) {
                ans[k][j+1]=sa2[i][j];
            }
            k++;
        }
        return ans;
    }
}