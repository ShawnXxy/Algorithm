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
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
			this.next = null;
		}
	}
	
	public ListNode reorder (ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode first = head;
		ListNode mid = mid(head);
		ListNode last = mid.next;
		mid.next = null;
		return merge(first, reverse(last));
	}
	private ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode nextNode = head.next;
			head.next = prev;
			prev = head;
			head = nextNode;
		}
		return prev;
	}
	private ListNode mid (ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	private ListNode merge (ListNode one, ListNode two) {
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
