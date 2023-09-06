package LinkedList;

public class ReverseLinkedList {

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
		 while(current != null) {
			 ListNode next = current.next;
			 current.next = prev;
			 prev = current;
			 current = next;
		 }
		 return prev;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
	    ListNode node2 = new ListNode(2);
	    ListNode node3 = new ListNode(3);
	    ListNode node4 = new ListNode(4);
	    ListNode node5 = new ListNode(5);

	    // Linking the nodes together to form a linked list
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;
	    ListNode head = node1;
	    while(head != null) {
	    	System.out.println(head.val);
	    	head = head.next;
	    }
	    ListNode node = reverseList(node1);
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }
	}

}
