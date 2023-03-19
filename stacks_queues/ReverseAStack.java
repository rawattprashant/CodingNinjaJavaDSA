package stacks_queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseAStack {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Stack<Integer> takeInput() throws NumberFormatException, IOException {
    	int size = Integer.parseInt(br.readLine().trim());
    	Stack<Integer> input = new Stack<>();

    	if (size == 0) {
    		return input;
    	}
    	
    	String[] values = br.readLine().trim().split(" ");

    	for(int i = 0; i < size; i++) {
    		input.push(Integer.parseInt(values[i]));
    	}

    	return input;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	Stack<Integer> input = takeInput();
    	Stack<Integer> empty = new Stack<>();

    	reverseStack(input, empty);

    	while(!input.isEmpty()) {
    		System.out.print(input.pop() + " ");
    	}

    }
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		if (input.size()==0 || input.size()==1)
        {
            return;
        }
        
        int top=input.pop();
        reverseStack(input,extra);
        
        while(!input.isEmpty())
        {
            extra.push(input.pop());
        }
        input.push(top);
        
        while(!extra.isEmpty())
        {
            input.push(extra.pop());
        }
	}
	
}
