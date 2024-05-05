package LinkedList;

import LinkedList.DeletetheMiddleNodeofaLinkedList.ListNode;

public class DeleteNodeinaLinkedList {
	
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

	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(4);
	    ListNode node2 = new ListNode(5);
	    ListNode node3 = new ListNode(1);
	    ListNode node4 = new ListNode(9);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    deleteNode(node2);
	    ListNode node = node1;
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
