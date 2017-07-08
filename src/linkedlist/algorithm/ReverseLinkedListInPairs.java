package linkedlist.algorithm;

public class ReverseLinkedListInPairs {
	
	class ListNode {
		public int value;
		public ListNode next;
		public ListNode (int value) {
			this.value = value;
			next = null;
		}
	}
	
	public ListNode reverse(ListNode head) {
		// Solution 1 : recursion
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = head.next;
		head.next = reverse(head.next.next);
		newHead.next = head;
		return newHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
