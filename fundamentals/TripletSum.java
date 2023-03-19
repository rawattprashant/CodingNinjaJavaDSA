package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripletSum {

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
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
    	int numPairs = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                    {
                    numPairs += 1;
                    }
                }
              
            }
        }
        return numPairs;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(findTriplet(input, x));

            t -= 1;
        }
	}

}
//other approaches

//private static int pairSum(int arr[], int startIndex, int endIndex, int num){
//    int numPair = 0;
//    while(startIndex < endIndex){
//        if (arr[startIndex] + arr[endIndex] < num) {
//            // move from left to right, increase start
//            startIndex++;
//        } else if (arr[startIndex] + arr[endIndex] > num) {
//            // move from right to left, decrease end
//            endIndex--;
//        } else 
//        {
//            int elementAtStart = arr[startIndex];
//            int elementAtEnd = arr[endIndex];
//            // to check for {2,2,2,2,2} all elements same condition
//            if (elementAtStart == elementAtEnd) {
//                int totalElementFromStartToEnd = (endIndex - startIndex) + 1;
//                numPair += ((totalElementFromStartToEnd) * (totalElementFromStartToEnd - 1)) / 2;
//                return numPair;
//            }
//            int tempStartIndex = startIndex + 1;
//            int tempEndIndex = endIndex - 1;
//            // to check for index of same elements from start/left
//            while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
//                tempStartIndex++;
//            }
//            // to check for index of same elements from end/right
//            while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
//                tempEndIndex--;
//            }
//            // count no of same elements from start
//            int totalElementFromStart = tempStartIndex - startIndex;
//            // count no of same elements from end
//            int totalElementFromEnd = endIndex - tempEndIndex;
//            // count no. of total num pairs n*m
//            numPair += (totalElementFromEnd * totalElementFromStart);
//            // adjust start and end
//            startIndex = tempStartIndex;
//            endIndex = tempEndIndex;
//
//        }
//    }
//    return numPair;
//}
//public static int tripletSum(int[] arr, int num) {
//	//Your code goes here
//    Arrays.sort(arr); //nlogn
//    int n = arr.length;
//    int numTriplets = 0;
//    for(int i=0;i<arr.length;i++){
//        int pairSumFor = num - arr[i];
//        int numPairs = pairSum(arr, (i+1), (n-1), pairSumFor);
//        numTriplets += numPairs;
//    }
//    return numTriplets;
//
//}