package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int sum(int[] arr) {
		//Your code goes here
		int s = 0;
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		return s;
	}
	
	public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().trim().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 int t = Integer.parseInt(br.readLine().trim());

	        while(t > 0) {
	            int[] input = takeInput();
	            System.out.println(sum(input));
	            t -= 1;
	        }
	}

}
