package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayIntersection {

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
    
    //For more solution check commented solution at the end.
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here.(Most Optimal solution using Binary Search) 
    	//Time Complexity: O(mlogm + nlogn)
    	
    	int m1 = arr1.length;
    	int n1 = arr2.length;
    	int n,e;
    	if(m1<n1)
    		{
    			Arrays.sort(arr1);
    			n=n1;
    			e = m1-1;
    		}
    	else
    		{
    			Arrays.sort(arr2);
    			n=m1;
    			e = n1-1;
     		}
    	int s,mid;
    	for(int i=0;i<n;i++) {
    		s=0;
    		
    		while(s<=e) {
    			mid = (s+e)/2;
    			if(arr1[i]<arr2[mid]) {
    				e = mid-1;
    			}
    			else if(arr1[i]>arr2[mid])
    				s = mid+1;
    			else {
    				System.out.print(arr2[mid]+" ");
    				break;
    			}
    		}
    	}
    	
    }
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            intersections(input1, input2);
            System.out.println();

            t -= 1;
        }
	}

}


//public static void intersections(int arr1[], int arr2[]) {
//	//Your code goes here. (Using Merge Sort)
//	//Time Complexity: O(mlogm + nlogn)
//	Arrays.sort(arr1);
//	Arrays.sort(arr2);
//	
//	int m = arr1.length;
//	int n = arr2.length;
//	
//	int i=0, j=0, k=0;
//	while(i<m && j<n) {
//		if(arr1[i] < arr2[j])
//			i=i+1;
//		else if(arr1[i] > arr2[j])
//			j++;
//		else {
//			
//			System.out.print(arr1[i]+" ");
//			i++;
//			j++;
//		}
//	}
//	
//}


/*public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here(output will be unsorted in this.)
    	//Time Complexity: O(mn)
    	for(int i=0;i<arr1.length;i++) {
    		for(int j = 0;j<arr2.length;j++) {
    			if(arr2[j]==arr1[i]) {
    				System.out.print(arr1[i]+" ");
    				arr2[j] = Integer.MIN_VALUE;
    				break;
    			}
    		}
    	}
    }
*/