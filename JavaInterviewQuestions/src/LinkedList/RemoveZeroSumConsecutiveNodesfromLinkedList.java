package LinkedList;

import java.util.HashMap;

import LinkedList.RemoveNthNodeFromEndofList.ListNode;

public class RemoveZeroSumConsecutiveNodesfromLinkedList {
	
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

	public static ListNode removeZeroSumSublists(ListNode head) {
		int prefixSum = 0;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		HashMap<Integer, ListNode> map = new HashMap<Integer, ListNode>();
		map.put(0, dummy);
		while(head != null) {
			prefixSum += head.val;
			if(map.containsKey(prefixSum)) {
				int sum = prefixSum;
				ListNode start = map.get(sum);
				ListNode temp = start;
				while(temp != head) {
					temp = temp.next;
					sum += temp.val;
					if(temp != head) {
						map.remove(sum);
					}
				}
				start.next = head.next;
			}
			else {
				map.put(prefixSum, head);
			}
			
			head = head.next;
		}
		
		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
	    ListNode node2 = new ListNode(2);
	    ListNode node3 = new ListNode(-3);
	    ListNode node4 = new ListNode(3);
	    ListNode node5 = new ListNode(1);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;
	    ListNode head = node1;
	    ListNode node = removeZeroSumSublists(head);
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
