package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenAfterOddLL {

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
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
    	if(head == null || head.next == null)
    		return head;
    	
    	LinkedListNode<Integer> node = head,evenNode=null,evenHead = null,oddHead=null, oddNode = null;
    	while(node!=null) {
    		int data = node.data;
    		if(data%2==0) {
    			if(evenNode==null) {
    				evenNode = node;
    				evenHead = node;
    			}
    			else {
    				evenNode.next=node;
    				evenNode = evenNode.next;
    			}
    		}
    		else {
    			if(oddNode==null) {
    				oddNode=node;
                    oddHead=node;
    			}
    			else {
    				oddNode.next = node;
    				oddNode = oddNode.next;
    			}
    		}
    		node = node.next;
    	}
    	if (oddHead==null)
        {
            return evenHead;
        }
        else
        {
            oddNode.next=evenHead;
        }
        if (evenNode!=null)
        {
            evenNode.next=null;
        }
        
        return oddHead;
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput(); 

            LinkedListNode<Integer> newHead = evenAfterOdd(head);
            print(newHead);

            t -= 1;
        }

    }
    
}
