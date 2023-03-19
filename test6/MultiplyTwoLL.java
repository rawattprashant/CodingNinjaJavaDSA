package test6;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class MultiplyTwoLL {

	public static LinkedListNode<Integer> takeInput(Scanner s) {
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		
		int data = s.nextInt();
		
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		LinkedListNode<Integer> head1 = takeInput(s);
		LinkedListNode<Integer> head2 = takeInput(s);
		
		
		multiply(head1, head2);
		
		s.close();
	}

	private static void multiply(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		// TODO Auto-generated method stub
		
	}
}
