package linkedlist.algorithm;

public class MiddleNode {
	
	class ListNode {
		public int value;
		public ListNode next;
		public ListNode (int value) {
			this.value = value;
			next = null;
		}
	}
	
	public ListNode middleNode (ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
