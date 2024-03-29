package recursion1;
import java.util.Scanner;

public class LastIndexOfNumber {

	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static int lastIndex(int input[], int x, int startIndex) {
        if(startIndex==input.length){
            return -1;
        }
        int smallAns = lastIndex(input,x, startIndex+1);
        if(smallAns!=-1){
            return smallAns;
        }
		if(input[startIndex]==x){
            return startIndex;
        }
        else{
            return -1;
        }
		
	}
    
    public static int lastIndex(int input[], int x) {
    	/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
    	
        return lastIndex(input,x,0);
        
    }
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(lastIndex(input, x));
	}
}
