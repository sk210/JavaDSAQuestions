package LinkedList;

import LinkedList.RemoveZeroSumConsecutiveNodesfromLinkedList.ListNode;

public class RemoveZeroSumConsecutiveNodesfromLinkedListAns2 {
	
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

	public static ListNode removeZeroSumSublists(ListNode head) {
		if(head == null) return head;
		ListNode curr = head;
		int running_sum = 0;
		
		while(curr != null) {
			running_sum += curr.val;
			if(running_sum == 0) {
				head = curr.next;
				return removeZeroSumSublists(head);
			}
			curr = curr.next;
		}
		head.next = removeZeroSumSublists(head.next);
		return head;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
	    ListNode node2 = new ListNode(2);
	    ListNode node3 = new ListNode(3);
	    ListNode node4 = new ListNode(-3);
	    ListNode node5 = new ListNode(-2);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;
	    ListNode head = node1;
	    ListNode node = removeZeroSumSublists(head);
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
