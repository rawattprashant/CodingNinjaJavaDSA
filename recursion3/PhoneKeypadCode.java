/*
 * Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.

Note : 

1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.

Input Format :
Integer n

Output Format :

All possible strings in different lines

Constraints :
1 <= n <= 10^6

Sample Input:
23

Sample Output:

ad
ae
af
bd
be
bf
cd
ce
cf

 */



package recursion3;

import java.util.Scanner;

public class PhoneKeypadCode {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = Solution.keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
}

class Solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
		return helper("",n);
	}
	
private static String[] helper(String p,int n){
        
        if(n==0){
            
            return new String[]{p};
        }
        
        int r=n%10;
        String arr=numMapping(r);
        String [] ans={};
        for(int i=0;i<arr.length();i++){
            String [] smallans=helper(arr.charAt(i)+p,n/10);
            String []ans1=new String[ans.length];
            for(int j=0;j<ans1.length;j++){
                ans1[j]=ans[j];
            }
            ans = new String[ans1.length+smallans.length];
            int k=0;
            while(k<ans1.length){
                ans[k]=ans1[k];
                k++;
            }
            int z=0;
            while(z<smallans.length){
                ans[k]=smallans[z];
                k++;
                z++;
            }
        }

        return ans;
    }
	
	private static String numMapping(int n){
        String s="";
        switch(n){
            case 0 : s=""; break;
            case 1 : s= ""; break;
            case 2 : s= "abc"; break;
            case 3 : s= "def"; break;
            case 4 : s= "ghi"; break;
            case 5 : s= "jkl"; break;
            case 6 : s= "mno"; break;
            case 7 : s= "pqrs"; break;
            case 8 : s= "tuv"; break;
            case 9 : s= "wxyz"; break;
        }

        return s;
    }
	
}
