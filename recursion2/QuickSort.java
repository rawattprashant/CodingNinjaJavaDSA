package recursion2;

import java.util.Scanner;

public class QuickSort {

	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
	}
	
	public static void quickSort(int[] input, int startIndex, int endIndex) {
		// your code goes here
		if(startIndex >= endIndex){
            return;  
        }
        int partitionIndex = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, partitionIndex - 1);
        quickSort(input, partitionIndex+1, endIndex);
	}
	
	public static int partition(int[] input, int startIndex, int endIndex){
        int pivot = input[startIndex];
        int count = 0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(input[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = startIndex + count;
        input[startIndex] = input[pivotIndex];
        input[pivotIndex] = pivot;
        
        int i = startIndex, j= endIndex;
        while(i < j){
            while(i <= endIndex && input[i] <= pivot){
                i++;
            }
            while(input[j] > pivot){
                j--; 
            }
            if(i<=j){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--; 
            }
        }
        return pivotIndex; 
    }
	
	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
