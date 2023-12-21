package LinkedList;

import LinkedList.OddEvenLinkedList.ListNode;

public class RemoveNthNodeFromEndofList {

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

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode first = dummy;
	    ListNode second = dummy;

	    for (int i = 0; i <= n; i++) {
	        first = first.next;
	    }

	    while (first != null) {
	        first = first.next;
	        second = second.next;
	    }
	    
	    if (second.next != null) {
	        second.next = second.next.next;
	    }

	    return dummy.next;
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
	    ListNode node = removeNthFromEnd(head,2);
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
