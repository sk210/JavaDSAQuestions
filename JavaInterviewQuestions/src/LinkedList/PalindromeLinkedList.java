package LinkedList;

import java.util.ArrayList;
import java.util.List;

import LinkedList.OddEvenLinkedList.ListNode;

public class PalindromeLinkedList {
	
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
		List<Integer> list = new ArrayList<Integer>();
		
		while(head != null) {
			list.add(head.val);
			head = head.next;
		}
		
		int start = 0;
		int end = list.size() - 1;
		
		while(start < end && list.get(start) == list.get(end)) {
			start++;
			end--;
		}
		
		return start >= end;
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
