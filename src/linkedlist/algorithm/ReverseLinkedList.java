package linkedlist.algorithm;

public class ReverseLinkedList {
	
	class ListNode {
		public int value;
		public ListNode next;
		public ListNode (int value) {
			this.value = value;
			next = null;
		}
	}
	
	public ListNode reverse (ListNode head) {
		
		// Solution 1: iterative
		// Time: O(n)
		// Space: O(1)
		ListNode prev = null;
		while (head != null) {
			ListNode nextNode = head.next;
			head.next = prev;
			prev = head;
			head = nextNode;
		}
		return prev;
		
		// Solution 2: recurstion
		// Time: O(n)
		// Space: O(n)
//		if (head == null || head.next == null) {
//			return head;
//		}
//		ListNode nextNode = head.next;
//		ListNode newHead = reverse(nextNode);
//		nextNode.next = head;
//		head.next = null;
//		return newHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
