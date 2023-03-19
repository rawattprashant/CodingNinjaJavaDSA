package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeNumInArrays {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
	
	public static void arrange(int[] arr, int n) {
			//Your code goes here
		int startIndex ;
		int endIndex ;
		int numValue =1;
		for(startIndex=0,endIndex=n-1;startIndex<=endIndex;startIndex++,endIndex--) {
			arr[startIndex] =numValue;
	        numValue++;
			if(startIndex==endIndex)
				break;
			else {
				arr[endIndex]=numValue;
				numValue++;
			}
		}
	    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
	}

}
