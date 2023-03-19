package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompressTheString {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static String getCompressedString(String str) {
		// Write your code here.
		String s="";
        char ch=str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++)
        {   
        	char c=str.charAt(i);
        	if(ch==c)
        	{
        		count++;
        	}
        	else{
        		if(count>1)
        			s=s+ch+count;
        		else
        			s=s+ch;

        		count=1;
        	}
        	ch = c;
        }

        if(count>1)
            s=s+ch+count;
        else
            s=s+ch;

        return s;
	}
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine ();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = getCompressedString(str);
		System.out.println(ans);
		
	}
}
