package liveClassesProblems;

import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
	    int[] arr1 = new int[n1];
	    for (int i = 0; i < n1; i++) 
	    	arr1[i] = sc.nextInt();

	    int n2 = sc.nextInt();
	    int[] arr2 = new int[n2];
	    for (int i = 0; i < n2; i++) 
	    	arr2[i] = sc.nextInt();
	    sc.close();

	    int[] res = calSum(arr1, arr2, n1, n2);
	    for (int i : res) System.out.println(i);
		
	}
	
	static int[] calSum(int a[], int b[], int n, int m) {
	    // your code here
		  int arr_sum []= new int[n];
		  if(n==m) {
			  if(a[0]+b[0] >9) {
				  arr_sum = new int[n+1];
			  }
			  for(int i=0;i<arr_sum.length;i++) {
				  arr_sum[i] = a[i]+b[i];
			  }
		  }
		  else {
			  
		  }
		  return arr_sum;
	  }


}
