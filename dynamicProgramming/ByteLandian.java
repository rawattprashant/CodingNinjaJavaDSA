package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ByteLandian {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            long n = Long.parseLong(br.readLine().trim());
            HashMap<Long, Long> memo = new HashMap<Long, Long>();
            System.out.println(bytelandian(n,memo));
    }
    
    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here
    	if(n<=3)
    		return n;
    	
    	long total = 0;
    	if(memo.containsKey(n/2))
    		total += memo.get(n/2);
    	else
    		total += bytelandian(n/2, memo);
    	
    	if(memo.containsKey(n/3))
    		total += memo.get(n/3);
    	else
    		total += bytelandian(n/3, memo);
    	
    	if(memo.containsKey(n/4))
    		total += memo.get(n/4);
    	else
    		total += bytelandian(n/4, memo);
    	
    	if(total > n)
    		memo.put(n, total);
    	else
    		memo.put(n, n);
    	
    	return memo.get(n);
	}
    
}
