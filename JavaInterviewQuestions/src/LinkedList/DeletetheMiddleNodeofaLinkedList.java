package LinkedList;

import LinkedList.OddEvenLinkedList.ListNode;

public class DeletetheMiddleNodeofaLinkedList {
	
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
	
	 public static ListNode deleteMiddle(ListNode head) {
         if(head == null || head.next == null) {
			 head = null;
			 return head;
		 }
	        ListNode slow = head;
	        ListNode fast = head.next.next;
	        while(fast != null && fast.next != null) {
	        	slow = slow.next;
	        	fast = fast.next.next;
	        }
	        slow.next = slow.next.next;
	        return head;
    }

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
	    ListNode node2 = new ListNode(3);
	    ListNode node3 = new ListNode(4);
	    ListNode node4 = new ListNode(7);
	    ListNode node5 = new ListNode(1);
	    ListNode node6 = new ListNode(2);
	    ListNode node7 = new ListNode(6);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;
	    node5.next = node6;
	    node6.next = node7;
	    ListNode head = node1;
	    ListNode node = deleteMiddle(head);
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
