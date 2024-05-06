package LinkedList;

import java.util.Stack;

import LinkedList.DeletetheMiddleNodeofaLinkedList.ListNode;

public class RemoveNodesFromLinkedList {

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
		Stack<ListNode> stack = new Stack<ListNode>();

		while (head != null) {
			while (!stack.isEmpty() && stack.peek().val < head.val) {
				stack.pop();
			}
			stack.push(head);
			head = head.next;
		}

		ListNode next = null;
		while (!stack.isEmpty()) {
			head = stack.pop();
			head.next = next;
			next = head;
		}

		return head;
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
