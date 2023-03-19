package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort012 {

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
    
    public static void sort012(int[] arr){
    	//Your code goes here
    	int i=0;
        int nextZeros = 0;
        int nextTwo = arr.length - 1;
    	while(i<nextTwo){
            if(arr[i]==0){
                int temp = arr[nextZeros];
                arr[nextZeros] = arr[i];
                arr[i] = temp;
                i++;
                nextZeros++;
            }else if(arr[i]==2){
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;
            }else{
                i++;
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            sort012(input);
            printArray(input);

            t -= 1;
        }
	}

}
