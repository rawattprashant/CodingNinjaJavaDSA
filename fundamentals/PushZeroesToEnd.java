package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PushZeroesToEnd {

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
    
    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
    	int n = arr.length;
    	int j =0;
    	for(int i=0;i<n;i++) {
    		if(arr[i]!=0) {
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j]=temp;
    			j++;
    		}
    	}
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            pushZerosAtEnd(input);
            printArray(input);
            
            t -= 1;
        }
    }

}
