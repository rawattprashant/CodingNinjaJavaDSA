package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapAlernate {

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
	    
	public static void swapAlternate(int arr[]) {
	  	//Your code goes here
		for(int i =0;i<arr.length-1;i+=2) {
			int temp=0;
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            swapAlternate(input);
            printArray(input);

            t--;
        }
	}

}
