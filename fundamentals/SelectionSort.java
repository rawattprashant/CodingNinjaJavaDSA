package fundamentals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SelectionSort {

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
	
	public static void selectionSort(int[] arr) {
    	//Your code goes here
		int min;
		for(int i=0;i<arr.length-1;i++) {
			min = i;
			for(int j =i;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i] = temp;
		}
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            selectionSort(input);
            printArray(input);

            t -= 1;
        }
    }

}
