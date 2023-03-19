/*
 *You are given two strings S and T of lengths M and N, respectively. Find the 'Edit Distance' between the strings.
Edit Distance of two strings is the minimum number of steps required to make one string equal to the other. In order to do so, you can perform the following three operations:
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note :
Strings don't contain spaces in between.
 Input format :
The first line of input contains the string S of length M.

The second line of the input contains the String T of length N.
Output format :
Print the minimum 'Edit Distance' between the strings.
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
abc
dc
Sample Output 1 :
2
 Explanation to the Sample Input 1 :
 In 2 operations we can make string T to look like string S.
First, insert character 'a' to string T, which makes it "adc".

And secondly, replace the character 'd' of string T with 'b' from the string S. This would make string T as "abc" which is also string S. 

Hence, the minimum distance.
Sample Input 2 :
whgtdwhgtdg
aswcfg
Sample Output 2 :
9 
 */

package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EditDistances {

	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        
	        String s = br.readLine().trim();
	        String t = br.readLine().trim();

	        
	        System.out.println(editDistance(s, t));
	    }
	    
	    public static int editDistance(String s1, String s2) {
			//Your code goes here
	    	int m=s1.length();
	        int n=s2.length();
	        int [][] storage= new int[m+1][n+1];

	        for (int i = 0; i <=n; i++) {
	            storage[0][i]=i;
	        }

	        for (int i = 0; i <=m; i++) {
	            storage[i][0]=i;
	        }

	        for (int i = 1; i <=m ; i++) {
	            for (int j = 1; j <=n ; j++) {
	                if(s1.charAt(m-i)==s2.charAt(n-j)){
	                    storage[i][j]=storage[i-1][j-1];
	                }else {
	                    storage[i][j]=1+Math.min(storage[i][j-1],Math.min(storage[i-1][j-1],storage[i-1][j]));
	                }
	            }
	        }
	        
	        return storage[m][n];
		}

		public static int editDistance(String s1, String s2,int [][] stotage){

	        int m=s1.length();
	        int n=s2.length();
	        if(s1.isEmpty()){
	            stotage[m][n]=n;
	            return n;
	        }
	        
	        if(s2.isEmpty()){
	            stotage[m][n]=m;
	            return m;
	        }
	        
	        if(stotage[m][n]!=-1)
	            return stotage[m][n];
	        
	        if(s1.charAt(0)==s2.charAt(0)) {
	            stotage[m][n]= editDistance(s1.substring(1), s2.substring(1), stotage);
	        }
	        else {
	            stotage[m][n]= 1+ Math.min(editDistance(s1,s2.substring(1),stotage),
	                    Math.min(editDistance(s1.substring(1),s2,stotage),editDistance(s1.substring(1),s2.substring(1),stotage)));
	        }
	        return stotage[m][n];
	    }
	    
}


//Recursive APProach
//public static int editDistanceR(String s1, String s2){
//
//	/* Your class should be named Solution
//	 * Don't write main().
//	 * Don't read input, it is passed as function argument.
//	 * Return output and don't print it.
// 	 * Taking input and printing output is handled automatically.
//    */        
//
//    int [][] stotage=new int[s1.length()+1][s2.length()+1];
//    for (int i = 0; i < stotage.length; i++) {
//        for (int j = 0; j < stotage[0].length; j++) {
//            stotage[i][j]=-1;
//        }
//    }
//    
//    return editDistanceR(s1,s2,stotage);
//}
//
//public static int editDistanceR(String s1, String s2,int [][] stotage){
//
//    int m=s1.length();
//    int n=s2.length();
//    if(s1.isEmpty()){
//        stotage[m][n]=n;
//        return n;
//    }
//    
//    if(s2.isEmpty()){
//        stotage[m][n]=m;
//        return m;
//    }
//    
//    if(stotage[m][n]!=-1)
//        return stotage[m][n];
//    
//    if(s1.charAt(0)==s2.charAt(0)) {
//        stotage[m][n]= editDistanceR(s1.substring(1), s2.substring(1), stotage);
//    }
//    else {
//        stotage[m][n]= 1+ Math.min(editDistanceR(s1,s2.substring(1),stotage),
//                Math.min(editDistanceR(s1.substring(1),s2,stotage),editDistanceR(s1.substring(1),s2.substring(1),stotage)));
//    }
//    return stotage[m][n];
//}