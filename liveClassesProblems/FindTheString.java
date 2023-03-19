package liveClassesProblems;

import java.util.Scanner;

public class FindTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		
		System.out.println(isItPossible(s));
	}

	private static boolean isItPossible(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		//System.out.println(n);
		String s1 = s.substring(0, n/2);
		String s2 = s.substring(n/2,n);
		//System.out.println(s2);
		if(s1.equals(s2))
			return true;
		return false;
	}
	

}
