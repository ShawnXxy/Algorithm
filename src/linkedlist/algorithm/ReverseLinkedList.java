package linkedlist.algorithm;

public class ReverseLinkedList {
	
	class ListNode {
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
			this.next = null;
		}
	}
	
	public ListNode reverse (ListNode head) {
		
		// Solution 1 : iterative
//		ListNode prev = null;
//		while (head != null) {
//			ListNode nextNode = head.next;
//			head.next = prev;
//			prev = head;
//			head = nextNode;
//		}
//		return prev;
		
		// Solution 2: recursion
		if (head == null || head.next == null) {
			return head;
		}
		ListNode nextNode = head.next;
		ListNode newHead = reverse(nextNode);
		nextNode.next = head;
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
