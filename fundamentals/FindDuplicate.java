package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicate {
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
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int dupliNum = arr[0];
        for(int i=0;i<arr.length-1;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i]==arr[j]) {
    				dupliNum =  arr[i];
    				break;
    			}
    		}
    	}
    	return dupliNum;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            System.out.println(duplicateNumber(input));
        
            t -= 1;
        }
    }

}

// other methods to do above code

//public static int findDuplicate(int[] arr) {
//	//Your code goes here
//    //first we calculate the arraySum, Sum Of elements of the Array
//    int arraySum = 0;
//    for(int i=0;i<arr.length;i++){
//       arraySum += arr[i];
//    }
//    //we are given for n sized array elements range from 0 to n-2
//    //so lets calculte sum of first n-2 natural numbers.
//    int n = arr.length;
//    int naturalNumberSum = ((n-2) * (n-1))/2;
//    //its obvious the duplicate is added twice, so 
//    int result = arraySum - naturalNumberSum; //gives us the duplicate number
//    return result;  //time complexity O(n), spaceComplexity O(1)
//}
//
////another approach time complexity O(n^2)
//public static int findDuplicate1(int[] arr) {
//	//Your code goes here
//    for(int i=0;i<arr.length;i++){
//        for(int j=i+1;j<arr.length;j++){
//            if(arr[i]==arr[j]){
//                return arr[i];
//            }
//        }
//    }
//    return -1; //time complexity is O(n^2).
//}
////another approach time complexity O(nlogn)
//public static int findDuplicate2(int[] arr) {
//	//Your code goes here
//    Arrays.sort(arr); //nlogn
//    for(int i=0;i<arr.length-1;i++){ //n
//        
//            if(arr[i]==arr[i+1]){
//                return arr[i];
//            }
//        }
//    
//    return -1; //time complexity is O(nlogn).
//}
