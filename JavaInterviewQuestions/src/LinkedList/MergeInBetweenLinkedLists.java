package LinkedList;

public class MergeInBetweenLinkedLists {

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

	public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		ListNode currNode = list1;
		int index = 0;

		while (index < a - 1) {
			currNode = currNode.next;
			index++;
		}

		ListNode front = currNode;

		while (index < b + 1) {
			currNode = currNode.next;
			index++;
		}

		ListNode rear = currNode;

		front.next = list2;

		while (front.next != null) {
			front = front.next;
		}

		front.next = rear;

		return list1;
	}

	public static void main(String[] args) {
		ListNode nodeFirst1 = new ListNode(10);
	    ListNode nodeFirst2 = new ListNode(1);
	    ListNode nodeFirst3 = new ListNode(13);
	    ListNode nodeFirst4 = new ListNode(6);
	    ListNode nodeFirst5 = new ListNode(9);
	    ListNode nodeFirst6 = new ListNode(5);
	    nodeFirst1.next = nodeFirst2;
	    nodeFirst2.next = nodeFirst3;
	    nodeFirst3.next = nodeFirst4;
	    nodeFirst4.next = nodeFirst5;
	    nodeFirst5.next = nodeFirst6;
	    ListNode head1 = nodeFirst1;
	    
	    ListNode nodeSecond1 = new ListNode(1000000);
	    ListNode nodeSecond2 = new ListNode(1000001);
	    ListNode nodeSecond3 = new ListNode(1000002);
	    nodeSecond1.next = nodeSecond2;
	    nodeSecond2.next = nodeSecond3;
	    ListNode head2 = nodeSecond1;
	    
	    ListNode node = mergeInBetween(head1, 3, 4, head2);
	    while(node != null) {
	    	System.out.println(node.val);
	    	node = node.next;
	    }

	}

}
