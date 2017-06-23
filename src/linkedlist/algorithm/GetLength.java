package linkedlist.algorithm;

public class GetLength {

	class ListNode {
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
			next = null;
		}
	}
	
	public int length(ListNode head) {
		if (head == null) {
			return 0;
		}
		int length = 1;
		ListNode cur = head;
		while (cur != null ) {
			cur = cur.next;
			length++;
		}
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
