package linkedlist.algorithm;

public class OddEvenList {

	/**
	 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
	 * 
	 * @param args
	 */
	
	class ListNode {
		public int value;
		public ListNode next;
		public ListNode (int value) {
			this.value = value;
			next = null;
		}
	}
	
	public ListNode oddEven (ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode odd = head;
		ListNode even = odd.next;
		ListNode evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
