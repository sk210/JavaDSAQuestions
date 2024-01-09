package LinkedList;

import LinkedList.RemoveDuplicatesfromSortedList.ListNode;

public class RemoveDuplicatesfromSortedList2 {

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

	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		int data = Integer.MIN_VALUE;
		ListNode tail = null;
		ListNode newHead = null;
		ListNode temp = head;
		
		while(temp != null) {
			if(temp.next != null && temp.val == temp.next.val) {
				data = temp.val;
				temp = temp.next;
				continue;
			}
			
			if(temp.val != data) {
				if(newHead == null) {
					newHead = temp;
					tail = temp;
				}
				else {
					tail.next = temp;
					tail = temp;
				}
			}
			
			temp = temp.next;
		}
		
		if(tail != null) {
			tail.next = null;
		}
		
		return newHead;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
	    ListNode node2 = new ListNode(2);
	    ListNode node3 = new ListNode(3);
	    ListNode node4 = new ListNode(3);
	    ListNode node5 = new ListNode(4);
	    ListNode node6 = new ListNode(4);
	    ListNode node7 = new ListNode(5);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;
	    node5.next = node6;
	    node6.next = node7;
	    ListNode head = node1;
	    ListNode node = deleteDuplicates(head);
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
