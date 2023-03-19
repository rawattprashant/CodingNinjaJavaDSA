package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K_Reverse {

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
    
    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
        
        if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> smallerHead=reverseLinkedListRec(head.next);
        LinkedListNode<Integer> node=smallerHead;
        while (node.next!=null)
        {
            node=node.next;
        }
        node.next=head;
        head.next=null;
        return smallerHead;
	}
    
    public static LinkedListNode<Integer> findTail(LinkedListNode<Integer> head, int k)
    {
            for (int i=0;i<k && head.next!=null;i++)
            {
                head=head.next;
            }
            return head;
        
        
    }
    
    public static int findLength(LinkedListNode<Integer> head)
    {
        int count=0;
        while(head.next!=null)
        {
            head=head.next;
            count=count+1;
        }
        return count;
    }
    
    
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
    	if (head==null || k==0 || k==1)
        {
            return head;
        }
        else if (k>findLength(head))
        {
            return reverseLinkedListRec(head);
        }
        
        LinkedListNode<Integer> node=head,nextNode=null,tail=null,prevTail=null,newHead=null;
        while(node!=null)
        {
            tail=findTail(node,k-1);
            nextNode=tail.next;
            tail.next=null;
            newHead=reverseLinkedListRec(node);
            //Runner.print(newHead);
            if (node==head)
            {
                tail=head;
                tail.next=nextNode;
                head=newHead;
                
            }
            else
            {
                tail=node;
                tail.next=nextNode;
                prevTail.next=newHead;
                
            }
            node=nextNode;
            prevTail=tail;
            //Runner.print(head);
            
        }
        return head;
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            LinkedListNode<Integer> head = takeInput();
            int k = Integer.parseInt(br.readLine().trim());
            
            LinkedListNode<Integer> newHead = kReverse(head, k);
            print(newHead);
            
            t -= 1;
        }

    }
    
}
