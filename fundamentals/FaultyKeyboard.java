package fundamentals;

import java.util.Scanner;

public class FaultyKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		while(n>0)
		{
			String named = s.next();
			String typed = s.next();
			
			System.out.println(isFaulty(named, typed));
			n--;
		}
		
		
	}

	static boolean isFaulty(String named, String typed) {
		// TODO Auto-generated method stub
		
		if(named.length() > typed.length()) {
			return false;
		}
		int i=0 , j =0;
		
		while(i<named.length() && j<typed.length()) {
			if(named.charAt(i)==typed.charAt(j)) {
				i++;
				j++;
			}
			else if(i>0 && named.charAt(i-1) == typed.charAt(j)) {
				j++;
			}
			else {
				return false;
			}
		}
		
		while(j<typed.length()) {
			if(named.charAt(i-1)!= typed.charAt(j)) {
				return false;
			}
			j++;
		}
		if(i<named.length())
			{
				return false;
			}
		else
			{
				return true;
			}
	}

}
