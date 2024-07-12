package LinkedList;

import java.util.Arrays;

import LinkedList.MergeInBetweenLinkedLists.ListNode;

public class FindtheMinimumandMaximumNumberofNodesBetweenCriticalPoints {
	
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

	public static int[] nodesBetweenCriticalPoints(ListNode head) {
		ListNode prev = head;
		ListNode curr = head.next;
		int[] ans = {-1, -1};
		int prevPosition = -1, currPosition = -1, firstPosition = -1, position = 0;
		while(curr.next != null) {
			if((curr.val < prev.val && curr.val < curr.next.val) || (curr.val > prev.val && curr.val > curr.next.val)) {
				prevPosition = currPosition;
				currPosition = position;
				if(firstPosition == -1) {
					firstPosition = position;
				}
				
				if(prevPosition != -1) {
					if(ans[0] == -1) ans[0] = currPosition - prevPosition;
					else ans[0] = Math.min(ans[0], currPosition - prevPosition);
					ans[1] = position - firstPosition;
				}
			}
			position++;
			prev = curr;
			curr = curr.next;
		}
		return ans;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(1);
		node1.next = node2;
		System.out.println(Arrays.toString(nodesBetweenCriticalPoints(node1)));

	}

}
