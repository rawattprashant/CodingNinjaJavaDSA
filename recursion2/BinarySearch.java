package recursion2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n= s. nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		int x = s.nextInt();
		System.out.println(binarySearch(arr,0,n-1,x));
	}
	

	private static int binarySearch(int arr[], int s, int e, int x) {
		int m = (s+e)/2;
		if(arr[m]>x)
			return binarySearch(arr, s, m-1, x);
		else if(arr[m]<x) {
			return binarySearch(arr, m+1, e, x);
		}
		else
			return m;
	}

}
