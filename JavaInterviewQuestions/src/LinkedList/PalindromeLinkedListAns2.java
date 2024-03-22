package LinkedList;

import LinkedList.PalindromeLinkedList.ListNode;

public class PalindromeLinkedListAns2 {
	
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

	public static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) {
			return true;
		}
		
		int[] array = new int[100_000];
		int traveller = 0;
		
		while(head != null) {
			array[traveller++] = head.val;
			head = head.next;
		}
		
		int start = 0;
		int end = traveller - 1;
		
		while(start < end) {
			if(array[start++] != array[end--]) return false; 
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
	    ListNode node2 = new ListNode(2);
	    ListNode node3 = new ListNode(2);
	    ListNode node4 = new ListNode(1);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    ListNode head = node1;
	    System.out.println(isPalindrome(head));

	}

}
