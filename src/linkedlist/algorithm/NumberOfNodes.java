package linkedlist.algorithm;

public class NumberOfNodes {
	
	class ListNode {
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
			this.next = null;
		}
	}

	public int length(ListNode head) {
		if (head == null) {
			return 0;
		}
		int len = 0;
		while (head != null && head.next != null) {
			head = head.next;
			len++;
		}
		return len + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
