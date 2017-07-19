package linkedlist.algorithm;

public class ReverseLinkedListInPairs {
	
	class ListNode {
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
			this.next = null;
		}
	}
	
	public ListNode reverse (ListNode head) {
		if (head != null || head.next != null) {
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
