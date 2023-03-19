package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthOfLL {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static int length(LinkedListNode<Integer> head){
		//Your code goes here
    	if(head == null) {
    		return 0;
    	}
    	
    	LinkedListNode<Integer> temp = head;
    	int count = 1;
    	while(temp.next != null) {
    		count++;
    		temp = temp.next;
    	}
    	return count;
	}
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(br.readLine().trim());
		
		while (t > 0) 
		{
            
            LinkedListNode<Integer> head = takeInput();    
            System.out.println(length(head));
            System.out.println();

            t -= 1;
        }
		
	}

}
