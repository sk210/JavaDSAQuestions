package LinkedList;

import LinkedList.ReorderList.ListNode;

public class ReorderListAns2 {

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
	
	public static ListNode helper(ListNode head, ListNode curr) {
		ListNode temp;
		
		if(curr.next != null) {
			temp = helper(head, curr.next);
		}
		else {
			temp = head;
		}
		
		if(temp == null) {
			return null;
		}
		
		if(temp == curr || temp.next == curr) {
			curr.next = null;
			return null;
		}
		
		curr.next = temp.next;
		temp.next = curr;
		return curr.next;
	}

	public static void reorderList(ListNode head) {
		if(head.next == null) {
			return;
		}
		
		helper(head, head.next);
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
	    ListNode node2 = new ListNode(2);
	    ListNode node3 = new ListNode(3);
	    ListNode node4 = new ListNode(4);
	    ListNode node5 = new ListNode(5);
	    ListNode node6 = new ListNode(6);
	    
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;
	    node5.next = node6;
	    ListNode head = node1;
	    reorderList(head);
	    while(head != null) {
	    	System.out.println(head.val);
	    	head = head.next;
	    }

	}

}
