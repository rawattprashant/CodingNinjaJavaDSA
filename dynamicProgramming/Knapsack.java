package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Input {
	private int n;
	private int[] weights;
	private int[] values;
	private int maxWeight;

	public Input(int[] weights, int[] values, int n, int maxWeight) {
		this.n = n;
		this.weights = weights;
		this.values = values;
		this.maxWeight = maxWeight;
	}

	public int getSize() {
		return this.n;
	}

	public int[] getWeights() {
		return this.weights;
	}

	public int[] getValues() {
		return this.values;
	}

	public int getMaxWeight() {
		return this.maxWeight;
	}
}

public class Knapsack {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Input takeInput() throws NumberFormatException, IOException {
		
		int n = Integer.parseInt(br.readLine().trim());

		if (n == 0) {
			return (new Input(new int[0], new int[0], 0, 0));
		}

		String[] strWeights = br.readLine().trim().split(" ");
		String[] strValues = br.readLine().trim().split(" ");
		int maxWeight = Integer.parseInt(br.readLine().trim());

		int[] weights = new int[n];
		int[] values = new int[n];

		for (int i = 0; i < n; i++) {
			weights[i] = Integer.parseInt(strWeights[i]);
			values[i] = Integer.parseInt(strValues[i]);
		}

		return (new Input(weights, values, n, maxWeight));

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Input input = takeInput();

        int n = input.getSize();
        int[] weights = input.getWeights();
        int[] values = input.getValues();
        int maxWeight = input.getMaxWeight();

        
        System.out.println(knapsack(weights, values, n, maxWeight));
    }
    
    public static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
		//Your code goes here
    	//Dp with space complexity: O(W)
    	int storagePrev[] = new int[maxWeight+1];
        int storageCurrent[] = new int [maxWeight+1];
        for(int i=1;i<value.length+1;i++){
            for(int w = 1;w<maxWeight+1;w++){
                if(weight[i-1]>w){
                    storageCurrent[w] = storagePrev[w];
                }
                else { 
                storageCurrent[w]= Math.max(storagePrev[w - weight[i-1]]+ value[i-1],storagePrev[w]);
                }
            }
                storagePrev = storageCurrent ;
                storageCurrent = new int[maxWeight+1];
            
        }
        return storagePrev[maxWeight];
	}
    
}

//Recursive
//public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
//    //Your code goes here
//    return knapsack(weights, values, n, maxWeight, 0);
//    }
//private static int knapsack(int[] weights, int[] values, int n, int maxWeight, int i){
//    //Base case 
//    if(i==weights.length || maxWeight ==0){
//        return 0;
//    }
//    if(weights[i]>maxWeight){
//        return knapsack(weights, values, n-1, maxWeight, i+1);
//        
//    }else{
//        //include the ith item
//        int op1 = values[i] + knapsack(weights, values, n-1, maxWeight-weights[i], i+1);
//        //dont include
//        int op2 =  knapsack(weights, values, n-1, maxWeight, i+1);
//        return Math.max(op1, op2);
//    }
//    
//}


//DP and Memoization
//static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
//
//int storage[][]=new int[n+1][maxWeight+1];
//for(int i=0;i<n+1;i++){
//    for(int j=0;j<maxWeight+1;j++){
//        storage[i][j]=-1;
//    }
//}
//return knapsack(weight,value,maxWeight,n+1,storage,0);
//
//}
//public static int knapsack(int[] weight,int value[],int maxWeight,int n,int[][] storage,int i){
//if(i==weight.length || maxWeight==0){
//   storage[i][maxWeight]=0;
//   return storage[i][maxWeight];}
//
//if(storage[i][maxWeight]!=-1)
//   return storage[i][maxWeight];
//if(weight[i]>maxWeight)
//{
//   storage[i][maxWeight]=knapsack(weight,value,maxWeight,n-1,storage,i+1);
//   return storage[i][maxWeight];
//}
//else{
//   int op1=value[i]+knapsack(weight,value,maxWeight-weight[i],n-1,storage,i+1);
//   int op2=knapsack(weight,value,maxWeight,n-1,storage,i+1);
//   storage[i][maxWeight]=Math.max(op1,op2);
//   return storage[i][maxWeight];
//}
//
//}