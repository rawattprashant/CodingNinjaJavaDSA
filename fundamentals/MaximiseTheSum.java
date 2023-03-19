package fundamentals;

import java.util.Scanner;

public class MaximiseTheSum {

	public static long maximumSumPath(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		long maxSum = 0;
        if(input1.length ==0 && input2.length==0){
            return maxSum; //in case both ararys are empty
        }
        long sum1 = 0;
        long sum2 = 0;
        int i=0, j=0;
        while(i<input1.length && j<input2.length)
        	{
        		if(input1[i]<input2[j]){
        			sum1 += input1[i];
        			i++;
        		}
        		else if(input2[j]<input1[i]){
        			sum2 += input2[j];
        			j++;
        		}
        		else if(input1[i]==input2[j]){ //intersection point             
        			sum1 += input1[i];
        			sum2 += input2[j];
        			maxSum += Math.max(sum1, sum2);
        			sum1=0; //reinitialize both sums and start again
        			sum2=0;
        			i++;
        			j++;
        		} 
        	}
        //System.out.println(i);
        //System.out.println(input1.length);
        while(i<input1.length){ //in case there are still elements in 1st array
            //System.out.println(i);
            sum1 += input1[i];
            i++;
            //System.out.println(sum1);
            //System.out.println(i);
        }
        //System.out.println(sum1);
        while(j<input2.length){//in case there are still elements in 1st array
            sum2 += input2[j];
            j++;
        }
		maxSum += Math.max(sum1, sum2);
        return maxSum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int input1[] = new int[m];
        for(int i = 0; i < m; i++) {
        	input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int input2[] = new int[n];
        for(int i = 0; i < n; i++) {
        	input2[i] = s.nextInt();
        }
        System.out.println(maximumSumPath(input1, input2));
	}
	
}
