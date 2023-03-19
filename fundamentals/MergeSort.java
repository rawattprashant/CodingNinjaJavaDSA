package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {

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
    
    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
    	int m = arr1.length;
    	int n = arr2.length;
    	int arr3[]= new int[m+n];
    	int i=0, j=0, k=0;
    	while(i<m && j<n) {
    		if(arr1[i]<=arr2[j]) {
    			arr3[k] = arr1[i];
    			i++;
    			k++;
    		}
    		else {
    			arr3[k] = arr2[j];
    			j++;
    			k++;
    		}
    	}
    	while(i<m) {
    		arr3[k] = arr1[i];
    		i++;
    		k++;
    	}
    	while(j<n) {
    		arr3[k] = arr2[j];
    		j++;
    		k++;
    	}
    	return arr3;
    	
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            int[] ans = merge(input1, input2);
            printArray(ans);

            t -= 1;
        }
    }
}
