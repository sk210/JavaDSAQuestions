package LinkedList;

import LinkedList.RemoveNodesFromLinkedList.ListNode;

public class RemoveNodesFromLinkedListAns2 {

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

	public static ListNode removeNodes(ListNode head) {
		if (head.next == null)
			return head;

		ListNode prevNode = null;
		ListNode currentNode = head;

		while (currentNode != null) {
			ListNode nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}

		head = prevNode;
		currentNode = head.next;

		while (currentNode != null) {
			if (currentNode.val < prevNode.val) {
				currentNode = currentNode.next;
			} else {
				ListNode nextNode = currentNode.next;
				currentNode.next = prevNode;
				prevNode = currentNode;
				currentNode = nextNode;
			}
		}

		head.next = null;
		return prevNode;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(13);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(8);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode head = node1;
		ListNode node = removeNodes(head);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}

	}

}
