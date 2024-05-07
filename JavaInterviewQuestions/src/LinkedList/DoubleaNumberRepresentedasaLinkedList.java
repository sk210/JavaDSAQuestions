package LinkedList;

import LinkedList.DeletetheMiddleNodeofaLinkedList.ListNode;

public class DoubleaNumberRepresentedasaLinkedList {

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

	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public static ListNode doubleIt(ListNode head) {
		ListNode reverseList = reverseList(head);
		ListNode currNode = reverseList;
		ListNode prevNode = null;
		int carry = 0;

		while (currNode != null) {
			int newValue = currNode.val * 2 + carry;

			currNode.val = newValue % 10;

			if (newValue > 9) {
				carry = 1;
			} else {
				carry = 0;
			}

			prevNode = currNode;
			currNode = currNode.next;
		}

		if (carry != 0) {
			ListNode addCarryNode = new ListNode(carry);
			prevNode.next = addCarryNode;
		}

		return reverseList(reverseList);
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(8);
		ListNode node3 = new ListNode(9);
		node1.next = node2;
		node2.next = node3;
		ListNode head = node1;
		ListNode node = doubleIt(head);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}

	}

}
