package tree.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class CheckCompleted {
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	}
	
	public boolean isComplete (TreeNode root) {
		if (root == null) {
			return true;
		}
		Deque<TreeNode> dq = new LinkedList<>();
		dq.offer(root);
		boolean noChild = false;
		while (!dq.isEmpty()) {
			TreeNode cur = dq.poll();
			if (cur.left == null) {
				noChild = true;
			} else if (noChild) {
				return false;
			} else {
				dq.offer(cur.left);
			}
			if (cur.right == null) {
				noChild = true;
			} else if (noChild) {
				return false;
			} else {
				dq.offer(cur.right);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
