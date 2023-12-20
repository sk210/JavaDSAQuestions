package LinkedList;

import LinkedList.ReverseLinkedList.ListNode;

public class OddEvenLinkedList {
	
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
	
	public static ListNode oddEvenList(ListNode head) {
        if(head == null) {
	    	return null;
	    }
	    ListNode odd = head;
	    ListNode even = head.next;
	    ListNode evenHead = even;
	    
	    while(even != null && even.next != null) {
	    	odd.next = even.next;
	    	odd = even.next;
	    	even.next = odd.next;
	    	even = odd.next;
	    }
	    odd.next = evenHead;
	    return head;
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
	    ListNode node = oddEvenList(head);
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
