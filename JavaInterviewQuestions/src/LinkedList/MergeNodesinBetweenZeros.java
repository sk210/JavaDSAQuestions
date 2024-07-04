package LinkedList;

import LinkedList.MergeInBetweenLinkedLists.ListNode;

public class MergeNodesinBetweenZeros {

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

	public static ListNode mergeNodes(ListNode head) {
		ListNode modify = head.next;
		ListNode nextNode = modify;

		while (nextNode != null) {
			int sum = 0;

			while (nextNode.val != 0) {
				sum += nextNode.val;
				nextNode = nextNode.next;
			}

			modify.val = sum;
			nextNode = nextNode.next;
			modify.next = nextNode;
			modify = modify.next;
		}

		return head.next;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(0);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(5);
		ListNode node7 = new ListNode(2);
		ListNode node8 = new ListNode(0);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		ListNode ans = mergeNodes(node1);

		while (ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}

}
