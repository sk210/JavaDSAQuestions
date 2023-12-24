package LinkedList;

import LinkedList.ReverseLinkedList.ListNode;

public class SwapNodesinPairs {

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

	public static ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = dummy;
		
		while(curr.next != null && curr.next.next != null) {
			ListNode first = curr.next;
			ListNode second = curr.next.next;
			first.next = second.next;
			curr.next = second;
			second.next = first;
			curr = second.next;
		}
		
		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode head = node1;
		ListNode node = swapPairs(head);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
