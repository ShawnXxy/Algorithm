package linkedlist.algorithm;

public class GetLength {

	class ListNode {
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
			this.next = null;
		}
	}
	
	public int length (ListNode head) {
		if (head == null) {
			return 0;
		}
		int result = 1;
		ListNode cur =  head;
		while (cur.next != null) {
			cur = cur.next;
			result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
