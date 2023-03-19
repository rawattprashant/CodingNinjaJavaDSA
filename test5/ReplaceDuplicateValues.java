package test5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class ReplaceDuplicateValues {

	private static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = input();
		changeLL(head);
		print(head);
	}
	
	public static void changeLL(LinkedListNode<Integer> head) {
		// Write your code here
        Map<Integer, Integer> myMap  = new HashMap<>();
        LinkedListNode<Integer> temp = head;
        
        int maxNum = 0;
        
        while(temp != null) {
        	myMap.put(temp.data, (myMap.get(temp.data) == null? 0: myMap.get(temp.data))+1);
        	if(maxNum < temp.data)
        		maxNum = temp.data;
        	temp = temp.next;
        }
        
        while(head != null) {
        	if(myMap.get(head.data) > 1)
        		myMap.put(head.data, -1);
        	else if(myMap.get(head.data) == -1)
        		head.data = ++maxNum;
        	
        	head = head.next;
        }
    }
}
