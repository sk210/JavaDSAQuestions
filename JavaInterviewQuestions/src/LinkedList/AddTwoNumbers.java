package LinkedList;

import LinkedList.OddEvenLinkedList.ListNode;

public class AddTwoNumbers {

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

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode();
		ListNode curr = dummy;
		int carry = 0;
		
		while(l1 != null || l2 != null || carry != 0) {
			int sum = 0;
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			
			if(l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			
			sum += carry;
			carry = sum/10;
			
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
		}
		
		return dummy.next;
		
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		ListNode head1 = node1;

		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);
		node4.next = node5;
		node5.next = node6;
		ListNode head2 = node4;
		ListNode node = addTwoNumbers(head1, head2);
		while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
