package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

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
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> head = takeInput();
		fun(head);
	}
	
	static void fun(LinkedListNode<Integer> start)
	{
	  if(start == null)
	    return;
	  //System.out.print( start.data); 

	  if(start.next != null )
	    fun(start.next.next);
	  System.out.print(start.data);
	}


}
