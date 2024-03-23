package LinkedList;

import java.util.List;

import LinkedList.PalindromeLinkedList.ListNode;

public class ReorderList {
	
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void reorderList(ListNode head) {
		if(head == null || head.next == null) {
			return;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode prev = null;
		ListNode next = null;
		
		while(slow != null) {
			next = slow.next;
			slow.next = prev;
			prev = slow;
			slow = next;
		}
		
		ListNode firstHalf = head;
		ListNode secondHalf = prev;
		
		while(secondHalf.next != null) {
			next = firstHalf.next;
			prev = secondHalf.next;
			
			firstHalf.next = secondHalf;
			secondHalf.next = next;
			
			firstHalf = next;
			secondHalf = prev;
		}
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
	    ListNode node2 = new ListNode(2);
	    ListNode node3 = new ListNode(3);
	    ListNode node4 = new ListNode(4);
	    ListNode node5 = new ListNode(5);
	    
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;
	    ListNode head = node1;
	    reorderList(head);
	    while(head != null) {
	    	System.out.println(head.val);
	    	head = head.next;
	    }

	}

}
