package recursion3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSumOfK {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = Solution1.subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class Solution1 {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		ArrayList<int[]> l1 = helper("", input, k, 0);
		int[][] arr1 = new int[l1.size()][];

		for (int i = 0; i < l1.size(); i++) {
			arr1[i] = l1.get(i);
		}
		return arr1;
	}

	private static ArrayList<int[]> helper(String p,int[] arr,int sum,int si){
        
        if(sum==0){
            ArrayList<int[]> l1 = new ArrayList<>();
            String [] s2 = p.split(" ");
            int [] i1=new int[s2.length];
            for (int i = 0; i < s2.length; i++) {
            	i1[i]=Integer.parseInt(s2[i]);
        	}
            l1.add(i1);
            return l1;
        }
        
        ArrayList<int[]> ans=new ArrayList<>();
        for(int i=si;i<arr.length;i++){
            if(arr[i]<=sum){
                ArrayList<int[]> l2=helper(p+arr[i]+" ",arr,sum-arr[i],i+1);
                ans.addAll(l2);
            }
        }
        return ans;
    }
}