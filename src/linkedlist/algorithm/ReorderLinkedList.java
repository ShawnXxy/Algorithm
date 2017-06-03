package linkedlist.algorithm;

public class ReorderLinkedList {
	
	/**
	 * Time: O(3n) = O(n)
	 * 	middleNode(): O(n) interative all nodes
	 * 	reverse(): O(n/2) = O(n) only reverse half of the list
	 * 	merge(): O(n)
	 * @author ShawnX
	 *
	 */
	class ListNode {
		public int value;
		public ListNode next;
		public ListNode (int value) {
			this.value = value;
			next = null;
		}
	}
	
	public ListNode reorder (ListNode head) {
		if  (head == null || head.next == null) {
			return head;
		}
		ListNode left = head;
		ListNode mid = middleNode (head);
		ListNode right = mid.next;
		mid.next = null;
		return merge(left, reverse(right));
	}
	private ListNode middleNode (ListNode head) {
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
	private ListNode reverse (ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode nextNode = head.next;
			head.next = prev;
			prev = head;
			head = nextNode;
		}
		return prev;
	}
	private ListNode merge(ListNode one, ListNode two) {
		// TODO Auto-generated method stub
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		while (one != null && two != null) {
			cur.next = one;
			one = one.next;
			cur.next.next = two;
			two = two.next;
			cur = cur.next.next;
		}
		if (one != null) {
			cur.next = one;
		} else {
			cur.next = two;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
