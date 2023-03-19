package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LootHouses {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws IOException {
		int n = Integer.parseInt(br.readLine().trim());

		if (n == 0) {
			return new int[0];
		}

		String[] strNums = br.readLine().trim().split("\\s");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strNums[i]);
        }

        return arr;
	}

    public static void main(String[] args) throws NumberFormatException, IOException {
            int[] arr = takeInput();
            System.out.println(maxMoneyLooted(arr));
    }
    
    
	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
    	if(houses.length ==0)
    		return 0;
    	if(houses.length == 1)
    		return houses[0];
    	houses[1] = Math.max(houses[1],houses[0]);
    	for(int i =2;i<houses.length;i++) {
    		houses[i] = Math.max(houses[i]+houses[i-2],houses[i-1]);
    	}
    	
    	return houses[houses.length-1];
	}
    
}


//DP Approach
//public class Solution {
//
//	public static int maxMoneyLooted(int[] arr) {
//		//Your code goes here
//          if(arr.length==0)
//            return 0;
//        int storage[]=new int[arr.length];
//        storage[0]=arr[0];
//        storage[1]=Math.max(arr[1],storage[0]);
//        for(int i=2;i<storage.length;i++){
//            storage[i]=Math.max(arr[i]+storage[i-2],storage[i-1]);
//      }
//        return storage[storage.length-1];
//	}
//
//}
//
//=============================================================================
//Recursive Approach
//public class Solution {
//
//    public static int maxMoneyLooted(int[] arr) {
//        //Your code goes here
//        return getMaxMoney(arr,0); //start with 0
//    }
//    public static int getMaxMoney(int arr[],int index){
//        if( arr.length==0 || index>=arr.length)
//            return 0;
//        int op1=arr[index]+getMaxMoney(arr,index+2); //if we include array[index]
//        int op2=getMaxMoney(arr,index+1); //if we dont include array[index]
//        return Math.max(op1,op2);
//    }
//}
