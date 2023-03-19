package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray {

	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static int[] takeInput() throws IOException {
	        int size = Integer.parseInt(br.readLine().trim());
	        int[] input = new int[size];

	        if (size == 0) {
	            return input;
	        }
	        
	        String[] strNums; 
	        strNums = br.readLine().split("\\s");
	        

	        for (int i = 0; i < size; ++i) {
	            input[i] = Integer.parseInt(strNums[i]);
	        }

	        return input;
	    }

	    public static void printArray(int[] arr) {
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }

	        System.out.println();
	    }
	    
	    public static void rotate(int[] arr, int d) {
	    	//Your code goes here
	    	int n = arr.length;
	        int temp[] = new int[d];
	        for(int j=0;j<d;j++){
	            temp[j] = arr[j];
	        }
	        int i;
	        for(i=0;i<n-d;i++){
	            arr[i] = arr[i+d];
	        }
	        for(int j=0;j<d;j++){
	            arr[i] = temp[j];
	            i++;
	        }
	    }

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        int t = Integer.parseInt(br.readLine().trim());

	        while(t > 0) {

	            int[] input = takeInput();
	            int d = Integer.parseInt(br.readLine().trim());
	            rotate(input, d);
	            printArray(input);

	            t -= 1;
	        }
	    }

}

//
////A program to swap first and last elements of the array
//private static void swapElements(int arr[], int start, int end){
//   int temp = arr[start];
//   arr[start] = arr[end];
//   arr[end] = temp;
//}
////A program to reverse a array from start to end
//private static void reverse(int arr[], int start, int end){
//    while(start<end){
//        swapElements(arr, start, end);
//        start++;
//        end--;
//    }
//} 
//public static void rotate(int[] arr, int d) {
//	//Your code goes here
//    if(arr.length == 0){
//        return;
//    }
//    if(d>=arr.length && arr.length != 0){
//        d =d%arr.length; //to get effective d 
//    }
//    //reverse the original array
//    reverse(arr, 0, arr.length-1);
//    //reverse first n-d elements 
//    reverse(arr, 0, arr.length-1-d);
//    //reverse last d elements 
//    reverse(arr, arr.length-d, arr.length-1);
//}