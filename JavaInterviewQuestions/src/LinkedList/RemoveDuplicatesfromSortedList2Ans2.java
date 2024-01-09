package LinkedList;

import LinkedList.RemoveDuplicatesfromSortedList2.ListNode;

public class RemoveDuplicatesfromSortedList2Ans2 {

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
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode mover = dummy;
		
		while(mover.next != null && mover.next.next != null) {
			if(mover.next.val == mover.next.next.val) {
				int value = mover.next.val;
				while(mover.next != null && mover.next.val == value) {
					mover.next = mover.next.next;
				}
			}
			else {
				mover = mover.next;
			}
		}
		
		return dummy.next;

	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(1);
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
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}

	}

}
