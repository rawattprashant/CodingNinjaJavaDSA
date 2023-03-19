package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindUnique {

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
    
    public static int findUnique(int[] arr){
		//Your code goes here
    	
    	int unique = arr[0];
        for(int i=1;i<arr.length;i++) {
        		int j;
        		for( j=0;j<arr.length;j++) {
        			if(i!=j) {
        				if(arr[i]==arr[j]) {
        					break;
        				}
        			}
        		}
        		if(j==arr.length)
        			unique= arr[i];
        	}
        	return unique;
    }
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(br.readLine().trim());
		
        while(t > 0) {

            int[] input = takeInput();
            System.out.println(findUnique(input));
        
            t -= 1;
        }
	}

}

// other methods
//public static int findUnique(int[] arr){
//    int XOR = 0;;
//    for(int i=0;i<arr.length;i++)
//    {
//       XOR ^= arr[i];    
//    }
//    return XOR;  //time complexity is O(n) ans space Complexity is O(1).
//}
////another approach
//public static int findUnique1(int[] arr) {
//	//Your code goes here
//    if(arr.length == 0){
//        return -1;
//    }
//    Arrays.sort(arr); //nlogn
//    if(arr[0]!=arr[1]){
//        return arr[0]; //for 1st unique element
//    }
//    for(int i=1;i<arr.length-1;i++){  //bigo of n.
//        if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
//            return arr[i];
//        }
//    }
//    return -1; //final time complexity = nlogn+n
//}