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
		if (root ==  null) {
			return true;
		}
		Deque<TreeNode> q = new LinkedList<>();
		q.offer(root);
		boolean flag = false;
		while (!q.isEmpty()) {
			TreeNode cur = q.poll();
			if (cur.left == null) {			
				flag = true;
			} else if (flag) {
				return false;
			} else {
				q.offer(cur.left);
			}
			if (cur.right == null) {
				flag = true;
			} else if (flag) {
				return false;
			} else {
				q.offer(cur.right);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
