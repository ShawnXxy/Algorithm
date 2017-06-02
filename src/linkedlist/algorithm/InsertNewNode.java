package linkedlist.algorithm;

public class InsertNewNode {
	
	class ListNode {
		public int value;
		public ListNode next;
		public ListNode (int value) {
			this.value = value;
			next = null;
		}
	}
	
	public ListNode insert (ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		// append at head
		if ( head == null || head.value >= value) {
			newNode.next = head;
			return newNode;
		}
		// append at middle or tail
		ListNode cur = head;
		while (cur.next != null && cur.next.value > value) { 
			cur = cur.next;
		}
		// cur stop at : 
		// 1, if cur is tail, then append value at tail; 
		// 2, if newNode is larger than cur.next, append after cur
		newNode.next = cur.next;
		cur.next = newNode;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
