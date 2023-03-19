package recursion3;
import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = Solution2.permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
}

class Solution2 {
	
	public static String[] permutationOfString(String input){
		// Write your code here
		return helper(input);
	}
	
	private static String[] helper(String up) {

		if (up.length() == 1)
			return new String[] { up };

		String[] sm1 = helper(up.substring(1));
		// ArrayList<String> l1 = new ArrayList<>();
		String[] ans = {};
		for (String s1 : sm1) {
			String[] ans1 = new String[ans.length + s1.length() + 1];
			int k = 0;
			while (k < ans.length) {
				ans1[k] = ans[k];
				k++;
			}
			for (int i = 0; i <= s1.length(); i++) {
				String s = s1.substring(0, i) + up.charAt(0) + s1.substring(i);
				// l1.add(s);
				ans1[k] = s;
				k++;
			}
			ans = ans1;
		}
		return ans;
	}
}