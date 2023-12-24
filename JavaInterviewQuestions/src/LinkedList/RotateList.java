package LinkedList;

import LinkedList.SwapNodesinPairs.ListNode;

public class RotateList {

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

	public static ListNode rotateRight(ListNode head, int k) {
		if(head == null || head.next == null || k == 0) {
			return head;
		}
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = head;
		ListNode temp = head;
		int length = 1;
		
		while(temp.next != null) {
			temp = temp.next;
			length++;
		}
		
		k = k % length;
		
		if(k == 0) {
			return head;
		}
		
		for(int i = 0;i<length - k - 1;i++) {
			curr = curr.next;
		}
		
		temp.next = dummy.next;
		dummy.next = curr.next;
		curr.next = null;
		
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
		ListNode node = rotateRight(head, 2);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
