package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PallindromeLL {

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
    
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
    	
    	 LinkedListNode<Integer> node=head;
         ArrayList<Integer> arr = new ArrayList<>();
         while (node!=null)
         {
             arr.add(node.data);
             node=node.next;
         }
         int start=0, end=arr.size()-1;
         while(start<end)
         {
             if (arr.get(start)!=arr.get(end))
             {
                 return false;
             }
             else
             {
                 start=start+1;
                 end=end-1;
             }
         }
         
         return true;
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput(); 

            boolean ans = isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }
        
    }
    
}
