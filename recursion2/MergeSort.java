package recursion2;

import java.util.Scanner;

public class MergeSort {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}
	
	public static void mergeSort(int[] input){
		// Write your code here
		if(input.length<=1)
			return;
		
		int mid = input.length/2;
		int arr1[] = new int[mid];
		int arr2[] = new int[input.length-mid];
		
		for(int i=0;i<mid;i++) {
			arr1[i] = input[i];
		}
		int k=0;
		for(int j=mid;j<input.length;j++) {
			arr2[k] = input[j];
			k++;
		}
		
		mergeSort(arr1);
		mergeSort(arr2);
		merge(arr1,arr2, input);
	}
	
	private static void merge(int[] a1, int a2[], int output[]) {
		int i=0,j=0,k=0;
		while(i<a1.length && j<a2.length) {
			if(a1[i] <= a2[j]) {
				output[k] = a1[i];
				i++;
				k++;
			}
			else {
				output[k] = a2[j];
				k++;
				j++;
			}
		}
		while(i<a1.length) {
			output[k] = a1[i];
			k++;
			i++;
		}
		while(j< a2.length) {
			output[k] = a2[j];
			k++;
			j++;
		}
	}
}
