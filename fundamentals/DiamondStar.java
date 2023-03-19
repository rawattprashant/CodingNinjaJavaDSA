package fundamentals;

import java.util.Scanner;

public class DiamondStar {

	public static void main(String[] args) {
        // Write your code here
        Scanner s =new Scanner (System.in);
        int t;
        t = s.nextInt();
        
        while(t>0) {
        	
        	int n = s.nextInt();
    		int i , j, k, spaces;
    		for(i=1;i<=n/2 +1;i++) {
    			
    			for(spaces = 1;spaces <= (n/2+1)-i  ;spaces++) {
    				System.out.print(" ");
    			}
    			
    			for(j = 1;j<=i;j++) {
    				System.out.print(" *");
    			}
    			for(k = i-1;k>=1;k--) {
    				System.out.print(" *");
    			}
    			System.out.println();
    			
    		}
    		
    		for(i=1;i<=n/2 ;i++) {
    			
    			for(spaces = 1;spaces <= i  ;spaces++) {
    				System.out.print(" ");
    			}
    			
    			for(j = i;j<=n/2;j++) {
    				System.out.print(" *");
    			}
    			for(k = n/2-i;k>=1;k--) {
    				System.out.print(" *");
    			}
    			System.out.println();
    			
    		}
        	
        }
		
        
    }
}
