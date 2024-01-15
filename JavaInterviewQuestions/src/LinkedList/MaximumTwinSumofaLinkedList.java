package LinkedList;

import LinkedList.LinkedListCycle2.ListNode;

public class MaximumTwinSumofaLinkedList {
	
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

	public static int pairSum(ListNode head) {
		int[] arr = new int[100000];
		int index = 0;
		
		while(head != null) {
			arr[index++] = head.val;
			head = head.next;
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<index/2;i++) {
			if(arr[i] + arr[index - 1 - i] > max) {
				max = arr[i] + arr[index - 1 - i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(5);
	    ListNode node2 = new ListNode(4);
	    ListNode node3 = new ListNode(2);
	    ListNode node4 = new ListNode(1);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    ListNode head = node1;
	    System.out.println(pairSum(head));
	}

}
